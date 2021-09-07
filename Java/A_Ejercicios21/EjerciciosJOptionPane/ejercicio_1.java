package A_Ejercicios21.EjerciciosJOptionPane;
import java.io.*;
import javax.swing.JOptionPane;

class ejercicio_1 {

	public static void main(String args[]) throws IOException {
		// BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		int edad;
		double estatura;
		String nom;
		nom = JOptionPane.showInputDialog("escriba su  nombre");
		// bufEntrada.readLine();
		
		edad = Integer.parseInt(JOptionPane.showInputDialog("dijite su edad")) ;
		
		estatura = Double.parseDouble(JOptionPane.showInputDialog("escriba su estatura"));
		JOptionPane.showMessageDialog(null,"Su nombre es: "+nom+"\n"+" Su edad es: "+edad+"\n estatura: "+estatura+" metros");
	}
}

