package easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteUnitarioex10 {

    Exercicio10_easy exercicio101Easy;

    @Before
    public void before() {
        exercicio101Easy = new Exercicio10_easy();
    }

    @Test
    public void testCalcularInvestimentoJurosSimples() {
        Assert.assertEquals("2200.0", exercicio101Easy.calcularInvestimentoJurosSimples(1000.00).toString());
    }


    @Test
    public void testCalcularValorInvestimento() {
        Double valorTotal = exercicio101Easy.calcularInvestimentoJurosSimples(1000.00);
        Double valorInvestimento = 1000.0;
        Assert.assertEquals("1200.0",exercicio101Easy.calcularValorDeJuros(valorTotal, valorInvestimento).toString());
    }

}