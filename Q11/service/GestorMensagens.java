package Q11.service;

import Q11.exception.FalhaEnvioException;
import Q11.model.EnvioMensagem;

public class GestorMensagens {
    public boolean enviarMensagem(EnvioMensagem envio, String mensagem) {
        boolean enviado = envio.enviar(mensagem);
        if (!enviado) {
            throw new FalhaEnvioException("Falha ao enviar mensagem");
        }
        System.out.println(envio.obterStatus());
        return true;
    }
}
