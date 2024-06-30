package Store;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class adminLogIn implements ActionListener {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JTextField pass;
    JButton enter;

    Font font = new Font("Avenir", 1,30);


    adminLogIn(){
        frame = new JFrame("Store");
        frame.setSize(800,800);
        frame.setDefaultCloseOperation(3);
        frame.setLayout(null);

        panel = new JPanel();
        panel.setLayout(new GridLayout(3,1,20,20));
        panel.setBounds(200,200,400,400);

        label = new JLabel("Enter your password");
        label.setFont(font);

        pass = new JTextField();
        pass.setFont(font);

        enter = new JButton("Enter");
        enter.setFont(font);
        enter.setFocusable(false);
        enter.addActionListener(this);

        panel.add(label);
        panel.add(pass);
        panel.add(enter);
        frame.add(panel);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == enter){
            String password = pass.getText();
            if (password.equals("12345")){
                frame.dispose();
                new adminPanel();
            }
            else {
                label.setText("Try Again");
                pass.setText("");
            }
        }
    }
}
