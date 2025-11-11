package model;

public class Produto {

    // atributos
    private Long id;
    private String nome;
    private double preco;
    private int estoque;
    private Categoria categoria;

    // contrutor vazio (necessário para frameworks como Gson)
    public Produto() {
    }

    // construtor com todos os campos
    public Produto(Long id, String nome, double preco, int estoque, Categoria categoria) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
        this.categoria = categoria;
    }

    // construtor sem o id (para inserções, onde o id é auto-gerado)
    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    // getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public Categoria getCategoria(){
        return categoria;
    }

    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }

    // toString para facilitar a depuração
    @Override
    public String toString() {
        return "Produto [id=" + id +
                ", nome=" + nome +
                ", preco=" + preco +
                ", estoque=" + estoque +
                ", categoria=" + (categoria != null ? categoria.getNome() : "null") +
                "]";
    }
}