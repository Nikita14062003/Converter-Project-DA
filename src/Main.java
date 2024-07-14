import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame {
    Main() {
        JLabel l1, l2;
        JButton b1;

        l1 = new JLabel("Currency from:");
        l1.setBounds(20, 40, 100, 30);
        add(l1);
        String[] options = {"Rupees", "Dollar", "Euro"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        add(comboBox);

        l2 = new JLabel("Currency to:");
        l2.setBounds(170, 40, 100, 30);
        add(l2);
        String[] options2 = {"Rupees", "Dollar", "Euro"};
        JComboBox<String> comboBox2 = new JComboBox<>(options2);
        add(comboBox2);

        b1 = new JButton("Submit");
        b1.setBounds(80, 80, 100, 15);
        add(b1);

        setSize(225, 200);
        setResizable(false);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String from = (String) comboBox.getSelectedItem();
                String to = (String) comboBox2.getSelectedItem();
                if (!from.equals(to)) {
                    new Frame1(from, to);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Please select different currencies..");
                }
            }
        });
    }

    public static void main(String[] args) {
        new Main();
    }
}
