import java.util.InputMismatchException;
import java.util.Scanner;
class AnoInvalidoException extends Exception {    
}

public class Ex05 {
    public static void main(String[] args) {
        int anoNascimento, years = 0;
        Scanner in = new Scanner(System.in);
        boolean success;

        System.out.println("Insert your birthyear");
        do {
            try {    
                anoNascimento = in.nextInt();
                
                years = calcularIdade(anoNascimento);
                success = true;
            } catch (InputMismatchException error) {
                in.nextLine();
                System.out.println("Erro: Valor inválido! Digite um número inteiro válido.");
                success = false;
            } catch (AnoInvalidoException error) {
                in.nextLine();
                System.out.println("ERRO: Ano inválido! Digite um ano no passado");
                success = false;
            }
        } while (!success);

        System.out.println("You have " + years + " years");
    }

    private static int calcularIdade(int anoNascimento) throws AnoInvalidoException {
        int currentYear = 2023;
        
        if (anoNascimento > currentYear) throw new AnoInvalidoException();

        return currentYear - anoNascimento;
    }
    
}
