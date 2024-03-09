package easy;

import org.junit.Assert;
import org.junit.Test;

public class TesteUnitarioEx2 {


    @Test
    public void testePalavraDigitada(){
        Exercicio02_easy exercicio02Easy = new Exercicio02_easy();
        String palavraDitada = "TesteUnitario";
        Assert.assertEquals("Você digitou: " + palavraDitada, exercicio02Easy.exibirPalavra(palavraDitada));
    }
}