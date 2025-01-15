package exceptions;

public class DAOException extends RuntimeException {

    private static final long serialVersionUID = -9049736531051429750L;

    public DAOException(String msg, Exception ex) {
        super(msg, ex);
    }
}
