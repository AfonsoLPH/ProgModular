import java.util.*;
public class Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(" INFORME A BASE :  ");

        int base = in.nextInt();

        System.out.println(" INFORME O EXPOENTE:  ");

        int expoente = in.nextInt();

        System.out.println(power(base ,  expoente));

    }

    public static int power ( int base , int expoente){

        if ( expoente == 0 ){

            return 1;
        }
        else{

            return power(base, expoente - 1 ) * base;
            
        }
    }
}
