package provedores;

public class Sedex implements ProvedorFrete{

    public static TipoProvedorFrete TIPO_PROVEDOR_FRETE = TipoProvedorFrete.SEDEX;

    @Override
    public Frete calcularFrete(double peso, double valor) {

        double valorFrete;
        if ( peso > 1000) {
            valorFrete  = valor * 0.10;
        } else {
            valorFrete = valor * 0.05;
        }
        return new Frete(TIPO_PROVEDOR_FRETE, valorFrete);
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TIPO_PROVEDOR_FRETE;
    }

}
