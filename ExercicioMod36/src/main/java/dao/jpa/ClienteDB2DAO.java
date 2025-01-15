package dao.jpa;

import dao.generic.GenericDB2DAO;
import domain.jpa.Cliente;

public class ClienteDB2DAO extends GenericDB2DAO<Cliente, Long> implements IClienteDAO<Cliente> {

    public ClienteDB2DAO() {
        super(Cliente.class);
    }

}
