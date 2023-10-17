package Dia1;
import java.util.*;
public class Ex01{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float prova1, prova2, trab1,trab2;
        float media;
        
        System.out.println(" INFORME O RESULTADO DA PROVA 1 : ");
        prova1 = in.nextFloat();
        prova1 = prova1 * 0.3f;

        System.out.println(" INFORME O RESULTADO DA PROVA 2 : ");
        prova2 = in.nextFloat();
        prova2 = prova2 * 0.3f;

        System.out.println(" INFORME O RESULTADO DO TRABALHO 1: ");
        trab1 = in.nextFloat();
        trab1 = trab1 * 0.2f;

        System.out.println(" INFORME O RESULTADO DO TRABALHO 2: ");
        trab2 = in.nextFloat();
        trab2 = trab2 * 0.2f;

        media = prova1 + prova2 + trab1 + trab2 / 4;

        System.out.println("RESULTADO DA PROVA 1: " +  prova1);
        System.out.println("RESULTADO DA PROVA 2: " + prova2);
        System.out.println("RESULTADO DA TRABALHO 1: " + trab1);
        System.out.println("RESULTADO DA TRABALHO 2: " + trab2);
        System.out.println("RESULTADO DA MEDIA : " + media);


    }
}