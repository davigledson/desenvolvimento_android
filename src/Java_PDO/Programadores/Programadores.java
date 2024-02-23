package Java_PDO.Programadores;

public class Programadores {
    public static void main(String[] args) {
        System.out.println(Senioridade.JUNIOR + " " + Senioridade.JUNIOR.getId());
        for (Senioridade s: Senioridade.values()){
            System.out.println(" O programdor " +s+ " deve ter" +s.getId() +" anos de experiencia ");
        }
    }
}
