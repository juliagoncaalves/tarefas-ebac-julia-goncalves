package exceptions;

public class TableException extends RuntimeException {

    private static final long serialVersionUID = -1759051814199454081L;

    public TableException(String msg) {
        super(msg);
    }
}
