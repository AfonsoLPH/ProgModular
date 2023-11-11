import java.net.CacheRequest;
import java.util.*;
public class Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n1,n2;

        System.out.println( " INFORME DOIS VALORES ");

        for (int i = 0; i < 1; i++) {


        try {
            System.out.println( " valor 1");

            n1 = in.nextInt(); 

            System.out.println(" valor 2");
            
            n2 = in.nextInt();

            dividirnumeros(n1, n2);

            System.out.println(dividirnumeros(n1, n2));
            
        } catch (InputMismatchException e) {
            
            System.out.println(" VALOR NAO VÁLIDO INFORME UM VALOR NUMERICO");

        in.next();

        i--;
        continue;
        }
        catch ( ArithmeticException e){

        System.out.println( " ERRO DIVISÃO POR ZERO NÃO PERMITIDA");

        break;
        }

}
    }

    public static double dividirnumeros( int n1, int n2)throws ArithmeticException{

        double resultado = n1 / n2;

        if( n2 == 0){

            throw new ArithmeticException();
        }

    return resultado;
    }
}

