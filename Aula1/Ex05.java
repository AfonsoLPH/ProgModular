package Dia1;
import java.util.*;
public class Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int soma = 0;

        for (int i = 2; i <= 100; i++) {

            if( i % 2 == 0 ){
                soma = soma + i;
            }
            
        } System.out.println(soma);
    }
}
