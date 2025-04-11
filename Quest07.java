import java.util.Scanner;

public class Quest07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        int maior = Integer.MIN_VALUE;
        int posicao = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
            if (vetor[i] > maior) {
                maior = vetor[i];
                posicao = i;
            }
        }

        System.out.println("Vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.println("[" + i + "] = " + vetor[i]);
        }
        System.out.println("Maior valor: " + maior + " na posição " + posicao);
        sc.close();
    }
}
