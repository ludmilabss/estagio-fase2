package questoes.q2VerificandoString;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma string para verificar a presença da letra 'a': ");
        String str = sc.nextLine();

        int quantidade = contarOcorrencias(str);

        if (quantidade > 0) {
            System.out.println("A letra 'a' aparece " + quantidade + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' não foi encontrada na string.");
        }
    }

    public static int contarOcorrencias(String str) {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }
}
