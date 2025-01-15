package dao.jpa;

import dao.generic.GenericDB1DAO;
import domain.jpa.Cliente;

public class ClienteDAO extends GenericDB1DAO<Cliente, Long> implements IClienteDAO<Cliente> {

    public ClienteDAO() {
        super(Cliente.class);
    }

}
