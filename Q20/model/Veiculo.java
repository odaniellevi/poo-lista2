package Q20.model;

public abstract class Veiculo {
    protected String modelo;
    protected int capacidade;

    public Veiculo(String modelo, int capacidade) {
        this.modelo = modelo;
        this.capacidade = capacidade;
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public abstract double calcularTempo(double distancia);
}