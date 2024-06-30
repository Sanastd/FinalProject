package Store;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPanel implements ActionListener {
    JFrame frame;
    JPanel panel;
    JButton userLogIn;
    JButton admin;
    JButton createAccount;
    Font font = new Font("Avenir", 1,22);

    MainPanel(){

        Main main = new Main();
        Store store = main.store;


        frame = new JFrame("Store");
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(3);
        frame.setLayout(null);

        panel = new JPanel();
        panel.setLayout(new GridLayout(3,1,20,20));
        panel.setBounds(200,200,400,400);

        userLogIn = new JButton("Log in (Customer)");
        userLogIn.setFont(font);
        userLogIn.setFocusable(false);
        userLogIn.addActionListener(this);

        admin = new JButton("Log in (Admin)");
        admin.setFont(font);
        admin.setFocusable(false);
        admin.addActionListener(this);

        createAccount = new JButton("Create Account");
        createAccount.setFont(font);
        createAccount.setFocusable(false);
        createAccount.addActionListener(this);

        panel.add(admin);
        panel.add(userLogIn);
        panel.add(createAccount);
        frame.add(panel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == admin){
            frame.dispose();
            new adminLogIn();
        }
        if (e.getSource() == userLogIn){
            frame.dispose();
            new userLogIn();
        }
        if (e.getSource() == createAccount){
            frame.dispose();
            new CreateAccount();
        }
    }
}

