package exercisios;

import java.util.Scanner;

public class exer_17 {

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int n1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int n2 = scanner.nextInt();
        
        System.out.println("Números entre " + n1 + " e " + n2 + ":");
        
        int menor = Math.min(n1, n2);
        int maior = Math.max(n1, n2);
        
        for (int i = menor + 1; i < maior; i++) {
            System.out.println(i);
        }
        
        scanner.close();
    }
}