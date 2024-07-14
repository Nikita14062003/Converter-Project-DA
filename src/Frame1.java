import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

public class Frame1 extends JFrame {
    Frame1(String from, String to) {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel l4 = new JLabel(from);
        panel.add(l4);

        JTextField t1 = new JTextField(10);
        panel.add(t1);

        JLabel l5 = new JLabel(to);
        panel.add(l5);

        JTextField t2 = new JTextField(10);
        t2.setEditable(false);
        panel.add(t2);

        JButton b2 = new JButton("Convert");
        panel.add(b2);

        add(panel);
        setSize(200, 200);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String from2 = l4.getText();
                String to2 = l5.getText();

                try {
                    String c1 = t1.getText();
                    Double value1 = Double.valueOf(c1);
                    final DecimalFormat df = new DecimalFormat("0.00");

                    if (from2.equals("Rupees") && to2.equals("Dollar")) {
                        Double result = value1 / 83.11;
                        t2.setText(df.format(result).toString());
                    } else if (from2.equals("Rupees") && to2.equals("Euro")) {
                        Double result = value1 / 90.38;
                        t2.setText(df.format(result).toString());
                    } else if (from2.equals("Dollar") && to2.equals("Euro")) {
                        Double result = value1 / 1.09;
                        t2.setText(df.format(result).toString());
                    } else if (from2.equals("Dollar") && to2.equals("Rupees")) {
                        Double result = value1 * 83.11;
                        t2.setText(df.format(result).toString());
                    } else if (from2.equals("Euro") && to2.equals("Rupees")) {
                        Double result = value1 * 90.38;
                        t2.setText(df.format(result).toString());
                    } else if (from2.equals("Euro") && to2.equals("Dollar")) {
                        Double result = value1 * 1.09;
                        t2.setText(df.format(result).toString());
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid numeric value.");
                }
        }
    });
    }

    public static void main(String[] args) {

        new Frame1("Rupees","Dollar");
    }
}

