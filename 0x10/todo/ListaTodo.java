import java.util.ArrayList;
import java.util.List;

public class ListaTodo {

    private List<Tarefa> tarefas = new ArrayList<>();

    public ListaTodo() {
    }

    public ListaTodo(List<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    public void adicionarTarefa(Tarefa tarefa1) throws Exception {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == tarefa1.getIdentificador()) {
                throw new IllegalArgumentException("Tarefa com identificador " + tarefa1.getIdentificador() + " ja existente na lista");
            }
            if (tarefa1.getDescricao().isEmpty() || tarefa1.getDescricao().isEmpty()) {
                throw new IllegalArgumentException("Descricao de tarefa invalida");
            }
        }
        tarefas.add(tarefa1);
    }

    public boolean marcarTarefaFeita(int idTarefa) {
        boolean feita = false;
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == idTarefa) {
                feita = true;
                tarefa.setEstahFeita(true);
            }
        }
        return feita;
    }

    public boolean desfazerTarefa(int idTarefa) {
        boolean naoFeita = false;
        for (Tarefa tarefa : tarefas) {
            if (tarefa.getIdentificador() == idTarefa) {
                naoFeita = true;
                tarefa.setEstahFeita(false);
            }
        }
        return naoFeita;
    }

    public void fazerTodas() {
        for (Tarefa tarefa : tarefas) {
            tarefa.setEstahFeita(true);
        }
    }

    public void desfazerTodas() {
        for (Tarefa tarefa : tarefas) {
            tarefa.setEstahFeita(false);
        }
    }

    public void listarTarefas() {
        for (Tarefa tarefa : tarefas) {
            if (tarefa.isEstahFeita()) {
                System.out.println("[X] Id: " + tarefa.getIdentificador() + " Descricao: " + tarefa.getDescricao());
            } else {
                System.out.println("[ ] Id: " + tarefa.getIdentificador() + " Descricao: " + tarefa.getDescricao());
            }

        }
    }

}