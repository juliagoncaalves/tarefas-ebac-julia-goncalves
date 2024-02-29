package pessoa;

public class PessoaFisica extends Pessoa{

    private int cpf;
    public PessoaFisica(String nome, int idade, int cpf) {
        super(nome, idade);
        this.cpf = cpf;
    }
}
