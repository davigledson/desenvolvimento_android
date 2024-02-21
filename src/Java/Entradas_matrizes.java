package Java;

import java.util.Scanner;

public class Entradas_matrizes {
    public static void main(String[] args) {


        Scanner  scanner = new Scanner(System.in);
        System.out.println("Digite o numero de linhas:");
        int l = scanner.nextInt();
        System.out.println("Digite o lumeros de colunas");
        int c = scanner.nextInt();

        int[][] matriz = new int [l][c];
        System.out.println("Digite os elementos da matriz");
        for (int i =0;i<l;i++){
            for(int j =0;j<c;j++){
                matriz[i][j] = scanner.nextInt();
            }

        }
        System.out.println("Matriz lido, agora vamos imprimi-las");
        for (int i =0;i<l;i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
            scanner.close();

    }
}
