package service;

import dao.IContratoDao;
import dao.Contrato;
import java.util.List;

public class ContratoServiceImpl implements IContratoService {
    private IContratoDao contratoDao;

    public ContratoServiceImpl(IContratoDao contratoDao) {
        this.contratoDao = contratoDao;
    }

    @Override
    public String salvar(Contrato contrato) {
        contratoDao.salvar(contrato);
        return "Contrato salvo com sucesso!";
    }

    @Override
    public Contrato buscarPorId(int id) {
        return contratoDao.buscarPorId(id);
    }

    @Override
    public String atualizar(Contrato contrato) {
        contratoDao.atualizar(contrato);
        return "Contrato atualizado com sucesso!";
    }

    @Override
    public String excluir(int id) {
        contratoDao.excluir(id);
        return "Contrato excluído com sucesso!";
    }

    @Override
    public List<Contrato> listarTodos() {
        return contratoDao.listarTodos();
    }
}