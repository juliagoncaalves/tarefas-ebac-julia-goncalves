package dao;

import domain.Cliente;

public interface IClienteDAO {
    void adicionar(Cliente cliente);
    Cliente buscar(String nome);
    void excluir(String nome);
}
