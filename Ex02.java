import java.util.*;
public class Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String s1 = "amor";
        String s2 = "romza";

       System.out.println( isPalindromo(s1,s2));;
    }

    public static boolean isPalindromo( String s1, String s2){

        if(s1.length() == s2.length()){
            return isPalindromo(  s1,  s2 , 0,s1.length() - 1 );
        }
        else{
            System.out.println(" entrou nesse ponto");
            return false;
        }
    }

    public static boolean isPalindromo ( String s1, String s2 , int inicio, int fim){

        if ( inicio == s1.length()){
            return true;
        } else { 
        
            if ( s1.charAt(inicio) != s2.charAt(fim)){
                return false;
            } else {
                return isPalindromo(s1, s2, inicio +1,fim-1);
            }
        }
    }
}

