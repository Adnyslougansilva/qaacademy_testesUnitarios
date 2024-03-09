package easy;

import easy.Exercicio03_easy;
import org.junit.Assert;
import org.junit.Test;

public class TesteUnitarioEx3 {

    @Test
    public void testTrocaValoresDigitados(){
        Exercicio03_easy exercicio03Easy = new Exercicio03_easy();
        String msgTrocada =  exercicio03Easy.trocaValorDigitado("Primeiro valor digitado", "Segundo valor digitado");
        Assert.assertEquals("Primeiro valor: Segundo valor digitado|Segundo valor: Primeiro valor digitado",  msgTrocada);

    }
}
