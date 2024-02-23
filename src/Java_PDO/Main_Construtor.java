package Java_PDO;

public class Main_Construtor {
    public static void main(String[] args) {
        new Construtor();
        Construtor c = new Construtor(15,2000f,"Davi");
        Construtor c2 = new Construtor();

        System.out.println(c.idade);
        System.out.println(c.nome);
        System.out.println(c.saldo);

        System.out.println(c2.idade);
        System.out.println(c2.nome);
        System.out.println(c2.saldo);
    }

}
