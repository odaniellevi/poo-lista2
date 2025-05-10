package Q2.model;

public class Motocicleta extends Veiculo {
    private String tipoDeGuidao;

    public Motocicleta(String marca, String modelo, int ano, String tipoDeGuidao) {
        super(marca, modelo, ano);
        this.tipoDeGuidao = tipoDeGuidao;
    }

    @Override
    public void informacoes() {
        System.out.printf("Motocicleta: %s %s (%d) - Guidão: %s\n", marca, modelo, ano, tipoDeGuidao);
    }
}