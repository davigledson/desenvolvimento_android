package Java_PDO.Conceito_Heranca;

public class Operario extends Funcionario{
    public int meta;

    @Override
    public void saudacao() {
        //super.saudacao();
        System.out.println("Olá, tudo bem!");
    }

    //digita @ e dps o nome da funcao para o override automatico
    @Override
    protected float horaExtra(int h, int f) {
      //  return super.horaExtra(h * 3, f * 2);
        return (h * 3) + ( f * 2);
    }
    public  void trabalhar(int h){

    }

    public  void trabalhar(char g){

    }
    public  void trabalhar(int h,int g){

    }
    @Override
    public void pagarImposto() {
        System.out.println("O operario paga 7% de imposto");
    }
}
