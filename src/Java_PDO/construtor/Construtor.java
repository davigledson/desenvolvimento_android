package Java_PDO.construtor;

public class Construtor {
    public Integer idade;
    public Float saldo;
    public String nome;

    public Construtor(int idade, float saldo, String nome){
        this.idade=idade;
        this.saldo= saldo;
        this.nome = nome;
    }

    public Construtor(){
        idade=0;
        saldo=0.0f;
        nome = " ";
    }
}
