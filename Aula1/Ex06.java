package Dia1;
import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class Ex06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        float numerador = 1;
        int denominador;
        float soma = 0;

        System.out.println(" INFORME O VALOR DE n: ");

        denominador = in.nextInt();

        for (int i = 1; i <= denominador; i++) {

            soma = soma + (numerador / i);           
        }

        System.out.println(soma);

        } 
    }
