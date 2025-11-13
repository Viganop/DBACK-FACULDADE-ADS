package exercisios;

import java.util.Scanner;

public class exer_19 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a base: ");
        int base = scanner.nextInt();
        
        System.out.print("Digite o expoente: ");
        int expo = scanner.nextInt();
        
        int resultado = (int) Math.pow(base, expo);
        
        System.out.println(base + " elevado a " + expo + " = " + resultado);
        
        scanner.close();
    }
}
