import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LogIn extends JFrame implements ActionListener {

    private JButton login, signup;
    private JTextField username, password;

    LogIn() {
        setTitle("E-Vote");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1440, 1440);
        setLayout(null);
        setResizable(false);

        //Add text field
        username = new JTextField();
        username.setBounds(540, 550, 350, 40);
        add(username);

        password = new JTextField();
        password.setBounds(540, 600, 350, 40);
        add(password);

        signup = new JButton("Sign up");
        signup.setBounds(540, 650, 170, 40);
        add(signup);
        signup.setFont(new Font("Roboto", Font.BOLD, 16));

        login = new JButton("Login");
        login.setBounds(720, 650, 170, 40);
        add(login);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
