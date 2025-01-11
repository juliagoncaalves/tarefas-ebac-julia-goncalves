import dao.IProdutoDAO;
import dao.ProdutoDAO;
import domain.Produto;
import java.math.BigDecimal;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.*;

public class ProdutoTest {
    private IProdutoDAO produtoDAO = Mockito.mock(ProdutoDAO.class);

    public ProdutoTest() {
    }

    @Test
    public void cadastrar() {
        Produto produto = new Produto();
        produto.setCodigo("A1");
        produto.setNome("Computador Samsung");
        produto.setDescricao("Versão 5.1");
        produto.setPreco(BigDecimal.valueOf((double)5000.0));

        Produto produtoCadastrado = new Produto();
        produtoCadastrado.setId(1L);  // Atribuindo um ID para o produto mockado
        when(produtoDAO.cadastrar(any(Produto.class))).thenReturn(produtoCadastrado);

        produto = produtoDAO.cadastrar(produto);

        assertNotNull(produto);
        assertNotNull(produto.getId());
    }
}