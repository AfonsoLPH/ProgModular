import java.util.*;

public class Ex02Revisado {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // String escrita pelo usuario.

        String s1 = "amor";
        String s2 = "roma";

        // printa o método.
        // INFORMA OS DADOS QUE VER PRINTAR no caso as Strings
        // S1 e S2;

        // chama o metodo no print
        System.out.println(ispalindromos(s1, s2));

        // fecho o main e começo o método.
    }

    // metodo não recursivo para veriguar se sao paravras
    // do mesmo tamanho.

    public static boolean ispalindromos(String s1, String s2) {

        // pegou os dados das strings s1 e s2;

        if (s1.length() == s2.length()) {

            return ispalindromos(s1, s2, 0, s1.length() - 1);

            // CHAMA O METODO RECURSIVO COM INICIO = 0 E FIM = S1.LENGHT() - 1;

        } else {
            return false;
        }
    }

    public static boolean ispalindromos(String s1, String s2, int inicio, int fim) {

        // confirma que depoiis de todo o processo tem o mesmo tamanho.
        if (inicio == s1.length()) {
            return true;
        } else {

            if (s1.charAt(inicio) != s2.charAt(fim)) {
                return false;
            }

            // verifica se as letras sao iguais
            // s1. charAt escolhe letras por posição da string

            else {
                return ispalindromos(s1, s2, inicio + 1, fim - 1);
            }

            // metodo recursivo de leitura das Strings.

        }

        // 1º PASSO- FAZ O MAIN CHAMAR O METODO INDICANDO AS VARIAVEIS.
        // 2º PASSO - CRIA O METODO DE COMPARAR O TAMANHO DAS STRINGS
        // SE O TAMANHO FOR DIFERENTE, RETURN FALSE, SE FOR IGUAIS RETURN TRUE ABRINDO O
        // METODO RECURSIVO
        // ( s1, s2, 0, s1.lengh() - 1);
        // 3º PASSO -CRIA O METODO RECURSIVO (String s1, String s2, int inicio, int fim)
        // 4º PASSO - VERIFICA SE DEPOIS DE DO PROCESSO AS VARIAVIES INICIO E
        // S1.LENGTH() TEM O MESMO TAMANHO
        // IF ( S1.LENGHT() == INICIO) RETURN TRUE.
        // 5º PASSO VERIFICA SE AS LETRAS SÃO IGUAIS USANDO charAT do inicio e fim
        // if ( s1.charAT(incicio) != s2.charAtfim))return false.
        // 6º PASSO RETORNA O METODO (s1,s2, inicio +1 e fim -1); para comparar as
        // letras.
    }

}
