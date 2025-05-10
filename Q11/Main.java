package Q11;

import Q11.model.EnvioEmail;
import Q11.model.EnvioSMS;
import Q11.model.EnvioWhatsApp;
import Q11.service.GestorMensagens;

public class Main {
    public static void main(String[] args) {
        GestorMensagens gestor = new GestorMensagens();

        gestor.enviarMensagem(new EnvioEmail(), "Bem-vindo ao sistema");
        gestor.enviarMensagem(new EnvioSMS(), "Seu código é 1234");
        gestor.enviarMensagem(new EnvioWhatsApp(), "Você tem uma nova notificação");
    }
}