package Dia1;
import java.util.*;
public class Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor;

        for ( ; ; ){

        System.out.println(" INFORME UM NUMERO");

        valor = in.nextInt();

        if( valor % 3 == 0 && valor % 5 ==0){
            System.out.println(" VALOR INFORMADO DIVISIVEL POR AMBOS");
        }
        else if( valor % 3 == 0 && valor % 5 != 0){
            System.out.println( " VALOR INFORMADO SOMENTE DIVISIVEL POR 3 ");
        }
        else if( valor % 5 == 0 && valor % 3 != 0){
            System.out.println( " VALOR INFORMADO SOMENTE DIVISIVEL POR 5 ");    
        }
        else{
            System.out.println( " VALOR NÃO DIVISIVEL POR 3 OU POR 5");
        }
    }
}
}
