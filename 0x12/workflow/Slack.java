public class Slack implements CanalNotificacao{

    public static final String template = "[%s] {%s} - %s";


    @Override
    public void notificar(Mensagem mensagem) {
        System.out.println(String.format("SMS", mensagem.getTipoMensagem(), mensagem.getTexto()));
    }
}
