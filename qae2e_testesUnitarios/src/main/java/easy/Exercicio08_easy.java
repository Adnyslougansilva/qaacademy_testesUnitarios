package easy;

public class Exercicio08_easy {

    public Double calcularIr(double salario) {

        double impostoRenda = 0.0;
        double aliquotaImposto = 0.0;
        double deducaoImposto = 0.0;
        if (salario <= 2112.00) {
            impostoRenda = 0;
        }

        if (salario >= 2112.01 && salario <= 2826.65) {
            aliquotaImposto = 0.075;
            deducaoImposto = 158.40;
            impostoRenda = (salario * aliquotaImposto) - deducaoImposto;
            if (salario == 2112.01) {
                impostoRenda = 0.0;
            }

        }
        if (salario >= 2826.66 && salario <= 3751.05) {
            aliquotaImposto = 0.15;
            deducaoImposto = 370.40;
            impostoRenda = (salario * aliquotaImposto) - deducaoImposto;
        }
        if (salario >= 3751.06 && salario <= 4664.68) {
            aliquotaImposto = 0.225;
            deducaoImposto = 651.73;
            impostoRenda = (salario * aliquotaImposto) - deducaoImposto;
        }
        if (salario >= 4664.69) {
            aliquotaImposto = 0.275;
            deducaoImposto = 884.96;
            impostoRenda = (salario * aliquotaImposto) - deducaoImposto;
        }
        return impostoRenda;
    }

    public Double calcularSalarioLiquido(double salario, double impostoDeRenda){
        return salario - impostoDeRenda;
    }
}