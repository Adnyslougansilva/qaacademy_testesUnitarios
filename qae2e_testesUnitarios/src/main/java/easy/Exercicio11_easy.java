package easy;

public class Exercicio11_easy {

    public int[] somaDoisAoNumeroDigitado(int numeroDigitado) {
        int[] somaDois = new int[100];
        for (int i = 0; i <= 99; i++) {
            numeroDigitado = numeroDigitado + 2;
            System.out.println("Iteração: " + i + " - Valor: " + numeroDigitado);
            somaDois[i] = numeroDigitado;

        }
        System.out.println("Fim das iterações!!!");
        return somaDois;
    }
}