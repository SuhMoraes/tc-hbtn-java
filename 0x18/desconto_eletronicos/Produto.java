public class Produto {

    private int codigo;
    private String nome;
    private CategoriaProduto categoriaProduto;
    private double preco;

    public Produto() {
    }

    public Produto(int codigo, String nome, CategoriaProduto categoriaProduto, double preco) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoriaProduto = categoriaProduto;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CategoriaProduto getCategoriaProduto() {
        return categoriaProduto;
    }

    public void setCategoriaProduto(CategoriaProduto categoriaProduto) {
        this.categoriaProduto = categoriaProduto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return String.format("[%d]" + " %s " + "%s " + "R$ %.2f", getCodigo(),  getNome(), getCategoriaProduto(), getPreco());
    }


}

















