import java.util.*;
public class Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int V1[] = { 1, 1, 1, 1, 1, 1, 2, 2, 6, 3 };
        int V2[] = new int[5];
        int tamanho = 0;

        for (int i = 0; i < V1.length; i++) {
            for (int j = i+1; j < V1.length; j++) {

                if(V1[i] == V1[j]){

                    boolean jaadicionou = false;

                    for (int k = 0; k < tamanho; k++) {

                        if(V1[i] == V2[k]){
                            jaadicionou = true;
                        }

                        
                    }
                    if(!jaadicionou){
                        V2[tamanho] = V1[i];
                        tamanho++;
                    }

                    break;
            }
            
        }

    }
    
    }
}
    
