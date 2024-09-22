public class Main {
    public static void main(String[] args) {

            LojaDeVeiculos<Carros> lojaDeVeiculos = new LojaDeVeiculos<>();


            Carros eletrico = new CarroEletrico("Tesla", "Cybertruck");
            Carros convencional = new CarroConvencional("Volkswagen", "Amarok");

            lojaDeVeiculos.adicionarCarro(eletrico);
            lojaDeVeiculos.adicionarCarro(convencional);

            lojaDeVeiculos.listarCarros();

            lojaDeVeiculos.ligarTodos();
        }
    }
