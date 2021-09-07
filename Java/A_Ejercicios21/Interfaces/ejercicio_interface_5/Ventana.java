package A_Ejercicios21.Interfaces.ejercicio_interface_5;


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
      panel.setLayout(null);

      this.getContentPane().add(panel);
      

      ImageIcon imagen = new ImageIcon("A_Ejercicios21/Interfaces/ejercicio_interface_5/assets/equivalencia.png");
      JLabel ImagenContain =  new JLabel();

      ImagenContain.setBounds( 250 - 60  , 10, 120, 156);
      ImagenContain.setIcon( new ImageIcon(imagen.getImage().getScaledInstance(ImagenContain.getWidth(), ImagenContain.getHeight(),  java.awt.Image.SCALE_SMOOTH )));

      panel.add(ImagenContain);
  
      JLabel title =  new JLabel();

      title.setText("Triangulo");
      title.setBounds(0, 150, 500, 50);
      title.setHorizontalAlignment(SwingConstants.CENTER);
      title.setFont(new Font("arial",1,40));

      panel.add(title);


      JLabel description =  new JLabel();

      description.setText("Calcula");
      description.setBounds(0, 185, 500, 50);
      description.setHorizontalAlignment(SwingConstants.CENTER);
      description.setFont(new Font("arial",0,12));

      panel.add(description);


      JLabel labelAltura =  new JLabel();

      labelAltura.setText("Digite la altura en metros");
      labelAltura.setBounds(0, 235, 420, 50);
      labelAltura.setHorizontalAlignment(SwingConstants.CENTER);

      labelAltura.setFont(new Font("arial",1,14));
      panel.add(labelAltura);

      JTextField TextBoxAltura = new JTextField();
      TextBoxAltura.setBounds(250 - 125, 275, 250, 35);
      TextBoxAltura.addKeyListener( new KeyAdapter(){

        public void keyTyped(KeyEvent evt) {
            char caracter = evt.getKeyChar();
    
            if (((caracter < '0') || (caracter > '9')) && (caracter != '.')
                    && (caracter != '\b' /* corresponde a BACK_SPACE */)) {
                evt.consume(); 
            }
        }
      });
      panel.add(TextBoxAltura);

      //--------------

      JLabel labelBase =  new JLabel();

      labelBase.setText("Digite la base en metros");
      labelBase.setBounds(0, 305, 420, 50);
      labelBase.setHorizontalAlignment(SwingConstants.CENTER);

      labelBase.setFont(new Font("arial",1,14));
      panel.add(labelBase);

      JTextField TextBoxBase = new JTextField();
      TextBoxBase.setBounds(250 - 125, 345, 250, 35);
      TextBoxBase.addKeyListener( new KeyAdapter(){

        public void keyTyped(KeyEvent evt) {
            char caracter = evt.getKeyChar();
    
            if (((caracter < '0') || (caracter > '9')) && (caracter != '.')
                    && (caracter != '\b' /* corresponde a BACK_SPACE */)) {
                evt.consume(); 
            }
        }
      });


      panel.add(TextBoxBase);

     //------------


      JButton button = new JButton("Calcular");
      button.setBounds(250 - 125, 400, 250, 35);

      button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
            
              double a;
              double b;
              double c;
              double cm;
              double h;
              double mm;
              
              h = Double.parseDouble( TextBoxAltura.getText() );
            
              b = Double.parseDouble(	TextBoxBase.getText() );
              a = (b*h);
              mm = a*1000;
              cm = a*100;
              JOptionPane.showMessageDialog(null,"Area en milimetros cuadrados es: "+String.valueOf(mm)+"\n Aea en centimetros cuadrados es: "+String.valueOf(cm)+"\n Area en metros cuadrados es: "+String.valueOf(a));
         
            } catch (Exception e) {
                // resultado.setText("Error: "+e);
            }
        
        
        
          }
    });

      panel.add(button);

      
  
    };

    
    
}
