package janelacheckbox;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class CheckBox1 extends JFrame implements ItemListener{
    
        JLabel texto1;
        JCheckBox box1;
        JCheckBox box2;
    
    public CheckBox1(){
        super("Uso do JCheckBox");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,100);
        setResizable(false);
        Container Janela = getContentPane();
        Janela.setLayout(new FlowLayout());
        
        texto1 = new JLabel("Java");
        texto1.setFont(new Font("Java",Font.PLAIN,20));
        
        box1 = new JCheckBox("Negrito");
        box1.setFont(new Font("Negrito",Font.BOLD,20));
        
        box2 = new JCheckBox("Itálico");
        box2.setFont(new Font("Itálico",Font.ITALIC,20));
        
        
        Janela.add(texto1);
        Janela.add(box1);
        Janela.add(box2);
        
        box1.addItemListener(this);
        box2.addItemListener(this);
        
        setVisible(true);
    }
    
    

    @Override
    public void itemStateChanged(ItemEvent ie) {
        
        if(box1.isSelected() == true){
            texto1.setFont(new Font("Java",Font.BOLD,20));
        }
        
        if(box2.isSelected() == true){
            texto1.setFont(new Font ("Java",Font.ITALIC,20));
        }
        
        if(box1.isSelected() == true && box2.isSelected() == true){
            texto1.setFont(new Font("Java",Font.BOLD + Font.ITALIC,20));
        }
        
        if (box1.isSelected() == false && box2.isSelected() == false){
            texto1.setFont(new Font("Java",Font.PLAIN,20));
        }
        
    }
    
}