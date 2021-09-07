package A_Ejercicios21.EjerciciosJOptionPane;
import java.io.*;
import javax.swing.JOptionPane;

public class ejercicio_20 {

	public static void main(String args[]) throws IOException {
		
		double destino = 0;
		double pies = 0;
		
		destino = Double.parseDouble(JOptionPane.showInputDialog("Digite la distancia en pies: "));
		pies = destino/6561.68;
		JOptionPane.showMessageDialog(null,"para llegar a "+destino+" pies de distancia se demora "+pies+" minutos");
	}


}

