package A_Ejercicios21.EjerciciosJOptionPane;
import java.io.*;
import javax.swing.JOptionPane;

public class ejercicio_7 {

	public static void main(String args[]) throws IOException {
		
		double cg;
		double dag;
		double dg;
		double g;
		double hg;
		double kg;
		double lb;
		double mg;
		double onza;
		double t;
	
		g = Double.parseDouble(	JOptionPane.showInputDialog(null,"DIGITA LA CANTIDAD EN GRAMOS"));
		mg = g*1000;
		hg = g*0.01;
		kg = g*0.001;
		dg = g*10;
		cg = g*100;
		lb = g*0.00220462;
		dag = g*0.1;
		t = kg*0.001;
		onza = kg*35.274;
		JOptionPane.showMessageDialog(null,mg+" miligramos\n"+hg+" hectogramos\n"+kg+" kilogramos\n"+dg+" decigramos\n"+cg+" centigramos\n"+lb+" libras metricas\n"+dag+" decagramos\n"+t+" toneladas\n"+onza+" onzas");
	}


}

