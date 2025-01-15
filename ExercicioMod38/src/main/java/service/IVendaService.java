package service;

import dao.generic.IGenericDAO;
import domain.Venda;

public interface IVendaService extends IGenericDAO<Venda, Long> {

    public void finalizarVenda(Venda venda);

    public void cancelarVenda(Venda venda);

    public Venda consultarComCollection(Long id);

}
