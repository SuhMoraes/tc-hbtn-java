public class Slack implements CanalNotificacao{

    @Override
    public void notificar(Mensagem mensagem) {
        System.out.println(String.format("[Slack] {%s} - %s", mensagem.getTipoMensagem(), mensagem.getTexto()));
    }
}
