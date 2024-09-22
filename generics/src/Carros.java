public abstract class Carros {

    private String marca;
    private String modelo;

    public Carros(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;

    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public abstract void ligar();

    }
