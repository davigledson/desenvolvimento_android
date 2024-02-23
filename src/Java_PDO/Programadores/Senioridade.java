package Java_PDO.Programadores;

public enum Senioridade {
    APRENDIZ(1), JUNIOR(4), PLENO(10), SENIOR(15), ESPECIALISTA(20);
    public int id;
    Senioridade(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
