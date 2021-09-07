package A_Ejercicios21.EjerciciosJOptionPane;

import java.io.*;
import javax.swing.JOptionPane;

public class ejercicio_21 {

	public static void main(String args[]) throws IOException {
	
		double anio = 0;
		int iterador = 0;
		while (iterador==0) {
			
			anio = Double.parseDouble(JOptionPane.showInputDialog("Digite el annio"));
			if ((anio%4==0 && anio%100!=0) || anio%400==0) {
				JOptionPane.showMessageDialog(null,"si es bisiesto");
			} else {
				JOptionPane.showMessageDialog(null,"no es bisiesto");
			}
			
		}
	}


}

