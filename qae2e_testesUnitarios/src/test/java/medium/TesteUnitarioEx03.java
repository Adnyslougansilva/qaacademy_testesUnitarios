package medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteUnitarioEx03 {
    int[] vetorSomaAteMilEsperado;
    Exercicio03_medium exercicio03Medium;

    @Before
    public void before() {
        vetorSomaAteMilEsperado = new int[]{0, 1, 3, 6};
        exercicio03Medium = new Exercicio03_medium();
    }

    @Test
    public void testeSomeAteMil() {
        int[] vetorAtual = exercicio03Medium.somaAteMil();
        for (int i = 0; i < vetorSomaAteMilEsperado.length; i++) {
            Assert.assertEquals(vetorSomaAteMilEsperado[i], vetorAtual[i]);
        }
    }
}