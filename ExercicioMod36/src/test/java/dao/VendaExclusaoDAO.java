package dao;

import dao.generic.GenericDB1DAO;
import dao.jpa.IVendaDAO;
import domain.jpa.Venda;
import exceptions.DAOException;
import exceptions.TipoChaveNaoEncontradaException;

public class VendaExclusaoDAO extends GenericDB1DAO<Venda, Long> implements IVendaDAO {

    public VendaExclusaoDAO() {
        super(Venda.class);
    }

    @Override
    public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

    @Override
    public Venda consultarComCollection(Long id) {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO PERMITIDA");
    }

}
