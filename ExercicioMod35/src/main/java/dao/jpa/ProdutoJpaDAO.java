package dao.jpa;

import dao.generic.jpa.GenericDAO;
import domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericDAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

    public ProdutoJpaDAO() {
        super(ProdutoJpa.class);
    }

}
