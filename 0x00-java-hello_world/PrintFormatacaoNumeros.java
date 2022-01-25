public class PrintFormatacaoNumeros {
    public static void main(String[] args) {
        float taxa = 0.2456f;
        float valor = 7654.321f;
        System.out.printf("Valor: R$ %.5f\n",valor);

        System.out.printf("Taxa: %.2f", taxa);

        // System.out.printf("O valor de pi: %.3f", pi)

    }
}
