package Q4.exception;

public class ProdutoInvalidoException extends RuntimeException {
    public ProdutoInvalidoException(String mensagem) {
        super(mensagem);
    }
}
