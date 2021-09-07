package A_Ejercicios21.EjerciciosJOptionPane;
import java.io.*;
import javax.swing.JOptionPane;

public class ejercicio_16 {

	public static void main(String args[]) throws IOException {
	
		double gramos=0;
		int iterador = 0;
		double kilovoltios=0;
		double naranjas=0;
		double naranjasvoltios=0;
		double voltios=0;
	
		kilovoltios = Double.parseDouble(JOptionPane.showInputDialog("Cuantos Kiloviltios requiere su sistema de iluminacion?"));
		voltios = kilovoltios/0.001;

		while ( iterador == 0 ) {
			if (naranjasvoltios<voltios) {
				naranjasvoltios = naranjasvoltios+0.05;
				naranjas = naranjas+1;
			} else {
				iterador = 1;
			}
		}

		gramos = naranjas*6;
		JOptionPane.showMessageDialog(null,"kilovoltios ingresados: "+kilovoltios+"\nSu equivalencia en voltios es: "+voltios+"\nEl numero de naranjas que necesita es: "+naranjas+"\nNecesita: "+gramos/907185+" Toneladas de naranja o "+gramos+" gramos de naranja"+"\nQue equivalen a: "+naranjasvoltios+" Voltios y "+naranjasvoltios*0.001+" kilovoltios");
	}


}

