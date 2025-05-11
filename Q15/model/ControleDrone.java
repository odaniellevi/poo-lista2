package Q15.model;

public class ControleDrone implements ControleAutonomo {
    public String iniciarRota(String destino) {
        return "Drone voando para " + destino;
    }

    public String ajustarVelocidade(double velocidade) {
        return "Drone ajustando velocidade para " + velocidade + " km/h";
    }
}
