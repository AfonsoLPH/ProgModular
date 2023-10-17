import java.util.*;
public class Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int V1[] = {1,2,3,4,5,6,1,8,6,3};

        for (int i = 0; i < V1.length; i++) {
            for (int j = i+1; j < V1.length; j++) {

                if( V1[j] == V1[i]){
                    System.out.println(V1[j]);
                    break;
                }

            }
            
        }
    }
}
