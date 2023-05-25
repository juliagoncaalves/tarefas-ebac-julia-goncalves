import javax.swing.plaf.IconUIResource;

public class Ventilador {
    private String cor; // exemplo: preto, branco.
    private String tipo; // exemplo: ventilador de teto, ventilador de pé.
    private int diametro; // exemplo: 40, 35.
    private int comprimento; // exemplo: 100, 120.
    private int qtnHelice; // exemplo: 3, 8, 6.


    public void ligar() {
        System.out.println("ligou");
    }
    public void velocidade(int nivel) {
        System.out.println("velocidade "+ nivel);
    }

    public void girar() {
        System.out.println("girando");
    }

    public void desligar() {
        System.out.println("desligado");
    }

}

