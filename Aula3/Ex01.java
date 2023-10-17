import java.util.*;
public class Ex01{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int contador = 0;

       int M1[][] = new int [4][4];

        System.out.println( " INFORME OS VALORES CONTIDOS NA MATRIZ");
        
        for (int i = 0; i < M1.length; i++) {
            for (int j = 0; j < M1.length; j++) {
                M1[i][j] = in.nextInt();
            }                               
        }
            System.out.println( "MATRIZ");
        for (int i = 0; i < M1.length; i++) {
            for (int j = 0; j < M1.length; j++) {

                System.out.print(M1[i][j] + " ");
                
            }
            System.out.println();
        }
                
        for (int i = 0; i < M1.length; i++) {
            for (int j = 0; j < M1.length; j++) {

                if(M1[i][j] >10){
                    contador++;
                }  
            }
            
        } System.out.println( " NUMERO DE VALORES MAIORES QUE 10 ----> " + contador);

        
    }
}