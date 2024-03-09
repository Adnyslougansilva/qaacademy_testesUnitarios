package medium;

import org.junit.Assert;
import org.junit.Test;

public class TesteUnitarioEx07_08 {

    @Test
    public void testeVetorAno() {
        String[] vetorAnoEsperado = new String[]{"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        Exercicio07_08_medium exericio0708Medium = new Exercicio07_08_medium();
        Assert.assertArrayEquals(vetorAnoEsperado, exericio0708Medium.exibirMesesDoAno());
    }
}