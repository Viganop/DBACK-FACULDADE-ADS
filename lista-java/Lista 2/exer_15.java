package exercisios;

import java.util.Scanner;

public class exer_15 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maior = 0, soma = 0;
        
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite um número: ");
            int num = scanner.nextInt();
            soma += num;
            if (i == 0 || num > maior) {
                maior = num;
            }
        }
        
        System.out.println("Maior número: " + maior);
        System.out.println("Soma dos números: " + soma);
        System.out.println("Média dos números: " + (soma / 5.0));
        
        scanner.close();
    }
}

