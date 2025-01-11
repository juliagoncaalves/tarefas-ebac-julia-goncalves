package services.generic;

import java.io.Serializable;
import java.util.Collection;

import dao.IPersistente;
import exceptions.DAOException;
import exceptions.TipoChaveNaoEncontradaException;

public interface IGenericService<T extends IPersistente, E extends Serializable> {

    public Boolean cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public void excluir(E valor) throws DAOException;

    public void alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException;

    public T consultar(E valor) throws DAOException;

    public Collection<T> buscarTodos() throws DAOException;

}
