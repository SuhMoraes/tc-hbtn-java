package provedores;

public class Frete {

    private TipoProvedorFrete tipoProvedorFrete;
    private double valor;

    public Frete() {
    }

    public Frete(TipoProvedorFrete tipoProvedorFrete, double valor) {
        this.tipoProvedorFrete = tipoProvedorFrete;
        this.valor = valor;
    }

    public TipoProvedorFrete getTipoProvedorFrete() {
        return tipoProvedorFrete;
    }

    public double getValor() {
        return valor;
    }
}

