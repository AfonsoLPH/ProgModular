import java.util.*;
public class Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int aux = 0;
        int M1[][] = {
            {1,2,3,4,5,6},
            {7,8,9,10,11,12},
            {13,14,15,16,17,18},
            {17,19,20,21,22,23},
            {24,25,26,27,28,29},
            {30,31,32,33,34,35},
        };
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {

                System.out.print(M1[i][j]+ "  ");
            }
            System.out.println("  ");
        }
        for (int i = 0; i <6; i++) {
            for (int j = 0; j < 6; j++) {
                if(j%2==0){
                    aux = M1[i][j];
                    M1[i][j] = M1[i][j+1];
                    M1[i][j+1] = aux;
                }
                System.out.print(M1[i][j]+"  ");
                
            }
            System.out.println("   ");
        }

    }
}
