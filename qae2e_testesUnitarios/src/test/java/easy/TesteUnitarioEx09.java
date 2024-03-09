package easy;

import easy.Exercicio09_easy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteUnitarioEx09 {
    Exercicio09_easy exercicio09Easy;
    int[] tabuada;

    @Before
    public void before() {
        tabuada = new int[]{2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        exercicio09Easy = new Exercicio09_easy();
    }

    @Test
    public void testeCalcularTabuada() {
        Assert.assertArrayEquals(tabuada, exercicio09Easy.calcularEexibirTabuada(2));

    }
    @Test
    public void testeCalcularTabuadaValoresIncorretos() {
        exercicio09Easy.calcularEexibirTabuada(0);
    }

}