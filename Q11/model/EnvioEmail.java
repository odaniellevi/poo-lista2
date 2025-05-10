package Q11.model;

public class EnvioEmail implements EnvioMensagem {
    private String status;

    public boolean enviar(String mensagem) {
        status = "Email enviado com sucesso: " + mensagem;
        return true;
    }

    public String obterStatus() {
        return status;
    }
}
