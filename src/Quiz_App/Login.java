package Quiz_App;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
//import Rules;

public class Login extends JFrame implements ActionListener{
    JButton Log_Button, Close_Button;
    JTextField User_Field, Pass_Field;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon icon_1 = new ImageIcon(ClassLoader.getSystemResource("Images/Log_Img.jpg"));
        JLabel Img_1 = new JLabel(icon_1);
        Img_1.setSize(360, 500);
        Img_1.setBounds(0, 0, 360, 500);
        add(Img_1);

        JLabel Heading = new JLabel("Welcome to MCQ Quiz App!");
        Heading.setBounds(370, 50, 360, 50);
        Heading.setFont(new Font("HelveticaNeue", Font.BOLD, 25));
        add(Heading);

        JLabel User = new JLabel("Enter UserName!");
        User.setBounds(370, 100, 360, 50);
        User.setFont(new Font("HelveticaNeue", Font.BOLD, 18));
        add(User);

        User_Field = new JTextField();
        User_Field.setBounds(370, 150, 300, 25);
        User_Field.setFont(new Font("HelveticaNeue", Font.PLAIN, 15));
        add(User_Field);

        JLabel Password = new JLabel("Enter Password!");
        Password.setBounds(370, 170, 360, 50);
        Password.setFont(new Font("HelveticaNeue", Font.BOLD, 18));
        add(Password);

        Pass_Field = new JTextField();
        Pass_Field.setBounds(370, 220, 300, 25);
        Pass_Field.setFont(new Font("HelveticaNeue", Font.PLAIN, 15));
        add(Pass_Field);

        Log_Button = new JButton("Login");
        Log_Button.setFont(new Font("HelveticaNeue", Font.PLAIN, 15));
        Log_Button.setBackground(new Color(100, 34, 205));
        Log_Button.setForeground(Color.WHITE);
        Log_Button.setBounds(370, 270, 100, 30);
        Log_Button.addActionListener(this);
        add(Log_Button);

        Close_Button = new JButton("Close");
        Close_Button.setFont(new Font("HelveticaNeue", Font.PLAIN, 15));
        Close_Button.setBackground(Color.RED);
        Close_Button.setForeground(Color.WHITE);
        Close_Button.setBounds(570, 270, 100, 30);
        Close_Button.addActionListener(this);
        add(Close_Button);


        setSize(720, 500);
        setLocation(400, 200);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Log_Button) {
            String U_name = User_Field.getText();
            String Password = Pass_Field.getText();
            setVisible(false);
            new Rules(U_name, Password);

        } else if (e.getSource() == Close_Button) {
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}