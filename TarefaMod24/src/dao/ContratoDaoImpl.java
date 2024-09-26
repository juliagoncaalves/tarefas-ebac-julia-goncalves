package dao;

import java.util.ArrayList;
import java.util.List;

public class ContratoDaoImpl implements IContratoDao {

    private List<Contrato> contratos = new ArrayList<>();  // Simulando um banco de dados em memória

    @Override
    public void salvar(Contrato contrato) {
        contratos.add(contrato);  // Adiciona o contrato à lista
        System.out.println("Contrato salvo: " + contrato.getNome());
    }

    @Override
    public Contrato buscarPorId(int id) {
        for (Contrato contrato : contratos) {
            if (contrato.getId() == id) {
                return contrato;  // Retorna o contrato se o ID corresponder
            }
        }
        return null;  // Retorna null se o contrato não for encontrado
    }

    @Override
    public void atualizar(Contrato contrato) {
        Contrato contratoExistente = buscarPorId(contrato.getId());
        if (contratoExistente != null) {
            contratoExistente.setNome(contrato.getNome());  // Atualiza o nome do contrato
            System.out.println("Contrato atualizado: " + contrato.getNome());
        }
    }

    @Override
    public void excluir(int id) {
        Contrato contrato = buscarPorId(id);
        if (contrato != null) {
            contratos.remove(contrato);  // Remove o contrato da lista
            System.out.println("Contrato excluído: " + contrato.getNome());
        }
    }

    @Override
    public List<Contrato> listarTodos() {
        return contratos;  // Retorna todos os contratos
    }

    @Override
    public void salvar() {

    }
}
