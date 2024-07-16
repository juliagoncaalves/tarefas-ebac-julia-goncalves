package dao;
import java.util.Collection;

public interface IClienteDAO {
    public Cliente cadastrar(Cliente cliente);
    public void excluir(Long cpf);
    public void alterar (Cliente cliente);
    public Cliente consultar(Long cpf);
    Collection<Cliente> buscarTodos();
}
