package Java;

public class FOR {
    public static void main(String[] args) {
        //for(inicio;condicao de parada;forma de contar){}
        for(int i=0;i<20; i++){
            System.out.print(i +" ola ");
        }
        System.out.println();
        for(int i=9;i>=0;i--){
        System.out.print(i + " ");
        }
        System.out.println();//crecente
        for(int i =1; i<=10;i+=2){
            System.out.print(i + " ");
        }

        System.out.println(); //decrecente
        for(int i =1; i<=10;i-=2){
            System.out.print(i + " ");
        }
    }
}
