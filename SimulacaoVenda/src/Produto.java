public class Produto {

    public String nome;
    public String codigo;
    public double preco;
    public int quantidadeEstoque;

    public Produto(String nome, String codigo, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }


    public boolean verificarEstoque(int quantidade) {
        return this.quantidadeEstoque >= quantidade;
    }

    public void reduzirEstoque(int quantidade) {
        this.quantidadeEstoque -= quantidade;
    }


    public double getPrecoTotal(int quantidade) {
        return this.preco * quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return this.preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public String getCodigo() {

        return codigo;
    }
}
