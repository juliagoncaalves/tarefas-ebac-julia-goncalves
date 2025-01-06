package dao;

import domain.Produto;

public interface IProdutoDAO {

    void adicionar(Produto produto);
    Produto buscar(int id);
    void excluir(int id);
    void atualizar(Produto produto);
}

