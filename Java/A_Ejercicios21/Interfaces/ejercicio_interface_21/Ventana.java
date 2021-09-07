package A_Ejercicios21.Interfaces.ejercicio_interface_21;


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

    this.setSize(500,500);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setTitle("Mazanas");
    initComponet();

  }

  private void initComponet(){
      JPanel panel = new JPanel();
      // panel.setBackground(Color.gray);
      panel.setLayout(null);

      this.getContentPane().add(panel);
      

      ImageIcon imagen = new ImageIcon("A_Ejercicios21/Interfaces/ejercicio_interface_21/assets/ano-nuevo.png");
      JLabel ImagenContain =  new JLabel();

      ImagenContain.setBounds( 250 - 65  , 10, 130, 130);
      ImagenContain.setIcon( new ImageIcon(imagen.getImage().getScaledInstance(ImagenContain.getWidth(), ImagenContain.getHeight(),  java.awt.Image.SCALE_SMOOTH )));

      panel.add(ImagenContain);
  
      JLabel title =  new JLabel();

      title.setText("Año");
      title.setBounds(0, 150, 500, 50);
      title.setHorizontalAlignment(SwingConstants.CENTER);

      title.setFont(new Font("arial",1,40));

      panel.add(title);


      JLabel description =  new JLabel();

      description.setText("Consulta si un año es bisiesto o no");
      description.setBounds(0, 185, 500, 50);
      description.setHorizontalAlignment(SwingConstants.CENTER);

      description.setFont(new Font("arial",0,12));

      panel.add(description);





      JLabel labelAnnio =  new JLabel();

      labelAnnio.setText("Digite el annio");
      labelAnnio.setBounds(0, 235, 475, 50);
      labelAnnio.setHorizontalAlignment(SwingConstants.CENTER);

      labelAnnio.setFont(new Font("arial",1,12));
      panel.add(labelAnnio);

      JTextField TextBoxAnnio = new JTextField();
      TextBoxAnnio.setBounds(250 - 125, 275, 250, 35);
      TextBoxAnnio.addKeyListener( new KeyAdapter(){

        public void keyTyped(KeyEvent evt) {
            char caracter = evt.getKeyChar();
    
            if (((caracter < '0') || (caracter > '9')) && (caracter != '.')
                    && (caracter != '\b' /* corresponde a BACK_SPACE */)) {
                evt.consume(); 
            }
        }
      });
      panel.add(TextBoxAnnio);




      JButton button = new JButton("Calcular");
      button.setBounds(250 - 125, 325, 250, 35);

      button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
            
              double anio = Double.parseDouble(TextBoxAnnio.getText());
              if ((anio%4==0 && anio%100!=0) || anio%400==0) {
                JOptionPane.showMessageDialog(null,"si es bisiesto");
              } else {
                JOptionPane.showMessageDialog(null,"no es bisiesto");
              }

            } catch (Exception e) {
                // resultado.setText("Error: "+e);
            }
        
        
        
          }
    });

      panel.add(button);

      
  
    };

    
    
}
