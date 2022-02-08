public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;
    private double total;


    public Pedido(int percentualDesconto, ItemPedido[] itens) {
        super();
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        double total = 0;
        for(ItemPedido p : itens) {
            total += (p.getProduto().obterPrecoLiquido(p.getProduto().getPrecoBruto())*p.getQuantidade());
        }
        return total - (total *(percentualDesconto/100));
    }


    public double getPercentualDesconto() {
        return percentualDesconto;
    }

    public void setPercentualDesconto(int percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
    }

    public ItemPedido[] getItens() {
        return itens;
    }

    public void setItens(ItemPedido[] itens) {
        this.itens = itens;
    }
}
