package exercisios;

public class exer_9 {

	public static void main(String[] args) {
		//Criação da variavel soma
        int soma = 0;
        
        //Codigo para os numeros se repitirem até o 16
        for (int i = 0; i < 16; i++) {
        	
        	
            int peso = (int) Math.pow(2, i);
            soma += peso;
            System.out.println("2 ^ " + i + " = " + peso);
            
            if ((i + 1) % 4 == 0) {
                System.out.println();
            }
        }
        
        System.out.println("Somatório dos pesos: " + soma);
    }
}

