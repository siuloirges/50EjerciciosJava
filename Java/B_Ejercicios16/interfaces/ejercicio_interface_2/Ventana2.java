package ejercicio_interface_2;


import java.awt.*;
import java.util.ArrayList;
import java.util.Map;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

public class Ventana2 extends JFrame{

  ArrayList<Dado> Dados; 
  Map<Integer, Integer> ReportData;

  public Ventana2(){

    this.setSize(500,450);
    this.setTitle("Mazanas");

  }

  public void initView(){
    
           JScrollPane scrol = new JScrollPane() ;
           JPanel panel = new JPanel();
           panel.setLayout(null);

           int inicialLocation = 10;

           JLabel Title =  new JLabel();

           Title.setText("Lanzamientos");
           Title.setBounds(0, inicialLocation, 170, 50);
           Title.setHorizontalAlignment(SwingConstants.CENTER);
           Title.setFont(new Font("arial",1,18));
           panel.add(Title);
           

           inicialLocation += 30;
           int i = 0;
           for (Dado dado : Dados) {

            inicialLocation += 20;
            i++;

            JLabel Dado =  new JLabel();

            Dado.setText("#"+i);
            Dado.setBounds(0, inicialLocation, 150, 50);
            Dado.setHorizontalAlignment(SwingConstants.CENTER);
            Dado.setFont(new Font("arial",0,12));
            panel.add(Dado);
            
            ImageIcon imagen = new ImageIcon(dado.getImagen());
            JLabel ImagenContain =  new JLabel();

            inicialLocation += 40;
            ImagenContain.setBounds( 50, inicialLocation , 50, 50);
            ImagenContain.setIcon( new ImageIcon(imagen.getImage().getScaledInstance(ImagenContain.getWidth(), ImagenContain.getHeight(),  java.awt.Image.SCALE_SMOOTH )));
            panel.add(ImagenContain);
            inicialLocation += 50;

           }

           JPanel divider = new JPanel();
           divider.setLayout(null);
           divider.setBounds( 249, 40 , 1, inicialLocation - 40);
           divider.setBackground(Color.gray);

           panel.add(divider);



           JLabel Title2 =  new JLabel();

           Title2.setText("Reporte");
           Title2.setBounds(0, 10, 650, 50);
           Title2.setHorizontalAlignment(SwingConstants.CENTER);
           Title2.setFont(new Font("arial",1,18));
           panel.add(Title2);
            
            int location = 0;

            for(i=0;i<=5;i++){

            location += 60;
        

            JLabel Dado =  new JLabel();

            Dado.setText(" = "+( ReportData.get( (i+1) ) == null ? 0 : ReportData.get( (i+1) )));
            Dado.setBounds(0, location, 740, 50);
            Dado.setHorizontalAlignment(SwingConstants.CENTER);
            Dado.setFont(new Font("arial",0,12));
            panel.add(Dado);
            
            ImageIcon imagen = new ImageIcon("assets/dado_"+(i+1)+".png");
            JLabel ImagenContain =  new JLabel();


            ImagenContain.setBounds(300, location , 50, 50);
            ImagenContain.setIcon( new ImageIcon(imagen.getImage().getScaledInstance(ImagenContain.getWidth(), ImagenContain.getHeight(),  java.awt.Image.SCALE_SMOOTH )));
            panel.add(ImagenContain);

            }              

           panel.setPreferredSize(new Dimension(450,inicialLocation+20));
           scrol.setViewportView(panel);

           this.getContentPane().add(scrol);

  }


  public void setDados(ArrayList<Dado> dados) {
      this.Dados = dados;
  }

  public void setReportData(Map<Integer, Integer>  reportDados) {
      this.ReportData = reportDados;
  }

}
