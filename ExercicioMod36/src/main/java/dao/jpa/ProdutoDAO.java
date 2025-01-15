package dao.jpa;

import dao.generic.GenericDB1DAO;
import domain.jpa.Produto;

public class ProdutoDAO extends GenericDB1DAO<Produto, Long> implements IProdutoDAO {

    public ProdutoDAO() {
        super(Produto.class);
    }

}