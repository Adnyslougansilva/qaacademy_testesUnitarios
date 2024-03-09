package easy;

import easy.Exercicio05_easy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteUnitarioEx05 {
    Exercicio05_easy exercicio05Easy;

    @Before
    public void before(){
        exercicio05Easy = new Exercicio05_easy();
    }

    @Test
    public void testeCalcularSoma(){
        Assert.assertEquals("6",  exercicio05Easy.calcularSoma(1,2,3).toString());
    }
    @Test
    public void testeCalcularSubtracao(){
        Assert.assertEquals("0",  exercicio05Easy.calcularSubtrair(2,2,2).toString());
    }
    @Test
    public void testeCalcularMultiplicacao(){
        Assert.assertEquals("6",  exercicio05Easy.calcularMultiplicar(1,2,3).toString());
    }
    @Test
    public void testeCalcularMedia(){
        Assert.assertEquals("41",  exercicio05Easy.calcularMedia(5,5,5).toString());
    }
}
