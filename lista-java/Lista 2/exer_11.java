package exercisios;

import java.util.Scanner;

public class exer_11 {
    public static void main(String[] args) {
    	
        Scanner scan = new Scanner(System.in);
        int resposta; 

        do {
            System.out.print("Me dê uma nota de 0 a 10: ");
            resposta = scan.nextInt(); 

            if (resposta < 0 || resposta > 10) {
                System.out.println("Errado! Digite mais uma vez.");
            }

        } while (resposta < 0 || resposta > 10); 

        System.out.println("Correto, você passou!");
        
        scan.close();
    }
}

