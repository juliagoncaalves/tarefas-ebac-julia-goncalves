import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venda {
    private String cliente;
    private List<Produto> itens = new ArrayList<>();
    private List<Integer> quantidades = new ArrayList<>();
    private double valorTotal;
    private LocalDate dataEmissao;

    public Venda(String cliente) {
        this.cliente = cliente;
        this.valorTotal = 0.0;
        this.dataEmissao = LocalDate.now();
    }

    public Venda(Cliente cliente) {
        this(cliente.getNome());
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        itens.add(produto);
        quantidades.add(quantidade);
        System.out.println("Produto adicionado: " + produto.getNome() + " - Quantidade: " + quantidade);
    }

    public void calcularTotal() {
        valorTotal = 0.0;
        for (int i = 0; i < itens.size(); i++) {
            Produto produto = itens.get(i);
            int quantidade = quantidades.get(i);

            valorTotal += produto.getPrecoTotal(quantidade);
        }
}

    public void gerarNotaFiscal() {

        System.out.println("Cliente: " + cliente);
        System.out.println("Data de Emissão: " + dataEmissao);
        System.out.println("Itens vendidos:");

        for (int i = 0; i < itens.size(); i++) {
            Produto produto = itens.get(i);
            int quantidade = quantidades.get(i);
            double precoTotal = produto.getPrecoTotal(quantidade);
            System.out.printf("Produto: %s - Código: %s - Quantidade: %d - Preço unitário: R$ %.2f - Preço total: R$ %.2f%n",
                    produto.getNome(), produto.getCodigo(), quantidade, produto.getPreco(), precoTotal);
        }
        System.out.println();
        System.out.printf("Valor total da compra: R$ %.2f%n", valorTotal);
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public List<Produto> getItens() {
        return itens;
    }

    public List<Integer> getQuantidades() {
        return quantidades;
    }
}

