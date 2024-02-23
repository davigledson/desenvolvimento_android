package Java_PDO.construtor;

import Java_PDO.Cliente.Cliente;

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

        new Cliente();
        Cliente c1 = new Cliente();
        c1.nome2 = "teste de importacao 2";
        System.out.println(c1.nome2);
    }

}
