package dao;

import domain.Cliente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteDAOTest {

    private ClienteDAO clienteDAO;

    @BeforeEach
    void setUp() {
        clienteDAO = new ClienteDAO();
    }

    @Test
    void testarAdicionarCliente() {
        Cliente cliente = new Cliente("Julia", "julia@email.com");
        clienteDAO.adicionar(cliente);

        Cliente clienteBuscado = clienteDAO.buscar("Julia");
        assertNotNull(clienteBuscado, "Cliente não encontrado");
        assertEquals("Julia", clienteBuscado.getNome());
    }

    @Test
    void testarExcluirCliente() {
        Cliente cliente = new Cliente("Julia", "julia@email.com");
        clienteDAO.adicionar(cliente);

        clienteDAO.excluir("Julia");
        Cliente clienteBuscado = clienteDAO.buscar("Julia");
        assertNull(clienteBuscado, "Cliente não foi excluído corretamente");
    }
}
