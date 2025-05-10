package Q4.service;

import Q4.model.Produto;
import Q4.exception.ProdutoInvalidoException;

import java.util.ArrayList;
import java.util.List;

public class LojaService {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        if (produto == null || produto.getPreco() <= 0) {
            throw new ProdutoInvalidoException("Produto inválido: nome ou preço incorreto.");
        }
        produtos.add(produto);
    }

    public void listarGarantias() {
        System.out.println("Garantias dos produtos:");
        for (Produto p : produtos) {
            System.out.printf("%s - Garantia: %d ano(s)\n", p.getNome(), p.calcularGarantia());
        }
    }
}