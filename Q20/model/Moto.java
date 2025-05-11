package Q20.model;

public class Moto extends Veiculo implements Reservavel {
    public Moto(String modelo, int capacidade) {
        super(modelo, capacidade);
    }

    @Override
    public double calcularTempo(double distancia) {
        double velocidade = 100.0;
        return distancia / velocidade;
    }

    @Override
    public boolean reservar(String data, Rota rota) {
        return true;
    }
}
