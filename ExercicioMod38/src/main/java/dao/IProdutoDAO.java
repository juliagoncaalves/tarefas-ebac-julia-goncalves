package dao;

import java.util.List;

import dao.generic.IGenericDAO;
import domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String> {

    List<Produto> filtrarProdutos(String query);

}
