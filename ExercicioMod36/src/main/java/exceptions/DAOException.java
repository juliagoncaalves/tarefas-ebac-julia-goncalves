package exceptions;

public class DAOException extends Exception {

    private static final long serialVersionUID = 893836296274397206L;

    public DAOException(String msg, Exception ex) {
        super(msg, ex);
    }

}