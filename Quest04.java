import java.util.Scanner;

public class Quest04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[8];

        for (int i = 0; i < 8; i++) {
            System.out.print("Digite o valor da posição " + i + ": ");
            vetor[i] = sc.nextInt();
        }

        System.out.print("Digite o índice X (0 a 7): ");
        int x = sc.nextInt();
        System.out.print("Digite o índice Y (0 a 7): ");
        int y = sc.nextInt();

        int soma = vetor[x] + vetor[y];
        System.out.println("Soma: " + soma);
        sc.close();
    }
}
