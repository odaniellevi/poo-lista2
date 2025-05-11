package Q16.model;

public class Carboidrato extends Ingrediente {
    public Carboidrato(String nome, double quantidade) {
        super(nome, quantidade);
    }

    public String informar() {
        return nome + ": " + quantidade + "g de carboidrato";
    }
}
