import java.util.HashMap;
import java.util.Map;

public class Armazem<T> implements Armazenavel<T>{

    private Map<String, T> itens = new HashMap<>();

    public Armazem() {
    }

    public Map<String, T> getItens() {
        return itens;
    }

    public void setItens(Map<String, T> itens) {
        this.itens = itens;
    }

    @Override
    public void adicionarAoInventario(String nome, T valor) {
        itens.put(nome, valor);

    }

    @Override
    public T obterDoInventario(String nome) {
        return itens.get(nome);
    }
}
