package Java;

public class OP_ternario {
    String maiorDeIdade(int idade){
//        if(idade>=10){
//            return "maior de idade";
//        } else {
//            return "Menor de idade";
//        }

    //expressao ? true: false;
        String str =(idade>= 18) ? "maior de idade" : "menor de idade";
    return  str;
    }
    public static void main(String[] args) {
    int x = 17;
    String z = new OP_ternario().maiorDeIdade(x);
        System.out.println(z);
    }
}
