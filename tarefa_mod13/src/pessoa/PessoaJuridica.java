package pessoa;

public class PessoaJuridica extends Pessoa{

    private int cnpj;

    public PessoaJuridica(String nome, int idade, int cnpj) {
        super(nome, idade);
        this.cnpj = cnpj;
    }
}
