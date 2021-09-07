package A_Ejercicios21.EjerciciosJOptionPane;
import java.io.*;

import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;

 class ejercicio_11 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		String edad = "0" ;

		
		edad = JOptionPane.showInputDialog("Escriba su edad");

		JOptionPane.showMessageDialog(null,"annios: " + edad+"\nsiglos: "+ Integer.parseInt ( edad ) *0.01 +"\ndecadas: "+ Integer.parseInt ( edad ) *0.1+"\nsemestres: "+ Integer.parseInt ( edad ) *2+"\ntrimestres : "+ Integer.parseInt ( edad ) *4+"\nbimestres: "+ Integer.parseInt ( edad ) *6+"\nmeses: "+ Integer.parseInt ( edad ) *12+"\nQuinsenas: "+ Integer.parseInt ( edad ) *24+"\nsemana: "+ Integer.parseInt ( edad ) *52.143+"\nDias: "+ Integer.parseInt ( edad ) *365+"\nJornadas dia: "+( Integer.parseInt ( edad ) *365)/4+"\nJornadas noche: "+( Integer.parseInt ( edad ) *365)/4+"\nJornadas manana: "+( Integer.parseInt ( edad ) *365)/4+"\nJornadas tarde: "+( Integer.parseInt ( edad ) *365)/4+"\nHoras: "+ Integer.parseInt ( edad ) *8760+"\nMinutos: "+ Integer.parseInt ( edad ) *525600+"\nSegundos: "+ Integer.parseInt ( edad ) *3.154+"\nDomingos: "+ Integer.parseInt ( edad ) *52.143+"\nMili-segundos: "+ Integer.parseInt ( edad ) *3.154); 
	}


}

