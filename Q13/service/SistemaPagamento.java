package Q13.service;

import Q13.exception.PagamentoInvalidoException;
import Q13.model.ProcessadorPagamento;

public class SistemaPagamento {

    public boolean realizarPagamento(ProcessadorPagamento processador, double valor) {
        if (valor <= 0) {
            throw new PagamentoInvalidoException("Valor de pagamento inválido");
        }

        if (processador.autorizarPagamento(valor)) {
            return processador.processarPagamento(valor);
        }
        return false;
    }
}
