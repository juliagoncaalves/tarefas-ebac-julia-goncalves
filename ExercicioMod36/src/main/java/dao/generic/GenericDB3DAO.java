package dao.generic;

import java.io.Serializable;

import dao.IPersistente;

public class GenericDB3DAO<T extends IPersistente, E extends Serializable> extends GenericDAO<T, E> {

    public GenericDB3DAO(Class<T> persistenteClass) {
        super(persistenteClass, "Mysql1");
    }

}