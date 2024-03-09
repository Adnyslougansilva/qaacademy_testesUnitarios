package medium;

import org.junit.Assert;
import org.junit.Test;


public class TesteUnitarioEx06 {

        @Test
        public void testeCalcularFatorial(){
            Exercicio06_medium exercicio06_medium =  new Exercicio06_medium();
            Assert.assertEquals("3628800", exercicio06_medium.calculaFatorial(10).toString());
        }
        @Test
        public void testeCalcularFatorialValoresZero(){
            Exercicio06_medium exercicio06_medium =  new Exercicio06_medium();
            Assert.assertEquals("1", exercicio06_medium.calculaFatorial(0).toString());
        }
    }

