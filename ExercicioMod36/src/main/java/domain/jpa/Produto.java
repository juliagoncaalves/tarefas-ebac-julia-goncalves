package domain.jpa;

import java.math.BigDecimal;

import dao.IPersistente;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "TB_PRODUTO")
public class Produto implements IPersistente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "prod_seq")
    @SequenceGenerator(name = "prod_seq", sequenceName = "sq_produto", initialValue = 1, allocationSize = 1)
    private Long id;

    @Column(name = "codigo", nullable = false, length = 10, unique = true)
    private String codigo;

    @Column(name = "NOME", nullable = false, length = 50)
    private String nome;

    @Column(name = "DESCRICAO", nullable = false, length = 50)
    private String descricao;

    @Column(name = "valor", nullable = false)
    private BigDecimal valor;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
