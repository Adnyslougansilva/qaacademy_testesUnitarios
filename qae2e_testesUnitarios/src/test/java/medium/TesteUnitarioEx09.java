package medium;

import org.junit.Assert;
import org.junit.Test;

public class TesteUnitarioEx09 {

    @Test
    public void testeAtribuicaoNumeracao(){
        String [] alunos = {"Adriana", "Adnys", "Flavio", "Jesse", "Valeria"};
        Exercicio09_medium exercicio09Medium = new Exercicio09_medium();
        Integer [] vetNumeracao = exercicio09Medium.atribuirNumeracaoAlunos(alunos);
        exercicio09Medium.exibirNomeNumeracao(alunos, vetNumeracao);

        for (int i = 0; i < alunos.length; i++) {
            Assert.assertFalse(vetNumeracao[i].toString().isEmpty());
        }
    }
    @Test
    public void testeAtribuicaoNumeracaoValidaNomeNull(){
        String [] alunos = {null, "Adnys", "Flavio", "Jesse", "Valeria"};
        Exercicio09_medium exercicio09Medium = new Exercicio09_medium();
        Integer [] vetNumeracao = exercicio09Medium.atribuirNumeracaoAlunos(alunos);
        exercicio09Medium.exibirNomeNumeracao(alunos, vetNumeracao);

        for (int i = 0; i < alunos.length; i++) {
            Assert.assertFalse(vetNumeracao[i].toString().isEmpty());
        }
    }
}