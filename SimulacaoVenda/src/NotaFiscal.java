import java.util.Date;
import java.util.Random;

public class NotaFiscal {
    private int numeroNota;
    private Date dataEmissao;
    private Venda venda;


    public NotaFiscal(Venda venda) {
        this.dataEmissao = new Date();
    }

    public void gerarNota() {
        Random gerador = new Random();
        this.numeroNota = gerador.nextInt();
    }

    public int getgerarNota() {
        return this.numeroNota;
    }
}
