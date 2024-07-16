import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cliente {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cadastro de Cliente");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,300);
        frame.setLayout(new GridLayout(5,2));

        JLabel lblNome = new JLabel("     Nome:");
        JTextField txtNome = new JTextField();

        JLabel lblIdade = new JLabel("     Idade:");
        JTextField txtIdade= new JTextField();

        JLabel lblCidade = new JLabel("     Cidade:");
        JTextField txtCidade = new JTextField();

        JLabel lblEstado = new JLabel("     Estado:");
        JTextField txtEstado = new JTextField();

        JButton btnSalvar = new JButton("Cadastrar");
        JButton btnLimpar = new JButton("Limpar");

        frame.add(lblNome);
        frame.add(txtNome);

        frame.add(lblIdade);
        frame.add(txtIdade);

        frame.add(lblCidade);
        frame.add(txtCidade);

        frame.add(lblEstado);
        frame.add(txtEstado);

        frame.add(btnSalvar);
        frame.add(btnLimpar);

            btnSalvar.addActionListener(new ActionListener() {

                public void actionPerformed(ActionEvent e) {
                    String nome = txtNome.getText();
                    String idade = txtIdade.getText();
                    String cidade = txtCidade.getText();
                    String estado = txtEstado.getText();

                    JOptionPane.showMessageDialog(frame, "Cliente cadastrado com sucesso!\nNome: " + nome + "\nIdade: " + idade + "\nCidade: " + cidade + "\nEstado: " + estado);
                }
            });

        btnLimpar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                txtNome.setText("");
                txtIdade.setText("");
                txtCidade.setText("");
                txtEstado.setText("");
            }
        });

        frame.setVisible(true);
            }

}

