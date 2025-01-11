package domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.List;

@Entity
@Table(
        name = "tb_carro"
)
public class Carro {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String modelo;
    @ManyToOne
    @JoinColumn(
            name = "marca_id"
    )
    private Marca marca;
    @ManyToMany
    @JoinTable(
            name = "carro_acessorios",
            joinColumns = {@JoinColumn(
                    name = "carro_id"
            )},
            inverseJoinColumns = {@JoinColumn(
                    name = "acessorio_id"
            )}
    )
    private List<Acessorio> acessorios;

    public Carro() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Marca getMarca() {
        return this.marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public List<Acessorio> getAcessorios() {
        return this.acessorios;
    }

    public void setAcessorios(List<Acessorio> acessorios) {
        this.acessorios = acessorios;
    }
}
