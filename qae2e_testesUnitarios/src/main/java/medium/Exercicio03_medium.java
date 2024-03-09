package medium;

public class Exercicio03_medium {
    public void somaAteMil() {

        int somar = 0;
        for (int i = 0; i <= 1000; i++) {
            somar = i + somar;
            if (somar >= 1500) {
                System.out.println("A soma dos numeros parou em : " + i + " é " + somar);
                break;
            }
        }
        System.out.println("Limite atingido!");
    }
}
