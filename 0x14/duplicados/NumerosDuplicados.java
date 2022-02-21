import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class NumerosDuplicados {

    public static TreeSet<Integer> buscar(int[] numInteiros) {

        TreeSet<Integer> numeros = new TreeSet<>();
        Set<Integer> numNaoRepetivos = new HashSet<>();

        for(int inteiro: numInteiros){
            numNaoRepetivos.add(inteiro);
        }

        for (Integer num: numNaoRepetivos) {
            int count = 0;
            for (Integer num2: numInteiros){
                if(num.equals(num2)) {
                    count++;
                }
            }

            if (count >= 2){
                numeros.add(num);
            }
        }
        return numeros;
    }
}
