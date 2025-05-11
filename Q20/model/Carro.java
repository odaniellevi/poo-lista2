package Q20.model;

public class Carro extends Veiculo implements Reservavel {
    public Carro(String modelo, int capacidade) {
        super(modelo, capacidade);
    }

    @Override
    public double calcularTempo(double distancia) {
        double velocidade = 80.0;
        return distancia / velocidade;
    }

    @Override
    public boolean reservar(String data, Rota rota) {
        return true;
    }
}
