package postogasolina;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

public class PostoGasolina extends JFrame implements ActionListener,ItemListener {
    
    JLabel title;
    JLabel nome;
    JLabel quantidadedelitro1;
    JLabel combEstoqueT;
    JLabel tipodecombustivel;
    JLabel tipodelubrificante;
    JLabel formadepagamento;
    JLabel valores;
    JLabel pagar;
    JLabel pagarCombustivel;
    JLabel pagarLubrificante;
    JComboBox tipocombustivel;
    JTextField quantidadedelitro2;
    JTextField litrosEstoqueAlcool;
    JTextField litrosEstoqueGasolina;
    JTextField litrosEstoqueDiesel;
    JTextField nomecliente;
    JTextField pagarCombustivelValor;
    JTextField pagarLubrificanteValor;
    JComboBox tipolubrificante;
    ButtonGroup bg;
    JRadioButton avista;
    JRadioButton noprazo;
    JRadioButton depoisdoprazo;
    JTextField apagar;
    JButton calcular;
    JButton finalizar;
    float diferencialCo=1;
    float diferencialTo=1;
    float valorTotal;
    
    JLabel lubEstoque;
    JLabel ShellEstShow;
    JLabel IpirangaEstShow;
    JLabel LubraxEstShow;
    JLabel CastrolEstShow;
    
    JLabel alcoolEstoqueT;
    JLabel gasolinaEstoqueT;
    JLabel dieselEstoqueT;
    
    JTextField ShellEstIn;
    JTextField IpirangaEstIn;
    JTextField LubraxEstIn;
    JTextField CastrolEstIn;
    
    boolean pagamento=true;
            
    
    float lestoqueAlcool = 2000;
    float lestoqueGasolina = 2000;
    float lestoqueDiesel = 2000;
    
    private final float precoalcool = (float) 2.626;
    private final float precogasolina = (float) 4.446;
    private final float precodiesel = (float) 3.373;
    
    private final float lubShell = (float) 22.90;
    private final float lubIpiranga = (float) 27.89;
    private final float lubLubrax = (float) 18.90;
    private final float lubCastrol = (float) 25.19;
    
    String[] combustivel = {"Nenhum", "Alcool (R$"+precoalcool+")/L", "Gasolina (R$"+precogasolina+")/L", "Diesel (R$"+precodiesel+")/L"};
    String[] lubrificante = {"Nenhum", "Shell (R$"+lubShell+")/L", "Ipiranga (R$"+lubIpiranga+")/L", "Lubrax (R$"+lubLubrax+")/L", "Castrol (R$"+lubCastrol+")/L"};
    
    float ShellEstoque=100;
    float IpirangaEstoque=100;
    float LubraxEstoque=100;
    float CastrolEstoque=100;
    
    float diferencialAlcool=0;
    float diferencialGasolina=0;
    float diferencialDiesel=0;
    
    int diferencialShell=0;
    int diferencialIpiranga=0;
    int diferencialLubrax=0;
    int diferencialCastrol=0;
    
