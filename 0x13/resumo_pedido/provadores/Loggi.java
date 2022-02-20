package provadores;

public class Loggi implements ProvedorFrete{

    public static TipoProvedorFrete TIPO_PROVEDOR_FRETE = TipoProvedorFrete.LOGGI;

    @Override
    public Frete calcularFrete(double peso, double valor) {

        double valorFrete;
        if ( peso > 5000) {
            valorFrete  = valor * 0.12;
        } else {
            valorFrete = valor * 0.04;
        }
        return new Frete(TIPO_PROVEDOR_FRETE, valorFrete);
    }

    @Override
    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TIPO_PROVEDOR_FRETE;
    }

}
