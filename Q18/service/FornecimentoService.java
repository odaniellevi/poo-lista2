package Q18.service;

import Q18.model.Produto;
import Q18.model.Fornecedor;
import Q18.exception.FornecimentoException;

public class FornecimentoService {

    public boolean fornecerProduto(Fornecedor fornecedor, Produto produto) {
        try {
            if (fornecedor == null || produto == null) {
                throw new FornecimentoException("Fornecedor ou produto inválido.");
            }
            fornecedor.adicionarProduto(produto);
            return true;
        } catch (FornecimentoException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}