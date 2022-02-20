import atividades.Atividade;

import java.util.ArrayList;

public class Workflow {

    private ArrayList<Atividade> atividades = new ArrayList<>();

    public Workflow() {
    }

    public Workflow(ArrayList<Atividade> atividades) {
        this.atividades = atividades;
    }

    public ArrayList<Atividade> getAtividades() {
        return atividades;
    }

    public void registrarAtividade(Atividade atividade){
        atividades.add(atividade);
    }
}
