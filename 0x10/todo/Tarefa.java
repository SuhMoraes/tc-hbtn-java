public class Tarefa {

    String descricao;
    boolean estahFeia;
    int identificador;

    public Tarefa() {
    }

    public Tarefa(String descricao, int identificador) {
        this.descricao = descricao;
        this.identificador = identificador;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isEstahFeia() {
        return estahFeia;
    }

    public void setEstahFeia(boolean estahFeia) {
        this.estahFeia = estahFeia;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String modificadorDescricao() throws Exception {
        if(getDescricao() == null && getDescricao().isEmpty()){
            throw new IllegalArgumentException("Descricao de tarefa inavlida");
        }else {
            return descricao;
        }
    }
}
