package Q4;

import Q4.model.Computador;
import Q4.model.Smartphone;
import Q4.model.Tablet;
import Q4.service.LojaService;
import Q4.exception.ProdutoInvalidoException;

public class Main {
    public static void main(String[] args) {
        LojaService loja = new LojaService();

        try {
            loja.adicionarProduto(new Computador("Notebook Dell", 4000));
            loja.adicionarProduto(new Smartphone("iPhone 15", 7000));
            loja.adicionarProduto(new Tablet("Galaxy Tab", 0)); // Gera exceção
        } catch (ProdutoInvalidoException e) {
            System.err.println("Erro: " + e.getMessage());
        }

        loja.listarGarantias();
    }
}