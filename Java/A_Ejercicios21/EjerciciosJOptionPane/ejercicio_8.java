package A_Ejercicios21.EjerciciosJOptionPane;
import java.io.*;
import java.math.*;
import javax.swing.JOptionPane;

public class ejercicio_8 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double cm;
		double m;
		double milla;
		double mm;
		double pie;
		double pulg;
		double yarda;
		
		cm = Double.parseDouble(JOptionPane.showInputDialog("dijite los centimetros"));
		mm = cm*10;
		pulg = cm/2.54;
		pie = cm*0.0328084;
		m = cm*0.01;
		yarda = cm*0.0109361;
		milla = (m*0.001)*0.621371;
		
		JOptionPane.showMessageDialog(null,Math.floor(mm)+"."+Math.floor((mm-Math.floor(mm))*100)+" MILIMETROS\n"+Math.floor(pulg)+"."+Math.floor((pulg-Math.floor(pulg))*100)+" PULGADAS\n"+Math.floor(pie)+"."+Math.floor((pie-Math.floor(pie))*100)+" PIES\n"+Math.floor(m)+"."+Math.floor((m-Math.floor(m))*100)+" METROS \n"+Math.floor(yarda)+"."+Math.floor((yarda-Math.floor(yarda))*100)+" YARDAS\n"+milla+" MILLAS.");
	}


}

