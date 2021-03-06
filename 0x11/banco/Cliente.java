import java.util.ArrayList;

public class Cliente {

    private String nome;
    private ArrayList<Double> transacoes;

    public Cliente(String nome, double transacaoInicial) {
        this.nome = nome;
        this.transacoes = new ArrayList<>();
        this.transacoes.add(transacaoInicial);
    }

    public String getNome() {
        return nome;
    }

    public ArrayList<Double> getTransacoes() {
        return transacoes;
    }

    public void adicionarTransacao(double valorTransacao) {
        this.transacoes.add(valorTransacao);
    }


}
