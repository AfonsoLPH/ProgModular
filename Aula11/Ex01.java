import java.util.*;
public class Ex01{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N;

        System.out.println( " INFORME O TAMANHO DO VETOR");

        N = in.nextInt();

        int V1[] = new int [N];

        for (int i = 0; i < V1.length; i++) {

            try {
                V1[i] = in.nextInt();
                
            } catch (InputMismatchException e) {
                System.out.println(" VALOR INVÁLIDO");

                System.out.println(" INFORME NOVAMENTE UM VALOR NUMÉRICO");

                in.next();

                i--;
            
        }                      
    }

    calculamaior(V1,N);

    
}

public static void calculamaior ( int V1[], int N){

    int maior = V1[0];

    for (int i = 0; i < V1.length; i++) {

        if( maior > V1[i]){
            maior = maior;
        }
        else{

            maior = V1[i];
        }       
    }


    System.out.println( " O VALOR MAIOR É " + maior);
        
    }
}     

