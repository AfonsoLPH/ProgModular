package Dia1;
import java.util.*;
public class Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner( System.in);

        int raio;
        double area; 

        System.out.println(" INFORME O RAIO DA CIRCUNFERENCIA : ");

        raio = in.nextInt();

        area = Math.PI * Math.pow(raio,2);

        System.out.println(" RAIO INFORMADO : " + raio);
        System.out.println(" AREA CALCULADA : " + area);
    }
}
