import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Frame2 extends JFrame {
    public Frame2(String from, String to) {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel l1 = new JLabel(from);
        panel.add(l1);

        JTextField t1 = new JTextField(10);
        panel.add(t1);

        JLabel l2 = new JLabel(to);
        panel.add(l2);

        JTextField t2 = new JTextField(10);
        t2.setEditable(false);
        panel.add(t2);

        JButton b = new JButton("Convert");
        panel.add(b);

        add(panel);
        setSize(200, 200);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String from2 = from;
                String to2 = to;

                try {
                    String c1 = t1.getText();
                    Double value1 = Double.valueOf(c1);
                    final DecimalFormat df = new DecimalFormat("0.00");

                    if (from2.equals("Celsius") && to2.equals("Fahrenheit")) {
                        Double result = value1 * (9.0 / 5.0) + 32;
                        t2.setText(df.format(result).toString());
                    } else if (from2.equals("Fahrenheit") && to2.equals("Celsius")) {
                        Double result = (value1 - 32) * (5.0 / 9.0);
                        t2.setText(df.format(result).toString());
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid numeric value.");
                }
            }
        });
    }

    public static void main(String[] args) {
        new Frame2("Celsius", "Fahrenheit");
    }
}
