package Q6.model;

public class CartaoCredito extends MetodoPagamento {

    public CartaoCredito() {
        this.taxa = 0.02;
    }

    @Override
    public boolean processarPagamento(double valor) {
        if (this.taxa < 0.02) {
            System.out.println("Transação realizada com sucesso utilizando Cartão de Crédito!");
            return true;
        } else {
            System.out.println("Taxa excessiva para pagamento com Cartão de Crédito.");
            return false;
        }
    }
}
