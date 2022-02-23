import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ConsultaProdutos {

    public static List<Produto> filtrar(List<Produto> produto, Predicate<Produto> produtoPredicate) {

           return produto.stream()
                   .filter(p -> produtoPredicate.test(p))
                   .collect(Collectors.toList());
    }
}



