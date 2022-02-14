import java.util.List;

public class ManipularArrayNumeros {

    public static int buscarPosicaoNumero(List<Integer> list, int num){
        return list.indexOf(num);
    }

    public static void  adicionarNumero(List<Integer> list, int num){
        int total = buscarPosicaoNumero(list, num);
        if(total > 0) {
            throw new IllegalArgumentException("Numero jah contido na lista");
        }
        list.add(num);
    }

    public static void removerNumero(List<Integer> list, int num){
        int total = buscarPosicaoNumero(list, num);
        if(total < 0) {
            throw new IllegalArgumentException("Numero nao encontrado na lista");
        }
        list.remove(total);
    }

    public static void substituirNumero(List<Integer> list, int num, int num2){
        int total = buscarPosicaoNumero(list, num);
        if(total < 0) {
            list.add(num2);
        } else {
            list.set(total, num2);
        }
    }
}
