import java.io.LineNumberInputStream;
import java.util.*;
import java.util.function.DoubleBinaryOperator;
public class Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s1 = "bmor", s2 = "roma";


       if( isPalindromos(s1, s2) == true){

        System.out.println(" SÃO PALINDROMOS ");
       }
       else {
        System.out.println(" NÃO SÃO");
       }

        }
    
        // 2º METODO
        public static boolean isPalindromos ( String s1, String s2){


            if ( s1.length() == s2.length()){

                boolean resp = isPalindromos(s1, s2, 0, s1.length()-1 );
                return resp;
                
            }else{
                return false;
            }
        }

        // 3º MÉTODO

        public static boolean isPalindromos(String s1, String s2, int inicio, int fim) {

            if (inicio == s1.length()){

                return true;
            }

            if (s1.charAt(inicio) != s2.charAt(fim)) {

                return false;
            }

            else {
                return isPalindromos(s1, s2, inicio + 1, fim - 1);
            }
        }
        
    }















// if ( inicio == S1.length){
//return true;}if(S1.charAt(inicio)!=S2.charAt(fim)){

//return false;}

//else{return ispladindromos(S1,S2,int inicio+1,
//int fim-1)
