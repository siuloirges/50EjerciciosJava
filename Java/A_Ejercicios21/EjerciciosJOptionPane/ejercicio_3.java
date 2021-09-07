package A_Ejercicios21.EjerciciosJOptionPane;

import java.io.*;
import javax.swing.JOptionPane;

public class ejercicio_3 {

	public static void main(String args[]) throws IOException {

		int edad;
		int g;
		int kg;
		int manzanas;
	
		edad = Integer.parseInt(JOptionPane.showInputDialog("Dijite su edad"));
		kg = edad*8;
		g = kg*1000;
		manzanas = (g/4);
		JOptionPane.showMessageDialog(null,"Usted consumio aproximadamente "+g+"gr de frutas, lo que equivale "+manzanas+" manzanas.");

	}


}
