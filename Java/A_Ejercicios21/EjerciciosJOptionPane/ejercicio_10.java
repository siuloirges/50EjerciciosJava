package A_Ejercicios21.EjerciciosJOptionPane;
import java.io.*;
import java.math.*;
import javax.swing.JOptionPane;

public class ejercicio_10 {

	public static void main(String args[]) throws IOException {
		// BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double cantidad = 0.0;
		int divisa1 = 0;
		int divisa2 = 0;
		int i = 0;
		int i2 = 0;
		double resultado = 0.0;
		String valdidacion = "";
		int validacion = 0;
		while ( i==0 ) {
			
			System.out.println("");
			divisa1 = Integer.parseInt(JOptionPane.showInputDialog("Escoja la moneda de origen (Peso= 1 , Dolar= 2 , Euro = 3) ") );
			System.out.println("");
			divisa2 = Integer.parseInt(JOptionPane.showInputDialog("Escoja la moneda de Salida (Peso= 1 , Dolar= 2 , Euro = 3) "));

			i2 = 0;
			switch (divisa1) {
			case 1:
				System.out.println("");
				cantidad = Double.parseDouble(JOptionPane.showInputDialog("Dijite la cantidad de Pesos colombianos"));
				switch (divisa2) {
				case 1:

				    //   System.out.println();
				      JOptionPane.showMessageDialog(null,"al convertir de peso a peso estas obteniendo el mismo valor:  $"+cantidad);
					break;
				case 2:
					resultado = cantidad*0.000276;
					// System.out.println("");
					// System.out.println();
					JOptionPane.showMessageDialog(null,"Resultado: $"+cantidad+" Pesos colombianos equivalen a "+resultado+" dolar");
					break;
				case 3:
					resultado = cantidad*0.0002272;
					// System.out.println("Resultado: $"+cantidad+" Pesos colombianos equivalen a "+resultado+" Euros");
					JOptionPane.showMessageDialog(null,"Resultado: $"+cantidad+" Pesos colombianos equivalen a "+resultado+" Euros");
					break;
				default:
				    // System.out.println("Las opciones de origen y salida debian ser valores entre 1 , 2 y 3");
			     	JOptionPane.showMessageDialog(null,"Las opciones de origen y salida debian ser valores entre 1 , 2 y 3");
				}
				break;
			case 2:
				// System.out.println("");
				cantidad = Double.parseDouble(JOptionPane.showInputDialog("Dijite la cantidad de Dolares"));
				switch (divisa2) {
				case 1:
					resultado = cantidad*3646.5237;
					// System.out.println("Resultado: $"+cantidad+" Dolar equivalen a "+Math.round(resultado)+" Pesos colombianos");
					JOptionPane.showMessageDialog(null,"Resultado: $"+cantidad+" Dolar equivalen a "+Math.round(resultado)+" Pesos colombianos");
					break;
				case 2:
					// System.out.println("al convertir de dolar a dolar estas obteniendo el mismo valor:  $"+cantidad);
					JOptionPane.showMessageDialog(null,"al convertir de dolar a dolar estas obteniendo el mismo valor:  $"+cantidad);
					break;
				case 3:
					resultado = cantidad*0.828356;
					// System.out.println("Resultado: $"+cantidad+" Dolar equivalen a "+resultado+" Euro");
					JOptionPane.showMessageDialog(null,"Resultado: $"+cantidad+" Dolar equivalen a "+resultado+" Euro");
					break;
				default:
					// System.out.println();
					JOptionPane.showMessageDialog(null,"Las opciones de origen y salida debian ser valores entre 1 , 2 y 3");
				}
				break;
			case 3: 
				System.out.println("");
				cantidad = Double.parseDouble(JOptionPane.showInputDialog("Dijite la cantidad de Euros"));
				switch (divisa2) {
				case 1:
					resultado = cantidad*4402.691;
					// System.out.println("Resultado: $"+cantidad+" Euros equivalen a "+resultado+" pesos colombianos");
					JOptionPane.showMessageDialog(null,"Resultado: $"+cantidad+" Euros equivalen a "+resultado+" pesos colombianos");
					break;
				case 2:
					resultado = cantidad*1.20744;
					// System.out.println("Resultado: $"+cantidad+" Euros equivalen a "+resultado+" dolar");
					JOptionPane.showMessageDialog(null,"Resultado: $"+cantidad+" Euros equivalen a "+resultado+" dolar");
					break;
				case 3:
					// System.out.println("al convertir de euro a euro estas obteniendo el mismo valor:  $"+cantidad");
					JOptionPane.showMessageDialog(null,"al convertir de dolar a dolar estas obteniendo el mismo valor:  $"+cantidad);
					break;
				default:
					// System.out.println("Las opciones de origen y salida debian ser valores entre 1 , 2 y 3");
					JOptionPane.showMessageDialog(null,"Las opciones de origen y salida debian ser valores entre 1 , 2 y 3");

				}
				break;
			default:
				// System.out.println("Las opciones de origen y salida debian ser valores entre 1 , 2 y 3");
				JOptionPane.showMessageDialog(null,"Las opciones de origen y salida debian ser valores entre 1 , 2 y 3");
			}

			while ( i2 == 0 ) {

				// System.out.println("Desea realizar una nueva conversion? 1 = no / 0 = si ");
				 validacion = Integer.parseInt(JOptionPane.showInputDialog("Desea realizar una nueva conversion? 1 = no / 0 = si ")) ;
				//  String v = JOptionPane.showInputDialog("Desea realizar una nueva conversion? 1 = no / 0 = si ") ;
				if (validacion == 0){
					i = i;
					i2 = i+1;
				
				}else if (validacion == 1){
					i = i+1;
					i2 = i2+1;
				}else{
					i2 = i2;
				
					JOptionPane.showMessageDialog(null,"la respuesta debe ser 1 o 0 ");
				}
		        		
		        
					
				
			}

		}
	}


}

