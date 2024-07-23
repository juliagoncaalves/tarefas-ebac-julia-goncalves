public class CarroImpl implements ICarro{

    private String modelo;
    private String grupo;
    private int ano;
    private boolean disponivel;

    public CarroImpl(String modelo, String grupo, int ano, boolean disponivel) {
        this.modelo = modelo;
        this.grupo = grupo;
        this.ano = ano;
        this.disponivel = true;

    }

    public String getModelo() {
        return modelo;
    }
    public void  setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getGrupo() {
        return grupo;
    }
    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean disponibilidade() {
        return this.disponivel;
    }
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String toString() {
        return "Carros {" +
                "modelo='" + modelo + '\'' +
                ", especificação='" + grupo +
                "ano='" + ano +
                '}';
    }

    public void add(CarroImpl carroImpl) {
    }
}
