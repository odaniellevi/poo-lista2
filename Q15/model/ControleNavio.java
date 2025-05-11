package Q15.model;

public class ControleNavio implements ControleAutonomo {
    public String iniciarRota(String destino) {
        return "Navio navegando para " + destino;
    }

    public String ajustarVelocidade(double velocidade) {
        return "Navio ajustando velocidade para " + velocidade + " km/h";
    }
}
