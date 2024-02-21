package Java;

import java.util.Scanner;

public class Entrada_e_Vetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do vetor:");
        int tamanho = scanner.nextInt();

        int [] vetor = new int[tamanho];

        System.out.println("Digite os elementos do vetor");
        for (int i =0;i<tamanho;i++){
            vetor[i] = scanner.nextInt();

        }
        System.out.println("Vetor lido, agora vamos realizar a impressaõ");
        for (int i =0; i<tamanho; i++){
            System.out.print(vetor[i]+" ");
        }
    }
}
