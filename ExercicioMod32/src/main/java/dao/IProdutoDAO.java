package dao;

import domain.Produto;
import java.util.List;

public interface IProdutoDAO {
    Produto cadastrar(Produto var1);

    void excluir(Produto var1);

    List<Produto> buscarTodos();
}

