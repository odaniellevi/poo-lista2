package Q7.model;

public class Navio extends Veiculo {

    public Navio(int capacidade, double velocidadeMaxima) {
        super(capacidade, velocidadeMaxima);
    }

    @Override
    public String tipoDeCombustivel() {
        return "Diesel marítimo";
    }
}