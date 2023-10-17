import java.util.*;
public class Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int linhas;
        int colunas;

        System.out.println( " INFORME O NUMERO DE LINHAS ");

        linhas = in.nextInt();

        System.out.println(" INFORME O NUMERO DE COLUNAS ");

        colunas = in.nextInt();

        int M1[][] = new int [linhas][colunas];
        int MT[][] = new int [colunas][linhas];

        System.out.println( " INFORME OS VALORES CONTIDOS NO VETOR");

        for (int i = 0; i <linhas; i++) {
            for (int j = 0; j < colunas; j++) {

            M1[i][j]=in.nextInt();
                
            }
            
        }
        System.out.println( " MATRIZ ORIGINAL");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                
                System.out.print(M1[i][j] + "  ");
            }
            System.out.println("   ");
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {

              MT[j][i] = M1[i][j];

            }

        }
            System.out.println( " MATRIZ TRANSPOSTA");
        for (int i = 0; i < MT.length; i++) {
            for (int j = 0; j < MT.length; j++) {
                System.out.println(MT[j][i] + " ");
                
            }
            System.out.println("  ");
        }

    }
}
