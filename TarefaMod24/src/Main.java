import dao.Contrato;
import dao.ContratoDaoImpl;
import dao.IContratoDao;

public class Main {
    public static void main(String[] args) {
        IContratoDao contratoDao = new ContratoDaoImpl();

        // Criar e salvar contratos
        contratoDao.salvar(new Contrato(1, "Contrato A"));
        contratoDao.salvar(new Contrato(2, "Contrato B"));

        // Listar todos os contratos
        System.out.println("Todos os contratos:");
        for (Contrato contrato : contratoDao.listarTodos()) {
            System.out.println(contrato.getNome());
        }

        // Atualizar um contrato
        contratoDao.atualizar(new Contrato(1, "Contrato A Atualizado"));

        // Buscar um contrato
        Contrato contratoBuscado = contratoDao.buscarPorId(1);
        System.out.println("Encontrado: " + (contratoBuscado != null ? contratoBuscado.getNome() : "Não encontrado"));

        // Excluir um contrato
        contratoDao.excluir(2);
    }
}
