package Java;

public class SwitchCase {
    float calculadora(String carga, float salario) {
        carga = carga.toLowerCase();
        float bonus = 0f;
//        if (carga.equals("gerente")) {
//            bonus = salario * 1.5f;
//        } else if (carga.equals("analista")) {
//            bonus = salario * 1.2f;
//        } else if (carga.equals("supervisor")) {
//            bonus = salario * 1.5f;
//        } else {
//            bonus = salario * 0.7f;
//        }
//        return bonus;
//    }
        switch (carga) {
            case "gerente":
                bonus = salario * 1.5f;
                break;
            case "analista":
                bonus = salario * 1.3f;
                break;
            case "supervisor":
                bonus = salario * 0.7f;
                break;
            default:
                bonus = salario * 1;
        }
        return bonus;
    }
    public static void main(String[] args) {
        String cargo = "gerente";
        float salario = 1000f;
        float bonus = new SwitchCase().calculadora(cargo,salario);
        System.out.println("o  cargo é " + cargo+". e seu bonus é " + bonus);

    }
}
