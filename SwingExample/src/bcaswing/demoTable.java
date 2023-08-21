/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bcaswing;

import javax.swing.*;

public class demoTable {
        JFrame f;    
    demoTable(){
         f=new JFrame();    
    String data[][]={ {"1","Aayush","670000"},    
                          {"2","Bikal","780000"},    
                          {"3","Sandip","700000"},
                          {"4","Suman","700000"}
    };    
    String column[]={"ID","NAME","SALARY"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
      DefaultListModel<String> l1 = new DefaultListModel<>();  
          l1.addElement("Add item");  
          l1.addElement(" Add Item2");  
          l1.addElement("Aadd Item3");  
          l1.addElement("Add Item4");  
          JList<String> list = new JList<>(l1);  
          list.setBounds(100,100, 75,75);  
          f.add(list);  
    f.add(sp);          
    f.setSize(300,400);    
    f.setVisible(true);    
}     
    public static void main(String[] args) {
        new demoTable();
    }
}
