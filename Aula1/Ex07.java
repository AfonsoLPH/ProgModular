package Dia1;
import java.util.*;
public class Ex07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valor;
        int soma = 0;
        int sequencia;

        System.out.println(" INFORME UM VALOR ");

        valor = in.nextInt();

        System.out.println( " INFORME UM VALOR DE SEQUENCIA");

        sequencia = in.nextInt();

        for (int i = 0; i < sequencia; i++) {

            if(valor <= 0){

                System.out.println(" VALOR NÃO PERMITIDO");
                
                System.out.println(" INFORME UM VALOR ");

                valor = in.nextInt();

                System.out.println(" INFORME UM VALOR DE SEQUENCIA");

                sequencia = in.nextInt();
                continue;
            }

            soma = soma + valor ;

            valor++;
        }

        System.out.println( soma);
    }
}
