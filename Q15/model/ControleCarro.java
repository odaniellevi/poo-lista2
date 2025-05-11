package Q15.model;

public class ControleCarro implements ControleAutonomo {
    public String iniciarRota(String destino) {
        return "Carro iniciando rota para " + destino;
    }

    public String ajustarVelocidade(double velocidade) {
        return "Carro ajustando velocidade para " + velocidade + " km/h";
    }
}