public class Pessoa {

    private int codigo;
    private String nome;
    private String cargo;
    private int idade;
    private double salário;

    public Pessoa() {
    }

    public Pessoa(int codigo, String nome, String cargo, int idade, double salário) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salário = salário;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalário() {
        return salário;
    }

    public void setSalário(double salário) {
        this.salário = salário;
    }


    @Override
    public String toString() {
       return String.format("[%d]" + "%s"+ "%s"+ "%s"+ "R$ %f",
               getCodigo(), getNome(), getCargo(), getIdade(), getSalário());
    }
}
