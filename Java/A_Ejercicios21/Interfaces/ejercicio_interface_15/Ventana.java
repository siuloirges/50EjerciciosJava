package A_Ejercicios21.Interfaces.ejercicio_interface_15;


import java.awt.*;
import java.awt.event.*;
// import javax.swing.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

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
      

      ImageIcon imagen = new ImageIcon("A_Ejercicios21/Interfaces/ejercicio_interface_15/assets/money.png");
      JLabel ImagenContain =  new JLabel();

      ImagenContain.setBounds( 250 - 65  , 10, 130, 130);
      ImagenContain.setIcon( new ImageIcon(imagen.getImage().getScaledInstance(ImagenContain.getWidth(), ImagenContain.getHeight(),  java.awt.Image.SCALE_SMOOTH )));

      panel.add(ImagenContain);

      JLabel title =  new JLabel();

      title.setText("Oro");
      title.setBounds(0, 150, 500, 50);
      title.setHorizontalAlignment(SwingConstants.CENTER);
      title.setFont(new Font("arial",1,40));

      panel.add(title);

      JLabel description =  new JLabel();

      description.setText("Consulta ");
      description.setBounds(0, 185, 500, 50);
      description.setHorizontalAlignment(SwingConstants.CENTER);
      description.setFont(new Font("arial",0,12));

      panel.add(description);

      JLabel labelPrecio =  new JLabel();

      labelPrecio.setText("Digite el precio de la onza actual en COP");
      labelPrecio.setBounds(0, 235, 475, 50);
      labelPrecio.setHorizontalAlignment(SwingConstants.CENTER);

      labelPrecio.setFont(new Font("arial",1,12));
      panel.add(labelPrecio);

      JTextField TextBoxPrecio = new JTextField();
      TextBoxPrecio.setBounds(250 - 125, 275, 250, 35);
      TextBoxPrecio.addKeyListener( new KeyAdapter(){

        public void keyTyped(KeyEvent evt) {
            char caracter = evt.getKeyChar();
    
            if (((caracter < '0') || (caracter > '9')) && (caracter != '.')
                    && (caracter != '\b' /* corresponde a BACK_SPACE */)) {
                evt.consume(); 
            }
        }
      });
      panel.add(TextBoxPrecio);


      JLabel labelCantidad =  new JLabel();

      labelCantidad.setText("Digite la cantidad de oro en kilos que desea consultar");
      labelCantidad.setBounds(0, 305, 550, 50);
      labelCantidad.setHorizontalAlignment(SwingConstants.CENTER);
      labelCantidad.setFont(new Font("arial",1,12));
      panel.add(labelCantidad);

      JTextField TextBoxCantidad = new JTextField();
      TextBoxCantidad.setBounds(250 - 125, 345, 250, 35);
      TextBoxCantidad.addKeyListener( new KeyAdapter(){

        public void keyTyped(KeyEvent evt) {
            char caracter = evt.getKeyChar();
    
            if (((caracter < '0') || (caracter > '9')) && (caracter != '.')
                    && (caracter != '\b' /* corresponde a BACK_SPACE */)) {
                evt.consume(); 
            }
        }
      });


      panel.add(TextBoxCantidad);

      JButton button = new JButton("Calcular");
      button.setBounds(250 - 125, 400, 250, 35);

      button.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent evento) {
            try {
            
              double kilos;
              double onza;
              double valoronzacop;
              
              valoronzacop = Double.parseDouble(TextBoxPrecio.getText());
            
              kilos = Double.parseDouble(	TextBoxCantidad.getText() );
              onza = kilos*valoronzacop;
              JOptionPane.showMessageDialog(null,kilos+" Kilos son: $"+String.valueOf(onza)+" COP");

            } catch (Exception e) {
                // resultado.setText("Error: "+e);
            }
        
          }
    });

      panel.add(button);
  
    };

    
    
}
