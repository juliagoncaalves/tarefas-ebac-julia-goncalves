package dao.generic;

import java.io.Serializable;
import java.util.Collection;

import dao.IPersistente;
import exceptions.DAOException;
import exceptions.MaisDeUmRegistroException;
import exceptions.TableException;
import exceptions.TipoChaveNaoEncontradaException;


public interface IGenericDAO<T, T1> {
    Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    void excluir(T1 valor) throws DAOException;

    void alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    T consultar(T1 valor) throws MaisDeUmRegistroException, TableException, DAOException;

    Collection<T> buscarTodos() throws DAOException;
}
