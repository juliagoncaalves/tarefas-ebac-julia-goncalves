package services;

import dao.IClienteDAO;
import domain.Cliente;
import exceptions.DAOException;
import exceptions.MaisDeUmRegistroException;
import exceptions.TableException;
import services.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {


    public ClienteService(IClienteDAO clienteDAO) {
        super(clienteDAO);
    }


    @Override
    public Cliente buscarPorCPF(Long cpf) throws DAOException {
        try {
            return this.dao.consultar(cpf);
        } catch (MaisDeUmRegistroException | TableException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}
