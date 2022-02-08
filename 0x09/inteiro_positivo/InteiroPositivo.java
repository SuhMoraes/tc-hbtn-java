public class InteiroPositivo {

    int valor;
    int count = 0;

    public InteiroPositivo(int valor) {
        this.valor = valor;
    }

    public InteiroPositivo(String valor) {
        setValor(Integer.parseInt(valor));
    }

    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {

        if (valor <0) {
            throw new IllegalArgumentException("Valor nao eh um valor inteiro positivo");
        }
        this.valor = valor;
    }

    public boolean ehPrimo() {

        for (int i = 1; i <= valor; i++) {
            if (valor % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            return true;
        }
        return false;
    }
}


