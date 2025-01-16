import domain.Pilha;

public class testarPilha {

    public static void main(String[] args) {

        Pilha p = new Pilha();
        p.push(20);
        p.push(10);
        p.push(5);

        p.printSatus();

        int remover = p.pop();
        System.out.println("> Remover o item do topo.");
        System.out.println("> Número removido: " + remover);
        p.printSatus();

        remover = p.pop();
        System.out.println("> Número removido: " + remover);
        System.out.println("> Remover o item do topo.");
        p.printSatus();

        remover = p.pop();
        System.out.println("> Número removido: " + remover);
        System.out.println("> Remover o item do topo.");
        p.printSatus();
    }
}