package Q6.model;

public abstract class MetodoPagamento {
    protected double taxa;

    public abstract boolean processarPagamento(double valor);

    public double calcularTaxa(double valor) {
        return valor * taxa;
    }

    public double getTaxa() {
        return taxa;
    }
}