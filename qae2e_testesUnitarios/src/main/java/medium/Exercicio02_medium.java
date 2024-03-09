package medium;

public class Exercicio02_medium {
    public Double calcularInvstimentoJurosCompostos(double valorInvestimento) {
        int tempoDeInvestimento = 10;
        double valorTotal = 0.0;
        double taxaDeJuros = 0.12;
        valorTotal = valorInvestimento;

        for (int i = 0; i < tempoDeInvestimento; i++) {
            valorTotal = (valorTotal * taxaDeJuros) + valorTotal;
        }
        return valorTotal;
    }

    public Double calcularValorDosJuros(double valorTotal, double valorInvestido){
        return (valorTotal - valorInvestido);
    }
}
