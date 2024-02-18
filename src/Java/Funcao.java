package Java;

public class Funcao {
    //com retorno - Tipo de dados com parametros ou sem parametros
    //sem retorno - Void - com parametros ou sem parametros

    void Hello(){ // funcao sem parametros e sem parametros
        System.out.println("Olá");
    }

    void Hello(String nome){
        System.out.println("Olá " + nome);
    }

    String chegada(){ //Função com retorno e sem parametros
        return "Olá";
    }

    String chegada(String nome){ //funcao com retorno e com parametros
        return "Olá " + nome + " ";

    }

    int sum(int n1,int n2){
        Hello();
        return n1+n2;
    }

    public static void main(String[] args) {
        new Funcao().Hello();
        new Funcao().Hello("Davi");
        String x = new Funcao().chegada();
        System.out.println(x);

        String y = new Funcao().chegada("gledsonm");
        System.out.println(y);

        Integer z = new Funcao().sum(2,4);
        System.out.println(z);

    }
}
