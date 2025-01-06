package dao;


import domain.Produto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoDAOTest {

    private dao.ProdutoDAO produtoDAO;

    @BeforeEach
    void setUp() {
        produtoDAO = new ProdutoDAO();
    }

    @Test
    void testarAdicionarProduto() {
        Produto produto = new Produto("Camiseta", 50.0);
        produtoDAO.adicionar(produto);

        Produto produtoBuscado = produtoDAO.buscar(produto.getId());

        assertNotNull(produtoBuscado, "Produto não encontrado");
        assertEquals(produto.getNome(), produtoBuscado.getNome(), "O nome do produto não corresponde.");
    }

    @Test
    void testarExcluirProduto() {
        Produto produto = new Produto("Camiseta", 50.0);
        produtoDAO.adicionar(produto);

        produtoDAO.excluir("Camiseta");
        Produto produtoBuscado = produtoDAO.buscar("Camiseta");
        assertNull(produtoBuscado, "Produto não foi excluído corretamente");
    }
}