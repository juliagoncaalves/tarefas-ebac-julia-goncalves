package dao.jpa;

import dao.generic.GenericDB3DAO;
import domain.jpa.Cliente2;

public class ClienteDB3DAO extends GenericDB3DAO<Cliente2, Long> implements IClienteDAO<Cliente2> {

    public ClienteDB3DAO() {
        super(Cliente2.class);
    }

}