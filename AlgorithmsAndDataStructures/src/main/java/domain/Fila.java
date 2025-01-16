package domain;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Fila {

    private Queue<Integer> filas;

    public Fila() {
        filas = new LinkedList<>();
    }

    public void enqueue(int valor) {
        filas.add(valor);
    }

    public int dequeue() {
        return filas.poll();
    }

    public int rear() {
        try {
            return ((LinkedList<Integer>) filas).getLast();
        } catch (NoSuchElementException e) {
            System.out.println("> A fila está vazia!! [rear]");
            return 0;
        }
    }

    public int front() {
        try {
            return filas.peek();
        } catch (NullPointerException e) {
            System.out.println("> A fila está vazia!! [front]");
            return 0;
        }
    }

    public int size() {
        try {
            return filas.size();
        } catch (NullPointerException e) {
            System.out.println("> A fila está vazia!! [size]");
            return 0;
        }
    }

    public boolean isEmpty() {
        return filas.isEmpty();
    }

    public void printSatus() {
        System.out.println("> Primeiro da fila: " + this.front());
        System.out.println("> Último da fila: " + this.rear());
        System.out.println("> Tamanho da fila: " + this.size());
        System.out.println("> Fila: " + this);
        System.out.println();

    }

    @Override
    public String toString() {
        return "Fila{" +
                "filas=" + filas +
                '}';
    }
}
