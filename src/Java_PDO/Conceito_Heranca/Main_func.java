package Java_PDO.Conceito_Heranca;

public class Main_func {
    public static void main(String[] args) {
        Operario op = new Operario();
        op.nome = "Davi";
        op.idade  = 19;
        op.salario = 1456f;
        op.bonus = 300f;
        float h = op.horaExtra(10, 10);
        System.out.println("O ganho mensal do funcionario" + op.nome + " i de:" + (op.salario + op.bonus +h));
        op.saudacao();
       // op.trabalhar();
        System.out.println(op.teste);
        int g = Categorias.JUNIOR; //não dar para alterar (por ser ter um modificador final)
        Funcionario f1 = new Gerente();
        Funcionario f2 = new Operario();
        Gerente g1 = new Gerente();
        Operario op1 = new Operario();
        polimorfismo(f1);
        polimorfismo(f2);
        polimorfismo(g1);
        polimorfismo(op1);



    }

    private static void polimorfismo(Funcionario f){
        f.pagarImposto();
    }
}
