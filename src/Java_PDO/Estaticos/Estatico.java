package Java_PDO.Estaticos;

public class Estatico {
    public static int c= 10;
    protected static int contador =0;
    public static int n=10;
    public  Estatico(){
        contador++;
    }

    public static String mensagem(){ //Metodo Estatico
        return "Ola seu nome é";

    }
    public static int i(){
        return 1+1;
    }
    public static void  mensagem_2(){
        System.out.println("Testando metodo void");
        mensagem();
        i();
        int h = n;
    }





}
