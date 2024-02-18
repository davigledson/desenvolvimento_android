package Java;

public class operadores_matematicos {
    public static void main(String[] args) {

        System.out.println("5 + 2 = " + (5*2));
        System.out.println("5 - 2 = " + (5-2));
        System.out.println("5 * 2 = " + (5*2));
        System.out.println("5 / 2 = " + (5/2));
        float a = 5.0f;
        int b = 2;
        System.out.println("5 / 2 = " + (a/b));
        System.out.println("5 % 2 = " + (5%2));

        int x = 10;
        int y = 20;
        x = x + y;
        System.out.println(x);
        x+=y;
        System.out.println(x);

        y++; // = y = y + 1
        System.out.println(y);

    }
}
