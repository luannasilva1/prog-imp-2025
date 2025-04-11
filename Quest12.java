import java.util.Scanner;

public class Quest12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] valores = new double[5];
        double soma = 0, maior, menor;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = sc.nextDouble();
            soma += valores[i];
        }

        maior = menor = valores[0];
        for (double v : valores) {
            if (v > maior) maior = v;
            if (v < menor) menor = v;
        }

        System.out.println("Valores:");
        for (double v : valores) {
            System.out.println(v);
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média: " + (soma / 5));
        sc.close();
    }
}
