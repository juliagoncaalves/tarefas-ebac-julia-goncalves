package exceptions;

public class TipoElementoNaoConhecidoException extends RuntimeException {

    private static final long serialVersionUID = 8612150993809494373L;

    public TipoElementoNaoConhecidoException(String msg) {
        this(msg, null);
    }

    public TipoElementoNaoConhecidoException(String msg, Throwable e) {
        super(msg, e);
    }
}
