package model;

public class Categoria {

    private Long id;
    private String nome;

    // Construtor vazio
    public Categoria() {
    }

    // Construtor com ID (usado na leitura do banco)
    public Categoria(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    // Construtor sem ID (usado na inserção)
    public Categoria(String nome) {
        this.nome = nome;
    }

    // Getters e Setters
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

    // toString
    @Override
    public String toString() {
        return "Categoria [id=" + id + ", nome=" + nome + "]";
    }
}