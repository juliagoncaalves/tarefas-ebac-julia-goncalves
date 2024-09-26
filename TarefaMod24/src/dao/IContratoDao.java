package dao;
import java.util.List;
public interface IContratoDao {
    void salvar(Contrato contrato);

    Contrato buscarPorId(int id);

    void atualizar(Contrato contrato);

    void excluir(int id);

    List<Contrato> listarTodos();

    void salvar();
}