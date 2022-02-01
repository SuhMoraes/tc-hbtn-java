public class Departamento {
    public double valorMeta;
    public double valorAtingidoMeta;

     public Departamento(double valorMeta, double valorAtingidoMaeta) {
         super();
         this.valorMeta = valorMeta;
         this.valorAtingidoMeta = valorAtingidoMaeta;
    }

    public double getValorMeta() {
        return valorMeta;
    }

    public double getValorAtingidoMeta() {
        return valorAtingidoMeta;
    }

    public void setValorMeta(double valorMeta) {
        this.valorMeta = valorMeta;
    }

    public void setValorAtingidoMeta(double valorAtingidoMeta) {
        this.valorAtingidoMeta = valorAtingidoMeta;
    }

    public boolean alcancouMeta(){
        if (valorAtingidoMeta >= valorMeta) {
            return true;
        } else {
            return  false;
        }
    }

}
