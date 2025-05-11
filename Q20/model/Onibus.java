package Q20.model;

public class Onibus extends Veiculo implements Reservavel {
    public Onibus(String modelo, int capacidade) {
        super(modelo, capacidade);
    }

    @Override
    public double calcularTempo(double distancia) {
        double velocidade = 60.0;
        return distancia / velocidade;
    }

    @Override
    public boolean reservar(String data, Rota rota) {
        return true;
    }
}
