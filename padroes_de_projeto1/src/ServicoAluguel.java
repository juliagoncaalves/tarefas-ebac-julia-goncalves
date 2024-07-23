import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class ServicoAluguel implements IServicoAluguel {
    private List<CarroImpl> carroImpls = new ArrayList<>();
    private List<Aluguel> aluguels = new ArrayList<>();

    public void addCarros (CarroImpl carroImpl) {
        carroImpls.add(carroImpl);
    }

    public void aluguel (ClienteImpl cliente, String modelo, LocalDate aluguelDate, LocalDate returnDate) {
        for (CarroImpl carroImpl : carroImpls) {
            if(carroImpl.getModelo().equals(modelo) && carroImpl.disponibilidade()) {
                carroImpl.setDisponivel(false);
                Aluguel aluguel = new Aluguel(cliente, carroImpl, aluguelDate, returnDate);
                aluguels.add(aluguel);
                JOptionPane.showMessageDialog(null, "Carro Alugado com Sucesso", "Comfirmação", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        System.out.println("Carro não disponivel para aluguel: " + modelo);
        JOptionPane.showMessageDialog(null, "Carro não disponivel para aluguel: " + modelo, "Comfirmação", JOptionPane.INFORMATION_MESSAGE);
    }

    public void returnCarro(String modelo) {
        for (Aluguel aluguel : aluguels) {
            if (aluguel.getCarro().getModelo().equals(modelo) && !aluguel.getCarro().disponibilidade()) {
                aluguel.getCarro().setDisponivel(true);
                JOptionPane.showMessageDialog(null, "Carro Devolvido com Sucesso", "Comfirmação", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }

        JOptionPane.showMessageDialog(null, "Carro não existe ou já está disponivel: " + modelo, "Comfirmação", JOptionPane.INFORMATION_MESSAGE);
    }
    public void showDisponivelCarros() {
        System.out.println("Carros disponiveis:");
        for (CarroImpl carroImpl : carroImpls) {
            if (carroImpl.disponibilidade()) {
                System.out.println(carroImpl.getModelo());
            }
        }
    }
}
