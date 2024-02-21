package Java;

import java.util.Scanner;

public class Entrada_de_dados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um numero do tipo inteiro:");
        int x = sc.nextInt();
        System.out.println("O numero digitado foi:" + x);

        System.out.println("Informe um numero do tipo decimal");
        Double y = sc.nextDouble();
        System.out.println("O numero digitado foi "  +y);

        sc.nextLine();
        System.out.println("informe um nome:");
        String str = sc.nextLine();

        System.out.println("O nome digitado foi" + str);
    }
}
