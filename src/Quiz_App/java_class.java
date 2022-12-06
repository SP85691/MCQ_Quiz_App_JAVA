package Quiz_App;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class java_class extends JFrame implements ActionListener{

    JTextField inp_n1, inp_n2, inp_n3;
    String str[] = {"Add", "Subtract", "Divide", "Multiply"};

    Integer x, val;
    JComboBox cbx;

    JButton btn;

    java_class() {
        getContentPane().setBackground(new Color(82, 110, 232));
        setLayout(null);
        setTitle("Calculator📱️");

        JLabel Heading = new JLabel("CALCULATOR");
        Heading.setBounds(60, 20, 200, 30);
        Heading.setForeground(new Color(255, 167, 1));
        Heading.setFont(new Font("Consolas", Font.BOLD, 30));
        add(Heading);


        JLabel n1 = new JLabel("Num1");
        n1.setBounds(30, 70, 100, 20);
        n1.setForeground(Color.WHITE);
        n1.setFont(new Font("Tahoma", Font.BOLD, 18));
        add(n1);

        inp_n1 = new JTextField();
        inp_n1.setBounds(100, 70, 150, 25);
        inp_n1.setFont(new Font("Tahoma", Font.PLAIN, 18));
        inp_n1.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        add(inp_n1);

        JLabel n2 = new JLabel("Num2");
        n2.setBounds(30, 110, 100, 20);
        n2.setForeground(Color.WHITE);
        n2.setFont(new Font("Tahoma", Font.BOLD, 18));
        add(n2);

        inp_n2 = new JTextField();
        inp_n2.setBounds(100, 110, 150, 25);
        inp_n2.setFont(new Font("Tahoma", Font.PLAIN, 18));
        inp_n2.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        add(inp_n2);

        JLabel opt = new JLabel("Select Operator");
        opt.setBounds(60, 155, 200, 20);
        opt.setForeground(new Color(255, 255, 255));
        opt.setFont(new Font("Consolas", Font.BOLD, 20));
        add(opt);

        JComboBox cbx = new JComboBox<>(str);
        cbx.setBounds(30, 190, 220, 30);
        cbx.setForeground(Color.BLACK);
        cbx.setBackground(new Color(255, 255, 255));
        cbx.setFont(new Font("Consolas", Font.PLAIN, 18));
        x = cbx.getSelectedIndex();
        cbx.addActionListener(this);
        add(cbx);

        JLabel n3 = new JLabel("Ans: ");
        n3.setBounds(30, 230, 100, 20);
        n3.setForeground(Color.WHITE);
        n3.setFont(new Font("Tahoma", Font.BOLD, 18));
        add(n3);

        inp_n3 = new JTextField();
        inp_n3.setBounds(100, 230, 150, 25);
        inp_n3.setFont(new Font("Tahoma", Font.PLAIN, 18));
        inp_n3.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        inp_n3.setEnabled(false);
        add(inp_n3);

        btn = new JButton("Submit");
        btn.setBounds(30, 270, 110, 30);
        btn.setFont(new Font("Consolas", Font.BOLD, 20));
        btn.setBackground(new Color(100, 34, 205));
        btn.setForeground(Color.WHITE);
        btn.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        btn.addActionListener(this);
        add(btn);

        setSize(300, 400);
        setLocation(250, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        Integer num1 = Integer.parseInt(inp_n1.getText());
        Integer num2 = Integer.parseInt(inp_n2.getText());

        if(e.getSource() == btn) {
            if(e.getSource() == cbx){
                System.out.println(num1+num2);
            }
        }

    }

//    java_class(){
//        getContentPane().setBackground(Color.WHITE);
////        setLayout(new FlowLayout());
//        setLayout(null);
//
//        JLabel n1 = new JLabel("Num1");
//        n1.setBounds(10, 10, 100, 30);
//        n1.setFont(new Font("Tahoma", Font.PLAIN, 18));
//        add(n1);
//
//        inp_n1 = new JTextField();
//        inp_n1.setBounds(70, 10,150, 30);
//        inp_n1.setFont(new Font("Tahoma", Font.PLAIN, 18));
//        add(inp_n1);
//
//        JLabel n2 = new JLabel("Num2");
//        n2.setBounds(10, 60, 100, 30);
//        n2.setFont(new Font("Tahoma", Font.PLAIN, 18));
//        add(n2);
//
//        inp_n2 = new JTextField();
//        inp_n2.setBounds(70, 60,150, 30);
//        inp_n2.setFont(new Font("Tahoma", Font.PLAIN, 18));
//        add(inp_n2);
//
//        JLabel cbx_l = new JLabel("Operator");
//        cbx_l.setBounds(10, 95, 100, 30);
//        cbx_l.setFont(new Font("Tahoma", Font.PLAIN, 18));
//        add(cbx_l);
//
//        cbx = new JComboBox<>(str);
//        cbx.setBounds(90, 100,150, 30);
//        cbx.setFont(new Font("Tahoma", Font.PLAIN, 18));
//        x = cbx.getSelectedIndex();
//        add(cbx);
//
//        inp_n3 = new JTextField();
//        inp_n3.setBounds(10, 150,210, 30);
//        inp_n3.setFont(new Font("Tahoma", Font.PLAIN, 18));
//        inp_n3.setEnabled(false);
//        add(inp_n2);
//
//
//        btn = new JButton("Login");
//        btn.setFont(new Font("HelveticaNeue", Font.PLAIN, 15));
//        btn.setBackground(new Color(100, 34, 205));
//        btn.setForeground(Color.WHITE);
//        btn.setBounds(50, 200, 100, 30);
//        btn.addActionListener(this);
//        add(btn);
//
//        setSize(400, 300);
//        //setLocation(400, 200);
//        setVisible(true);
//
//    }


//    }

    public static void main(String[] args) {
        new java_class();
    }
}
