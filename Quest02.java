import java.util.Scanner;

public class Quest02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite um número: ");
            valores[i] = sc.nextInt();
        }

        for (int valor : valores) {
            System.out.println("Valor: " + valor);
        }

        sc.close();
    }
}

