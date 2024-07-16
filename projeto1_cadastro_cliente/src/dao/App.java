package dao;

import javax.swing.*;
public class App {

    private static IClienteDAO iClienteDAO;

    public static void main(String args[]) {
        iClienteDAO = new ClienteMapDAO();

        String opcao = JOptionPane.showInputDialog(
                null,
                "Digite 1 para cadastro, 2 para consultar, 3 para exclusão, 4 para alteração ou 5 para sair",
                "Green dinner",
                JOptionPane.INFORMATION_MESSAGE
        );

        while (!isOpcaoValida(opcao)) {
            if ("".equals((opcao))) {
                sair();
            }
            opcao = JOptionPane.showInputDialog(
                    null,
                    "Opção inválida, digite 1 para cadastro, 2 para consulta, 3 para exclusão, 4 para alteração ou 5 para sair",
                    "Green dinner",
                    JOptionPane.INFORMATION_MESSAGE
            );
        }

        while (isOpcaoValida(opcao)) {
            if (isOpcaoSair(opcao)) {
                sair();
            } else if (isCadastro(opcao)) {
                String dados = JOptionPane.showInputDialog(null);

            }
        }
    }
}
