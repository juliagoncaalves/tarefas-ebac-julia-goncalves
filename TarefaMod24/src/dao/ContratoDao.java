package dao;

import java.util.List;

public class ContratoDao implements IContratoDao {

    @Override
    public void salvar(Contrato contrato) {

    }

    @Override
    public Contrato buscarPorId(int id) {
        return null;
    }

    @Override
    public void atualizar(Contrato contrato) {

    }

    @Override
    public void excluir(int id) {

    }

    @Override
    public List<Contrato> listarTodos() {
        return null;
    }

    @Override
    public void salvar() {
        throw new UnsupportedOperationException("Não funciona com o banco");
    }
}