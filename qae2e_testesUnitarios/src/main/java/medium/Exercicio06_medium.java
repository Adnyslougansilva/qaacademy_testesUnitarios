package medium;

import javax.swing.*;

public class Exercicio06_medium {
    public int calculaFatorial(int numeroFatorialDigitado) {

         if (numeroFatorialDigitado == 0){
            System.out.println("O fatorial do numero digitado e:0");
        }
        for (int i = numeroFatorialDigitado; i > 1 ; i--){
            numeroFatorialDigitado = numeroFatorialDigitado * (i-1);
        }
        return numeroFatorialDigitado;
    }
}
