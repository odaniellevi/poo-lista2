package Q1.exception;

public class AnimalInvalidoException extends RuntimeException {
    public AnimalInvalidoException(String mensagem) {
        super(mensagem);
    }
}
