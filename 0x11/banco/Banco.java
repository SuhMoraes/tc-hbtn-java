import java.util.ArrayList;

public class Banco {

    private String nome;
    private ArrayList<Agencia> agencias;
    private ArrayList<Cliente> cliente;

    public Banco(String nome) {
        this.nome = nome;
        this.agencias = new ArrayList<>();
    }

    public Agencia buscarAgencia(String nome) {
        for (Agencia a : agencias) {
            if (a.getNome().equals(nome)) {
                return a;
            }
        }
        return null;
    }

    public boolean adicionarAgencia(String nome) {
        Agencia agencia = this.buscarAgencia(nome);
        if (agencia != null) {
            return false;
        }
        this.agencias.add(new Agencia(nome));
        return true;
    }

    public boolean adicionarCliente(String nomeAgencia, String nomeCliente, double valorTrasacaoInicial) {
        Agencia agencia = buscarAgencia(nomeAgencia);
        if (agencia == null)
            return false;

        Cliente cliente = agencia.buscarCliente(nome);
        if (cliente != null)
            return false;

        agencia.novoCliente(nomeCliente, valorTrasacaoInicial);
        return true;
    }

    public boolean listarClientes(String nomeAgencia, boolean imprimirTransacoes) {
        Agencia agencia = buscarAgencia(nomeAgencia);
        if (agencia == null)
            return false;

        int cont = 0;
        for (Cliente c : agencia.getClientes()) {
            cont++;
            System.out.println("Cliente: " + c.getNome() + " [" + (cont) + "]");

            if (imprimirTransacoes) {
                int contTransacao = 0;
                for (double valorTransacao : c.getTransacoes()) {
                    contTransacao++;
                    System.out.println("  [" + (contTransacao) + "] valor " +  valorTransacao);
                }
            }
        }
        return true;
    }

    public boolean adicionarTransacaoCliente(String nomeAgencia, String nomeCliente, double valorTransacao) {
        Agencia agencia = buscarAgencia(nomeAgencia);
        if (agencia != null){
            agencia.adicionarTransacaoCliente(nomeCliente, valorTransacao);
            return true;
        }

        return false;

    }
}



