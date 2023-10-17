package Dia1;
import java.util.*;
public class Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float altura, peso;

        System.out.println(" INFORME SUA ALTURA : ");

        altura = in.nextFloat();

        System.out.println(" ALTURA INFORMADA : " + altura);

        System.out.println(" INFORME SEU PESO : ");

        peso = in.nextFloat();

        System.out.println(" PESO INFORMADO : " + peso);

        if (peso <= 60f) {
            if(altura < 1.20){
                System.out.println(" CATEGORIA ----> A");
            }
            else if(altura >=1.20f && altura <= 1.70f){
                System.out.println(" CATEGORIA ----> B");
            }
            else {
                System.out.println("CATEGORIA ----> C");
            }
            }
            if( peso >= 61f && peso <=90f){
                if( altura <= 1.20f){
                    System.out.println(" CATEGORIA ----> D");
                }
                else if (altura >=1.20f && altura <= 1.70f){
                    System.out.println( "CATEGORIA ----> E");
                }
                else {
                    System.out.println("CATEGORIA ----> F");
                }
            }
            if( peso >= 90f){
                if(altura < 1.20){
                System.out.println(" CATEGORIA ----> G");
            }
            else if (altura >=1.20f && altura <= 1.70f){
                System.out.println(" CATEGORIA ----> H");
            }
            else {
                System.out.println(" CATEGORIA ----> I");
            }
    }
    }
}

