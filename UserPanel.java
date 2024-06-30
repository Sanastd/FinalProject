package Store;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserPanel implements ActionListener {
    JFrame frame;
    JPanel panel;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;

    Font font = new Font("Avenir", 1,22);

    UserPanel(){
        frame = new JFrame("Store");
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(3);
        frame.setLayout(null);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4,1,20,20));
        panel.setBounds(200,200,400,400);

        b1 = new JButton("Profile");
        b1.setFont(font);
        b1.setFocusable(false);
        b1.addActionListener(this);

        b2 = new JButton("Cart");
        b2.setFont(font);
        b2.setFocusable(false);
        b2.addActionListener(this);

        b3 = new JButton("Products");
        b3.setFont(font);
        b3.setFocusable(false);
        b3.addActionListener(this);

        b4 = new JButton("Log out");
        b4.setFont(font);
        b4.setFocusable(false);
        b4.addActionListener(this);

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        panel.add(b4);
        frame.add(panel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b4) {
            frame.dispose();
            new MainPanel();
        }
    }
}
