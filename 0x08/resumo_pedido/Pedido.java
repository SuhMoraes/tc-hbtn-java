public class Pedido {
    private double percentualDesconto;
    private ItemPedido[] itens;
    private double total;
    private String tipo;


    public Pedido(int percentualDesconto, ItemPedido[] itens) {
        super();
        this.percentualDesconto = percentualDesconto;
        this.itens = itens;
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido p : itens) {
            total += (p.getProduto().obterPrecoLiquido(p.getProduto().getPrecoBruto()) * p.getQuantidade());
        }
        return total - (total * (percentualDesconto / 100));
    }

    public void apresentarResumoPedido() {
        System.out.println("------- RESUMO PEDIDO -------");
        double resumo = 0;
        for (ItemPedido p: itens) {
            resumo += (p.getProduto().obterPrecoLiquido(p.getProduto().getPrecoBruto())* p.getQuantidade());

            tipo = p.getProduto().getClass().getName();

            System.out.printf("Tipo: " + tipo.replace("produtos.", ""));
            System.out.printf("  Titulo: " + p.getProduto().getTitulo());
            System.out.printf("  Preco: %.2f" , p.getProduto().obterPrecoLiquido(p.getProduto().getPrecoBruto()));
            System.out.printf("  Quant: " + p.getQuantidade());
            System.out.printf("  Total: %.2f\n" , p.getProduto().obterPrecoLiquido(p.getProduto().getPrecoBruto()* p.getQuantidade()));

        }
        System.out.println("----------------------------");
        System.out.printf("DESCONTO: %.2f\n", (resumo * percentualDesconto / 100));
        System.out.printf("TOTAL PRODUTOS: %.2f\n", resumo);
        System.out.println("----------------------------");
        System.out.printf("TOTAL PEDIDO: %.2f\n", calcularTotal());
        System.out.println("----------------------------");
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
