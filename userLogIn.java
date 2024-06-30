package Store;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class userLogIn implements ActionListener {
    JFrame frame;
    JPanel panel;
    JLabel label1;
    JTextField user;
    JLabel label;
    JTextField pass;
    JButton enter;
    Font font = new Font("Avenir", 1,30);

    userLogIn(){
        frame = new JFrame("Store");
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(3);
        frame.setLayout(null);

        panel = new JPanel();
        panel.setLayout(new GridLayout(5,1,20,20));
        panel.setBounds(200,200,400,400);

        label1 = new JLabel("Enter your username");
        label1.setFont(font);

        user = new JTextField();
        user.setFont(font);

        label = new JLabel("Enter your password");
        label.setFont(font);

        pass = new JTextField();
        pass.setFont(font);

        enter = new JButton("Log in");
        enter.setFont(font);
        enter.setFocusable(false);
        enter.addActionListener(this);

        panel.add(label1);
        panel.add(user);
        panel.add(label);
        panel.add(pass);
        panel.add(enter);
        frame.add(panel);
        frame.setVisible(true);
    }

    Main main = new Main();
    Store store = main.store;

    public boolean CheckPassword(String username, String password) {
        for (User user : store.getUsers())
            if (username.equals(user.getUsername()) && password.equals(store.getPasswords().get(user)))
                return true;

        return false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == enter){
            if(CheckPassword(user.getText(), pass.getText())){
                frame.dispose();
                new UserPanel();
            }
            else{
                label.setText("Try Again");
                pass.setText("");
            }
        }
    }
}
