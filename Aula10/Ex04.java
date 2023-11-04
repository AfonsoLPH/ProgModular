import java.util.*;
public class Ex04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("INFORME O TAMANHO DO VETOR");

        int tam = in.nextInt();

        System.out.println(" INFORME OS ELEMENTOS DO VETOR");

        
        int V1[] = new int [tam];

        for (int i = 0; i < V1.length; i++) {

            V1[i] = in.nextInt();
        }

        printArray(V1,tam);



    }
    
    public static void printArray(int V1[], int tam){

        if(tam == 1){
            System.out.print(V1[0] + "  ");
        }
        else {
            printArray(V1, (tam-1));

            System.out.print(V1[tam-1] + "  ");
            
        }
    }
}
