import java.util.Scanner;

public class Quest11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vetor = new double[10];
        int negativos = 0;
        double somaPositivos = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextDouble();
            if (vetor[i] < 0) negativos++;
            else somaPositivos += vetor[i];
        }

        System.out.println("Negativos: " + negativos);
        System.out.println("Soma dos positivos: " + somaPositivos);
        sc.close();
    }
}
