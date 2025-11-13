package exercisios;

import java.util.Scanner;

public class exer_20 {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o número de termos (n): ");
        int n = scan.nextInt();
        
        double h = 0.0;
        
        for (int i = 1; i <= n; i++) {
            h += 1.0 / i;
        }
        
        System.out.println("O valor de H com " + n + " termos é: " + h);
        
        scan.close();
    }
}
