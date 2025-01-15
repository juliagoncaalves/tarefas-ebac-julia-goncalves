package dao;

import java.util.List;

import dao.generic.IGenericDAO;
import domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long> {

    List<Cliente> filtrarClientes(String query);

}
