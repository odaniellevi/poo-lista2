package Q13.model;

public interface ProcessadorPagamento {
    boolean autorizarPagamento(double valor);
    boolean processarPagamento(double valor);
}
