package Java_PDO.Conceito_Heranca;

public class Gerente extends Funcionario{
    @Override
    public void pagarImposto() {
        System.out.println("O gerente paga 15% de imposto");
    }
}
