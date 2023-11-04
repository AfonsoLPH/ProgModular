import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class Ex01{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N;

        System.out.println(" INFORME O VALOR DE N");

        N = in.nextInt();

        int fibo = fibo(N);

        System.out.println(fibo(N));

        }

        public static int fibo(int N){

            if(N == 0){
            return 0;}

            else if(N==1){
            return 1;

            }else {
                return fibo(N-1) + fibo(N-2);

            }           
            }
        }
        
