package A_Ejercicios21.EjerciciosJOptionPane;
import java.io.*;
import javax.swing.JOptionPane;

public class ejercicio_6 {

	public static void main(String args[]) throws IOException, InterruptedException {

		int msj;
		int n1;
		int n2;
		int n3;
		int orden;
		// n1n2n3 n1n3n2 n2n1n3 n2n3n1 n3n1n2 n3n2n1
		JOptionPane.showMessageDialog(null,"escriba 3 numeros diferentes");

	
		n1 = Integer.parseInt( JOptionPane.showInputDialog( "escriba el numero 1") );
	
		n2 = Integer.parseInt(JOptionPane.showInputDialog("escriba el numero 2"));
		
		n3 = Integer.parseInt(JOptionPane.showInputDialog("escriba el numero 3"));

		if (n1==n2 && n2==n3) {
			orden = 1;
		} else {
			if (n1>=n2 && n2>=n3) {
				orden = 2;
			} else {
				if (n1>=n3 && n3>=n2) {
					orden = 3;
				} else {
					if (n2>=n1 && n1>=n3) {
						orden = 4;
					} else {
						if (n2>=n3 && n3>=n1) {
							orden = 5;
						} else {
							if (n3>=n1 && n1>=n2) {
								orden = 6;
							} else {
								if (n3>=n2 && n2>=n1) {
									orden = 7;
								} else {
									orden = 8;
								}
							}
						}
					}
				}
			}
		}
		if (orden==1) {
			JOptionPane.showMessageDialog(null,"Error Bi Bra!!!");
		}
		if (orden==2) {
			JOptionPane.showMessageDialog(null,"el orden descendente  es: "+n1+", "+n2+", "+n3);
		}
		if (orden==3) {
			JOptionPane.showMessageDialog(null,"el orden descendente  es:  "+n1+", "+n3+", "+n2);
		}
		if (orden==4) {
			JOptionPane.showMessageDialog(null,"el orden descendente  es:  "+n2+", "+n1+", "+n3);
		}
		if (orden==5) {
			JOptionPane.showMessageDialog(null,"el orden descendente  es:  "+n2+", "+n3+", "+n1);
		}
		if (orden==6) {
			JOptionPane.showMessageDialog(null,"el orden descendente  es:  "+n3+", "+n1+", "+n2);
		}
		if (orden==7) {
			JOptionPane.showMessageDialog(null,"el orden descendente  es:  "+n3+", "+n2+", "+n1);
		}
	}


}

