package dao.generic;

import java.io.Serializable;

import dao.IPersistente;

public abstract class GenericDB1DAO<T extends IPersistente, E extends Serializable> extends GenericDAO<T, E> {

    public GenericDB1DAO(Class<T> persistenteClass) {
        super(persistenteClass, "MySql1");
    }

}
