import java.util.Scanner;

public class EX1 {
    public static void main(String[] args) throws Exception {
        //Exercisio 1
        Scanner scanner = new Scanner(System.in, "CP850");
        System.out.print("Digite o nome: ");
        String nome = scanner.nextLine();

        String nomeFormato = nome.trim();
        System.out.println("Nome sem espaços: " + nomeFormato);
        scanner.close();

        //Exercisio 2
    }
}
