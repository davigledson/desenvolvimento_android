package Java;

public class Vetores_Letras_Numeros {
    public static void main(String[] args) {
        char letras[] = {'a','v','g','j','k'};
        Character letras_2[] = {'A','B','C','D','E'};
        for(int i=0;i<5;i++){
            System.out.println("Vetor de letras minusculas:" +
                    letras[i] + " vetor de letras maisuculas" +
                    letras_2[i]);
        }
        System.out.println("----------------------------------");
        char[] alfabeto = new char[26];
        char l = 'a';
        for(int i=0;i<alfabeto.length;i++){//tabela ASP
            alfabeto[i] = l;
            l++;

        }
        for(int i=0;i<alfabeto.length;i++){
            System.out.print(alfabeto[i] + " ");
        }
        System.out.println();
        String nomes[] = {"davi","carlos","gledson","silva"};
        for (int i =0;i<nomes.length;i++){
            System.out.println(nomes[i] + " ");
        }
        
    }
}
