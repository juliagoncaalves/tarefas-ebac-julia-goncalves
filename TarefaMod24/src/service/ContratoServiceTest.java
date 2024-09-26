package service;

import dao.Contrato;
import dao.IContratoDao;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.verification.Times;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class ContratoServiceTest {

    @Mock
    private IContratoDao contratoDao;

    @InjectMocks
    private  ContratoServiceImpl contratoService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testSalvarContrato() {

    Contrato contrato = new Contrato(1, "Contrato Teste");

        doNothing().when(contratoDao).salvar(contrato);

        String resultado = contratoService.salvar(contrato);

        verify(contratoDao, times(1)).salvar(contrato);
        assertEquals("Contrato salvo com sucesso!", resultado);
    }

    @Test
    public void testBuscarporIdContrato(){

        Contrato contrato = new Contrato(1, "Contrato Teste");

        when(contratoDao.buscarPorId(1)).thenReturn(contrato);
        Contrato resultado = contratoService.buscarPorId(1);

        verify(contratoDao, times(1)).buscarPorId(1);
        assertNotNull(resultado);
        assertEquals(1, resultado.getId());
        assertEquals("Contrato Teste", resultado.getNome());
    }

    @Test
    public void testAtualizarContrato() {

        Contrato contrato = new Contrato(1, "Contrato Atualizado");

        doNothing().when(contratoDao).atualizar(contrato);

        String resultado = contratoService.atualizar(contrato);

        verify(contratoDao, times(1)).atualizar(contrato);
        assertEquals("Contrato atualizado com sucesso!", resultado);
    }

    @Test
    public void testExcluirContrato() {

        doNothing().when(contratoDao).excluir(1);

        String resultado = contratoService.excluir(1);

        verify(contratoDao, times(1)).excluir(1);
        assertEquals("Contrato excluído com sucesso!", resultado);
    }

    @Test
    public void testListarTodosContratos() {

        List<Contrato> contratos = Arrays.asList(new Contrato(1, "Contrato A"), new Contrato(2, "Contrato B"));

        when(contratoDao.listarTodos()).thenReturn(contratos);

        List<Contrato> resultado = contratoService.listarTodos();

        verify(contratoDao, times(1)).listarTodos();
        assertEquals(2, resultado.size());
        assertEquals("Contrato A", resultado.get(0).getNome());
    }


    private IContratoDao verify(IContratoDao contratoDao, Times times) {
        return null;
    }
}