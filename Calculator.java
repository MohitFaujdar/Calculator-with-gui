import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
  private JTextField display;
  private JButton button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonPoint;
  private JButton buttonPlus, buttonMinus, buttonMultiply, buttonDivide, buttonEqual;
  private double firstNumber, secondNumber, result;
  private String operator;F

  public Calculator() {
    JFrame frame = new JFrame("Calculator");
    frame.setSize(200, 300);
    frame.setLayout(new FlowLayout());

    display = new JTextField(20);
    display.setEditable(false);

    button0 = new JButton("0");
    button1 = new JButton("1");
    button2 = new JButton("2");
    button3 = new JButton("3");
    button4 = new JButton("4");
    button5 = new JButton("5");
    button6 = new JButton("6");
    button7 = new JButton("7");
    button8 = new JButton("8");
    button9 = new JButton("9");
    buttonPoint = new JButton(".");
    buttonPlus = new JButton("+");
    buttonMinus = new JButton("-");
    buttonMultiply = new JButton("*");
    buttonDivide = new JButton("/");
    buttonEqual = new JButton("=");

    button0.addActionListener(this);
    button1.addActionListener(this);
    button2.addActionListener(this);
    button3.addActionListener(this);
    button4.addActionListener(this);
    button5.addActionListener(this);
    button6.addActionListener(this);
    button7.addActionListener(this);
    button8.addActionListener(this);
    button9.addActionListener(this);
    buttonPoint.addActionListener(this);
    buttonPlus.addActionListener(this);
    buttonMinus.addActionListener(this);
    buttonMultiply.addActionListener(this);
    buttonDivide.addActionListener(this);
    buttonEqual.addActionListener(this);

    frame.add(display);
    frame.add(button1);
    frame.add(button2);
    frame.add(button3);
    frame.add(button4);
    frame.add(button5);
    frame.add(button6);
    frame.add(button7);
    frame.add(button8);
    frame.add(button9);
    frame.add(button0);
    frame.add(buttonPoint);
    frame.add(buttonPlus);
    frame.add(buttonMinus);
    frame.add(buttonMultiply);
    frame.add(buttonDivide);
    frame.add(buttonEqual);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}

public void actionPerformed(ActionEvent e) {
    if (e.getSource() == button0) {
        display.setText(display.getText() + "0");
    } else if (e.getSource() == button1) {
        display.setText(display.getText() + "1");
    } else if (e.getSource() == button2) {
        display.setText(display.getText() + "2");
    } else if (e.getSource() == button3) {
        display.setText(display.getText() + "3");
    } else if (e.getSource() == button4) {
        display.setText(display.getText() + "4");
    } else if (e.getSource() == button5) {
        display.setText(display.getText() + "5");
    } else if (e.getSource() == button6) {
        display.setText(display.getText() + "6");
    } else if (e.getSource() == button7) {
        display.setText(display.getText() + "7");
    } else if (e.getSource() == button8) {
        display.setText(display.getText() + "8");
    } else if (e.getSource() == button9) {
        display.setText(display.getText() + "9");
    } else if (e.getSource() == buttonPoint) {
        display.setText(display.getText() + ".");
    } else if (e.getSource() == buttonPlus) {
        firstNumber = Double.parseDouble(display.getText());
        operator = "+";
        display.setText("");
    } else if (e.getSource() == buttonMinus) {
        firstNumber = Double.parseDouble(display.getText());
        operator = "-";
        display.setText("");
    } else if (e.getSource() == buttonMultiply) {
        firstNumber = Double.parseDouble(display.getText());
        operator = "";
        display.setText("");
    } else if (e.getSource() == buttonDivide) {
        firstNumber = Double.parseDouble(display.getText());
        operator = "/";
        display.setText("");
    } else if (e.getSource() == buttonEqual) {
        secondNumber = Double.parseDouble(display.getText());
    if (operator.equals("+")) {
        result = firstNumber + secondNumber;
    } else if (operator.equals("-")) {
        result = firstNumber - secondNumber;
    } else if (operator.equals("")) {
        result = firstNumber * secondNumber;
    } else if (operator.equals("/")) {
        result = firstNumber / secondNumber;
    }
    display.setText(String.valueOf(result));
    }
}

public static void main(String[] args) {
    new Calculator();
}
}

