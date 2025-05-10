package Q6.service;

import Q6.model.MetodoPagamento;
import Q6.exception.PagamentoException;

public class SistemaPagamentoService {

    public boolean efetuarPagamento(MetodoPagamento metodo, double valor) {
        try {
            System.out.println("Efetuando pagamento de R$" + valor);
            boolean sucesso = metodo.processarPagamento(valor);

            if (sucesso) {
                double taxaAplicada = metodo.calcularTaxa(valor);
                System.out.println("Taxa aplicada: R$" + taxaAplicada);
            }
            return sucesso;

        } catch (Exception e) {
            throw new PagamentoException("Erro ao processar pagamento: " + e.getMessage());
        }
    }
}
