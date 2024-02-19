package Java;

public class Formato_String {
    public static void main(String[] args) {
        String str = "Curso de Android";
        System.out.println("Tamanho da String " +str.length());
        System.out.println("Terceira posição da String é: "+ str.charAt(2));
        System.out.println(str.equals("Curso de IOS"));// comparacao entre string
        System.out.println(str.startsWith("Curso"));
        System.out.println(str.endsWith("Android"));
        System.out.println(str.substring(5));
        System.out.println(str.substring(0,5));
        System.out.println(str.substring(0,8));
        System.out.println(str.replace("Curso","Curso top"));
        System.out.println(str.replace("o","a"));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        String str2 = "       curso de android 2    ";
        System.out.println(str2.trim());
    }
}
