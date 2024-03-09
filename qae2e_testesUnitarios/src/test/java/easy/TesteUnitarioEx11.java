package easy;

import org.junit.Assert;
import org.junit.Test;

public class TesteUnitarioEx11 {


    @Test
    public void testSomaDois(){
        int [] somaDoisAssert = {3, 5, 7};
        Exercicio11_easy exercicio11Easy = new Exercicio11_easy();
        int [] valorAtual = exercicio11Easy.somaDoisAoNumeroDigitado(1);
        for (int i = 0; i < somaDoisAssert.length; i++) {
            Assert.assertEquals(somaDoisAssert[i], valorAtual[i]);
        }
    }
}