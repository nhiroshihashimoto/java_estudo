
package calcular;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Interface extends JFrame implements ActionListener{
    JTextField txt1;
    JTextField txt2;
    JLabel lbl4;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    
    public Interface(){
    super("Calculadora");
    setSize(350,100);
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Container c = getContentPane();
    
    c.setLayout(new GridLayout(3,4));
    
    txt1 = new JTextField("");
    txt1.setColumns(2);

    txt2 = new JTextField("");
    txt2.setColumns(2);
    
    JLabel lbl1 = new JLabel("Num.1");
    
    JLabel lbl2 = new JLabel("Num.2");
    
    JLabel lbl3 = new JLabel("Total");
    
    lbl4 = new JLabel ("");
    lbl4.setBackground(Color.WHITE);
    
    btn1 = new JButton("+");
    
    btn2 = new JButton("-");
    
    btn3 = new JButton ("x");
    
    btn4 = new JButton("/");
    
    btn5 = new JButton("Limpar");
    btn5.setBackground(Color.BLACK);
    btn5.setForeground(Color.WHITE);
    
    c.add(lbl1);
    c.add(txt1);
    c.add(btn1);
    c.add(btn2);
    c.add(lbl2);
    c.add(txt2);
    c.add(btn3);
    c.add(btn4);
    c.add(lbl3);
    c.add(lbl4);
    c.add(btn5);
    
    btn1.addActionListener(this);
    btn2.addActionListener(this);
    btn3.addActionListener(this);
    btn4.addActionListener(this);
    btn5.addActionListener(this);
    
    setVisible(true);
    
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        float n1 = Float.parseFloat(txt1.getText());
        float n2 = Float.parseFloat(txt2.getText());
        
         if(ae.getSource() == btn1){
             lbl4.setText(Float.toString(n1+n2));
         }
         
         if(ae.getSource() == btn2){
             lbl4.setText(Float.toString(n1-n2));
         }
         
         if(ae.getSource() == btn3){
             lbl4.setText(Float.toString(n1*n2));
         }
         if(ae.getSource() == btn4){
             lbl4.setText(Float.toString(n1/n2));
         }
         if(ae.getSource() == btn5){
             txt1.setText("");
             txt2.setText("");
             lbl4.setText("");
         }
}
        
    }
