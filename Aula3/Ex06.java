import java.util.*;
public class Ex06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A[][] = {
            {1,2},
            {3,4},
            {5,6},
        };
        int B[][] = {
            {1,2},
            {1,2},
        };

        int R[][] = new int [3][2];
        int soma = 0 ;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                soma = 0;
                for (int k = 0; k < 2; k++) {
                    soma = soma + A[i][k]* B[k][j];
                }

                R[i][j] = soma;
            }
            
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
      
                System.out.print(R[i][j] + "  ");       
            }
          System.out.println("  ");
        }
    }
}
