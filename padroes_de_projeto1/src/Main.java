
import java.time.LocalDate;
import java.util.Collection;

import javax.swing.*;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ServicoAluguel servicoAluguel = new ServicoAluguel();
        ModelosCarros modeloDeCarros = new ModelosCarros();

        servicoAluguel.addCarros(modeloDeCarros.audi);
        servicoAluguel.addCarros(modeloDeCarros.hb20);
        servicoAluguel.addCarros(modeloDeCarros.gol);
        servicoAluguel.addCarros(modeloDeCarros.teslaModel3);
        servicoAluguel.addCarros(modeloDeCarros.ecoSport);
        servicoAluguel.addCarros(modeloDeCarros.cronus);

        servicoAluguel.showDisponivelCarros();



        String[] options = {"Alugar Carro", "Devolver Carro", "Mostrar Carros Disponiveis", "Exit"};
        while (true) {
            int choice = JOptionPane.showInternalOptionDialog(null, "Selecione uma Opção", "Sistema de Aluguel de Carros", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {

                case 0:
                    String nome = JOptionPane.showInputDialog("Nome do cliente:");
                    String carteiraHabilitacao = JOptionPane.showInputDialog("Digite o número da carteira de habilitação");
                    ClienteImpl cliente = new ClienteImpl(nome, carteiraHabilitacao);

                    String modelo = JOptionPane.showInputDialog("Insira modelo do carro para alugar:");
                    CharSequence aluguelDateStr = JOptionPane.showInputDialog("Insira a data do aluguel (yyyy-mm-dd):");
                    CharSequence devolverDateStr = JOptionPane.showInputDialog("Insira a data de devolução (yyyy-mm-dd):");

                    LocalDate aluguelDate = LocalDate.parse(aluguelDateStr, DateTimeFormatter.ISO_LOCAL_DATE);
                    //LocalDate.
                    LocalDate devolverDate = LocalDate.parse(devolverDateStr, DateTimeFormatter.ISO_LOCAL_DATE);

                    servicoAluguel.aluguel(cliente, modelo, aluguelDate, devolverDate);

                    break;

                case 1:

                    String modeloDevolucao = JOptionPane.showInputDialog("Insira o modelo do carro para devolver:");
                    servicoAluguel.returnCarro(modeloDevolucao);
                    break;


                case 2:

                    servicoAluguel.showDisponivelCarros();
                    break;

                case 3:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }
}
