import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class converter extends JFrame {
    converter(){
    JPanel panel= new JPanel();
    panel.setLayout(new FlowLayout());

    JLabel l1=new JLabel("Choose one:");
    panel.add(l1);
    JButton b1=new JButton("Currency converter");
    panel.add(b1);
    JButton b2=new JButton("Temperature converter");
    panel.add(b2);
    JButton b3=new JButton("Time converter");
    panel.add(b3);

    add(panel);
    setSize(200, 200);
    setResizable(false);
    setVisible(true);
    setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


    b1.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e) {
            new Main();
            dispose();
    }
    });
    b2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            new Main2();
            dispose();
        }
    });
    b3.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            new Main3();
            dispose();
        }
    });
    }
    public static void main(String[] args) {
        new converter();
    }
}

