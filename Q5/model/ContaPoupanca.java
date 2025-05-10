package Q5.model;

public class ContaPoupanca implements Conta {
    private String titular;
    private double saldo;

    public ContaPoupanca(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void adicionarRendimento(double percentual) {
        if (percentual <= 0) throw new RuntimeException("Percentual inválido.");
        saldo += saldo * (percentual / 100);
    }

    @Override
    public String getTitular() {
        return titular;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) throw new RuntimeException("Depósito inválido.");
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (valor > saldo) throw new RuntimeException("Saldo insuficiente.");
        saldo -= valor;
    }
}
