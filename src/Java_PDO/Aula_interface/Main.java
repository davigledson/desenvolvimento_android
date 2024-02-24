package Java_PDO.Aula_interface;

public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador();
        pc.liga();
        pc.teste();
        pc.desligar();
        Integer c = pc.x;
        int x = pc.y;
        System.out.println(c);
        System.out.println(x);
    }
}
