package test;

import org.junit.Test;
import service.TesteCliente;

import static org.junit.Assert.assertEquals;

class TesteClienteTest {

    @Test
    public void testeClasseCliente() {
        TesteCliente cli = new TesteCliente();
        cli.adicionarNome("Rodrigo");
        cli.adicionarNome1("Rodrigo");

        assertEquals("Rodrigo", cli.getNome());
    }
}