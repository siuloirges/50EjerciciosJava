package A_Ejercicios21.EjerciciosJOptionPane;
import java.io.*;
import javax.swing.JOptionPane;

public class ejercicio_9 {
	public static void main(String args[]) throws IOException {
	
		double cm;
		int edad;
		double metros;
		int metrosadc;
	
		edad = Integer.parseInt(JOptionPane.showInputDialog("Cuantos anios tiene usted?"));
		metrosadc = Integer.parseInt(JOptionPane.showInputDialog("hace cuantos meses cumplio: "+edad+" anios OJO!! si fue menos de un mes INGRESAR 0  "));
		metros = (((edad*360)/30+metrosadc)*4)*0.01;
		JOptionPane.showMessageDialog(null,"si usten nunca le a dado chamba al peluquero entonces su pelo mide: "+metros);
	}


}

