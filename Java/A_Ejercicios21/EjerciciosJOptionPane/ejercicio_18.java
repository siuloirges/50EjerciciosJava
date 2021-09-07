package A_Ejercicios21.EjerciciosJOptionPane;

import java.io.*;
import javax.swing.JOptionPane;

public class ejercicio_18 {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double costolitro=0;
		double costototal=0;
		double costoyarda=0;
		String fixed="";
		double galones=0;
		double recorrido=0;
		double tanqueadas=0;
		double yardas=0;
		
		recorrido = Double.parseDouble(JOptionPane.showInputDialog("Digite los kilometros recorridos"));
		
		costolitro = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de un litro de combustible"));
		galones = (recorrido*0.1498)*0.264172;
		costototal = costolitro*(recorrido*0.1498);
		yardas = recorrido*1093.61;
		costoyarda = (0.00013697712*yardas)*costolitro;
		tanqueadas = (recorrido*0.1498)/75.7082;
		JOptionPane.showMessageDialog(null,"---------------------"+" \nresultados obtenidos: "+" \nNumero de galones necesarios: "+galones+" \nCosto del combustible por "+recorrido+"km recorridos: "+costototal+" \nCosto total de cada yarda recorrida: "+fixed+costoyarda+" \nNumero de tanqueadas full que debe hacer: "+tanqueadas+" \nDebe tanquear full cada 1658120.71388 pies"+" \n---------------------");
	}


}

