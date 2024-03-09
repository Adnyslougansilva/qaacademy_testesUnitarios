package easy;

public class Exercicio07_easy {

    public double calcularInss(double salario) {

        double inss = 0;
        if (salario <= 1320.00) {
            inss = salario * 0.075;
        }
        if (salario >= 1320.01 && salario <= 2571.29) {
            inss = salario * 0.09;
        }
        if (salario >= 2571.30 && salario <= 3856.94) {
            inss = salario * 0.12;
        } if (salario >= 3856.95 && salario <= 7507.49) {
            inss = salario * 0.14;
        }
        if (salario > 7507.49){
            inss = 1051.04;
        }
        return inss;
    }
}





