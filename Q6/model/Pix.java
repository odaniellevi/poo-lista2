package Q6.model;

public class Pix extends MetodoPagamento {

    public Pix() {
        this.taxa = 0.0;
    }

    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Transação realizada com sucesso via Pix!");
        return true;
    }
}
