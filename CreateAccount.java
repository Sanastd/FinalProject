package Store;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateAccount implements ActionListener {
    JFrame frame;
    JPanel panel1;
    JPanel panel2;
    JLabel label;
    JButton enter;
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JLabel l5;
    JLabel l6;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JTextField t4;
    JTextField t5;
    JTextField t6;
    Font font = new Font("Avenir", 1,24);

    CreateAccount(){
        frame = new JFrame("Store");
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(3);
        frame.setLayout(null);

        panel1 = new JPanel();
        panel1.setLayout(new GridLayout(6,1,20,20));
        panel1.setBounds(100,150,200,500);

        panel2 = new JPanel();
        panel2.setLayout(new GridLayout(6,1,20,20));
        panel2.setBounds(300,150,400,500);

        label = new JLabel("Enter your information:");
        label.setFont(font);
        label.setBounds(250,50,300,70);

        enter = new JButton("Next");
        enter.setFont(font);
        enter.setFocusable(false);
        enter.addActionListener(this);
        enter.setBounds(350,700,100,60);

        l1 = new JLabel("username:");
        l1.setFont(font);
        l2 = new JLabel("password:");
        l2.setFont(font);
        l3 = new JLabel("name:");
        l3.setFont(font);
        l4 = new JLabel("phoneNumber:");
        l4.setFont(font);
        l5 = new JLabel("address:");
        l5.setFont(font);
        l6 = new JLabel("balance:");
        l6.setFont(font);

        t1 = new JTextField();
        t1.setFont(font);
        t2 = new JTextField();
        t2.setFont(font);
        t3 = new JTextField();
        t3.setFont(font);
        t4 = new JTextField();
        t4.setFont(font);
        t5 = new JTextField();
        t5.setFont(font);
        t6 = new JTextField();
        t6.setFont(font);

        frame.add(label);
        frame.add(enter);
        panel1.add(l1);
        panel1.add(l2);
        panel1.add(l3);
        panel1.add(l4);
        panel1.add(l5);
        panel1.add(l6);
        panel2.add(t1);
        panel2.add(t2);
        panel2.add(t3);
        panel2.add(t4);
        panel2.add(t5);
        panel2.add(t6);
        frame.add(panel1);
        frame.add(panel2);
        frame.setVisible(true);
    }

    Main main = new Main();
    Store store = main.store;
    public void addUser(User user){
        store.getUsers().add(user);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == enter){
            User user = new User(t1.getText(), t2.getText(), t3.getText(), t4.getText(), t5.getText(), Double.parseDouble(t6.getText()));
            addUser(user);
            frame.dispose();
            new UserPanel();
        }
    }
}
