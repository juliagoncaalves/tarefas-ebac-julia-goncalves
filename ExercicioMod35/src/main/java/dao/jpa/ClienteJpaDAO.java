package dao.jpa;

import dao.generic.jpa.GenericDAO;
import domain.jpa.ClienteJpa;

public class ClienteJpaDAO extends GenericDAO<ClienteJpa, Long> implements IClienteJpaDAO {
    public ClienteJpaDAO() {
        super(ClienteJpa.class);
    }
}
