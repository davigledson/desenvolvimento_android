package _4_orientacao_a_objeto;

public class Escopo {
    static int valor = 0;
    int value =0;
    public Escopo(){
        value++;
        valor++;
    }

    public  static void main(String[] args){
        new Escopo();
        new Escopo();
        new Escopo();
        new Escopo();

        Escopo s = new Escopo();
        System.out.println(s.valor); //Pertence ao escopo classse, por isso incremento
        System.out.println(s.value); //Pertence ao escopo objeto, imcrementa uma vez

        for(int i=0;i<4;i++){
            s.value++;
        }
        System.out.println(s.value);
    }

}
