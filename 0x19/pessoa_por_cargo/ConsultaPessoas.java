import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConsultaPessoas {

    public static Map<String, List<Pessoa>> obterPessoasPorCargo(List<Pessoa> pessoa) {
        return pessoa.stream().collect(Collectors.groupingBy(p -> p.getCargo()));
    }


}
