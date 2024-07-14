import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class login extends JFrame {
    final String uname = "root";
    final String pass = "hii";
    login() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel l1 = new JLabel("Username:");
        panel.add(l1);
        JTextField t1 = new JTextField(10);
        panel.add(t1);

        JLabel l2 = new JLabel("Password:");
        panel.add(l2);
        JTextField t2 = new JTextField(10);
        panel.add(t2);

        JButton b = new JButton("LOGIN");
        panel.add(b);

        add(panel);
        setSize(200, 200);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String u = t1.getText().toString();
                String p = t2.getText().toString();

                if (u.equals(uname) && p.equals(pass)) {
                    new converter();
                    dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Please check your credentials.");
                }
            }
        });
    }
    public static void main(String[] args) {
        new login();
    }
}


