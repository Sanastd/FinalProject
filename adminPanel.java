package Store;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class adminPanel implements ActionListener {
    JFrame frame;
    JPanel panel;
    JButton view;
    JButton edit;
    JButton users;
    JButton carts;
    Font font = new Font("Avenir", 1,22);


    adminPanel(){
        frame = new JFrame("Store");
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(3);
        frame.setLayout(null);

        panel = new JPanel();
        panel.setLayout(new GridLayout(4,1,20,20));
        panel.setBounds(200,200,400,400);

        view = new JButton("View Products");
        view.setFont(font);
        view.setFocusable(false);
        view.addActionListener(this);

        edit = new JButton("Edit Products");
        edit.setFont(font);
        edit.setFocusable(false);
        edit.addActionListener(this);

        edit = new JButton("Edit Products");
        edit.setFont(font);
        edit.setFocusable(false);
        edit.addActionListener(this);

        frame.add(panel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
