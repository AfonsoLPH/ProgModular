import java.util.*;
public class Ex01{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int base, expoente, resultado, repetiçoes;

        System.out.println( " Informe quantas repetiçoes gostaria de realizar");

        repetiçoes = in.nextInt();

        for (int i = 0; i < repetiçoes; i++) {
            

       System.out.println(" Informe o valor da Base");

       base = in.nextInt();

       System.out.println(" Informe o valor do expoente");

       expoente = in.nextInt();

       resultado = calculaPotencia(base, expoente);

       System.out.println( resultado);
    }
}
    
    public static int calculaPotencia( int base, int expoente){

        int multiplicacao = 1;

        for (int i = 0; i < expoente; i++) {
            
            multiplicacao= multiplicacao * base; 
        }

        return multiplicacao;

    }


}