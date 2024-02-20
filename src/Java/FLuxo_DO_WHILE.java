package Java;

public class FLuxo_DO_WHILE {
    public static void main(String[] args) {
        int a =0;
        do{ // contagem de 1 em 1 de forma crescente
            System.out.println(a +" ");
            a++;
        } while (a<10);
       int b = 0;
        do{
            System.out.println(b + " "); // contagem de 2 em 2 de forma crecente
            b+=2;
        } while (b!=10);

        int c = 9;
        do{
            System.out.println(c + " "); // contagem de 1 em 1 de forma decrecente
            c--;
        }while (c>=10);
        int d = 0;
        do{
            System.out.println(d + " "); // contagem de 2 em 2 de forma decrecente
            d-=2;
        }while (d>=0);


        for(int k=0;k==8;k++){
            System.out.println("Imprimindo FOR");
        }
        int e =0;
        while (e ==3){
            System.out.println("Imprimindo WHILE");
        }
        System.out.println();
        int f = 0;
        do{
            System.out.println("Imprimindo DO...WHILE");
        } while (f==8);
    }
}
