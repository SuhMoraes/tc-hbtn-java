import java.util.ArrayList;
import java.util.List;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produto, CriterioFiltro criterioFiltro) {
        List<Produto> produtoList = new ArrayList<>();
        produto.forEach(produto1 -> {
            if (criterioFiltro.testar(produto1)) {
                produtoList.add(produto1);
            }
        });
           return produtoList;
    }
}



