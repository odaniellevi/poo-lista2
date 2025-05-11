package Q18.model;

public class Eletronico extends Produto {

    public Eletronico(String nome, Double preco) {
        super(nome, preco);
    }

    @Override
    public Double calcularDesconto() {
        return preco * 0.10; // 10% de desconto
    }
}