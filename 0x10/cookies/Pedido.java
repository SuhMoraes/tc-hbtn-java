import java.util.ArrayList;

public class Pedido {

    ArrayList<PedidoCookie> cookies = new ArrayList<>();

    public ArrayList<PedidoCookie> getCookies() {
        return cookies;
    }

    public void adicionarPedidoCookie(PedidoCookie pedidoCookie){
        cookies.add(pedidoCookie);
    }

    public int obterTotalCaixas(){
        int totalCx = 0;
        for (PedidoCookie pedidoCookie: cookies) {
            totalCx += pedidoCookie.getQuantidadeDeCaixas();
        }
        return totalCx;
    }

    public int removerSabor(String sabor) {
        int qtd = obterTotalCaixas();
        cookies.removeIf(s -> s.getSabor().equalsIgnoreCase(sabor));
        return qtd - obterTotalCaixas();
    }
}

