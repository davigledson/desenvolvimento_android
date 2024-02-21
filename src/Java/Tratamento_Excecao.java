package Java;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tratamento_Excecao {
    public static void main(String[] args) {
        String str = "ABC"; // 0 1 2
        String nome = null;
        Scanner scanner = new Scanner(System.in);
        try {
            int x = 10/0;
            System.out.println("Tamanho da String nome" + nome.length());
            System.out.println(str.charAt(1));
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Posição invalida");
        } catch (NullPointerException e){
            System.out.println("Não existe nome digitado");
        } catch (ArithmeticException e ){
            System.out.println("Não existe diviçao por zero");
        } catch (InputMismatchException e){
            System.out.println("O numero digitado deve ser do tipo inteiro");
        } catch (Exception e ){//tem que ser o ultimo
            System.out.println("Exceção generica ");
        } finally {
            System.out.println("Excutando finally ");
        }
    }
}
