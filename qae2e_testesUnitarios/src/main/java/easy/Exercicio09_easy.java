package easy;

public class Exercicio09_easy {// incio classe

    public int[] calcularEexibirTabuada(int numeroDigitado) {//incio main
        int[] tabuada = new int[10];
        if (numeroDigitado <= 0 || numeroDigitado > 10) {
            System.out.println("Numero invalido!!!");
        } else {
            for (int i = 1; i <= 10; i++) {
                System.out.println(numeroDigitado + " X " + i + " = " + (numeroDigitado * i));
                tabuada[i - 1] = numeroDigitado * i;
            }
        }
        return tabuada;
    }
}