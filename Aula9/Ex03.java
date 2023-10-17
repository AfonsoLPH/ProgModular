import java.util.*;

import javax.swing.plaf.FontUIResource;
public class Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int M1[][] = {
            {10,2,3},
            {12,5,3},
            {11,6,4},
        };

        System.out.println( " MATRIZ  ORIGINAL");

        for (int i = 0; i < M1.length; i++) {
            for (int j = 0; j < M1.length; j++) {

                System.out.print( M1[i][j] + " ");
            }

            System.out.println( "   ");
            
        }

        transforma(M1);

        System.out.println( " MATRIZ TRANSPOSTA");

        for (int i = 0; i < M1.length; i++) {
            for (int j = 0; j < M1.length; j++) {

                System.out.print(M1[i][j] + " ");
            }

            System.out.println("   ");

        }

    }

    public static void transforma ( int M1[][]){

        int MT[][] = new int [M1.length][M1.length];

      for (int i = 0; i < M1.length; i++) {
        for (int j = 0; j < M1.length; j++) {

            MT[i][j] = M1[i][j];
}

    }

    for (int i = 0; i < M1.length; i++) {
        for (int j = 0; j < M1.length; j++) {

            M1[i][j] = MT[j][i];
            
        }
}
}
}

