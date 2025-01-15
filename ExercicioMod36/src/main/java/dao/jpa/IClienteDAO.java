package dao.jpa;

import dao.IPersistente;
import dao.generic.IGenericDAO;

public interface IClienteDAO<T extends IPersistente> extends IGenericDAO<T, Long> {

}
