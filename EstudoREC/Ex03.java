import java.util.*;

public class Ex03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int V1[] = { 1, 2, 9, 4, };
        char V2[] = { 'a', 'b', 'c', 'Z' };

        System.out.println(maior(V1));

        System.out.println(maior(V2));
    }

    public static int maior(int V1[]) {

        int maior = V1[0];

        for (int i = 0; i < V1.length; i++) {

            if (V1[0].toUpperCase() > V1[i].toUpperCase()) {

                maior = V1[0];
            } else {
                maior = V1[i];
            }

        }
        return maior;

    }

    public static char maior(char V2[]) {

        char maior = V2[0];

        for (int i = 0; i < V2.length; i++) {

            if (V2[0] > V2[i]) {

                maior = V2[0];
            } else {
                maior = V2[i];
            }

        }
        return maior;

    }

}
