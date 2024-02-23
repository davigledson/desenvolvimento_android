package Java_PDO.Defaults;

public class Default {
    public static void main(String[] args) {
        OBJ_Default d = new OBJ_Default();
        System.out.println("Nome: " +d.nome);
        System.out.println("numero: " +d.numero);
        System.out.println("Float: " +d.f);
        System.out.println("Bolean: " +d.b);
        System.out.println("Double: " +d.d);
        System.out.println("Numero referencial (colocando o zero por padrão): " + d.obj);
    }
}
