import java.util.Scanner;

public class Livro { 
    // Atributos -----------------------------

    private String titulo;
    private String autor;
    private String isbn;
    private String editora;
    private int numeroPaginas;

    // Construtor ----------------------------

    public Livro(String titulo, String autor, String isbn, String editora, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.editora = editora;
        this.numeroPaginas = numeroPaginas;
    }

    // Getters e Setters ---------------------

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    // exibir os dados do livro------------------------
    public void visualizarDados() {
        System.out.println("\n--- Dados do Livro ---");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("ISBN: " + isbn);
        System.out.println("Editora: " + editora);
        System.out.println("Número de Páginas: " + numeroPaginas);
    }

    //alterar os dados do livro --------------------
    public void alterarDados() {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu de Alteração ---");
            System.out.println("1 - Alterar Título");
            System.out.println("2 - Alterar Autor");
            System.out.println("3 - Alterar ISBN");
            System.out.println("4 - Alterar Editora");
            System.out.println("5 - Alterar Número de Páginas");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Novo título: ");
                    setTitulo(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Novo autor: ");
                    setAutor(scanner.nextLine());
                    break;
                case 3:
                    System.out.print("Novo ISBN: ");
                    setIsbn(scanner.nextLine());
                    break;
                case 4:
                    System.out.print("Nova editora: ");
                    setEditora(scanner.nextLine());
                    break;
                case 5:
                    System.out.print("Novo número de páginas: ");
                    setNumeroPaginas(scanner.nextInt());
                    break;
                case 0:
                    System.out.println("Voltando ao menu principal...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
        scanner.close();
    }  
}


// primeiro a gente começou escrevendo o "Livro" aonde estaria a classe e todos os seus atributos e 
// construção, os gattings e satters.

// depois escrever métodos para exibir os dados do livro e logo em seguida o Método para alterar os dados do livro
// Fazendo um Scanner para o programa armazenar sua resposta, e em base disso tomar uma ação. fazendo uma
// int - opcao para que seja lá aonde sera armazenado. Aplicando o "DO" pq pode ter mais de uma resposta e 
//caminho para a ação dela. escrevendo a tabela de opções e aplicando o opcao = scanner.nextInt(); para que
// a proxima resposta do usuario seja armazeanda em "opcao".
