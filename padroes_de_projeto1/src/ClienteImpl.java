public class ClienteImpl implements ICliente {
    private String nome;
    private String carteiraHabilitacao;

    public ClienteImpl(String nome, String carteiraHabilitacao) {
        this.nome = nome;
        this.carteiraHabilitacao = carteiraHabilitacao;
    }

    public String getNome() {
        return nome;
    }

    public String getCarteiraHabilitacao() {
        return carteiraHabilitacao;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", carteiraHabilitação='" + carteiraHabilitacao + '\'' +
                '}';
    }
}
