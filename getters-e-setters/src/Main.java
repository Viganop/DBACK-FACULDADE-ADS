import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro(
            "Dom Casmurro", 
            "Machado de Assis", 
            "978-85-359-0277-7", 
            "Editora X", 
            256
        );

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1 - Visualizar dados do livro");
            System.out.println("2 - Alterar dados do livro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    livro.visualizarDados();
                    break;
                case 2:
                    livro.alterarDados();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);
        scanner.close();
    }
}
