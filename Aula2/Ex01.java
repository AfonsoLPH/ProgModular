import java.util.*;
public class Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int V1[] = {1,2,3,4,5,6,7,8,9,10};
        int V2[] = new int [V1.length];

        for (int i = 0; i < V2.length; i++) {
            if ( i %2 == 0) {
                V2[i] = V1[i] * 2;
            }
            else{
                V2[i] = V1[i]*3;
            }
            }
        for (int i = 0; i < V2.length; i++) {
            System.out.println( V2[i]);
        }
    }
}
