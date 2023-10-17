import java.util.*;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;
public class Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int numero, numero2, repetiçoes;
        Boolean resposta;

        boolean multiplo;

        System.out.println( " INFORME O NUMERO DE REPETIÇOES");

        repetiçoes = in.nextInt();

        for (int i = 0 ; i < repetiçoes; i++ ) {

            System.out.println( " Informe um numero  :");

            numero = in.nextInt();

            System.out.println(" Informe seu segundo numero ");

            numero2 = in.nextInt();
            
            resposta =  isMultiple(numero, numero2);

            if( resposta == true) {
                System.out.println( " É MULTIPLO");
            }else {
                System.out.println(" NÃO É MULTIPLO");
            }
        }
    }

         public static boolean isMultiple ( int numero, int numero2){



            if( numero2 % numero == 0){
                return true;
            }else{
                return false;
            }

         }
            
        }
    

