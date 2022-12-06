package Quiz_App;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Rules extends JFrame implements ActionListener{

    String User, Passcode;
    JButton Back, Start, Close;
    Rules(String U_name, String Password) {
        this.User = U_name;
        getContentPane().setBackground(new Color(226, 206, 185));
        setLayout(null);
        setTitle("Rules To Play!");

        JLabel U_get = new JLabel("User : " + User);
        U_get.setBounds(10, 10, 360, 30);
        U_get.setFont(new Font("HelveticaNeue", Font.PLAIN, 20));
        add(U_get);

        JLabel Heading = new JLabel("Important Rules:");
        Heading.setBounds(10, 50, 360, 30);
        Heading.setFont(new Font("HelveticaNeue", Font.BOLD, 30));
        add(Heading);

        Back = new JButton("Back");
        Back.setFont(new Font("HelveticaNeue", Font.PLAIN, 15));
        Back.setBackground(new Color(100, 34, 205));
        Back.setForeground(Color.WHITE);
        Back.setBounds(590, 10, 100, 30);
        Back.addActionListener(this);
        add(Back);

        JLabel text_rule = new JLabel();
        text_rule.setBounds(30, 50, 550, 300);
        text_rule.setForeground(Color.BLACK);
        text_rule.setFont(new Font("Tahoma", Font.PLAIN, 17));
        text_rule.setText(
                "<html>"+
                        "Rule #1: Test comprehension and critical thinking, not just recall" + "<br>" +
                        "Rule #2: Use simple sentence structure and precise wording" + "<br>"+
                        "Rule #3: Place most of the words in the question stem" + "<br>"+
                        "Rule #4: Make all distractors plausible" + "<br>" +
                        "Rule #5: Keep all answer choices the same length" + "<br>" +
                        "Rule #6: Avoid double negatives" + "<br>" +
                        "Rule #7: Mix up the order of the correct answers" + "<br>" +
                        "Rule #8: Keep the number of options consistent" + "<br>" +
                        "Rule #9: Avoid tricking test-takers" + "<br>" +
                        "Rule #10: Use ‘All of the Above’ and ‘None of the Above’ with caution" + "<br>"+
                "</HTML>"
        );
        add(text_rule);

        Start = new JButton("Start");
        Start.setFont(new Font("HelveticaNeue", Font.PLAIN, 15));
        Start.setBackground(new Color(100, 34, 205));
        Start.setForeground(Color.WHITE);
        Start.setBounds(590, 380, 100, 30);
        Start.addActionListener(this);
        add(Start);

        Close = new JButton("Close");
        Close.setFont(new Font("HelveticaNeue", Font.PLAIN, 15));
        Close.setBackground(new Color(100, 34, 205));
        Close.setForeground(Color.WHITE);
        Close.setBounds(590, 420, 100, 30);
        Close.addActionListener(this);
        add(Close);

        setSize(720, 500);
        setLocation(400, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Back) {
            setVisible(false);
            new Login();
        } else if (e.getSource() == Close) {
            setVisible(false);
        } else if (e.getSource() == Start) {
            setVisible(false);
            new Start();
        }
    }

    public static void main(String[] args) {
        new Rules("User", "1234");
    }

}
