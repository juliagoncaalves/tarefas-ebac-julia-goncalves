package services;

import dao.IClienteDAO;
import domain.Cliente;
import exceptions.DAOException;
import exceptions.MaisDeUmRegistroException;
import exceptions.TableException;
import services.generic.GenericService;

    public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

        // private IClienteDAO clienteDAO;

        public ClienteService(IClienteDAO clienteDAO) {
            super(clienteDAO);
            // this.clienteDAO = clienteDAO;
        }

        @Override
        public Cliente buscarPorCPF(Long cpf) throws DAOException {
            try {
                return this.dao.consultar(cpf);
            } catch (MaisDeUmRegistroException | TableException e) {
                e.printStackTrace();
            }
            return null;
        }
    }
