package Q18;

import Q18.model.*;
import Q18.service.FornecimentoService;

public class Main {
    public static void main(String[] args) {
        // Criando fornecedores e produtos
        Fornecedor fornecedor1 = new Fornecedor("Fornecedor A");
        Fornecedor fornecedor2 = new Fornecedor("Fornecedor B");

        Produto eletronico = new Eletronico("Smartphone", 1200.00);
        Produto alimento = new Alimento("Arroz", 30.00);
        Produto vestuario = new Vestuario("Camiseta", 50.00);

        FornecimentoService fornecimentoService = new FornecimentoService();

        // Fornecendo produtos
        fornecimentoService.fornecerProduto(fornecedor1, eletronico);
        fornecimentoService.fornecerProduto(fornecedor1, alimento);
        fornecimentoService.fornecerProduto(fornecedor2, vestuario);

        // Listando os produtos fornecidos por cada fornecedor
        System.out.println(fornecedor1.listarProdutosFornecidos());
        System.out.println(fornecedor2.listarProdutosFornecidos());
    }
}

