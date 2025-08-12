import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame implements ActionListener{

  private JTextField display;
  private JButton[] numberButtons;
  private JButton addButton, subButton, mulButton, divButton, equalsButton, clearButton;

  

  private double num1, num2, result;
  private char operator;

  public Calculator(){

    setTitle("Utkarsh's Simple Calculator");
    setSize(400,500);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new BorderLayout());

    display = new JTextField();
    display.setEditable(false);
    display.setFont(new Font("Arial", Font.PLAIN, 20));
    add(display, BorderLayout.NORTH);

    JPanel buttonPanel = new JPanel();
    buttonPanel.setLayout(new GridLayout(4, 4, 10, 10));

    numberButtons = new JButton[10];
    for(int i=0; i<10; i++){
      numberButtons[i] = new JButton(String.valueOf(i));
      numberButtons[i].addActionListener(this);
      buttonPanel.add(numberButtons[i]);
    }

    addButton = new JButton("+");
    subButton = new JButton("-");
    mulButton = new JButton("*");
    divButton = new JButton("/");
    equalsButton = new JButton("=");
    clearButton = new JButton("C");

    addButton.addActionListener(this);
    subButton.addActionListener(this);
    mulButton.addActionListener(this);
    divButton.addActionListener(this);
    equalsButton.addActionListener(this);
    clearButton.addActionListener(this);

    buttonPanel.add(addButton);
    buttonPanel.add(subButton);
    buttonPanel.add(mulButton);
    buttonPanel.add(divButton);
    buttonPanel.add(equalsButton);
    buttonPanel.add(clearButton);

    add(buttonPanel, BorderLayout.CENTER);

    setVisible(true);
  }

  @Override
  public void actionPerformed(ActionEvent e){
    for(int i=0;i<10;i++){
      if(e.getSource() == numberButtons[i]){
        display.setText(display.getText() + i);
      }
    }

    if(e.getSource() == addButton){
      num1 = Double.parseDouble(display.getText());
      operator = '+';
      display.setText("");
    }
    else if(e.getSource() == subButton){
      num1 = Double.parseDouble(display.getText());
      operator = '-';
      display.setText("");
    }
    else if(e.getSource() == mulButton){
      num1 = Double.parseDouble(display.getText());
      operator = '*';
      display.setText("");
    }
    else if(e.getSource() == divButton){
      num1 = Double.parseDouble(display.getText());
      operator = '/';
      display.setText("");
    }

    else if(e.getSource() == equalsButton){
      num2 = Double.parseDouble(display.getText());
      switch(operator){
        case '+' : result = num1 + num2; break;
        case '-' : result = num1 - num2; break;
        case '*' : result = num1 * num2; break;
        case '/' : 
          if(num2 != 0) result = num1 / num2;
          else display.setText("Error");
          break;
      }

      display.setText(String.valueOf(result));
    }

    else if(e.getSource() == clearButton){
      display.setText("");
    }
  }

  public static void main(String[] args){

    new Calculator();
  }
}
