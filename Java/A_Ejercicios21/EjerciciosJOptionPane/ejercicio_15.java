package A_Ejercicios21.EjerciciosJOptionPane;

import java.io.*;
import javax.swing.JOptionPane;

public class ejercicio_15 {

	public static void main(String args[]) throws IOException {

		double kilos;
		double onza;
		double valoronzacop;
		
		valoronzacop = Double.parseDouble(JOptionPane.showInputDialog("Digite el precio de la onza actual en COP"));
	
		kilos = Double.parseDouble(	JOptionPane.showInputDialog("Digite la cantidad de oro en kilos que desea consultar") );
		onza = kilos*valoronzacop;
		JOptionPane.showMessageDialog(null,kilos+" Kilos son: $"+String.valueOf(onza)+" COP");
	}


}

