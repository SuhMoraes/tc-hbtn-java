public class PersonagemGame {

    private String nome;
    private int saudeAtual;
    private String status;

    public PersonagemGame(int saudeAtual, String nome) {
        this.nome = nome;
        this.saudeAtual = saudeAtual;
        setSaudeAtual(saudeAtual);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null && nome == " "){
            this.nome = nome;
        }
    }

    public int getSaudeAtual() {
        return saudeAtual;
    }

    public void setSaudeAtual(int saudeAtual) {
        this.saudeAtual = saudeAtual;
    }

    public String getStatus() {
        if (saudeAtual > 0) {
            status = "vivo";
        }else{
            status = "morto";
        }
        return status;
    }

    public void receberCura(int quantidadeDeCura) {
        saudeAtual += quantidadeDeCura;
        if (saudeAtual > 100){
            setSaudeAtual(100);
        }
    }

    public void tomarDano(int quantidadeDeDano) {
        saudeAtual -= quantidadeDeDano;
        if (saudeAtual <= 0){
            setSaudeAtual(0);
        }
    }

}