package _4_orientacao_a_objeto;

public class Main {
    public  static void  main(String[] args){
        Planet p = new Planet();
        System.out.println(p.getNome_());
        p.setNome_("Planeta Terra");
        System.out.println(p.getNome_());
    }
}
