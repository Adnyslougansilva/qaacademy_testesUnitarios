package easy;

import easy.Exercicio06_easy;
import org.junit.Assert;
import org.junit.Test;

public class TesteUnitarioEx06 {


    @Test
    public void testeVerificarAprovacaoAluno() {
        Exercicio06_easy exercicio06Easy = new Exercicio06_easy();
        Assert.assertEquals("Você está aprovado!!!", exercicio06Easy.verificaAprovacaoAluno(5, 6));
        Assert.assertEquals("Você está reprovado!!!", exercicio06Easy.verificaAprovacaoAluno(4, 4));
        Assert.assertEquals("Você está de exame!!!", exercicio06Easy.verificaAprovacaoAluno(5, 5));


    }
}