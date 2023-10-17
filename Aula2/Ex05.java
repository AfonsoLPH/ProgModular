import java.util.*;
public class Ex05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int V1[] = new int [10];

        for (int i = 0; i < V1.length; i++) {

            System.out.println(" INFORME UM VALOR : ");

            V1[i] = in.nextInt();

            for (int j = 0; j < V1.length; j++) {

                if(V1[i] == V1[j]){
                    System.out.println(" VALOR JA DIGITADO INFORME OUTRO VALOR:");
                    
                }
                
            }
            
        }
    }
}
