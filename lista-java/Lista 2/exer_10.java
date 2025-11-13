package exercisios;

public class exer_10 {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String classificacao = "";
            
            if (i % 2 == 0) {
                classificacao += "Par ";
            } else {
                classificacao += "Ímpar ";
            }
            
            if (i % 3 == 0) {
                classificacao += "Múltiplo de 3 ";
            }
            
            if (i % 7 == 0) {
                classificacao += "Múltiplo de 7 ";
            }
            
            System.out.println(i + " - " + classificacao.trim());
            
            if (i % 10 == 0) {
                System.out.println(); // Linha em branco a cada 10 números
            }
        }
    }
}
