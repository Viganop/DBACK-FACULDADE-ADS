package exercisios;

public class exer_13 {

	public static void main(String[] args) {
        double populacaoA = 80000;
        double taxaA = 0.03; // 3%

        double populacaoB = 200000;
        double taxaB = 0.015; // 1.5%

        int anos = 0;

        while (populacaoA < populacaoB) {
            populacaoA += populacaoA * taxaA;
            populacaoB += populacaoB * taxaB;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para que a população do país A ultrapasse ou iguale a população do país B.");
    }
}
