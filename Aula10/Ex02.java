import java.util.*;

public class Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N;

        System.out.println(" INFORME O VALOR DE N");

        N = in.nextInt();

        int SomaCubos = somacubos(N);

        System.out.println( somacubos(N));

    }

    public static int somacubos (int N){

        if( N == 1 ){
            return 1;
        }

        else {
            return somacubos(N -1) +  ( int )Math.pow(N, 3);
            }
            }
        }

    

