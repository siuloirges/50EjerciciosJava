package A_Ejercicios21.Interfaces.ejercicio_interface_18;


import java.awt.*;
import java.awt.event.*;
// import javax.swing.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class Ventana extends JFrame{

  public Ventana(){

    this.setSize(500,550);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setTitle("Mazanas");
    initComponet();

  }

  private void initComponet(){
      JPanel panel = new JPanel();
      // panel.setBackground(Color.gray);
      panel.setLayout(null);

      this.getContentPane().add(panel);
      

      ImageIcon imagen = new ImageIcon("A_Ejercicios21/Interfaces/ejercicio_interface_18/assets/lista.png");
      JLabel ImagenContain =  new JLabel();

      ImagenContain.setBounds( 250 - 65  , 10, 130, 130);
      ImagenContain.setIcon( new ImageIcon(imagen.getImage().getScaledInstance(ImagenContain.getWidth(), ImagenContain.getHeight(),  java.awt.Image.SCALE_SMOOTH )));

      panel.add(ImagenContain);
  
      JLabel title =  new JLabel();

      title.setText("Distancia");
      title.setBounds(0, 150, 500, 50);
      title.setHorizontalAlignment(SwingConstants.CENTER);
      title.setFont(new Font("arial",1,40));

      panel.add(title);


      JLabel description =  new JLabel();

      description.setText("Consulta del combustible ");
      description.setBounds(0, 185, 500, 50);
      description.setHorizontalAlignment(SwingConstants.CENTER);
      description.setFont(new Font("arial",0,12));

      panel.add(description);



      JLabel labelKilometros =  new JLabel();

      labelKilometros.setText("Digite los kilometros recorridos");
      labelKilometros.setBounds(0, 235,430, 50);
      labelKilometros.setHorizontalAlignment(SwingConstants.CENTER);
      labelKilometros.setFont(new Font("arial",1,12));
      panel.add(labelKilometros);

      JTextField TextBoxKilometros = new JTextField();
      TextBoxKilometros.setBounds(250 - 125, 275, 250, 35);
      TextBoxKilometros.addKeyListener( new KeyAdapter(){

        public void keyTyped(KeyEvent evt) {
            char caracter = evt.getKeyChar();
    
            if (((caracter < '0') || (caracter > '9')) && (caracter != '.')
                    && (caracter != '\b' /* corresponde a BACK_SPACE */)) {
                evt.consume(); 
            }
        }
      });
      panel.add(TextBoxKilometros);

      //--------------

      JLabel labelValorCombustible =  new JLabel();

      labelValorCombustible.setText("Digite el valor de un litro de combustible");
      labelValorCombustible.setBounds(0, 305, 470, 50);
      labelValorCombustible.setHorizontalAlignment(SwingConstants.CENTER);
      labelValorCombustible.setFont(new Font("arial",1,12));
      panel.add(labelValorCombustible);

      JTextField TextBoxValorCombustible = new JTextField();
      TextBoxValorCombustible.setBounds(250 - 125, 345, 250, 35);
      TextBoxValorCombustible.addKeyListener( new KeyAdapter(){

        public void keyTyped(KeyEvent evt) {
            char caracter = evt.getKeyChar();
    
            if (((caracter < '0') || (caracter > '9')) && (caracter != '.')
                    && (caracter != '\b' /* corresponde a BACK_SPACE */)) {
                evt.consume(); 
            }
        }
      });


      panel.add(TextBoxValorCombustible);

     //------------


      JButton button = new JButton("Calcular");
      button.setBounds(250 - 125, 400, 250, 35);

      button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
            
              double costolitro=0;
              double costototal=0;
              double costoyarda=0;
              String fixed="";
              double galones=0;
              double recorrido=0;
              double tanqueadas=0;
              double yardas=0;
              
              recorrido = Double.parseDouble(  TextBoxKilometros.getText() );
              
              costolitro = Double.parseDouble( TextBoxValorCombustible.getText() );
              galones = (recorrido*0.1498)*0.264172;
              costototal = costolitro*(recorrido*0.1498);
              yardas = recorrido*1093.61;
              costoyarda = (0.00013697712*yardas)*costolitro;
              tanqueadas = (recorrido*0.1498)/75.7082;
              JOptionPane.showMessageDialog(null,"---------------------"+" \nresultados obtenidos: "+" \nNumero de galones necesarios: "+galones+" \nCosto del combustible por "+recorrido+"km recorridos: "+costototal+" \nCosto total de cada yarda recorrida: "+fixed+costoyarda+" \nNumero de tanqueadas full que debe hacer: "+tanqueadas+" \nDebe tanquear full cada 1658120.71388 pies"+" \n---------------------");
            } catch (Exception e) {
                // resultado.setText("Error: "+e);
            }
        
        
        
          }
    });

      panel.add(button);

      
  
    };

    
    
}
