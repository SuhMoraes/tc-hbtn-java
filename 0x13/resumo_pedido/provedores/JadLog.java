package provedores;

public class JadLog implements ProvedorFrete{

    public static TipoProvedorFrete TIPO_PROVEDOR_FRETE = TipoProvedorFrete.JADLOG;

    @Override
    public Frete calcularFrete(double peso, double valor) {

        double valorFrete;
        if ( peso > 2000) {
            valorFrete  = valor * 0.7;
        } else {
            valorFrete = valor * 0.45;
        }
        return new Frete(TIPO_PROVEDOR_FRETE, valorFrete);
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TIPO_PROVEDOR_FRETE;
    }
}
