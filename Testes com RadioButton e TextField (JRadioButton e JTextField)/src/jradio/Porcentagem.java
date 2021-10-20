package jradio;

import java.awt.*; //Implementação de todas as bibliotecas de AWT
import javax.swing.*; //Implementação de todas as bibliotecas de SWING 
import java.awt.event.ItemEvent; //Implementação da biblioteca de eventos de Item
import java.awt.event.ItemListener; //Implementação da biblioteca de funções dos Itens

public class Porcentagem extends JFrame implements ItemListener{
    
                //Criação
    
    JPanel painel1; //Criação do painel da primeira linha
    JPanel painel2; //Criaçao do painel da segunda linha
    JPanel painel3; //Criação do painel da terceira linha
    
    JLabel digite; //Criação da caixa de texto "Digite um valor: "
    JTextField entrada; //Criação da caixa de inserção de texto
    
    ButtonGroup valores; /*Criação do grupo de RadioButton
    (PS: Necessário a criação para não possuir mais de uma seleção) */
    
    JRadioButton porc1; //Criação da primeira RadioButton (Botão de seleção)
    JRadioButton porc2; // Criação da segunda RadioButton (Botão de seleção)
    JRadioButton porc3; //Criação da terceira RadioButton (Botão de seleção)
    
    JLabel porcento; //Criação da caixa de texto " % do valor: "
    JTextField valor; //Criação da caixa de texto qual o valor será multiplicado pelo programa
        
    public Porcentagem(){ //Criação da Janela
        super("Uso de botoes de Radio"); //Utilização do SUPER para sobrescrita do título da janela
        setSize(320,150); //Parametros para tamanho da janela (Largura, Altura)
        setResizable(false); //Parametro para decisão de uso do ícone "Maximizar" da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Parametro para decisão do uso do ícone "Fechar" da janela
        setLocationRelativeTo(null); //Parametro para posição no centro de execução no windows
    
    Container tela = getContentPane();/*Criação do Container 
    (Conteiner é necessário para inserir objetos visíveis na janela) */
    tela.setLayout(new BorderLayout()); //Adição de borda no conteiner
    
    
                //Instanciamento
    
    painel1 = new JPanel(); //Criação do primeiro painel
    painel1.setLayout(new FlowLayout());
    
    painel2 = new JPanel();//Criação do segundo painel
    painel2.setLayout(new GridLayout(1,5));
    
    painel3 = new JPanel();//Criação do terceiro painel
    painel3.setLayout(new FlowLayout());
    
    digite = new JLabel("Digite um valor: ");
    entrada = new JTextField("");
    entrada.setColumns(5);//Largura da caixa de inserção de texto
    
    valores = new ButtonGroup();
    porc1 = new JRadioButton("10% do valor");
    porc2 = new JRadioButton("20% do valor");
    porc3 = new JRadioButton("30% do valor");
    
    porcento = new JLabel(" % do valor: ");
    valor = new JTextField("");
    valor.setEnabled(false);
    valor.setColumns(15); //Largura da caixa de texto
    
                //Adição de função dos botões criados
    
    porc1.addItemListener(this); 
    porc2.addItemListener(this); 
    porc3.addItemListener(this); 
    
                //Inserção dos objetos na tela
    
    tela.add(painel1,BorderLayout.NORTH); //Inserção do JPanel "painel1" no conteiner "tela" e sua localização
        painel1.add(digite); //Inserção da caixa de texto "digite" no "painel1"
        painel1.add(entrada); //Inserção da caixa de inserção de texto "entrada" no "painel1"
        
    tela.add(painel2,BorderLayout.CENTER); //Inserção do JPanel "painel2" no conteiner "tela" e sua localização
        valores.add(porc1); //Inserção da caixa de seleção "porc1" no ButtonGroup "valores"
        valores.add(porc2); //Inserção da caixa de seleção "porc2" no ButtonGroup "valores"
        valores.add(porc3); //Inserção da caixa de seleção "porc3" no ButtonGroup "valores"
    
        painel2.add(porc1); //Inserção da caixa de seleção "porc1" no painel "painel2"
        painel2.add(porc2); //Inserção da caixa de seleção "porc2" no painel "painel2"
        painel2.add(porc3); //Inserção da caixa de seleção "porc3" no painel "painel2"
    
    tela.add(painel3,BorderLayout.SOUTH); //Inserção do JPanel "painel3" no conteiner "tela" e sua localização
        painel3.add(porcento); //Inserção da caixa de texto "porcento" no painel "painel3"
        painel3.add(valor); //Inserção da caixa de texto "valor" no painel "painel3"
        
        setVisible(true); //Parametro para visibilidade
    }

    @Override
    public void itemStateChanged(ItemEvent ie) { //Função da caixa de seleção
        
        try{
            
            if(porc1.isSelected()){ //Teste da caixa de seleção "porc1"
                Double mult = (Double.parseDouble(entrada.getText()))*1.10; //Multiplicação
                valor.setText("" + mult); //Substituição da caixa de texto "valor"
            }
        
            if(porc2.isSelected()){ //Teste da caixa de seleção "porc2"
                Double mult = (Double.parseDouble(entrada.getText()))*1.20; //Multiplicação
                valor.setText("" + mult); //Substituição da caixa de texto "valor"
            }
        
            if(porc3.isSelected()){ //Teste da caixa de seleção "porc3"
                Double mult = (Double.parseDouble(entrada.getText()))*1.30; //Multiplicação
                valor.setText("" + mult); //Substituição da caixa de texto "valor"
            }
            
        }catch(java.lang.NumberFormatException a){
            JOptionPane.showMessageDialog(null,"Valor inserido é inválido.");
        }
    }
}
