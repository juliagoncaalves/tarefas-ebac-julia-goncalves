package dao;

import java.util.Collection;
import java.util.HashSet;

public class ClienteSetDAO implements IClienteDAO {

    private Set<Cliente> set;

    public ClienteSetDAO() {
        this.set = new HashSet<>();
    }

    public Cliente cadastrar(Cliente cliente) {
        return this.set.add(cliente);

        public void excluir (Long cpf){
            Cliente clienteEncontrado = null;
            for (Cliente cliente : this.set) {
                if (cliente.getCpf().equals(cpf)) {
                    clienteEncontrado = cliente;
                    break;
                }
            }

            if (clienteEncontrado != null) {
                this.set.remove(clienteEncontrado);
            }
        }

        public void alterar (Cliente cliente){
            if (this.set.contains(cliente)) {
                for (Cliente clienteCadastrado : this.set) {
                    if (clienteCadastrado.equals(cliente)) {
                        clienteCadastrado.setNome(cliente.getNome());
                        clienteCadastrado.setIdade(cliente.getIdade());
                        clienteCadastrado.setCidade(cliente.getCidade());
                        clienteCadastrado.setEstado(cliente.getEstado());
                        break;
                    }
                }
            }
        }

        public Cliente consultar (Longcpf) {
        for (Cliente clientecadastrado : this.set) {
            if (clientecadastrado.getCpf().equals(cpf)) {
                return clientecadastrado;
            }
        }
        return null;
    }

        public Collection<Cliente> buscarTodos () {
            return this.set
        }
    }
}

