import java.util.function.Consumer;
import java.util.function.Supplier;

public class Produto {

    private String nome;
    private double preco;
    private double percentualMarkUp = 0.1;

    public Produto() {
    }

    public Produto(double preco,String nome) {
        this.nome = nome;
        this.preco = preco;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPercentualMarkUp() {
        return percentualMarkUp;
    }

    public void setPercentualMarkUp(double percentualMarkUp) {
        this.percentualMarkUp = percentualMarkUp;
    }

    Supplier<Double> precoComMarkUp = () -> preco *(1 +percentualMarkUp);
    Consumer<Double> atualizarMarkUp = valor -> this.percentualMarkUp = (valor/100);

}
