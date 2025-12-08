import java.util.Scanner;

public class EX2 {
    public static void main(String[] args) throws Exception {
        //Exercisio 2
        Scanner scanner = new Scanner(System.in, "CP850");
        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();

        String regex = "\\d{2,3}\\.\\d{3}\\.\\d{3}-\\.\\d{2}\\.";       

        if (cpf.matches(regex)){
        System.out.println("O CPF" + cpf + "está no formato válido.");
        } else {
        System.out.println("O CPF" + cpf + "não está no formato válido.");
        }
        scanner.close();
    }
}
