package dao.jpa;

import dao.generic.IGenericDAO;
import domain.jpa.Venda;
import exceptions.DAOException;
import exceptions.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, Long> {

    void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

    Venda consultarComCollection(Long id);

}