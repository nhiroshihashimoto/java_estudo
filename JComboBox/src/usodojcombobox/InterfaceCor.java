package usodojcombobox;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class InterfaceCor extends JFrame implements ActionListener, ItemListener {
    
    JLabel lbl1;
    JComboBox cb1;
    JButton btn1;
    JButton btn2;
    JButton btn3;
    JButton btn4;
    JButton btn5;
    JButton btn6;
    JTextField txt1;
    JTextField txt2;
    
    public InterfaceCor(){
        super("Uso do JComboBox");
        setSize(500,150);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c = getContentPane();
        
        c.setLayout(new GridLayout(5,2));
        
        lbl1 = new JLabel("Texto :");
        lbl1.setForeground(Color.BLUE);
        
        cb1 = new JComboBox();
        
        btn1 = new JButton("Mostrar Texto");
        
        btn2 = new JButton("Remover Item");
        
        btn3 = new JButton("Mostrar Indice");
        
        btn4 = new JButton("Remover Tudo");
        
        btn5 = new JButton("Adicionar Item");
        
        btn6 = new JButton("Quant. Itens");
        
        txt1 = new JTextField("");
        
        txt2 = new JTextField("");
        txt2.setEditable(false);
        
        c.add(lbl1);
        c.add(cb1);
        c.add(btn1);
        c.add(btn2);
        c.add(btn3);
        c.add(btn4);
        c.add(btn5);
        c.add(txt1);
        c.add(btn6);
        c.add(txt2);
        
        cb1.addItemListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        

        if(ae.getSource() == btn1){
            lbl1.setText("Texto : " + cb1.getSelectedItem());
        }
        
        if(ae.getSource() == btn2){
            
            cb1.removeItemAt(cb1.getSelectedIndex());
        }
        
        if(ae.getSource() == btn3){
            txt2.setText("" + cb1.getSelectedIndex());
        }
        
        if(ae.getSource() == btn4){
            cb1.removeAllItems();
        }
        
        if(ae.getSource() == btn5){
            cb1.addItem(txt1.getText());
            txt1.setText("");
            
        }
        
        if(ae.getSource() == btn6){
            txt2.setText("" + cb1.getItemCount());
        }
        
        
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
         lbl1.setText("Texto : " + cb1.getSelectedItem());
    }

   
    
}
