package domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(
        name = "tb_produtos"
)
public class Produto {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "produto_seq"
    )
    @SequenceGenerator(
            name = "produto_seq",
            sequenceName = "sq_produto",
            initialValue = 1,
            allocationSize = 1
    )
    private Long id;
    @Column(
            name = "codigo",
            length = 10,
            nullable = false,
            unique = true
    )
    private String codigo;
    @Column(
            name = "nome",
            length = 50,
            nullable = false
    )
    private String nome;
    @Column(
            name = "descricao",
            length = 100,
            nullable = false
    )
    private String descricao;
    @Column(
            name = "preco",
            nullable = false,
            precision = 10,
            scale = 2
    )
    private BigDecimal preco;

    public Produto() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getPreco() {
        return this.preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }
}
