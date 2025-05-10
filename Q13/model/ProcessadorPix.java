package Q13.model;

public class ProcessadorPix implements ProcessadorPagamento {

    @Override
    public boolean autorizarPagamento(double valor) {
        return true; // Autoriza instantaneamente para qualquer valor
    }

    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Pagamento autorizado via PIX: " + valor);
        return true;
    }
}
