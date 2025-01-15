package dao.generic;

import java.io.Serializable;

import dao.IPersistente;

public class GenericDB2DAO<T extends IPersistente, E extends Serializable> extends GenericDAO<T, E> {

    public GenericDB2DAO(Class<T> persistenteClass) {
        super(persistenteClass, "MySql2");
    }

}
