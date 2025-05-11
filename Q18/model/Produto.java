package Q18.model;

public abstract class Produto {
    protected String nome;
    protected Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public abstract Double calcularDesconto();
}
