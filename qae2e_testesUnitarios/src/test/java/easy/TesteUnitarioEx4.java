package easy;

import easy.Exercicio04_easy;
import org.junit.Assert;
import org.junit.Test;

public class TesteUnitarioEx4 {

    @Test
    public void testeCalcularDobro(){
        Exercicio04_easy exercicio04Easy = new Exercicio04_easy();
        Assert.assertEquals("4", exercicio04Easy.calcularDobro(2).toString());

    }

}
