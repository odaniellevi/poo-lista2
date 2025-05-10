package Q6;

import Q6.model.*;
import Q6.service.SistemaPagamentoService;
import Q6.exception.PagamentoException;

public class Main {
    public static void main(String[] args) {
        SistemaPagamentoService sistemaPagamentoService = new SistemaPagamentoService();

        MetodoPagamento cartaoCredito = new CartaoCredito();
        MetodoPagamento pix = new Pix();
        MetodoPagamento boleto = new Boleto();

        try {
            sistemaPagamentoService.efetuarPagamento(cartaoCredito, 500);
            sistemaPagamentoService.efetuarPagamento(pix, 200);
            sistemaPagamentoService.efetuarPagamento(boleto, 150);
        } catch (PagamentoException e) {
            System.out.println("Erro durante o pagamento: " + e.getMessage());
        }
    }
}

