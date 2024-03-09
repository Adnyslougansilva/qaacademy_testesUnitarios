package medium;

import java.util.Random;

public class Exercicio09_medium {
    public void exibirNomeNumeracao(String [] nomeAlunos, Integer [] numeroAlunos) {

        if (nomeAlunos[0] == null || nomeAlunos[0].isEmpty()){
            System.out.println("Nao ha alunos para serem mostrados");
        }else {
            for (Integer i = 0; i<nomeAlunos.length; i++){
                System.out.println("Nome do aluno: " + nomeAlunos[i] + " - Numero: " + numeroAlunos[i]);
            }
        }
    }

    Integer [] atribuirNumeracaoAlunos(String[] nomeAlunos){
        Integer []numeroAlunos = new Integer[nomeAlunos.length];
        Random random = new Random();
        for (Integer i = 0; i < nomeAlunos.length; i++){
            numeroAlunos[i] = random.nextInt(100);
        }
        return numeroAlunos;
    }
}
