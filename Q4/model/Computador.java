package Q4.model;

public class Computador implements Produto {
    private String nome;
    private double preco;

    public Computador(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public int calcularGarantia() {
        return 3;
    }
}
