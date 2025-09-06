import javax.swing.*;
import java.awt.*;

// Lucas Dias Bernardes CC4P33 R0822B4
public class TelaSwing extends JFrame {

    private JLabel labelNome, labelEnd;
    private JTextField tFNome, tFEndereco;
    private JButton btOk;
    private JPanel jPanel1, jPanel2, jPanel3;

    public TelaSwing() {
        super("Border layout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        labelNome = new JLabel("Nome: ");
        tFNome = new JTextField(15);
        labelEnd = new JLabel("Endereço: ");
        tFEndereco = new JTextField(20);
        btOk = new JButton("OK");

        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jPanel3 = new JPanel();

        Container janela;
        janela = getContentPane();
        janela.setLayout(new BorderLayout());

        jPanel1.setLayout(new GridLayout(2, 1));
        jPanel2.setLayout(new GridLayout(2, 1));
        jPanel3.setLayout(new FlowLayout());

        jPanel1.add(labelNome);

        jPanel1.add(labelEnd);
        jPanel2.add(tFNome);

        jPanel2.add(tFEndereco);
        jPanel3.add(btOk);

        janela.add(jPanel1, BorderLayout.WEST);
        janela.add(jPanel2, BorderLayout.CENTER);

        janela.add(jPanel3, BorderLayout.SOUTH);
        pack();
    }

    public static void main(String[] args) {
        TelaSwing exBorderLayout = new TelaSwing();
        exBorderLayout.setVisible(true);
    }
}