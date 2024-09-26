package service;

import dao.Contrato;
import java.util.List;

public interface IContratoService {

    String salvar(Contrato contrato);

    Contrato buscarPorId(int id);

    String atualizar(Contrato contrato);

    String excluir(int id);

    List<Contrato> listarTodos();
}