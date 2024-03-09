package medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteUnitarioEx10 {
    int[] vetorEsperado = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
    Exercicio10_medium exercicio10Medium = new Exercicio10_medium();

    @Before
    public void before() {
        exercicio10Medium = new Exercicio10_medium();
    }

    @Test
    public void testeFibonacci() {
        Assert.assertArrayEquals(vetorEsperado, exercicio10Medium.calcularFibonacci(10));
    }

    @Test
    public void testeExibeFibonacci() {

        exercicio10Medium.exibirVetor(vetorEsperado);
    }

}