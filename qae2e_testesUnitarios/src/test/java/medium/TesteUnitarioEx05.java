package medium;

import org.junit.Assert;
import org.junit.Test;

public class TesteUnitarioEx05 {
    @Test
    public void testeMenorNumero(){
        int [] vetorMenorNumero = {2,4,5,8,1};
        Exercicio05_medium exercicio05Medium = new Exercicio05_medium();
        Assert.assertEquals("1", exercicio05Medium.retornaOmenorNumero(vetorMenorNumero).toString());
    }
}