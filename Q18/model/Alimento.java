package Q18.model;

public class Alimento extends Produto {

    public Alimento(String nome, Double preco) {
        super(nome, preco);
    }

    @Override
    public Double calcularDesconto() {
        return preco * 0.05; // 5% de desconto
    }
}