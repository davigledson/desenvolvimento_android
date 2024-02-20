package Java;

public class Continue_Break {
    public static void main(String[] args) {
        System.out.print("Continue no FOR");
        for(int i=0; i<=20;i++){
            if(i%2 ==0){
                continue; //Pular para a proxima posiçao, baseada na condiçao (imprimir os impares)
            }
            System.out.print(i+ " ");
        }

        System.out.println();
        System.out.print("Break no FOR");
        for(int i=0; i<=20; i++){
            if(i ==10){
                break; //pare, baseada na condiçao (imprimir os impares)
            }
            System.out.print(i + "  ");
        }
        System.out.println();
        System.out.print("Continue no WHILE");
        int a =0;
        while (a<=20){
            a++;
            if(a%2 ==1){
                continue; // Imprimir os pares
            }
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.print("Break no WHILE");
        a =0;
        while (a<=20){
            a++;
            if(a==10){
                break;
            }
            System.out.print(a + " ");
        }

        System.out.println();
        System.out.print("continue no DO_WHILE");
        int b =0;
        do{
            b++;
            if(b%3==0){
                continue; //Não Imprime os numeros divisiveis por 3.
            }
            System.out.print(b + " ");

        }while (b<=20);
        System.out.println();
        System.out.println("BREAK no DO WHILE");
        b=0;
        do{
            b++;
            if(b==10){
                break;
            };
            System.out.print(b +" ");
        }while (b<=20);

    }
}
