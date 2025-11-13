package exercisios;

import java.util.Scanner;

public class exer_12 {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String usuario, senha;

        do {
            System.out.print("Digite o nome de usuário: ");
            usuario = scan.nextLine();

            System.out.print("Digite a senha: ");
            senha = scan.nextLine();

            if (usuario.equals(senha)) {
                System.out.println("Erro! A senha não pode ser igual ao nome de usuário. Tente novamente.");
            }

        } while (usuario.equals(senha)); 

        System.out.println("Usuário e senha cadastrados com sucesso!");

        scan.close();
    }
}

