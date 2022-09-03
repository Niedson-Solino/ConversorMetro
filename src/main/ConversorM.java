
package main;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author alu201500391
 */
public class ConversorM {
    
public static void criarTela(){
    JFrame tela = new JFrame("Conversor M para MM, CM, DM, DAM, HM e KM");
    JTextField txtM = new JTextField(5);
    JLabel lblM = new JLabel("Valor em M:");
    JButton btnTransformarKM = new JButton("Converter em KM");
    JButton btnTransformarHM = new JButton("Converter em HM");
    JButton btnTransformarDAM = new JButton("Converter em DAM");
    JButton btnTransformarDM = new JButton("Converter em DM");
    JButton btnTransformarCM = new JButton("Converter em CM"); 
    JButton btnTransformarMM = new JButton("Converter em MM"); 
    JButton btnTransformarM = new JButton("Valor inicial"); 
    JLabel lblResultado = new JLabel("Resultado");

    
    Container painel3 = tela.getContentPane(); 
    painel3.setLayout(new GridLayout(4, 4, 4, 4));
    painel3.add(lblM);
    painel3.add(txtM);
    painel3.add(btnTransformarMM);
    painel3.add(lblResultado);
    
    Container painel2 = tela.getContentPane(); 
    painel2.setLayout(new GridLayout(4, 4, 4, 4));
    painel2.add(lblM);
    painel2.add(txtM);
    painel2.add(btnTransformarCM);
    painel2.add(lblResultado);
    
    Container painel4 = tela.getContentPane(); 
    painel4.setLayout(new GridLayout(4, 4, 4, 4));
    painel4.add(lblM);
    painel4.add(txtM);
    painel4.add(btnTransformarDM);
    painel4.add(lblResultado);
    
    Container painel5 = tela.getContentPane(); 
    painel5.setLayout(new GridLayout(4, 4, 4, 4));
    painel5.add(lblM);
    painel5.add(txtM);
    painel5.add(btnTransformarDAM);
    painel5.add(lblResultado);
    
    Container painel6 = tela.getContentPane(); 
    painel6.setLayout(new GridLayout (4, 4, 4, 4));
    painel6.add(lblM);
    painel6.add(txtM);
    painel6.add(btnTransformarHM);
    painel6.add(lblResultado);
    
    Container painel7 = tela.getContentPane(); 
    painel7.setLayout(new GridLayout (4, 4, 4, 4));
    painel7.add(lblM);
    painel7.add(txtM);
    painel7.add(btnTransformarKM);
    painel7.add(lblResultado); 
    
    Container painel8 = tela.getContentPane(); 
    painel8.setLayout(new GridLayout (4, 4, 4, 4));
    painel8.add(lblM);
    painel8.add(txtM);
    painel8.add(btnTransformarM);
    painel8.add(lblResultado); 
    
    //click do botao
    btnTransformarMM.addActionListener((e)->{
        double vlrM = Double.parseDouble(txtM.getText());
        double vlrM2 = vlrM * 1000;
        lblResultado.setText(String.format("%.2f MM", vlrM2)); //String.format("%.2f\u00b0F", vlrFahrenheit)) = p aceitar string
});
    btnTransformarCM.addActionListener((e)->{
        double vlrM = Double.parseDouble(txtM.getText());
        double vlrM2 = vlrM * 100;
        lblResultado.setText(String.format("%.2f CM", vlrM2)); //String.format("%.2f\u00b0F", vlrFahrenheit)) = p aceitar string
});  
    btnTransformarDM.addActionListener((e)->{
        double vlrM = Double.parseDouble(txtM.getText());
        double vlrM2 = vlrM * 10;
        lblResultado.setText(String.format("%.2f DM", vlrM2)); //String.format("%.2f\u00b0F", vlrFahrenheit)) = p aceitar string
    
});
    btnTransformarDAM.addActionListener((e)->{
        double vlrM = Double.parseDouble(txtM.getText());
        double vlrM2 = (vlrM / 10);
        lblResultado.setText(String.format("%.5f DAM", vlrM2)); //String.format("%.2f\u00b0F", vlrFahrenheit)) = p aceitar string
});
    btnTransformarHM.addActionListener((e)->{
        double vlrM = Double.parseDouble(txtM.getText());
        double vlrM2 = (vlrM / 100);
        lblResultado.setText(String.format("%.5f HM", vlrM2)); //String.format("%.2f\u00b0F", vlrFahrenheit)) = p aceitar string
});
    btnTransformarKM.addActionListener((e)->{
        double vlrM = Double.parseDouble(txtM.getText());
        double vlrM2 = (vlrM / 1000);
        lblResultado.setText(String.format("%.5f KM", vlrM2)); //String.format("%.2f\u00b0F", vlrFahrenheit)) = p aceitar string
});
    btnTransformarM.addActionListener((e)->{
        double vlrM = Double.parseDouble(txtM.getText());
        double vlrM2 = vlrM ;
        lblResultado.setText(String.format("%.2f M", vlrM2)); //String.format("%.2f\u00b0F", vlrFahrenheit)) = p aceitar string
});
    
    tela.pack();
    tela.setLocationRelativeTo(null); //organizar a tela melhor
    tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    tela.setVisible(true);
}  
}
