import java.util.*;
public class Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

       int aux = 0;

        int V1[] = {1,2,3,4,5,6,7,8,9,10};

        for (int i = 0 ; i < 5; i++) {

            aux = V1[i];
            V1[i] = V1[9-i];
            V1[9-i] = aux;
        
        }
        
        for (int i = 0; i < V1.length; i++) {

            System.out.println(V1[i]);
            
        }
    } 
}
