package questoes.q3VariavelSoma;

public class Q3 {
    public static void main(String[] args) {

        int INDICE = 13, SOMA = 0, K = 0;

        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }
        System.out.println(SOMA);
    }
}
