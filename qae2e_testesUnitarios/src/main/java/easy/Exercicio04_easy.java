package easy;

import javax.swing.*;

public class Exercicio04_easy {

    public Integer calcularDobro(Integer numeroDigitado) {
        do {

            int dobroNum = numeroDigitado * 2;
            return dobroNum;

        } while (JOptionPane.showInputDialog("Deseja continuar digite s , ou para sair clique em outra tecla").equals("s"));
    }
}

