import exceptions.OperacaoInvalidaException;

public class ContaBancariaTarifada  extends ContaBancariaBasica{

    private int quantidadeTransacoes;

    public ContaBancariaTarifada(String numeracao, double taxaJurosAnual) {
        super(numeracao, taxaJurosAnual);
    }

    public int getQuantidadeTransacoes() {
        return quantidadeTransacoes;
    }

    public void setQuantidadeTransacoes(int quantidadeTransacoes) {
        this.quantidadeTransacoes = quantidadeTransacoes;
    }

    @Override
    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor > 0 ) {
            double saldoDep = super.getSaldo() + valor - 0.10;
            setSaldo(saldoDep);
        }else {
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        }
    }

    @Override
    public void sacar(double valor) throws OperacaoInvalidaException {
           if (valor == 0 ) {
                throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
            }else if (super.getSaldo() >= valor) {
                double saldoSac = super.getSaldo() - valor - 0.10;
                setSaldo(saldoSac);
            }else {
                throw new OperacaoInvalidaException("Valor de saque deve ser maior que o saldo atual");
            }
        }
}


