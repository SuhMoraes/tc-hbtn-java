public class PedidoCookie {
   String sabor;
   int quantidadedeCaixas;

    public PedidoCookie(String sabor, int quantidadedeCaixas) {
        this.sabor = sabor;
        this.quantidadedeCaixas = quantidadedeCaixas;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public int getQuantidadeDeCaixas() {
        return quantidadedeCaixas;
    }

    public void setQuantidadeDeCaixas(int quantidadeDeCaixas) {
        this.quantidadedeCaixas = quantidadeDeCaixas;
    }
}
