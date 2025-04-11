import java.util.Scanner;

public class Quest08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[6];

        for (int i = 0; i < 6; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("Ordem inversa:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(vetor[i]);
        }

        sc.close();
    }
}
