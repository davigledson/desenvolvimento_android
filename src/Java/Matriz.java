package Java;

public class Matriz {
    public static void main(String[] args) {
        /*
        *   0 => 0, 1, 2, 3
        *   1 => 0, 1, 2
        *   2
        *   3
        *   4
        *   5
        *   6
        *   7
        * */

        int[][] matriz = new int[4][4];
        for(int i = 0;i<matriz.length;i++){
            for(int j =0 ; j<matriz[i].length ; j++){
                matriz[i][j] = i+j;
            }
        }
        for(int i = 0;i<matriz.length;i++){
            for(int j =0 ; j<matriz[i].length ; j++){
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("-------------------------");

        int[][] mt = new int[4][];
        mt[0] = new int[5];
        mt[1] = new int[3];
        mt[2] = new int[8];
        mt[3] = new int[9];
        for(int i = 0;i<mt.length;i++){
            for(int j =0 ; j<mt[i].length ; j++){
                mt[i][j] = i+j;
            }
        }
        for(int i = 0;i<mt.length;i++){
            for(int j =0 ; j<mt[i].length ; j++){
                System.out.print(mt[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();

        int m[][] ={{1},{2}};

        for(int i = 0;i<m.length;i++){
            for(int j =0 ; j<m[i].length ; j++){
                System.out.print(m[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
