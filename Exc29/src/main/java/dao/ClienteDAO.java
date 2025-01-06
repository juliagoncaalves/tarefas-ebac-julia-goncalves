package dao;

import domain.Cliente;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements IClienteDAO {
    private List<Cliente> clientes = new ArrayList<>();

    @Override
    public void adicionar(Cliente cliente) {
        clientes.add(cliente);
    }

    @Override
    public Cliente buscar(String nome) {
        for (Cliente cliente : clientes) {
            if (cliente.getNome().equals(nome)) {
                return cliente;
            }
        }
        return null;
    }

    @Override
    public void excluir(String nome) {
        clientes.removeIf(cliente -> cliente.getNome().equals(nome));
    }
}
