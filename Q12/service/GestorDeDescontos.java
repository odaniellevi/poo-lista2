package Q12.service;

import Q12.exception.DescontoInvalidoException;
import Q12.model.EstrategiaDesconto;

public class GestorDeDescontos {
    public double aplicarDesconto(EstrategiaDesconto estrategia, double preco) {
        if (preco < 0) {
            throw new DescontoInvalidoException("Preço inválido para aplicar desconto");
        }
        return estrategia.calcularDesconto(preco);
    }
}
