package medium;

public class Exercicio06_medium {

    public Integer calculaFatorial(int numeroFatorialDigitado) {

        for (int i = numeroFatorialDigitado; i > 1; i--) {
            numeroFatorialDigitado = numeroFatorialDigitado * (i - 1);
        }
        if (numeroFatorialDigitado == 0) {
            System.out.println("O Fatorial do numero digitado é: 1");
            return 1;
        }
        return numeroFatorialDigitado;
    }
}