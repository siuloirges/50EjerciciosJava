package ejercicio_interface_1;


import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JButton;
// import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
// import javax.swing.border.Border;

public class Ventana extends JFrame{

  public Ventana(){

    this.setSize(500,450);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setTitle("Mazanas");
    initComponet();

  }

  private void initComponet(){
      JPanel panel = new JPanel();
      panel.setLayout(null);

      this.getContentPane().add(panel);
      
      JLabel title =  new JLabel();

      title.setText("Azar");
      title.setBounds(0, 125, 500, 50);
      title.setHorizontalAlignment(SwingConstants.CENTER);
      title.setFont(new Font("arial",1,40));

      panel.add(title);


      JLabel description =  new JLabel();

      description.setText("Laza y gana");
      description.setBounds(0, 160, 500, 50);
      description.setHorizontalAlignment(SwingConstants.CENTER);
      description.setFont(new Font("arial",0,12));

      panel.add(description);


      ImageIcon imagen = new ImageIcon("assets/dado_1.png");
      JLabel ImagenContain =  new JLabel();

      ImagenContain.setBounds( 250 - 50  , 10, 100, 100);
      ImagenContain.setIcon( new ImageIcon(imagen.getImage().getScaledInstance(ImagenContain.getWidth(), ImagenContain.getHeight(),  java.awt.Image.SCALE_SMOOTH )));

      panel.add(ImagenContain);



      JLabel labelCantidad =  new JLabel();

      labelCantidad.setText("Cantidad de lanzamientos");
      labelCantidad.setBounds(0, 210, 430, 50);
      labelCantidad.setHorizontalAlignment(SwingConstants.CENTER);
      labelCantidad.setFont(new Font("arial",1,14));
      panel.add(labelCantidad);

      JTextField TextBox = new JTextField();
      TextBox.setBounds(250 - 125, 250, 250, 35);
      TextBox.addKeyListener( new KeyAdapter(){

        public void keyTyped(KeyEvent evt) {
            char caracter = evt.getKeyChar();
    
            if (((caracter < '0') || (caracter > '9')) && (caracter != '.')
                    && (caracter != '\b' /* corresponde a BACK_SPACE */)) {
                evt.consume(); 
            }
        }
      });

      panel.add(TextBox);

      JButton button = new JButton("Calcular");
      button.setBounds(250 - 125, 300, 250, 35);

      button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evento) {
            try {

              ArrayList<Dado> dados = new ArrayList<Dado>(); 
              Map<Integer, Integer> ReportData = new HashMap<Integer, Integer>();

              int cantidad = Integer.parseInt(TextBox.getText());

              for( int i = 0; i<cantidad; i++ ){

                Dado dado = new Dado(); 

                ReportData.put( dado.getValor(), ReportData.get( dado.getValor() )==null?1:ReportData.get( dado.getValor() ) + 1 );	
               
                dados.add(dado);
              
              }
          

              Ventana2 ventana2 = new Ventana2();

              ventana2.setDados(dados);
              ventana2.setReportData(ReportData);
              ventana2.initView();
	          	ventana2.setVisible(true);


             

        
            } catch (Exception e) {
              System.out.println(e);
            }
        }
    });

      panel.add(button);
  
    };

}
