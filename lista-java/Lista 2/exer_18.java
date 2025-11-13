package exercisios;

import java.util.Scanner;

public class exer_18 {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
    	
    	System.out.println("Digite um número de 1 a 10 para taboada: ");
    	int num = scan.nextInt();
    	
    	
    	if (num < 1 || num > 10) {
    		System.out.println("Número digitado incorreto! Tente novamente.");
    	}
    	
    	for (int i = 1; i <= 10; i++) {
    		System.out.println(num + " x " + i + " = " + (num*i));
    		
    	}
    	
    	scan.close();
    }
}
