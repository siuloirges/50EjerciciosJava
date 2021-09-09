package Ejercicio9;


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

  ArrayList<Estudiante> estudiantes; 
  Map<String, Integer> ReportData;

  public Ventana2(){

    this.setSize(500,450);
    this.setTitle("Mazanas");

  }

  public void initView(){
    
    // for (Estudiante estudiante : estudiantes) {

        System.out.println(ReportData.get("barcelona"));
        System.out.println(ReportData.get("Real Madrid"));
        System.out.println(ReportData.get("ninguno"));
        System.out.println("porcentaje "+ReportData.get("barcelona")  );
        System.out.println("porcentaje "+ estudiantes.size()  );
        // System.out.println(  );
        // System.out.println(estudiante.getGenero());

    // }
    
           JScrollPane scrol = new JScrollPane() ;
           JPanel panel = new JPanel();
           panel.setLayout(null);

           int inicialLocation = 10;

           JLabel Title =  new JLabel();

           Title.setText("Estudiantes");
           Title.setBounds(0, inicialLocation, 170, 50);
           Title.setHorizontalAlignment(SwingConstants.CENTER);
           Title.setFont(new Font("arial",1,18));
           panel.add(Title);
           

           inicialLocation += 30;
           int i = 0;
           for (Estudiante estudiante : estudiantes) {

            inicialLocation += 20;
            i++;

            JLabel item =  new JLabel();

            item.setText("Persona #"+i);
            item.setBounds(0, inicialLocation, 150, 50);
            item.setHorizontalAlignment(SwingConstants.CENTER);
            item.setFont(new Font("arial",0,12));
            panel.add(item);
            
            ImageIcon imagen = new ImageIcon( "interfaces/Ejercicio9/assets/"+estudiante.getGenero()+".png" );
            JLabel ImagenContain =  new JLabel();

            inicialLocation += 40;
            ImagenContain.setBounds( 50, inicialLocation , 50, 50);
            ImagenContain.setIcon( new ImageIcon(imagen.getImage().getScaledInstance(ImagenContain.getWidth(), ImagenContain.getHeight(),  java.awt.Image.SCALE_SMOOTH )));
            panel.add(ImagenContain);

            ImageIcon imagen2 = new ImageIcon( "interfaces/Ejercicio9/assets/"+estudiante.getEquipo()+".png" );
            JLabel ImagenContain2 =  new JLabel();

            // inicialLocation += 40;
            ImagenContain2.setBounds( 150, inicialLocation , 50, 50);
            ImagenContain2.setIcon( new ImageIcon(imagen2.getImage().getScaledInstance(ImagenContain2.getWidth(), ImagenContain2.getHeight(),  java.awt.Image.SCALE_SMOOTH )));
            panel.add(ImagenContain2);
            
            inicialLocation += 50;


            JPanel divider = new JPanel();
            divider.setLayout(null);
            divider.setBounds( 249, 40 , 1, inicialLocation - 40);
            divider.setBackground(Color.gray);
 
            panel.add(divider);


            }     


            
            JLabel Title2 =  new JLabel();

           Title2.setText("Reporte");
           Title2.setBounds(0, 10, 650, 50);
           Title2.setHorizontalAlignment(SwingConstants.CENTER);
           Title2.setFont(new Font("arial",1,18));
           panel.add(Title2);

           int location = 0;

          //  for(i=0;i<=2;i++){

            location += 60;
        

            JLabel EquipoA =  new JLabel();

            EquipoA.setText( Math. round(( ((double) ReportData.get("barcelona") / estudiantes.size())*100 ) )+"%");
            EquipoA.setBounds(0, location, 740, 50);
            EquipoA.setHorizontalAlignment(SwingConstants.CENTER);
            EquipoA.setFont(new Font("arial",0,12));
            panel.add(EquipoA);
            
            ImageIcon imagen3 = new ImageIcon("/interfaces/Ejercicio9/assets/barcelona.png" );
            JLabel ImagenContain3 =  new JLabel();

            ImagenContain3.setBounds(300, location , 50, 50);
            ImagenContain3.setIcon( new ImageIcon(imagen3.getImage().getScaledInstance(ImagenContain3.getWidth(), ImagenContain3.getHeight(),  java.awt.Image.SCALE_SMOOTH )));
            panel.add(ImagenContain3);

            location += 60;

            JLabel EquipoB =  new JLabel();

            EquipoB.setText( (  Math. round(((double) ReportData.get("Real Madrid") / estudiantes.size())*100 )) +"%");
            EquipoB.setBounds(0, location, 740, 50);
            EquipoB.setHorizontalAlignment(SwingConstants.CENTER);
            EquipoB.setFont(new Font("arial",0,12));
            panel.add(EquipoB);
            
            ImageIcon imagen4 = new ImageIcon("/interfaces/Ejercicio9/assets/Real Madrid.png" );
            JLabel ImagenContain4 =  new JLabel();

            ImagenContain4.setBounds(300, location , 50, 50);
            ImagenContain4.setIcon( new ImageIcon(imagen4.getImage().getScaledInstance(ImagenContain4.getWidth(), ImagenContain4.getHeight(),  java.awt.Image.SCALE_SMOOTH )));
            panel.add(ImagenContain4);

            location += 80;

            JLabel EquipoNO =  new JLabel();

            EquipoNO.setText( (Math. round(((double) ReportData.get("ninguno") / estudiantes.size())*100 ))  +"%");
            EquipoNO.setBounds(0, location, 740, 50);
            EquipoNO.setHorizontalAlignment(SwingConstants.CENTER);
            EquipoNO.setFont(new Font("arial",0,12));
            panel.add(EquipoNO);
            
            ImageIcon imagen5 = new ImageIcon("/interfaces/Ejercicio9/assets/ninguno.png" );
            JLabel ImagenContain5 =  new JLabel();

            ImagenContain5.setBounds(300, location , 50, 50);
            ImagenContain5.setIcon( new ImageIcon(imagen5.getImage().getScaledInstance(ImagenContain5.getWidth(), ImagenContain5.getHeight(),  java.awt.Image.SCALE_SMOOTH )));
            panel.add(ImagenContain5);




            
 


          //  }

           panel.setPreferredSize(new Dimension(450,inicialLocation+20));
           
           scrol.setViewportView(panel);

           this.getContentPane().add(scrol);

  }


  public void setEstudiantes(ArrayList<Estudiante> list) {
      this.estudiantes = list;
  }

  public void setReportData(Map<String, Integer>  reportDados) {
      this.ReportData = reportDados;
  }

}
