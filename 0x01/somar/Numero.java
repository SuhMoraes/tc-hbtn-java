public class Numero {
    public static void main(String[] args) {
        System.out.printf("%d\n", Numero.somar(24, 32));
        System.out.printf("%d\n", Numero.somar(5, 0));
        System.out.printf("%d\n", Numero.somar(4, -2));
    }
    public static int somar(int a, int b) {
        return a + b;
    }
}
