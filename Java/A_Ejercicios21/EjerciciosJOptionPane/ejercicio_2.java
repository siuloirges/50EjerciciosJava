package A_Ejercicios21.EjerciciosJOptionPane;
import java.io.*;
import javax.swing.JOptionPane;

public class ejercicio_2 {

	public static void main(String args[]) throws IOException {
		// BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double a;
		double b;
		double c;
		double h;
		double m;
		double mm;
		
		h = Double.parseDouble(JOptionPane.showInputDialog("Digite la altura en milimentros" ));
		
		b = Double.parseDouble(JOptionPane.showInputDialog("Dijite la base en milimetros"));
		b = b*0.1;
		h = h*0.1;
		a = (b*h)/2;
		mm = a*10;
		m = a*0.01;
		JOptionPane.showMessageDialog(null,"Area en milimetros: "+mm+"\nArea en centimetros: "+a+"\nArea en metros: "+m);

	}


}

