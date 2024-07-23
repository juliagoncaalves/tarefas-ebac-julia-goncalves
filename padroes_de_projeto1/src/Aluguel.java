import java.time.LocalDate;
public class Aluguel {
    private ClienteImpl cliente;
    private CarroImpl carroImpl;
    private LocalDate aluguelDate;
    private LocalDate returnDate;

    public Aluguel(ClienteImpl cliente, CarroImpl carroImpl, LocalDate aluguelDate, LocalDate returnDate) {
        this.cliente = cliente;
        this.carroImpl = carroImpl;
        this.aluguelDate = aluguelDate;
        this.returnDate = returnDate;
    }

    public ClienteImpl getCliente() {
        return cliente;
    }

    public LocalDate getAluguelDate() {
        return aluguelDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public boolean CarteiraHabilitacao(String habilitado) {
        if (habilitado == "SIM") {
            return true;
        } else {
            System.out.println("Não possui habilitação");
            return false;
        }
    }

    @Override
    public String toString() {
        return "Aluguel{" +
                ", cliente=" + cliente +
                ", aluguelCarros=" + carroImpl +
                ", aluguelDate=" + aluguelDate +
                ", returnDate=" + returnDate +
                '}';
    }

    public CarroImpl getCarro() {
        return carroImpl;
    }
}
