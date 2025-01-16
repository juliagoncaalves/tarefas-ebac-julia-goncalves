package domain;

public class No {

    int numero;
    No proximo;

    public No(int numero) {
        this.numero = numero;
        this.proximo = null;
    }

    @Override
    public String toString() {
        return "No{" +
                "numero=" + numero +
                ", proximo=" + proximo +
                '}';
    }
}