    public PostoGasolina(){
        super("Posto de Gasolina");
        setSize(465,460);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
       
        JPanel pl = new JPanel();
        pl.setLayout(null);
        
        bg = new ButtonGroup();
        
        title = new JLabel("Posto de Gasolina");
        title.setBounds(185, 10, 200, 20);
        title.setForeground(Color.red);
        
        nome = new JLabel("Nome do Cliente:");
        nome.setBounds(10, 62, 200, 25);
        
        quantidadedelitro1 = new JLabel("Quantidade de Litros:");
        quantidadedelitro1.setBounds(10, 93, 200, 25);
        
        combEstoqueT = new JLabel("Litros em estoque:");
        combEstoqueT.setBounds(10, 123, 1000, 25);
        
        alcoolEstoqueT = new JLabel("Alcool:");
        alcoolEstoqueT.setBounds(150, 123, 1000, 25);
        
        gasolinaEstoqueT = new JLabel("Gasolina:");
        gasolinaEstoqueT.setBounds(240, 123, 1000, 25);
        
        dieselEstoqueT = new JLabel("Diesel:");
        dieselEstoqueT.setBounds(345, 123, 1000, 25);
        
        litrosEstoqueAlcool = new JTextField();
        litrosEstoqueAlcool.setBounds(192, 123, 43, 25);
        litrosEstoqueAlcool.setText(""+lestoqueAlcool);
        litrosEstoqueAlcool.setEnabled(false);
        
        litrosEstoqueGasolina = new JTextField();
        litrosEstoqueGasolina.setBounds(296, 123, 43, 25);
        litrosEstoqueGasolina.setText(""+lestoqueGasolina);
        litrosEstoqueGasolina.setEnabled(false);
        
        litrosEstoqueDiesel = new JTextField();
        litrosEstoqueDiesel.setBounds(387, 123, 43, 25);
        litrosEstoqueDiesel.setText(""+lestoqueDiesel);
        litrosEstoqueDiesel.setEnabled(false);
        
        quantidadedelitro2 = new JTextField();
        quantidadedelitro2.setBounds(150, 93, 50, 25);
        quantidadedelitro2.setText("");
        
        nomecliente = new JTextField();
        nomecliente.setBounds(150, 62, 280, 25);
        
        tipodecombustivel = new JLabel("Escolha o tipo de Combustível:");
        tipodecombustivel.setBounds(10, 152, 200, 25);
        
        tipocombustivel = new JComboBox(combustivel);
        tipocombustivel.setBounds(192, 152, 238, 25);
        tipocombustivel.setSelectedIndex(0);
        
        formadepagamento = new JLabel("Forma de Pagamento:");
        formadepagamento.setBounds(10, 208, 200, 20);
        
            avista = new JRadioButton("À vista (10% de desconto no combustível)");
            avista.setBounds(140, 188, 300, 20);

            noprazo = new JRadioButton("Prazo de 30 dias (Sem desconto)");
            noprazo.setBounds(140, 208, 300, 20);

            depoisdoprazo = new JRadioButton ("Depois de 30 dias (acréscimo de 2% no total)" );
            depoisdoprazo.setBounds(140, 228, 300, 20);
            
        tipodelubrificante = new JLabel("Escolha o tipo de Lubrificante:");
        tipodelubrificante.setBounds(10, 260, 200, 25);
        
        tipolubrificante = new JComboBox(lubrificante);
        tipolubrificante.setBounds(192, 260, 238, 25);
        tipolubrificante.setSelectedIndex(0);
        
        lubEstoque = new JLabel("Lubrificantes no estoque:");
        lubEstoque.setBounds(10, 290, 200, 25);
        
        ShellEstShow = new JLabel("Shell:");
        ShellEstShow.setBounds(160, 290, 200, 25);
        
        IpirangaEstShow = new JLabel("Ipiranga:");
        IpirangaEstShow.setBounds(220, 290, 200, 25);
        
        LubraxEstShow = new JLabel("Lubrax:");
        LubraxEstShow.setBounds(297, 290, 200, 25);
        
        CastrolEstShow = new JLabel("Castrol:");
        CastrolEstShow.setBounds(370, 290, 200, 25);
        
        ShellEstIn = new JTextField();
        ShellEstIn.setBounds(192, 290, 25, 25);
        ShellEstIn.setText(String.format("%.0f", ShellEstoque));
        ShellEstIn.setEnabled(false);
        
        IpirangaEstIn = new JTextField();
        IpirangaEstIn.setBounds(270, 290, 25, 25);
        IpirangaEstIn.setText(String.format("%.0f", IpirangaEstoque));
        IpirangaEstIn.setEnabled(false);
        
        LubraxEstIn = new JTextField();
        LubraxEstIn.setBounds(343, 290, 25, 25);
        LubraxEstIn.setText(String.format("%.0f", LubraxEstoque));
        LubraxEstIn.setEnabled(false);
        
        CastrolEstIn = new JTextField();
        CastrolEstIn.setBounds(415, 290, 25, 25);
        CastrolEstIn.setText(String.format("%.0f", CastrolEstoque));
        CastrolEstIn.setEnabled(false);
        
        
        
        bg.add(avista);
        bg.add(noprazo);
        bg.add(depoisdoprazo);
        
        valores = new JLabel("Valores:");
        valores.setBounds(10,330,200,25);
        
        pagarCombustivel = new JLabel("Combustível:");
        pagarCombustivel.setBounds(90,330,200,25);
        
        pagarCombustivelValor = new JTextField();
        pagarCombustivelValor.setBounds(165,330,45,25);
        pagarCombustivelValor.setEnabled(false);
        
        pagarLubrificante = new JLabel("Lubrificante:");
        pagarLubrificante.setBounds(220,330,200,25);
        
        pagarLubrificanteValor = new JTextField();
        pagarLubrificanteValor.setBounds(295,330,45,25);
        pagarLubrificanteValor.setEnabled(false);
        
        pagar = new JLabel("Total:");
        pagar.setBounds(350,330,200,25);
        
        apagar = new JTextField();
        apagar.setBounds(385,330,45,25);
        apagar.setEnabled(false);
        
        finalizar = new JButton("Finalizar");
        finalizar.setBounds(230,370, 200, 30);
        
        calcular = new JButton("Calcular");
        calcular.setBounds(10,370,200,30);
        
        
        
        pl.add(title);
        pl.add(nome);
        pl.add(nomecliente);
        pl.add(quantidadedelitro1);
        pl.add(quantidadedelitro2);
        pl.add(combEstoqueT);
        pl.add(litrosEstoqueAlcool);
        pl.add(litrosEstoqueGasolina);
        pl.add(litrosEstoqueDiesel);
        
        pl.add(alcoolEstoqueT);
        pl.add(gasolinaEstoqueT);
        pl.add(dieselEstoqueT);
        
        pl.add(formadepagamento);
        pl.add(avista);
        pl.add(noprazo);
        pl.add(depoisdoprazo);
        pl.add(tipodecombustivel);
        pl.add(tipocombustivel);
        pl.add(tipolubrificante);
        pl.add(tipodelubrificante);
        
        pl.add(lubEstoque);
        pl.add(ShellEstShow);
        pl.add(IpirangaEstShow);
        pl.add(LubraxEstShow);
        pl.add(CastrolEstShow);   
        
        pl.add(ShellEstIn);
        pl.add(IpirangaEstIn);
        pl.add(LubraxEstIn);
        pl.add(CastrolEstIn);
        
        pl.add(pagarCombustivel);
        pl.add(pagarLubrificante);
        pl.add(pagarCombustivelValor);
        pl.add(pagarLubrificanteValor);
        
        pl.add(valores);
        pl.add(pagar);
        pl.add(apagar);
        pl.add(finalizar);
        pl.add(calcular);
        
        
        finalizar.addActionListener(this);
        calcular.addActionListener(this);
          
        avista.addItemListener(this);
        noprazo.addItemListener(this);
        depoisdoprazo.addItemListener(this);
        
        add(pl);
        setVisible(true);
    }
    
    
   
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == calcular){
            float valorCo = 0;
            float valorLu = 0;
            
            if(tipocombustivel.getSelectedItem()==this.combustivel[0] && tipolubrificante.getSelectedItem()==this.lubrificante[0]){
                JOptionPane.showMessageDialog(null, "Insira algum item antes de calcular.");
                valorTotal=0;
            } else if(pagamento){
                JOptionPane.showMessageDialog(null, "Insira uma forma de pagamento.");
                valorTotal=0;
            } else {
                if(tipocombustivel.getSelectedItem()!=this.combustivel[0]){
                    
                   try{
                    if(!quantidadedelitro2.getText().isEmpty()){
                        if(tipocombustivel.getSelectedItem()==this.combustivel[1]){
                            diferencialAlcool=Float.parseFloat(quantidadedelitro2.getText());
                            valorCo = precoalcool*(Float.parseFloat(quantidadedelitro2.getText()));
                            pagarCombustivelValor.setText(""+valorCo);
                        } else if(tipocombustivel.getSelectedItem()==this.combustivel[2]){
                            diferencialGasolina=Float.parseFloat(quantidadedelitro2.getText());
                            valorCo = precogasolina*(Float.parseFloat(quantidadedelitro2.getText()));
                            pagarCombustivelValor.setText(""+valorCo);
                        } else if(tipocombustivel.getSelectedItem()==this.combustivel[3]){
                            diferencialDiesel=Float.parseFloat(quantidadedelitro2.getText());
                            valorCo = precodiesel*(Float.parseFloat(quantidadedelitro2.getText()));
                            pagarCombustivelValor.setText(""+valorCo);
                        }
                    } else if((Float.parseFloat(quantidadedelitro2.getText()))<=0){
                    JOptionPane.showMessageDialog(null, "Insira um valor positivo.");
                    }
                 } catch(NumberFormatException a){
                JOptionPane.showMessageDialog(null, "Quantidade inserida inválida.");
                    }
                }
                
                if(tipolubrificante.getSelectedItem()==this.lubrificante[1]){
                    valorLu += lubShell;
                    diferencialShell=1;
                    diferencialIpiranga=0;
                    diferencialLubrax=0;
                    diferencialCastrol=0;
                    pagarLubrificanteValor.setText(""+valorLu);
                } else if(tipolubrificante.getSelectedItem()==this.lubrificante[2]){
                    valorLu += lubIpiranga;
                    diferencialShell=0;
                    diferencialIpiranga=1;
                    diferencialLubrax=0;
                    diferencialCastrol=0;
                    pagarLubrificanteValor.setText(""+valorLu);
                } else if(tipolubrificante.getSelectedItem()==this.lubrificante[3]){
                    valorLu += lubLubrax;
                    diferencialShell=0;
                    diferencialIpiranga=0;
                    diferencialLubrax=1;
                    diferencialCastrol=0;
                    pagarLubrificanteValor.setText(""+valorLu);
                } else if(tipolubrificante.getSelectedItem()==this.lubrificante[4]){
                    valorLu += lubCastrol;
                    diferencialShell=0;
                    diferencialIpiranga=0;
                    diferencialLubrax=0;
                    diferencialCastrol=1;
                    pagarLubrificanteValor.setText(""+valorLu);
                }
            
            
                valorCo *= diferencialCo;
                valorTotal= valorCo + valorLu;
                valorTotal *= diferencialTo;
                apagar.setText(String.format("%.2f", valorTotal));
            }
        }
        
        if(ae.getSource() == finalizar){
            if(valorTotal>0 && tipocombustivel.getSelectedItem()!=this.combustivel[0] || tipolubrificante.getSelectedItem()!=this.lubrificante[0]){
            litrosEstoqueAlcool.setText(""+(lestoqueAlcool-=diferencialAlcool));
            litrosEstoqueGasolina.setText(""+(lestoqueGasolina-=diferencialGasolina));
            litrosEstoqueDiesel.setText(""+(lestoqueDiesel-=diferencialDiesel));
            
                ShellEstoque-=diferencialShell;
                IpirangaEstoque-=diferencialIpiranga;
                LubraxEstoque-=diferencialLubrax;
                CastrolEstoque-=diferencialCastrol;
                ShellEstIn.setText(String.format("%.0f", ShellEstoque));
                IpirangaEstIn.setText(String.format("%.0f", IpirangaEstoque));
                LubraxEstIn.setText(String.format("%.0f", LubraxEstoque));
                CastrolEstIn.setText(String.format("%.0f", CastrolEstoque));
                
            diferencialShell=0;
            diferencialIpiranga=0;
            diferencialLubrax=0;
            diferencialCastrol=0;
            
            diferencialAlcool=0;
            diferencialGasolina=0;
            diferencialDiesel=0;
            pagamento=true;
            nomecliente.setText("");
            quantidadedelitro2.setText("");
            bg.clearSelection();
            apagar.setText("");
            } else{
                JOptionPane.showMessageDialog(null,"Calcule o valor antes de finalizá-lo.");
            }
      }
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
            if(avista.isSelected()){
                diferencialCo = (float) 0.90;
                diferencialTo = (float) 1;
                pagamento=false;
            }else if(depoisdoprazo.isSelected()){
                diferencialCo = (float) 1;
                diferencialTo = (float) 1.02;
                pagamento=false;
            }else if(noprazo.isSelected()){
                diferencialCo = (float) 1;
                diferencialTo = (float) 1;
                pagamento=false;
            }
    }
}
