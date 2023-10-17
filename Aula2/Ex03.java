import java.util.*;
public class Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int V1[]= new int [3];

        int M1[][] = {
            {1,2,3},
            {5,2,3},
            {6,2,3},
        };
        for (int i = 0; i < M1.length; i++) {
            for (int j = 0; j < M1.length; j++) {

                if(j==0){
                    V1[0] = V1[0] + M1[i][j];
                }
                if(j==1){
                    V1[1] = V1[1] + M1[i][j];
                }
                if(j==2){
                    V1[2] = V1[2] + M1[i][j];
                }
            }
        }

        for (int i = 0; i < M1.length; i++) {
            for (int j = 0; j < M1.length; j++) {
                System.out.print(M1[i][j]+"  ");
            }
            System.out.println( "  ");       
        }

        for (int i = 0; i < V1.length; i++) {

            System.out.println( V1[i]);
            
        }
    }
        
}


