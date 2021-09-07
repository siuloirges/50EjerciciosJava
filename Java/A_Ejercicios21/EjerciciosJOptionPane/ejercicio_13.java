package A_Ejercicios21.EjerciciosJOptionPane;
import java.io.*;
import java.math.*;
import javax.swing.JOptionPane;

public class ejercicio_13 {

public static void main(String args[]) throws IOException {
	
		double altura = 0.0;
		double combercion = 0.0;
		double final1 = 0.0;
		double peso = 0.0;
		
		peso = Double.parseDouble(JOptionPane.showInputDialog("Digite su peso en kg"));
		
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite su altura en Metros"));
		
		combercion = Math.pow(altura,2);
		final1 =Math.floor(peso/combercion);

		switch ( (int)final1 ) {
		case 0: case 1: case 2: case 3: case 4: case 5: case 6: case 7: case 8: case 9: case 10: case 11: case 12: case 13: case 14: case 15: case 16: case 18:
			JOptionPane.showMessageDialog(null,"Su IMC es: "+ String.valueOf(final1)+"\n // Delgadez o bajo peso o desnutrido");
			break;
		case 19: case 20: case 21: case 22: case 23: case 24:
			JOptionPane.showMessageDialog(null,"Su IMC es: "+ String.valueOf(final1)+"\n // Normal");
			break;
		case 25: case 26: case 27: case 28: case 29:
			JOptionPane.showMessageDialog(null,"Su IMC es: "+ String.valueOf(final1)+"\n // Peso superior al normal");
			break;
		default:
			JOptionPane.showMessageDialog(null,"Su IMC es: "+ String.valueOf(final1)+"\n // Obesidad");
		}
	}


}

