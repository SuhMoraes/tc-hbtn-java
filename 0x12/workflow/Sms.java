public class Sms implements CanalNotificacao {

    public static final String template = "[%s] {%s} - %s";

    @Override
    public void notificar(Mensagem mensagem) {
        System.out.println(String.format(template, "SMS", mensagem.getTipoMensagem(), mensagem.getTexto()));
    }
}
