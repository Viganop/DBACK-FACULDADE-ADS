package lista_02;

public class exer7 {

	public static void main(String[] args) {
    	int elemento_1 = 0;
    	int elemento_2 = 1;
    	
    	
	    System.out.println(elemento_1);
	    System.out.println(elemento_2);
	    
	    for (int i = 3; i <= 30; i++) {
	    	int proximo = elemento_1 + elemento_2;
	    	System.out.println(proximo);
	    	elemento_1 = proximo; 
	    	elemento_2 = elemento_1;
	    	
	       }
    	}
	}