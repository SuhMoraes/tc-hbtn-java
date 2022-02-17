import java.util.ArrayList;
import java.util.List;

public class Celular {

   private List<Contato> contatos = new ArrayList<>();

   public Contato buscarContato(String nomeContato) {
       for (Contato contato : contatos) {
           if (contato.getNome().equals(nomeContato)) {
                return contato;
           }
       }

       return null;
   }

   public void removerContato(Contato apagarContato) {
       Contato contato = buscarContato(apagarContato.getNome());
       if (contato != null) {
           contatos.remove(contato);
       } else {
           throw new IllegalArgumentException("Nao foi possivel remover contato. Contato nao existe");
       }
   }

   public void adicionarContato(Contato contato) {
       if (buscarContato(contato.getNome()) == null) {
           contatos.add(contato);
       } else {
           throw new IllegalArgumentException("Nao foi possivel adicionar contato. Contato jah existente com esse nome");
       }
   }

   public int buscarPosicaoContato(Contato contato) {
       return contatos.indexOf(contato);
   }

   public void atualizarContato(Contato contatoAntigo, Contato novoContato){
       Contato contato = buscarContato(contatoAntigo.getNome());
       if ( contato == null ){
           throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato nao existe");
       } else if (contatoAntigo.getNome() != novoContato.getNome() && buscarContato(novoContato.getNome()) != null){
           throw new IllegalArgumentException("Nao foi possivel modificar contato. Contato jah existente com esse nome");
       }

       Integer posicaoContato = buscarPosicaoContato(contato);
       contatos.set(posicaoContato, novoContato);
   }

   public void listarContatos() {
       for (Contato contato : contatos){
           System.out.println(contato.getNome() + " -> " + contato.getNumeroTelefone() + " (" + contato.getTipoNumero() + ")");
       }
   }




}
