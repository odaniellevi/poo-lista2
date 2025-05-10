package Q13.model;

public class ProcessadorCartao implements ProcessadorPagamento {

    @Override
    public boolean autorizarPagamento(double valor) {
        return valor <= 10000; // Simulação de valor máximo de autorização
    }

    @Override
    public boolean processarPagamento(double valor) {
        if (valor <= 10000) {
            System.out.println("Pagamento autorizado com Cartão de Crédito: " + valor);
            return true;
        }
        return false;
    }
}
