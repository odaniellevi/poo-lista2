package Q5.model;

public class ContaSalario implements Conta {
    private String titular;
    private double saldo;
    private int saquesRestantes;

    public ContaSalario(String titular, double saldoInicial, int saquesPermitidos) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.saquesRestantes = saquesPermitidos;
    }

    public int getSaquesRestantes() {
        return saquesRestantes;
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
        if (saquesRestantes <= 0) throw new RuntimeException("Limite de saques atingido.");
        if (valor > saldo) throw new RuntimeException("Saldo insuficiente.");
        saldo -= valor;
        saquesRestantes--;
    }
}
