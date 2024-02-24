package Java_PDO.Aula_interface;

public class Computador implements Maquina,Teste{
    @Override
    public void teste() {
        System.out.println("Computador realizando teste...");

    }

    @Override
    public void liga() {
        System.out.println("Computador ligando...");
    }

    @Override
    public void desligar() {
        System.out.println("Computador desligando...");
    }

    @Override
    public void testar() {

    }
}
