package Java;

public class IF_aninhado {
    public static void main(String[] args) {
        int v=6;
        if(v%2==0){ //Nivel 1
            if(v%3 ==0){ //Nivel 2
                if(v % 4==0){//nivel 3
                    System.out.println("o numero é divisivel por 4 e 6");

                } else{
                    System.out.println("o numero é divisivel por 6");
                }
                System.out.println("o numero é divisivel por 2");
            } else {
                System.out.println("o numero é divisivel por 2");
            }


        }
        else {
            System.out.println("O numero é divisivel por "+2);
        }
    }
}
