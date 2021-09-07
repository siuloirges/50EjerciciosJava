package B_Ejercicios16.interfaces.ejercicio_interface_1;


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
// import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
// import javax.swing.border.Border;

public class Ventana2 extends JFrame{

  ArrayList<Dado> Dados; 
  Map<String, Integer> ReportDados;

  public Ventana2(){

    this.setSize(500,450);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    this.setTitle("Mazanas");

  }

  public void initView(){
    
  }


  public void setDados(ArrayList<Dado> dados) {
      this.Dados = dados;
  }

  public void setReportDados(Map<String, Integer> reportDados) {
      ReportDados = reportDados;
  }

}
