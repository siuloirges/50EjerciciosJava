package A_Ejercicios21.EjerciciosJOptionPane;
import java.io.*;
import javax.swing.JOptionPane;

public class ejercicio_12 {

	public static void main(String args[]) throws IOException {

		int edad;
		int iterador = 0;
		while (iterador==0) {
			
			edad = Integer.parseInt(JOptionPane.showInputDialog("Digite su edad"));
			switch (edad) {
			case 0: case 1: case 2: case 3: case 4: case 5:
				JOptionPane.showMessageDialog(null,"Primera Infancia");
				break;
			case 6: case 7: case 8: case 9: case 10: case 11:
				JOptionPane.showMessageDialog(null,"Infancia");
				break;
			case 12: case 13: case 14: case 15: case 16: case 17: case 18:
				JOptionPane.showMessageDialog(null,"Adolescencia");
				break;
			case 19: case 20: case 21: case 22: case 23: case 24: case 25: case 26:
				JOptionPane.showMessageDialog(null,"Juventud");
				break;
			case 27: case 28: case 29: case 30: case 31: case 32: case 33: case 34: case 35:
				JOptionPane.showMessageDialog(null,"Adulto");
				break;
			case 36: case 37: case 38: case 39: case 40: case 41: case 42: case 43: case 44: case 45: case 46: case 47: case 48: case 49: case 50:
				JOptionPane.showMessageDialog(null,"Adulto Maduro");
				break;
			default:
				JOptionPane.showMessageDialog(null,"Adulto Mayor");
			}
			
			iterador = Integer.parseInt(JOptionPane.showInputDialog("quiere volvel a probar? 0 = si / 1 = no"));
	
		}
	}


}

