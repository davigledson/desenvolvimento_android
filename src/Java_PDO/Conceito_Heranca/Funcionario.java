package Java_PDO.Conceito_Heranca;

public class Funcionario{
    public  String nome;
    protected int idade;
    protected float salario;
    protected float bonus;
    protected float horaExtra(int h, int f){
        return (h *1.5f) * (f*2f);

    }
    public  void saudacao(){
        System.out.println("Olá!");
    }

}
