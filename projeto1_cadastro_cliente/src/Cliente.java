import java.util.Objects;

public class Cliente {

    private static String nome;
    private static int idade;
    private Long cpf;
    private static String cidade;
    private static String estado;

    public Cliente(String nome, int idade, String cpf, String cidade, String estado) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = Long.valueOf(cpf);
        this.cidade = cidade;
        this.estado = estado;

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public  int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public long getCPF() {
        return cpf;
    }
    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public static String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int hashCode() {
        int hash = 7;
        hash = (79 * hash) + Object.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null); {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.cpf, other.cpf)){
            return false;
        }
        return true;
    }

    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", cpf=" + cpf +
                '}';
    }
}