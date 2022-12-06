package Quiz_App;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Start  extends JFrame implements ActionListener{
    JButton back, close, next, submit;

    public static int timer = 15;
    public static int ans_quiz = 0;
    public static int count = 0;
    public static int score = 0;

    String questions[][] = new String[10][5];
    String answers[][] = new String[10][2];
    String usr_ans[][] = new String[10][1];

    JLabel q_no, que, User, Score;

    JRadioButton op1, op2, op3, op4;

    ButtonGroup groupopt;

    Start() {
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);

        setTitle("Start Quiz!");

        back = new JButton("Back");
        back.setBounds(10, 10, 100, 30);
        back.setFont(new Font("Consolas", Font.BOLD, 18));
        back.setBackground(new Color(255, 167, 1));
        back.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        back.setForeground(Color.BLACK);
        back.addActionListener(this);
        add(back);

        close = new JButton("Close");
        close.setBounds(720, 10, 100, 30);
        close.setFont(new Font("Consolas", Font.BOLD, 18));
        close.setBackground(new Color(255, 167, 1));
        close.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        close.setForeground(Color.BLACK);
        close.addActionListener(this);
        add(close);

        submit = new JButton("Submit");
        submit.setBounds(720, 380, 100, 30);
        submit.setFont(new Font("Consolas", Font.BOLD, 18));
        submit.setBackground(new Color(255, 167, 1));
        submit.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        submit.setForeground(Color.BLACK);
        submit.setEnabled(false);
        submit.addActionListener(this);
        add(submit);

        next = new JButton("Next");
        next.setBounds(720, 420, 100, 30);
        next.setFont(new Font("Consolas", Font.BOLD, 18));
        next.setBackground(new Color(255, 167, 1));
        next.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));
        next.setForeground(Color.BLACK);
        next.addActionListener(this);
        add(next);

        JLabel Heading = new JLabel("MCQ QUIZ!");
        Heading.setBounds(350, 15, 200, 30);
        Heading.setFont(new Font("Consolas", Font.BOLD, 28));
        Heading.setForeground(Color.WHITE);
        add(Heading);

        Score = new JLabel();
        Score.setBounds(720, 50, 150, 30);
        Score.setFont(new Font("Consolas", Font.BOLD, 20));
        Score.setForeground(Color.WHITE);
        add(Score);

        User = new JLabel("User : Surya");
        User.setBounds(10, 50, 150, 30);
        User.setFont(new Font("Consolas", Font.BOLD, 20));
        User.setForeground(Color.WHITE);
        add(User);

        q_no = new JLabel();
        q_no.setBounds(40, 130, 100, 50);
        q_no.setForeground(Color.WHITE);
        q_no.setFont(new Font("Consolas", Font.BOLD, 24));
        add(q_no);

        que = new JLabel();
        que.setBounds(80, 130, 800, 50);
        que.setForeground(Color.WHITE);
        que.setFont(new Font("Consolas", Font.BOLD, 18));
        add(que);

        questions[0][0] = "Which is used to find and fix bugs in the Java programs.?";
        questions[0][1] = "JVM";
        questions[0][2] = "JDB";
        questions[0][3] = "JDK";
        questions[0][4] = "JRE";

        questions[1][0] = "What is the return type of the hashCode() method in the Object class?";
        questions[1][1] = "int";
        questions[1][2] = "Object";
        questions[1][3] = "long";
        questions[1][4] = "void";

        questions[2][0] = "Which package contains the Random class?";
        questions[2][1] = "java.util package";
        questions[2][2] = "java.lang package";
        questions[2][3] = "java.awt package";
        questions[2][4] = "java.io package";

        questions[3][0] = "An interface with no fields or methods is known as?";
        questions[3][1] = "Runnable Interface";
        questions[3][2] = "Abstract Interface";
        questions[3][3] = "Marker Interface";
        questions[3][4] = "CharSequence Interface";

        questions[4][0] = "In which memory a String is stored, when we create a string using new operator?";
        questions[4][1] = "Stack";
        questions[4][2] = "String memory";
        questions[4][3] = "Random storage space";
        questions[4][4] = "Heap memory";

        questions[5][0] = "Which of the following is a marker interface?";
        questions[5][1] = "Runnable interface";
        questions[5][2] = "Remote interface";
        questions[5][3] = "Readable interface";
        questions[5][4] = "Result interface";

        questions[6][0] = "Which keyword is used for accessing the features of a package?";
        questions[6][1] = "import";
        questions[6][2] = "package";
        questions[6][3] = "extends";
        questions[6][4] = "export";

        questions[7][0] = "In java, jar stands for?";
        questions[7][1] = "Java Archive Runner";
        questions[7][2] = "Java Archive";
        questions[7][3] = "Java Application Resource";
        questions[7][4] = "Java Application Runner";

        questions[8][0] = "Which of the following is a mutable class in java?";
        questions[8][1] = "java.lang.StringBuilder";
        questions[8][2] = "java.lang.Short";
        questions[8][3] = "java.lang.Byte";
        questions[8][4] = "java.lang.String";

        questions[9][0] = "Which of the following option leads to the portability and security of Java?";
        questions[9][1] = "Bytecode is executed by JVM";
        questions[9][2] = "The applet makes the Java code secure and portable";
        questions[9][3] = "Use of exception handling";
        questions[9][4] = "Dynamic binding between objects";

        answers[0][1] = "JDB";
        answers[1][1] = "int";
        answers[2][1] = "java.util package";
        answers[3][1] = "Marker Interface";
        answers[4][1] = "Heap memory";
        answers[5][1] = "Remote interface";
        answers[6][1] = "import";
        answers[7][1] = "Java Archive";
        answers[8][1] = "java.lang.StringBuilder";
        answers[9][1] = "Bytecode is executed by JVM";

        op1 = new JRadioButton();
        op1.setBounds(80, 180, 400, 30);
        op1.setFont(new Font("Consolas", Font.BOLD, 20));
        op1.setForeground(Color.WHITE);
        op1.setBackground(Color.BLACK);
        add(op1);

        op2 = new JRadioButton();
        op2.setBounds(80, 210, 400, 30);
        op2.setFont(new Font("Consolas", Font.BOLD, 20));
        op2.setForeground(Color.WHITE);
        op2.setBackground(Color.BLACK);
        add(op2);

        op3 = new JRadioButton();
        op3.setBounds(80, 240, 400, 30);
        op3.setFont(new Font("Consolas", Font.BOLD, 20));
        op3.setForeground(Color.WHITE);
        op3.setBackground(Color.BLACK);
        add(op3);

        op4 = new JRadioButton();
        op4.setBounds(80, 270, 400, 30);
        op4.setFont(new Font("Consolas", Font.BOLD, 20));
        op4.setForeground(Color.WHITE);
        op4.setBackground(Color.BLACK);
        add(op4);

        groupopt = new ButtonGroup();
        groupopt.add(op1);
        groupopt.add(op2);
        groupopt.add(op3);
        groupopt.add(op4);

        run(count);

        setSize(860, 500);
        setLocation(350, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        if(ae.getSource() == back) {
            setVisible(false);
            new Login();
        } else if (ae.getSource() == close) {
            setVisible(false);
        }

        if (ae.getSource() == next) {
            repaint();
            op1.setEnabled(true);
            op2.setEnabled(true);
            op3.setEnabled(true);
            op4.setEnabled(true);

            ans_quiz = 1;
            if (groupopt.getSelection() == null) {
                usr_ans[count][0] = "";
            } else {
                usr_ans[count][0] = groupopt.getSelection().getActionCommand();
            }

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }

            count++;
            run(count);
        } else if (ae.getSource() == submit) {
            ans_quiz = 1;
            if (groupopt.getSelection() == null) {
                usr_ans[count][0] = "";
            } else {
                usr_ans[count][0] = groupopt.getSelection().getActionCommand();
            }

            for (int i = 0; i < usr_ans.length; i++) {
                if (usr_ans[i][0].equals(answers[i][1])) {
                    score += 10;
                    Score.setText("Score : " + score);

                } else {
                    score += 0;
                    Score.setText("Score : " + score);
                }
            }
            setVisible(false);
            new Score(User.getText(), score);
        }
    }

    public void paint(Graphics g){
        super.paint(g);

        String time = "Time left - " + timer + " sec"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Consolas", Font.BOLD, 20));

        if (timer > 0) {
            g.drawString(time, 620, 100);
        } else {
            g.drawString("Times up!!", 620, 100);
        }

        timer--; // 14

        try {
            Thread.sleep(1000);
            repaint();
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (ans_quiz == 1) {
            ans_quiz = 0;
            timer = 15;
        } else if (timer < 0) {
            timer = 15;
            op1.setEnabled(true);
            op2.setEnabled(true);
            op3.setEnabled(true);
            op4.setEnabled(true);

            if (count == 8) {
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if (count == 9) { // submit button
                if (groupopt.getSelection() == null) {
                    usr_ans[count][0] = "";
                } else {
                    usr_ans[count][0] = groupopt.getSelection().getActionCommand();
                }

                for (int i = 0; i < usr_ans.length; i++) {
                    if (usr_ans[i][0].equals(answers[i][1])) {
                        score += 10;
                        Score.setText("Score : " + score);
                    } else {
                        score += 0;
                        Score.setText("Score : " + score);
                    }
                }
                setVisible(false);
                new Score(User.getText(), score);
            } else { // next button
                if (groupopt.getSelection() == null) {
                    usr_ans[count][0] = "";
                } else {
                    usr_ans[count][0] = groupopt.getSelection().getActionCommand();
                }
                count++; // 0 // 1
                run(count);
            }
        }

    }
    public void run(int count){
        q_no.setText("" + (count + 1) + ". ");
        que.setText(questions[count][0]);
        op1.setText(questions[count][1]);
        op1.setActionCommand(questions[count][1]);

        op2.setText(questions[count][2]);
        op2.setActionCommand(questions[count][2]);

        op3.setText(questions[count][3]);
        op3.setActionCommand(questions[count][3]);

        op4.setText(questions[count][4]);
        op4.setActionCommand(questions[count][4]);

        groupopt.clearSelection();
    }


    public static void main(String[] args) {
        new Start();
    }
}
