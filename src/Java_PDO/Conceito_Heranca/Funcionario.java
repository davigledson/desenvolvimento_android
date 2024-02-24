package Java_PDO.Conceito_Heranca;

//quando utilizaro  final em um classe restringe a mesma de herança
public class Funcionario{
    public  String nome;
    protected int idade;
    protected float salario;
    protected float bonus;
    public  final int teste = 10; //nao consegue realizar a mudança para outro
    // calor da variavel (constante)
    protected float horaExtra(int h, int f){
        return (h *1.5f) * (f*2f);

    }
    public   void saudacao(){ //o metodo (com final) não será disponivel para realizar o Override
        System.out.println("Olá!");
    }

}
