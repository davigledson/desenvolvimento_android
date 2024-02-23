package Java_PDO;

public class Cliente {
public String nome = "davi";
private int anoNascimento;
protected  float comsumo = 1090f;

//Get e Set


    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) throws Exception {
        if((anoNascimento  <1960) || (anoNascimento> 2025)){
            throw new Exception("O ano de nascimento está Invalido");
        }
        this.anoNascimento = anoNascimento;
    }
}
//Public -> não realizar restricoes de acesso a variaveis e/ou e metodos
//Private -> atributo ou metodo fica disponivel somente a classe a que pertence
// Protected -> Está dispinivel ao pacote a que pertence