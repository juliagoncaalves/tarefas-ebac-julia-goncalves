package domain;

public class ListaEncadeada {

    private No inicio;

    public ListaEncadeada() {
        this.inicio = null;
    }

    public void push(No no) {
        if (this.inicio == null) {
            this.inicio = no;
            return;
        }

        No ultimo = this.inicio;
        while (ultimo.proximo != null) {
            ultimo = ultimo.proximo;
        }
        ultimo.proximo = no;
    }

    public No pop() {
        if (this.inicio == null) {
            return null;
        }

        if (this.inicio.proximo == null) {
            No removeNo = this.inicio;
            this.inicio = null;
            return removeNo;
        }

        No ultimo = this.inicio;
        while (ultimo.proximo.proximo != null) {
            ultimo = ultimo.proximo;
        }

        No removeNo = ultimo.proximo;
        ultimo.proximo = null;
        return removeNo;
    }

    public void insert(int indice, No no) {
        if (indice < 0) {
            System.out.println("> Índice inválido para inserção! ");
            return;
        }
        if (indice == 0) {
            no.proximo = this.inicio;
            this.inicio = no;
            return;
        }

        No padrao = this.inicio;
        for (int i = 0; i < indice - 1 && padrao != null; i++) {
            padrao = padrao.proximo;
        }
        if (padrao == null) {
            System.out.println("Índice inválido para inserção.");
            return;
        }
        no.proximo = padrao.proximo;
        padrao.proximo = no;
    }

    public void remove(int indice) {
        if (indice < 0) {
            System.out.println("> Índice inválido para remoção.");
            return;
        }
        if (indice == 0 && this.inicio != null) {
            this.inicio = this.inicio.proximo;
            return;
        }

        No padrao = this.inicio;
        for (int i = 0; i < indice - 1 && padrao != null; i++) {
            padrao = padrao.proximo;
        }

        if (padrao == null || padrao.proximo == null) {
            System.out.println("> Índice inválido para remoção.");
            return;
        }

        padrao.proximo = padrao.proximo.proximo;

    }

    public No elementAt(int indice) {
        No padrao = this.inicio;
        for (int i = 0; i < indice && padrao != null; i++) {
            padrao = padrao.proximo;
        }

        return padrao;
    }

    public int size() {
        int count = 0;
        No padrao = this.inicio;
        while (padrao != null) {
            count++;
            padrao = padrao.proximo;
        }
        return count;
    }

    public void printList() {
        No padrao = this.inicio;
        while (padrao != null) {
            System.out.print(padrao.numero + " ");
            padrao = padrao.proximo;
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "ListaEncadeada{" +
                "inicio=" + inicio +
                '}';
    }
}
