package Q16.model;

public class Tempero extends Ingrediente {
    public Tempero(String nome, double quantidade) {
        super(nome, quantidade);
    }

    public String informar() {
        return "Tempero: " + nome;
    }
}
