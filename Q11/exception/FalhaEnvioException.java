package Q11.exception;

public class FalhaEnvioException extends RuntimeException {
    public FalhaEnvioException(String mensagem) {
        super(mensagem);
    }
}
