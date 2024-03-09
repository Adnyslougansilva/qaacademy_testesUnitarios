package medium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteUnitarioEx02 {
    Exercicio02_medium exercicio02Medium;

    @Before
    public void before() {
        exercicio02Medium = new Exercicio02_medium();

    }

    @Test
    public void testeCalcularInvstimentoJurosCompostos() {
        Assert.assertEquals("31058.482083442083", exercicio02Medium.calcularInvstimentoJurosCompostos(10000.00).toString());
    }

    @Test
    public void testeCalcularValorDosJuros() {
        Double valorTotal = 31058.482083442083;
        Double valorInvestido = 10000.00;
        Assert.assertEquals("21058.482083442083", exercicio02Medium.calcularValorDosJuros(valorTotal, valorInvestido).toString());
    }
}