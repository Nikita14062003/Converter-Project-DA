import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main2 extends JFrame {
    Main2(){
        JLabel l1, l2;
        JButton b1;

        l1 = new JLabel("From:");
        l1.setBounds(20, 40, 100, 30);
        add(l1);
        String[] options = {"Celsius","Fahrenheit"};
        JComboBox<String> comboBox = new JComboBox<>(options);
        add(comboBox);

        l2 = new JLabel("To:");
        l2.setBounds(170, 40, 100, 30);
        add(l2);
        String[] options2 = {"Celsius","Fahrenheit"};
        JComboBox<String> comboBox2 = new JComboBox<>(options2);
        add(comboBox2);

        b1 = new JButton("Submit");
        b1.setBounds(80, 80, 100, 15);
        add(b1);

        setSize(150, 200);
        setResizable(false);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String from = (String) comboBox.getSelectedItem();
                String to = (String) comboBox2.getSelectedItem();
                if (!from.equals(to)) {
                    new Frame2(from, to);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Please select different temperatures.");
                }
            }
        });}
        public static void main(String[] args) {
            new Main2();
        }
    }

