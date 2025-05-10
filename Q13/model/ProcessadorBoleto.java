package Q13.model;

public class ProcessadorBoleto implements ProcessadorPagamento {

    @Override
    public boolean autorizarPagamento(double valor) {
        return valor > 10; // Só autoriza pagamentos acima de 10 reais
    }

    @Override
    public boolean processarPagamento(double valor) {
        if (valor > 10) {
            System.out.println("Pagamento autorizado com Boleto: " + valor);
            return true;
        }
        return false;
    }
}
