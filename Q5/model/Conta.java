package Q5.model;

public interface Conta {
    String getTitular();
    double getSaldo();
    void depositar(double valor);
    void sacar(double valor);
}
