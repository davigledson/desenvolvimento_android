package Java_PDO;

import Java_PDO.Cliente.Cliente;

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        //Pessoa -> tipo do objeto (Classe)
        //p -> o objeto que representa a classe pessoa
        //New Pessoa() -> o espaço de memoria que é reservada para o objeto p
        System.out.print("O seu nome é" + p.str);
        System.out.print("O seu nome é" + p.ano_nascimento);
        p.fala();
        new Cliente();
        Cliente c1 = new Cliente();
        c1.nome2 = "Benedito";
        System.out.println(c1.nome2);
    }
}
