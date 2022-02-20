public class Teams implements CanalNotificacao{

    public static final String template = "[%s] {%s} - %s";


    public void notificar(Mensagem mensagem) {
        System.out.println(String.format("TEAMS", mensagem.getTipoMensagem(), mensagem.getTexto()));
    }
}
