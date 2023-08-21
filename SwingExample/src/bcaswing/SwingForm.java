/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bcaswing;

import javax.swing.*;

public class SwingForm {
    
    SwingForm(){
         JFrame f= new JFrame("Label");  
    JLabel l1,l2,l3,l4; 
      JTextField tf1,tf2;

    l1=new JLabel("Name:");  
     tf1=new JTextField();  
    l1.setBounds(50,50, 100,30);
    tf1.setBounds(100,50,150,20);
    l2=new JLabel("email:"); 
    tf2=new JTextField();
    l2.setBounds(50,100, 100,30);
    tf2.setBounds(100,100,150,20);
    
      l3=new JLabel("Password:"); 
      JPasswordField value = new JPasswordField();
       l3.setBounds(50,150, 100,30);
       value.setBounds(120,150,100,20);
       
       l4=new JLabel("Gender:");
       l4.setBounds(50,150, 100,30);
        JCheckBox checkBox1 = new JCheckBox("Male",true);  
        
        checkBox1.setBounds(100,180, 80,50);  
        JCheckBox checkBox2 = new JCheckBox("Female");  
        checkBox2.setBounds(100,210, 80,50);
         f.add(checkBox1); f.add(checkBox2);
        JRadioButton r1=new JRadioButton("A) Java");    
JRadioButton r2=new JRadioButton("B) React");
JRadioButton r3=new JRadioButton("C) C++");  
r1.setBounds(75,250,100,30);    
r2.setBounds(75,280,100,30); 
r3.setBounds(75,310,100,30); 
ButtonGroup bg=new ButtonGroup();    
  String country[]={"Chitwan","Kathmandu","Bhaktapur","Nawalprasi","Jhapa"};        
    JComboBox cb=new JComboBox(country);    
    cb.setBounds(50, 350,90,20);    
    f.add(cb);        
bg.add(r1);bg.add(r2);bg.add(r3);    
f.add(r1);f.add(r2);f.add(r3);    
    f.add(l1); f.add(l2);  
     f.add(tf1); f.add(tf2);  
  f.add(value);  f.add(l3);
  f.add(checkBox1);  
        f.add(checkBox2);  
    f.setSize(800,800);  
    f.setLayout(null);  
    f.setVisible(true);
     JButton b=new JButton("Submit");  
    b.setBounds(50,400,95,30);  
    f.add(b);  
    f.setSize(400,400);  
    
    
}
   
    public static void main(String[] args) {
        new SwingForm();
        
    }
    
}
