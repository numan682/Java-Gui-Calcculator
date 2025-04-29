import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calc extends JFrame implements ActionListener {
    private JTextField boxScreen;
    private String num1 = "", num2 = "", mathSign = "";
    private boolean isNextNum = false;

    public calc() {
        setTitle("GUI Calculator By Numan");
        setSize(300, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        boxScreen = new JTextField();
        boxScreen.setEditable(false);
        boxScreen.setFont(new Font("Arial", Font.BOLD, 22));
        add(boxScreen, BorderLayout.NORTH);

        JPanel btnArea = new JPanel();
        btnArea.setLayout(new GridLayout(4, 4));

        String[] buttons = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "C", "0", "=", "/"
        };

        for (String txt : buttons) {
            JButton btn = new JButton(txt);
            btn.setFont(new Font("Arial", Font.PLAIN, 18));
            btn.addActionListener(this);
            btnArea.add(btn);
        }

        add(btnArea, BorderLayout.CENTER);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if (cmd.matches("[0-9]")) {
            if (isNextNum) {
                num2 += cmd;
                boxScreen.setText(num2);
            } else {
                num1 += cmd;
                boxScreen.setText(num1);
            }
        } else if (cmd.matches("[+\\-*/]")) {
            mathSign = cmd;
            isNextNum = true;
        } else if (cmd.equals("=")) {
            try {
                double n1 = Double.parseDouble(num1);
                double n2 = Double.parseDouble(num2);
                double result = 0;

                switch (mathSign) {
                    case "+": result = n1 + n2; break;
                    case "-": result = n1 - n2; break;
                    case "*": result = n1 * n2; break;
                    case "/": result = n2 != 0 ? n1 / n2 : 0; break;
                }

                boxScreen.setText(String.valueOf(result));
                num1 = String.valueOf(result);
                num2 = "";
                isNextNum = false;
            } catch (Exception ex) {
                boxScreen.setText("Error");
            }
        } else if (cmd.equals("C")) {
            num1 = "";
            num2 = "";
            mathSign = "";
            isNextNum = false;
            boxScreen.setText("");
        }
    }

    public static void main(String[] args) {
        new calc();
    }
}
