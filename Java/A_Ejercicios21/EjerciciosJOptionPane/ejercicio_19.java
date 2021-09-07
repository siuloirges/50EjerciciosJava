package A_Ejercicios21.EjerciciosJOptionPane;
import java.io.*;
import javax.swing.JOptionPane;

public class ejercicio_19 {

	public static void main(String args[]) throws IOException {
	
		double precio = 0;
	
		precio = Double.parseDouble(JOptionPane.showInputDialog("Digite el precio de un block"));
		JOptionPane.showMessageDialog(null,"Para construir una casa con 4 paredes de 7 metros cuadrados cada uno se necesitan "+(4*7)*13+" blocks."+"\n"+"El precio total de "+(4*7)*13+" blocks es: $"+((4*7)*13)*precio);
		
	}


}

