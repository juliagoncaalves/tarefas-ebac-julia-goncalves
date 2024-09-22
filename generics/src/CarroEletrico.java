public class CarroEletrico extends Carros {
    public CarroEletrico(String marca, String modelo) {
        super(marca,modelo);
    }

    @Override
    public void ligar() {
        System.out.println("Carro Elétrico " + getMarca() + " " + getModelo() + "liga silenciosamente");
    }
}
