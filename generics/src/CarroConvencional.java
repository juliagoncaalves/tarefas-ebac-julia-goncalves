public class CarroConvencional extends Carros {
        public CarroConvencional(String marca, String modelo) {
            super(marca, modelo);
        }

        @Override
        public void ligar() {
            System.out.println("Carro convencional " + getMarca() + " " + getModelo() + " liga com o barulho do motor.");
        }
    }


