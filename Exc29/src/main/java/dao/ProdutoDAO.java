package dao;

import domain.Produto;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO implements IProdutoDAO {
    private List<Produto> produtos = new ArrayList<>();

    @Override
    public void adicionar(Produto produto) {
        produtos.add(produto);
    }

    @Override
    public Produto buscar(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    @Override
    public void excluir(int id) {
        produtos.removeIf(produto -> produto.getId() == id);
    }

    @Override
    public void atualizar(Produto produto) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getId() == produto.getId()) {
                produtos.set(i, produto);
                return;
            }
        }
    }

    public void excluir(String camiseta) {
    }

    public Produto buscar(String camiseta) {
        return null;
    }
}
