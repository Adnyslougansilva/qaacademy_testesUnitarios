package medium;

public class Exercicio04_medium {
    public void multiplicaAteMilIteracoes() {

        int resultado = 1;
        for (int i = 1; i <= 1000; i++) {
            resultado *= i;
            if (resultado >= 1000) {
                System.out.println( + resultado);
                resultado = 1;
            }
        }
        System.out.println("Resultado final: " + resultado);
    }
}
