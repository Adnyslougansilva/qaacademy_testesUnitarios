package easy;

import easy.Exercicio08_easy;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteUnitarioEx08 {

    Exercicio08_easy exercicio08Easy;

    @Before
    public void before() {
        exercicio08Easy = new Exercicio08_easy();
    }

    @Test
    public void calcularIRMenorIgualDoisMil(){
        Assert.assertEquals("0.0", exercicio08Easy.calcularIr(2112.00));
    }

    @Test
    public void calcularIRMenorIgualDoisMilFaixa2(){
        Assert.assertEquals("0.0", exercicio08Easy.calcularIr(2112.01));
    }
    @Test
    public void calcularIRSegundaFaixa(){
        Assert.assertEquals("53.598749999999995", exercicio08Easy.calcularIr(2826.65));
    }
    @Test
    public void calcularIRTerceiraFaixa(){
        Assert.assertEquals("192.25750000000005",
                exercicio08Easy.calcularIr(3751.05));
    }
    @Test
    public void calcularIRQuartaFaixa(){
        Assert.assertEquals("397.8230000000001", exercicio08Easy.calcularIr(4664.68));
    }
    @Test
    public void calcularIRQuintaFaixa(){
        Assert.assertEquals("397.8297499999999", exercicio08Easy.calcularIr(4664.69));
    }
    @Test
    public void testeCalcularSalarioLiquido(){
        Double salario = 4664.69;
        Double imposto = exercicio08Easy.calcularIr(salario);
        Assert.assertEquals("4266.86025", exercicio08Easy.calcularSalarioLiquido(salario, imposto).toString());
    }
}