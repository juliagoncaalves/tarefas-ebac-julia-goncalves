package dao;

import dao.generic.IGenericDAO;
import domain.Venda;

public interface IVendaDAO extends IGenericDAO<Venda, Long> {

    void finalizarVenda(Venda venda);

    void cancelarVenda(Venda venda);

    Venda consultarComCollection(Long id);

}
