
package calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Calculator extends JFrame implements ActionListener {

 private  JTextField t1, t2, t3;
   private  JLabel l1, l2, l3;
 private JButton b1, b2,b3;

    Calculator() {
        super("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
            l1=new JLabel("First Value:");
            l2=new JLabel("Second Value:"); 
            l3=new JLabel("Result:");
            t1=new JTextField(10);
            t2=new JTextField(10);
            t3=new JTextField(10);
            b1 = new JButton("Add");
              b2 = new JButton("Subtract");
              b3 = new JButton("Clear");
              
               b1.addActionListener(this);
         b2.addActionListener(this);
         
                setLayout(new FlowLayout(FlowLayout.LEFT,150,20));
                add(l1);
                add(l2);
                add(l3);
                add(t1);
                add(t2);
                add(t3);
                add(b1);
                add(b2);
                add(b3);
                
                setSize(500,300);
                        setVisible(true);
                        
                        
 
            
        }
 
        
      public void actionPerformed(ActionEvent e) {
        try {
            double num1 = Double.parseDouble(t1.getText());
            double num2 = Double.parseDouble(t2.getText());
            double result;

            if (e.getSource() == b1) {
                result = num1 + num2;
            } else { 
                result = num1 - num2;
            }

            t3.setText(Double.toString(result));
        } catch (NumberFormatException ex) {
            t3.setText("Invalid input");
        }
    }
    
        
    public static void main(String[] args) {
     SwingUtilities.invokeLater(() -> {
         Calculator calculator = new Calculator();
        });
    }
    
}
