package medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteUnitarioEx04 {
    int[] vetorMultiplicaAteMilEsperado;
    Exercicio04_medium exercicio04Medium;

    @Before
    public void before() {
        vetorMultiplicaAteMilEsperado = new int[]{1, 2, 6, 24};
        exercicio04Medium = new Exercicio04_medium();
    }

    @Test
    public void testeSomeAteMil() {
        int[] vetorAtual = exercicio04Medium.multiplicaAteMilIteracoes();
        for (int i = 0; i < vetorMultiplicaAteMilEsperado.length; i++) {
            Assert.assertEquals(vetorMultiplicaAteMilEsperado[i], vetorAtual[i]);
        }
    }
}