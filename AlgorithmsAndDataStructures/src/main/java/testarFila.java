import domain.Fila;

public class testarFila {

    public static void main(String[] args) {

        Fila fila = new Fila();
        fila.enqueue(30);
        fila.enqueue(20);
        fila.enqueue(10);

        fila.printSatus();

        int remover = fila.dequeue();
        System.out.println("> Número removido: " + remover);
        fila.printSatus();

        Boolean vazio = fila.isEmpty();
        System.out.println("> A fila está vazia? " + vazio);
        fila.printSatus();

        remover = fila.dequeue();
        System.out.println("> Número removido: " + remover);
        fila.printSatus();

        vazio = fila.isEmpty();
        System.out.println("> A fila está vazia? " + vazio);
        fila.printSatus();

        remover = fila.dequeue();
        System.out.println("> Número removido: " + remover);
        fila.printSatus();

        vazio = fila.isEmpty();
        System.out.println("> A fila está vazia? " + vazio);
        fila.printSatus();
    }
}
