    public class PersonagemGame {

        private int saudeAtual;
        private String nome;
        private String status;

        public PersonagemGame(int saudeAtual, String nome) {
            this.saudeAtual = saudeAtual;
            this.nome = nome;
            this.saudeAtual = 0;
        }

        public void tomarDano(int quantidadeDeDano) {
            int result = this.saudeAtual -= quantidadeDeDano;
            if (result < 0) {
                result = 0;
            }
            setSaudeAtual(result);

        }

        public void receberCura(int quantidadeDeCura) {
            int result = this.saudeAtual += quantidadeDeCura;
            if (result > 100) {
                result = 100;
            }
            setSaudeAtual(result);

        }

        public int getSaudeAtual() {
            return saudeAtual;
        }

        public void setSaudeAtual(int saudeAtual) {
            this.saudeAtual = saudeAtual;
            if (this.saudeAtual > 0) {
                this.status = "vivo";
            } else {
                this.status = "morto";
            }
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getStatus() {
            return status;
        }

    }
