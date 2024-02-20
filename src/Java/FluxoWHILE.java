package Java;

public class FluxoWHILE {
    public static void main(String[] args) {
        int i =0;
        while(i<5){ //conta de 1 em 1 de forma crescente
            System.out.print(i + " ");
            i++;

        }
        i =0;
        System.out.println(); //conta de 2 em 2 de forma crescente
        while (i<10){
            System.out.print(i + " ");
            i+=2;
        }
        System.out.println();
        i--;
        while (i>=0){
            System.out.print(i +" ");
            i--;
        }
        System.out.println();
        i=9;
        while (i>=0){ //conta de 2 em 2 de forma decrescente
            System.out.print(i + " ");
            i-=2;
        }
    }
}
