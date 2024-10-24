public class Cliente {
    private String nome;
    private String cpfCnpj;
    private String endereco;


    public Cliente(String nome, String cpfCnpj){
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
    }

    public void realizarCompra(Venda venda) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
