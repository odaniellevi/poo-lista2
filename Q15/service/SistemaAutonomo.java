package Q15.service;

import Q15.model.ControleAutonomo;
import Q15.exception.ErroDeNavegacaoException;

public class SistemaAutonomo {
    public String navegar(ControleAutonomo controle, String destino, double velocidade) {
        if (destino == null || destino.isEmpty()) {
            throw new ErroDeNavegacaoException("Destino inválido.");
        }
        if (velocidade <= 0) {
            throw new ErroDeNavegacaoException("Velocidade deve ser positiva.");
        }

        String rota = controle.iniciarRota(destino);
        String ajuste = controle.ajustarVelocidade(velocidade);
        return rota + " | " + ajuste;
    }
}
