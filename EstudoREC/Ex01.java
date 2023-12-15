import java.util.*;

public class Ex01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int V[] = { 1, 2, 3, 4 };

        System.out.println(somapares(V, V.length));
    }

    public static int somapares(int V1[], int tam) {

        if (tam == 1) { // Condição de parada (CASO BASE)
            if (V1[0] % 2 == 0) {
                return V1[0];
            } else {
                return 0;
            }
        } else {
            if (V1[tam - 1] % 2 == 0) {
                return somapares(V1, tam - 1) + V1[tam - 1];
            } else {
                return somapares(V1, tam - 1);
            }

        }

    }
}
