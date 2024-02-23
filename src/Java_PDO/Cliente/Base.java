package Java_PDO.Cliente;

public class Base {
    public static void main(String[] args) {
//        try {
//            Cliente c = new Cliente();
//            c.nome = "davi";
//            System.out.println("O nome informado é: " + c.nome);
//            System.out.println("O sue comsumo foi de "+ c.comsumo);
//            c.setAnoNascimento(2000);
//            System.out.println("O ano de nacimento é" +c.getAnoNascimento());
//        } catch (Exception e){
//            System.err.println(e.getMessage());
//        }


            Cliente c = new Cliente();
            c.nome = "davi";
            System.out.println("O nome informado é: " + c.nome);
            System.out.println("O sue comsumo foi de "+ c.comsumo);
            c.setAnoNascimento(2000);
            System.out.println("O ano de nacimento é" +c.getAnoNascimento());

            //Cliente c2 = c; //esta apontando para o objecto c
            Cliente c2 = new Cliente();
            c2.setNome("Gledson");
            System.out.println("Pessoa 1:" + c.getNome());
            System.out.println("Pessoa 2:"+ c2.getNome());

            Cliente c3 = new Cliente();


    }
}
