import java.util.*;
public class Ex01{
    public static void main(String[] args) {
        Scanner  in  = new Scanner(System.in);

        int tamanho;

        System.out.println( " INFORME O TAMANHO DO VETOR : ");

        tamanho = in.nextInt();

        int V1[] = new int [tamanho];

        for (int i = 0; i < V1.length; i++) {

            V1[i] = in.nextInt();           
        }

        System.out.println(soma(V1,tamanho));
    }

    public static int soma (int V1[],int tamanho){

        if(tamanho == 1){
            return V1[0];
        }
        else{
            return soma( V1, tamanho - 1 ) + V1[tamanho - 1 ];
            
        }
    }


}