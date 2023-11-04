import java.util.*;

import javax.print.attribute.ResolutionSyntax;
public class Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A, B;

        System.out.println( " INFORME O VALOR DE A E O VALOR DE B ");

        A = in.nextInt();

        B = in.nextInt();

        int mult = multi(A , B);

        System.out.println(multi(A , B));
    }

    public static int multi ( int A, int B){

        int RESULTADO;


        if( A == 0 || B == 0 ){
        return 0;}

        else{

        RESULTADO = A + (A * (B-1));

            return RESULTADO;

            }
        }
    }

