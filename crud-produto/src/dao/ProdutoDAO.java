package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Produto;
import model.Categoria;
import util.ConnectionFactory;

public class ProdutoDAO {
    // ------------------------------------
    // READ
    // ------------------------------------
    public List<Produto> buscarTodos() {
        List<Produto> produtos = new ArrayList<>();
        // query SQL para selecionar todos os campos
        String sql = "SELECT p.id, p.nome, p.preco, p.estoque, " +
                     "c.id as id_categoria, c.nome as nome_categoria " +
                     "FROM produtos p " +
                     "LEFT JOIN categorias c ON p.id_categoria = c.id";
        
        try (Connection conn = ConnectionFactory.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()) {

            // itera sobre cada linha retornada pelo banco
            while (rs.next()) {
                // Mapeia a Categoria (pode ser nula)
                Categoria categoria = null;
                Long idCategoria = rs.getLong("id_categoria");

                // mapeia a categoria caso não seja null
                if (!rs.wasNull()) {
                    categoria = new Categoria(idCategoria, rs.getString("nome_categoria"));
                }

                // cria um novo objeto Produto a partir dos dados da linha atual do ResultSet
                Produto produto = new Produto(
                        rs.getLong("id"),
                        rs.getString("nome"),
                        rs.getDouble("preco"),
                        rs.getInt("estoque"),
                        categoria);
                produtos.add(produto);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar produtos: " + e.getMessage());
            e.printStackTrace();
        }
        return produtos;
    }

    // ------------------------------------
    // READ BY ID
    // ------------------------------------
    public Produto buscarPorId(Long id) {

        Produto produto = null;

        String sql = "SELECT p.id, p.nome, p.preco, p.estoque, " +
                     "c.id as id_categoria, c.nome as nome_categoria " +
                     "FROM produtos p " +
                     "LEFT JOIN categorias c ON p.id_categoria = c.id " +
                     "WHERE p.id = ?";

        try (Connection conn = ConnectionFactory.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            // define o valor do parâmetro (o '?' na posição 1)
            stmt.setLong(1, id);

            try (ResultSet rs = stmt.executeQuery()) {
                // se houver resultado, move o cursor e mapeia o objeto
                if (rs.next()) {
                    Categoria categoria = null;
                    Long idCategoria = rs.getLong("id_categoria");
                    
                    if (!rs.wasNull()) {
                        categoria = new Categoria(idCategoria, rs.getString("nome_categoria"));
                    }
                    
                    produto = new Produto(
                            rs.getLong("id"),
                            rs.getString("nome"),
                            rs.getDouble("preco"),
                            rs.getInt("estoque"),
                            categoria);
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar produto por ID: " + id + ". Detalhes: " + e.getMessage());
            e.printStackTrace();
        }
        return produto;
    }

    // ------------------------------------
    // CREATE
    // ------------------------------------
    public void inserir(Produto produto) {

        // usa Statement.RETURN_GENERATED_KEYS para solicitar o ID gerado
        String sql = "INSERT INTO produtos (nome, preco, estoque, id_categoria) VALUES (?, ?, ?, ?)";

        try (Connection conn = ConnectionFactory.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            // define os parâmetros da query
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getEstoque());

            // define o ID da categoria
            // precisamos checar se a categoria não é nula e se ela tem um ID
            if (produto.getCategoria() != null && produto.getCategoria().getId() != null) {
                stmt.setLong(4, produto.getCategoria().getId());
            } else {
                // Se for nula, inserimos NULL no banco
                stmt.setNull(4, java.sql.Types.BIGINT);
            }

            // executa a inserção
            stmt.executeUpdate();

            // recupera a chave gerada (o novo ID)
            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    // define o ID no objeto Produto que foi passado (importante para a API)
                    produto.setId(rs.getLong(1));
                }
            }

        } catch (SQLException e) {
            System.err.println("Erro ao inserir produto: " + produto.getNome() + ". Detalhes: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // ------------------------------------
    // UPDATE
    // ------------------------------------
    public void atualizar(Produto produto) {

        String sql = "UPDATE produtos SET nome = ?, preco = ?, estoque = ?, id_categoria = ? WHERE id = ?";

        try (Connection conn = ConnectionFactory.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            // define os parâmetros (os novos valores)
            stmt.setString(1, produto.getNome());
            stmt.setDouble(2, produto.getPreco());
            stmt.setInt(3, produto.getEstoque());

            // Define o ID da categoria (parâmetro 4)
            if (produto.getCategoria() != null && produto.getCategoria().getId() != null) {
                stmt.setLong(4, produto.getCategoria().getId());
            } else {
                stmt.setNull(5, java.sql.Types.BIGINT);
            }

            // define o ID no WHERE (o último '?')
            stmt.setLong(4, produto.getId());

            // executa a atualização
            int linhasAfetadas = stmt.executeUpdate();
            System.out.println("Produto ID " + produto.getId() + " atualizado. Linhas afetadas: " + linhasAfetadas);

        } catch (SQLException e) {
            System.err.println("Erro ao atualizar produto ID: " + produto.getId() + ". Detalhes: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // ------------------------------------
    // DELETE
    // ------------------------------------
    public void deletar(Long id) {

        // a exclusão precisa do ID no WHERE
        String sql = "DELETE FROM produtos WHERE id = ?";

        try (Connection conn = ConnectionFactory.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            // define o ID do produto a ser deletado
            stmt.setLong(1, id);

            // executa a exclusão
            int linhasAfetadas = stmt.executeUpdate();
            System.out.println("Tentativa de deletar Produto ID " + id + ". Linhas afetadas: " + linhasAfetadas);

        } catch (SQLException e) {
            System.err.println("Erro ao deletar produto ID: " + id + ". Detalhes: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

