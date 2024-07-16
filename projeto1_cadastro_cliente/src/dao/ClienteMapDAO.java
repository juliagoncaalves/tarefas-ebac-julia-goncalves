package dao;
import java.util.*;

public class ClienteMapDAO implements IClienteDAO {
    private Map<Long, Cliente> map;
    public ClienteMapDAO () {
        map = new TreeMap<>();

    public Boolean cadastrar(Cliente cliente) {
        if (map.containsKey(cliente.getCpf())) {
            return false;
        }

        map.put(cliente.getCpf(), cliente);
        return true;
        }

    public void excluir(Long cpf) {
        Cliente clienteCadastro = map.get(cpf);
        map.remove(clienteCadastro.getCpf(), clienteCadastro);
        }

    public void alterar(Cliente cliente) {
        Cliente clienteCadastro = map.get(cliente.getCpf());
        clienteCadastro.setNome(cliente.getNome());
        clienteCadastro.setIdade(cliente.getIdade());
        clienteCadastro.setCidade(cliente.getCidade());
        clienteCadastro.setEstado(cliente.getEstado());
    }

    public Cliente consultar(Long cof) {
        return this.map.get(cpf);
        }

    public Collection<Cliente> buscarTodos() {
        return this.map.values();
        }

    }

}
