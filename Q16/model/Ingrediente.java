package Q16.model;

public abstract class Ingrediente {
    protected String nome;
    protected double quantidade;

    public Ingrediente(String nome, double quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public abstract String informar();
}