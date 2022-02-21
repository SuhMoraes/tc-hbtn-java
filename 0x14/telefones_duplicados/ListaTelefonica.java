import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ListaTelefonica {

    static HashMap<String, HashSet<Telefone>> listaTelefonica = new HashMap<String, HashSet<Telefone>>();

    ArrayList<Telefone> numeroExistente = new ArrayList<>();

    public HashMap<String, HashSet<Telefone>> adicionarTelefone(String nome, Telefone telefone) {

        if(listaTelefonica.containsKey(nome) && listaTelefonica.get(nome).contains(telefone)) {
            throw new IllegalArgumentException("Telefone jah existente para essa pessoa");
        }

        if(numeroExistente.contains(telefone)) {
            throw new IllegalArgumentException("Telefone jah pertence a outra pessoa");
        }
        numeroExistente.add(telefone);
        if (listaTelefonica.containsKey(nome)) {
            listaTelefonica.get(nome).add(telefone);
        } else {
            HashSet<Telefone> itemsList = new HashSet<Telefone>();
            itemsList.add(telefone);
            listaTelefonica.put(nome, itemsList);
        }

        return listaTelefonica;
    }

    public HashSet<Telefone> buscar(String nome) {

        return listaTelefonica.get(nome);
    }
}
