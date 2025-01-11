package dao;

import java.util.Collection;

import dao.generic.IGenericDAO;
import domain.Produto;
import exceptions.TipoChaveNaoEncontradaException;

public interface IProdutoDAO extends IGenericDAO<Produto, String> {}
