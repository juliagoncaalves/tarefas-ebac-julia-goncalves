package exceptions;

public class TipoElementoNaoConhecidoException extends Exception {

    private static final long serialVersionUID = 3633698584043821104L;

    public TipoElementoNaoConhecidoException(String msg) {
        this(msg, null);
    }

    public TipoElementoNaoConhecidoException(String msg, Throwable e) {
        super(msg, e);
    }

}
