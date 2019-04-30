package calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class firstCalculator {
    private JPanel panelMain;
    private JButton plusMinusButton;
    private JButton oneButton;
    private JButton fourButton;
    private JButton sevenButton;
    private JButton onButton;
    private JButton zeroButton;
    private JButton twoButton;
    private JButton fiveButton;
    private JButton eightButton;
    private JButton eraseButton;
    private JButton dotButton;
    private JButton threeButton;
    private JButton sixButton;
    private JButton nineButton;
    private JButton deleteButton;
    private JButton equalsButton;
    private JButton plusButton;
    private JButton minusButton;
    private JButton timesButton;
    private JButton devidedButton;
    private JTextField resultTemp;
    private JTextField resultMain;
    char operation = '+';
    double number, result;
    boolean newEntry = true;


    public firstCalculator() {
        resultTemp.setEditable(false);
        resultMain.setEditable(false);
        oneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (newEntry)
                    resultMain.setText("");
                if(zeroCheck(resultMain.getText())){

                    resultMain.setText("1");
                }

                else
                    resultMain.setText(resultMain.getText()+"1");
                newEntry = false;
            }
        });
        twoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (newEntry)
                    resultMain.setText("");
                if(zeroCheck(resultMain.getText()))
                    resultMain.setText("2");
                else
                    resultMain.setText(resultMain.getText()+"2");
                newEntry = false;
            }
        });
        threeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (newEntry)
                    resultMain.setText("");
                if(zeroCheck(resultMain.getText()))
                    resultMain.setText("3");
                else
                    resultMain.setText(resultMain.getText()+"3");
                newEntry = false;
            }
        });
        fourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (newEntry)
                    resultMain.setText("");
                if(zeroCheck(resultMain.getText()))
                    resultMain.setText("4");
                else
                    resultMain.setText(resultMain.getText()+"4");
                newEntry = false;
            }
        });
        fiveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (newEntry)
                    resultMain.setText("");
                if(zeroCheck(resultMain.getText()))
                    resultMain.setText("5");
                else
                    resultMain.setText(resultMain.getText()+"5");
                newEntry = false;
            }
        });
        sixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (newEntry)
                    resultMain.setText("");
                if(zeroCheck(resultMain.getText()))
                    resultMain.setText("6");
                else
                    resultMain.setText(resultMain.getText()+"6");
                newEntry = false;
            }
        });
        sevenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (newEntry)
                    resultMain.setText("");
                if(zeroCheck(resultMain.getText()))
                    resultMain.setText("7");
                else
                    resultMain.setText(resultMain.getText()+"7");
                newEntry = false;
            }
        });
        eightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (newEntry)
                    resultMain.setText("");
                if(zeroCheck(resultMain.getText()))
                    resultMain.setText("8");
                else
                    resultMain.setText(resultMain.getText()+"8");
                newEntry = false;
            }
        });
        nineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (newEntry)
                    resultMain.setText("");
                if(zeroCheck(resultMain.getText()))
                    resultMain.setText("9");
                else
                    resultMain.setText(resultMain.getText()+"9");
                newEntry = false;
            }
        });
        zeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (newEntry)
                    resultMain.setText("");
                if(!zeroCheck(resultMain.getText()))
                    resultMain.setText(resultMain.getText()+"0");
                newEntry = false;
            }
        });
        dotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (newEntry)
                    resultMain.setText("");
                String temp = resultMain.getText();
                if (!temp.contains(".")){
                    if(temp.length() == 0){
                        resultMain.setText("0");
                    }
                    resultMain.setText(resultMain.getText()+".");
                }
                newEntry = false;
            }
        });
        eraseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultMain.setText("0");
                resultTemp.setText("");
            }
        });
        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tempString = resultMain.getText();
                int tempLength = tempString.length();
                if (tempString != null && tempLength>0){
                    resultMain.setText(tempString.substring(0,tempLength-1));
                }
                if (resultMain.getText().isEmpty())
                    resultMain.setText("0");
            }
        });
        plusMinusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tempString = resultMain.getText();
                int tempLength = tempString.length();
                if (tempString.startsWith("-"))
                    resultMain.setText(resultMain.getText().substring(1));
                else if (tempString.startsWith("0")){
                        if (tempLength != 1)
                            resultMain.setText("-" + resultMain.getText());
                }
                else
                    resultMain.setText("-" + resultMain.getText());
                number = Double.parseDouble(resultMain.getText());
            }
        });
        equalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!newEntry)
                    number = Double.parseDouble(resultMain.getText());
                resultTemp.setText("");
                calculation(operation);
                resultMain.setText("" + output(result));
                newEntry = true;
            }
        });
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result = Double.parseDouble(resultMain.getText());
                resultTemp.setText(output(result) + " + ");
                operation = '+';
                newEntry = true;
            }
        });
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result = Double.parseDouble(resultMain.getText());
                resultTemp.setText(output(result) + " - ");
                operation = '-';
                newEntry = true;
            }
        });
        timesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result = Double.parseDouble(resultMain.getText());
                resultTemp.setText(output(result) + " * ");
                operation = '*';
                newEntry = true;
            }
        });
        devidedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                result = Double.parseDouble(resultMain.getText());
                resultTemp.setText(output(result) + " / ");
                operation = '/';
                newEntry = true;
            }
        });
    }

    //CHECKS IF THE DISPLAY SHOWS ZERO DIGIT ONLY
    public boolean zeroCheck(String s){
        if (s.equals("0"))
            return true;
        else
            return false;
    }

    //PRINTS OUT THE RESULT
    public void printResults(){
        // DEALS WITH UNNECESSARY DIGITS AFTER INTEGER NUMBERS
        if (result == Math.floor(result))
            resultTemp.setText(resultTemp.getText() + (long)Math.floor(result));
        else
            resultTemp.setText(resultTemp.getText() + result);
        newEntry = true;
    }

    public void calculation (Character ch){
        switch (ch){
            case '+':
                result += number;
                break;
            case '-':
                result -= number;
                break;
            case '*':
                result *= number;
                break;
            case '/':
                result /= number;
                break;
        }
    }

    //AVOIDS UNNECESSARY DIGITS
    public String output(Double d){
        if (d % 1 == 0)
            return Long.toString((long)Math.floor(d));
        else
            //LIMIT THE OUTPUT NUMBER OF DECIMALS TO 8
            if (Double.toString(d % 1).length() > 10)
                return String.format("%.8f", d);
            else
                return Double.toString(d);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new firstCalculator().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
