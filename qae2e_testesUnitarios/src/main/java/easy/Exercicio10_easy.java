package easy;

public class Exercicio10_easy {

    public Double calcularInvestimentoJurosSimples(double valorInvestimento) {

        double taxaJuros = 0.12;
        int tempoInvestido = 10;
        double taxaJurosTotal = 0.0;

        for (int i = 1; i <= tempoInvestido; i++) {
            taxaJurosTotal = taxaJurosTotal + taxaJuros;
        }
        double valorTotal = (valorInvestimento * taxaJurosTotal) + valorInvestimento;

        return valorTotal;
    }

    public Double calcularValorDeJuros(double valorTotal, double valorInvestimento){
        return (valorTotal - valorInvestimento);
    }

}