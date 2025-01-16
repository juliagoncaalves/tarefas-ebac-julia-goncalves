package exception;

public class PilhaVaziaException extends RuntimeException {
    public PilhaVaziaException() {
        super("Pilha vazia");
    }

    public PilhaVaziaException(String msg) {
        super(msg);
    }

    public PilhaVaziaException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
