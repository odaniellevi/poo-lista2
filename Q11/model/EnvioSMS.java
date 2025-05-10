package Q11.model;

public class EnvioSMS implements EnvioMensagem {
    private String status;

    public boolean enviar(String mensagem) {
        status = "SMS enviado com sucesso: " + mensagem;
        return true;
    }

    public String obterStatus() {
        return status;
    }
}

