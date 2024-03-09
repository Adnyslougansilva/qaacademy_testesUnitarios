package easy;

public class Exercicio06_easy {

    public String verificaAprovacaoAluno(double nota1, double nota2) {

            double media = (nota1 + nota2) / 2;

            if (media >5){
                return ("Você está aprovado!!!");
            }
            else if (media ==5){

                return ("Você está de exame!!!");
            }
            else {
                return ("Você está reprovado!!!");
            }

    }

}

