package Java_PDO;

public class Base {
    public static void main(String[] args) {
        try {
            Cliente c = new Cliente();
            c.nome = "davi";
            System.out.println("O nome informado é: " + c.nome);
            System.out.println("O sue comsumo foi de "+ c.comsumo);
            c.setAnoNascimento(2000);
            System.out.println("O ano de nacimento é" +c.getAnoNascimento());
        } catch (Exception e){
            System.err.println(e.getMessage());
        }

    }
}
