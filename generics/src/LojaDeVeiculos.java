import java.util.ArrayList;
import java.util.List;

public class LojaDeVeiculos<T extends Carros> {
    private List<T> listCarros;

    public LojaDeVeiculos() {
        this.listCarros = new ArrayList<>();
    }

    public static void listarCarros() {
    }

    public void adicionarCarro(T Carros) {
        listCarros.add(Carros);
    }

    public void listarCarro(T Carros) {
        for (T carro : listCarros) {
            System.out.println(carro.getMarca() + " " + carro.getModelo());
        }
    }

    public void ligarTodos() {
        for (T carro : listCarros) {
            carro.ligar();
        }
    }
}