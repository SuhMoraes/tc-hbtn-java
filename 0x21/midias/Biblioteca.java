import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T extends Midia> {

    private List<T> lista = new ArrayList<>();

    public Biblioteca() {
    }

    public Biblioteca(List<T> lista) {
        this.lista = lista;
    }

    public void adicionarMidia (T video) {
        lista.add(video);
    }

    public List<T> obterListaMidias(){
        return lista;
    }
}
