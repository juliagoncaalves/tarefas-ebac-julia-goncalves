package exceptions;

public class TipoChaveNaoEncontradaException extends Exception {

    private static final long serialVersionUID = 2237864169182183097L;

    public TipoChaveNaoEncontradaException(String msg) {
        this(msg, null);
    }

    public TipoChaveNaoEncontradaException(String msg, Throwable e) {
        super(msg, e);
    }

}
