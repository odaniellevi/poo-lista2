package Q11.model;

public class EnvioWhatsApp implements EnvioMensagem {
    private String status;

    public boolean enviar(String mensagem) {
        status = "Mensagem enviada via WhatsApp: " + mensagem;
        return true;
    }

    public String obterStatus() {
        return status;
    }
}
