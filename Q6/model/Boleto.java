package Q6.model;

public class Boleto extends MetodoPagamento {

    public Boleto() {
        this.taxa = 0.05;
    }

    @Override
    public boolean processarPagamento(double valor) {
        double valorComTaxa = valor + calcularTaxa(valor);
        System.out.println("Pagamento realizado via Boleto com taxa de 5%. Total a pagar: R$" + valorComTaxa);
        return true;
    }
}
