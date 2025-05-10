package Q5.model;

public class ContaCorrente implements Conta {
    private String titular;
    private double saldo;
    private static final double TAXA = 2.50;

    public ContaCorrente(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
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
        double total = valor + TAXA;
        if (total > saldo) throw new RuntimeException("Saldo insuficiente.");
        saldo -= total;
    }
}