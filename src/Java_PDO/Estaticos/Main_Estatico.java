package Java_PDO.Estaticos;

public class Main_Estatico {
    public static void main(String[] args) {
        Estatico c = new Estatico();
        System.out.println(c.c);
        for (int i=0;i<5;i++){
            Estatico.contador++;
        }
        System.out.println(Estatico.contador);
        new Estatico();
        new Estatico();
        new Estatico();
        new Estatico();
        new Estatico();

        System.out.println(Estatico.mensagem());
        Estatico.mensagem_2();
    }
}
