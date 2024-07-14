import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame3 extends JFrame {
    public Frame3(String from, String to) {
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
        setSize(250, 150);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String from2 = t1.getText();
                try {
                    if (from.equals("12 Hour Format") && to.equals("24 Hour Format")) {
                        int result = Integer.parseInt(from2) + 1200;
                        t2.setText(Integer.toString(result));
                    } else if (from.equals("24 Hour Format") && to.equals("12 Hour Format")) {
                        int result = Integer.parseInt(from2) - 1200;
                        t2.setText(Integer.toString(result));
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid numeric value.");
                }
            }
        });
    }

    public static void main(String[] args) {
        new Frame3("12 Hour Format", "24 Hour Format");
    }
}
