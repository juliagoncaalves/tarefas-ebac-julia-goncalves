//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println();
        Cliente cliente = new Cliente("Julia Goncalves", "12365490");

        Produto relogio = new Produto("Relogio", "001", 1200.00, 10);
        Produto celular = new Produto("Celular", "002", 3000.00, 7);

        System.out.println("Cliente: " + cliente.getNome());
        System.out.println();
        System.out.println("Produtos disponíveis para venda:");
        System.out.println("1. " + relogio.getNome() + " - Preço: R$ " + relogio.getPreco());
        System.out.println("2. " + celular.getNome() + " - Preço: R$ " + celular.getPreco());
        System.out.println();

        Venda venda = new Venda(cliente);

        System.out.println("Produtos: ");
        System.out.println();
        venda.adicionarProduto(relogio, 3);
        venda.adicionarProduto(celular, 1);
        venda.calcularTotal();

        System.out.println("Valor total da compra: R$ " + venda.getValorTotal());
        System.out.println();

        System.out.println("Atualizando o estoque dos produtos vendidos: ");
        System.out.println();
        relogio.reduzirEstoque(3);
        celular.reduzirEstoque(1);

        System.out.println("Estoque Atualizado: ");
        System.out.println("Relogio - Quantidade atual: " + relogio.getQuantidadeEstoque() + " - Preço: R$ " + relogio.getPreco());
        System.out.println("Celular - Quantidade atual: " + celular.getQuantidadeEstoque() + " - Preço: R$ " + celular.getPreco());
        System.out.println();

        NotaFiscal notaFiscal = new NotaFiscal(venda);
        notaFiscal.gerarNota();

        System.out.println("Nota Fiscal: " + notaFiscal.getgerarNota());

        venda.gerarNotaFiscal();


    }
}
