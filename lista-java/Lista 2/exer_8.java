package exercisios;

public class exer_8 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 17; i++) {
			System.out.println("2 ^ " + i + " = " + (int) Math.pow(2, i));
			
			if ((i + 1) % 4 == 0) {
				System.out.println();
			}
		}

	}

}