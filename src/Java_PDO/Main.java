package Java_PDO;

public class Main {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        //Pessoa -> tipo do objeto (Classe)
        //p -> o objeto que representa a classe pessoa
        //New Pessoa() -> o espaço de memoria que é reservada para o objeto p
        System.out.print("O seu nome é" + p.str);
        System.out.print("O seu nome é" + p.ano_nascimento);
        p.fala();
    }
}
