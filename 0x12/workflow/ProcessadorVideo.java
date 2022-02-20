import java.util.ArrayList;
import java.util.List;

public class ProcessadorVideo {

 private ArrayList<CanalNotificacao> canais = new ArrayList<>();

    public ProcessadorVideo() {
    }

    public ProcessadorVideo(ArrayList<CanalNotificacao> canais) {
        this.canais = canais;
    }

    public List<CanalNotificacao> getCanais() {
        return canais;
    }

    public void setCanais(ArrayList<CanalNotificacao> canais) {
        this.canais = canais;
    }

    public void registrarCanal(CanalNotificacao canalNotificacao){
     canais.add(canalNotificacao);
 }

    public void processar(Video video) {
        for(CanalNotificacao canal : canais){

            Mensagem mensagem = new Mensagem();

            String texto = String.format("%s - %s", video.getArquivo(), video.getFormato());

            mensagem.setTipoMensagem(TipoMensagem.LOG);
            mensagem.setTexto(texto);

            canal.notificar(mensagem);
        }
    }
}
