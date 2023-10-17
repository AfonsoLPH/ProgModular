import java.util.*;
public class Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int B[][] = new int [10][10];

        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B.length; j++) {

                if( i < j){
                    B[i][j] = 2*i +7*j-2;
                }
                if( i==j) {
                    B[i][j] = (int) ( Math.pow(i, 2)*3 - 1);
                }

                if( i > j) {
                    B[i][j] = (int)( Math.pow(i, 3)*4) + (int)(Math.pow(j, 2)*5) + 1;
                }
                
            }

                
            }
            for (int i = 0; i < B.length; i++) {
                for (int j = 0; j < B.length; j++) {
                    System.out.print( B[i][j] + "  ");
                }
                System.out.println( " ");
            }
        }
    }
