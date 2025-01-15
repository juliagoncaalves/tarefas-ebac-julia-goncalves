package exceptions;

public class TipoChaveNaoEncontradaException extends RuntimeException {

    private static final long serialVersionUID = -1385381057926663213L;

    public TipoChaveNaoEncontradaException(String msg) {
        this(msg, null);
    }

    public TipoChaveNaoEncontradaException(String msg, Throwable e) {
        super(msg, e);
    }

}
