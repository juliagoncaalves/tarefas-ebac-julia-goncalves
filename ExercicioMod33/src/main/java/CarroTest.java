import dao.AcessorioDAO;
import dao.CarroDAO;
import dao.IAcessorioDAO;
import dao.ICarroDAO;
import dao.IMarcaDAO;
import dao.MarcaDAO;
import domain.Acessorio;
import domain.Carro;
import domain.Marca;
import org.mockito.Mockito;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import static org.testng.Assert.assertNotNull;

public class CarroTest {

    private ICarroDAO carroDAO;
    private IAcessorioDAO acessorioDAO;
    private IMarcaDAO marcaDAO;

    @BeforeMethod
    public void setUp() {

        carroDAO = Mockito.mock(ICarroDAO.class);
        acessorioDAO = Mockito.mock(IAcessorioDAO.class);
        marcaDAO = Mockito.mock(IMarcaDAO.class);
    }

    @Test
    public void cadastrar() {

        Carro carro = new Carro();
        Marca marca = new Marca();
        Acessorio acessorio = new Acessorio();
        Acessorio acessorio2 = new Acessorio();
        List<Acessorio> acessorios = new ArrayList<>();

        acessorio.setNome("Cinto segurança três pontos lado direito");
        acessorio2.setNome("Cinto segurança três pontos lado esquerdo");
        marca.setNome("Tesla");
        carro.setModelo("Number 1");
        carro.setMarca(marca);

        acessorios.add(acessorio);
        acessorios.add(acessorio2);
        carro.setAcessorios(acessorios);

        when(acessorioDAO.cadastrar(acessorio)).thenReturn(acessorio);
        when(acessorioDAO.cadastrar(acessorio2)).thenReturn(acessorio2);
        when(marcaDAO.cadastrar(marca)).thenReturn(marca);
        when(carroDAO.cadastrar(carro)).thenReturn(carro);

        acessorioDAO.cadastrar(acessorio);
        acessorioDAO.cadastrar(acessorio2);
        marcaDAO.cadastrar(marca);
        carroDAO.cadastrar(carro);

        assertNotNull(carro);
        verify(carroDAO).cadastrar(carro);
    }
}
