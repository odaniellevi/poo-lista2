package Q18.model;

public class Vestuario extends Produto {

    public Vestuario(String nome, Double preco) {
        super(nome, preco);
    }

    @Override
    public Double calcularDesconto() {
        return preco * 0.15; // 15% de desconto
    }
}
