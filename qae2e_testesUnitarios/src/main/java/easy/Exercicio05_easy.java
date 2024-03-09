package easy;

public class Exercicio05_easy {

    public Integer calcularSoma(int num1, int num2, int num3) {
            int somar = num1 + num2 + num3;
            return somar;
        }
        public Integer calcularSubtrair(int num1, int num2, int num3){
            int subtrair = num2 - num1;
            return subtrair;
        }
        public Integer calcularMultiplicar(int num1, int num2, int num3){
            int multiplicar = num1 * num2 * num3;
            return multiplicar;
        }
        public Integer calcularMedia(int num1, int num2, int num3){
            int media = calcularMultiplicar(num1, num2, num3) / 3;
            return media;
        }

}


