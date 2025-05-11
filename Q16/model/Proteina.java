package Q16.model;

public class Proteina extends Ingrediente {
    public Proteina(String nome, double quantidade) {
        super(nome, quantidade);
    }

    public String informar() {
        return nome + ": " + quantidade + "g de proteína";
    }
}
