package Java;

public class Vetores_Numeros {
    public static void main(String[] args) {
        int c=50,z=40,e=50,t =98;
        int[] v= new int[4];
        v[0] = 50;
        v[1] = 40;
        v[2] = 100;
        v[3] = 5; //a até n-1
        for(int i=0;i<v.length;i++){
            System.out.println("o vetor na posião " +i+ " contem o valor: " +v[i]);
        }
        Integer numeros[]={1,2,3,4,5,6,7,8,9};
        for(int i=0;i<numeros.length;i++){
            //System.out.print(i +" ");
            System.out.println("o vetor na posião " +i+ " contem o valor: " +numeros[i]);
        }
        System.out.print("--------------------------------");

        float decimais[] = {1f,2f,3f,4f,5f};
        float soma=0f;
        for(int i=0; i<decimais.length; i++){
            soma+=decimais[i];
            System.out.println("A soma é:" + soma);
        }
    }
}
