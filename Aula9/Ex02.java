import java.util.*;
public class Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int V1[] = { 1,3,4,5,6};

        System.out.println( " Vetor Original ");

        for (int i = 0; i < V1.length; i++) {

            System.out.println( V1[i]);           
        }

        trocavetor(V1);

        for (int i = 0; i < V1.length; i++) {

            System.out.println(V1[i]);
        }

    }

    public static void trocavetor ( int V1[]){

        System.out.println( " MODIFICADO ");

        int aux = 0;
        for (int i = 0; i < V1.length; i++) {

            if(i < V1.length - 1){

            aux = V1[i];
            V1[i] = V1[i+1];
            V1[i+1] = aux;

            }

            
        } 
    }
}
