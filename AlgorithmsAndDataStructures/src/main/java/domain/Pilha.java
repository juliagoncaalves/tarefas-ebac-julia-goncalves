package domain;

import exception.PilhaVaziaException;

import java.util.ArrayList;

public class Pilha {

    private final ArrayList<Integer> numeros;

    public Pilha() {
        this.numeros = new ArrayList<>();
    }

    public void push(int valor) {
        this.numeros.add(valor);
    }

    public int pop() {
        try {
            return this.numeros.remove(this.numeros.size() - 1);
        } catch (PilhaVaziaException e) {
            throw new PilhaVaziaException("Pilha vazia", e.getCause());
        } catch (IndexOutOfBoundsException e) {
            throw new IndexOutOfBoundsException("Pilha vazia[2]");
        }

    }

    public int top() {
        try {
            return this.numeros.get(this.numeros.size() - 1);
        } catch (PilhaVaziaException e) {
            throw new PilhaVaziaException("Pilha vazia", e.getCause());
        } catch (IndexOutOfBoundsException e) {
            System.out.println("> Pilha vazia[2]\n> " + e.getMessage());
            return 0;
        }

    }

    public boolean isEmpty() {
        return this.numeros.isEmpty();
    }

    public int size() {
        return this.numeros.size();
    }

    public void printSatus() {
        System.out.println("> Topo da pilha: " + this.top());
        System.out.println("> Tamanho da pilha: " + this.size());
        System.out.println("> Pilha: " + this + "\n");
    }

    @Override
    public String toString() {
        return "Pilha{" +
                "numeros=" + numeros +
                '}';
    }
}
