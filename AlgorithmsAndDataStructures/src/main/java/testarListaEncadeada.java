import domain.ListaEncadeada;
import domain.No;

public class testarListaEncadeada {

    public static void main(String[] args) {

        ListaEncadeada lista = new ListaEncadeada();
        No no1 = new No(1);
        No no2 = new No(2);
        No no3 = new No(3);

        lista.push(no1);
        lista.push(no2);
        lista.push(no3);

        System.out.println("> Lista encadeada: ");
        lista.printList();

        System.out.println("> Remover o último elemento: ");
        No remover = lista.pop();
        System.out.println("> Elemento removido: " + remover);

        System.out.println("> Adicionando novo elemento no índice 1:");
        No novoNo = new No(4);
        lista.insert(1, novoNo);

        System.out.println("> Lista encadeada após inserção: ");
        lista.printList();

        System.out.println("> Removendo o elemento no índice 1:");
        lista.remove(1);

        System.out.println("> Lista encadeada após remoção: ");
        lista.printList();
    }
}
