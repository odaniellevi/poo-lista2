package Q2.model;

public class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void informacoes() {
        System.out.printf("Carro: %s %s (%d) - %d portas\n", marca, modelo, ano, numeroDePortas);
    }
}
