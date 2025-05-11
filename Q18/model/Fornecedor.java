package Q18.model;

import java.util.ArrayList;

public class Fornecedor {
    private String nome;
    private ArrayList<Produto> produtosFornecidos;

    public Fornecedor(String nome) {
        this.nome = nome;
        this.produtosFornecidos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarProduto(Produto produto) {
        produtosFornecidos.add(produto);
    }

    public String listarProdutosFornecidos() {
        StringBuilder lista = new StringBuilder("Produtos fornecidos por " + nome + ":\n");
        for (Produto produto : produtosFornecidos) {
            lista.append(produto.getNome()).append(" - Preço: ").append(produto.getPreco())
                    .append(" - Desconto: ").append(produto.calcularDesconto()).append("\n");
        }
        return lista.toString();
    }
}
