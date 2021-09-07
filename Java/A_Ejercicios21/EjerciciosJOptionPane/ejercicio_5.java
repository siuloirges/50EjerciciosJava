package A_Ejercicios21.EjerciciosJOptionPane;

import java.io.*;
import javax.swing.JOptionPane;
public class ejercicio_5 {

	public static void main(String args[]) throws IOException {
	
		double a;
		double b;
		double c;
		double cm;
		double h;
		double mm;
		
		h = Double.parseDouble(JOptionPane.showInputDialog("Digite la altura en metros"));
	
		b = Double.parseDouble(	JOptionPane.showInputDialog("Digite la base en metros") );
		a = (b*h);
		mm = a*1000;
		cm = a*100;
		JOptionPane.showMessageDialog(null,"Area en milimetros cuadrados es: "+String.valueOf(mm)+"\n Aea en centimetros cuadrados es: "+String.valueOf(cm)+"\n Area en metros cuadrados es: "+String.valueOf(a));
	}


}

