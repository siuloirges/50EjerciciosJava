package A_Ejercicios21.EjerciciosJOptionPane;
import java.io.*;
import javax.swing.JOptionPane;

public class ejercicio_17 {

	public static void main(String args[]) throws IOException, InterruptedException {
		
		double aporeps = 0.0;
		double aporpension = 0.0;
		double bonificacion = 0.0;
		double diastrabajo = 0.0;
		double horasdominicfestdia = 0.0;
		double horasdominicfestnoct = 0.0;
		double horasnoct = 0.0;
		double horextradia = 0.0;
		double horextradomfesdia = 0.0;
		double horextradomfesnoct = 0.0;
		double horextranoct = 0.0;
		double i = 0.0;
		double i2 = 0.0;
		double i3 = 0.0;
		double i4 = 0.0;
		String jornada = "";
		String nombre = "";
		double saldiastrabjo = 0.0;
		double salhordominicfestdia = 0.0;
		double salhordominicfestnoct = 0.0;
		double salhorextradomfesdia = 0.0;
		double salhorextradomfesnoct = 0.0;
		double salhorextrdia = 0.0;
		double salhorextrnoct = 0.0;
		double salrecarnoct = 0.0;
		double smlvg = 0.0;
		double sueldo = 0.0;
		String tjornada = "";
		double totalauxtransp = 0.0;
		double totaldeduccion = 0.0;
		double totalsaldevengado = 0.0;
		double totalsalneto = 0.0;
		double totalsalrecargo = 0.0;
		String validarprestamo = "";
		double valorcuotaprestamo = 0.0;
		double valordia = 0.0;
		double valorhora = 0.0;
		// ENTRADA
		
		nombre = JOptionPane.showInputDialog("escriba el nombre del empleado");
		while (i==0) {
			
			jornada = JOptionPane.showInputDialog("Definir jornada de trabajo  C=jornada completa / M=jornada media");
			switch (jornada) {
			case "C": case "c": case "M": case "m":
				i = i+1;
				break;
			default:
				JOptionPane.showMessageDialog(null,"La respuesta debe ser C o M");
				i = 0;
			}
		}
		
		smlvg = Double.parseDouble(JOptionPane.showInputDialog("dijite el salario minimo legal vigente"));
		while (i3==0) {
			
			sueldo = Double.parseDouble(JOptionPane.showInputDialog("dijite el sueldo del empleado"));
			valordia = sueldo/30;
			switch (jornada) {
			case "c": case "C":
				if (sueldo>=smlvg) {
					i3 = i3+1;
					valorhora = valordia/8;
				} else {
					JOptionPane.showMessageDialog(null,"el sueldo no puede ser menor al salario minimo ");
					i3 = i3;
				}
				break;
			case "m": case "M":
				if (sueldo>=smlvg/2) {
					i3 = i3+1;
					valorhora = valordia/4;
				} else {
					JOptionPane.showMessageDialog(null,"el sueldo no puede ser menor a la mitad del salario minimo");
					i3 = 0;
				}
				break;
			default:
				i3 = 0;
			}
		}
		if (sueldo<smlvg*2) {
			totalauxtransp = (smlvg*10)/100;
		} else {
			totalauxtransp = 0;
		}
		// 
		diastrabajo = Double.parseDouble (JOptionPane.showInputDialog("Digite los dias que trabajo el empleado"));
		saldiastrabjo = valordia*diastrabajo;
		
		JOptionPane.showMessageDialog(null,"----------- Datos sobre Recargos extras-------------");
		
		horasnoct = Double.parseDouble (JOptionPane.showInputDialog("Digite las horas nocturnas "));
		salrecarnoct = (((valorhora*horasnoct)*35)/100+valorhora*horasnoct);
		
		horasdominicfestdia = Double.parseDouble (JOptionPane.showInputDialog("Digite las horas dominicales de dia que realizo el empleado"));
		salhordominicfestdia = (((valorhora*horasdominicfestdia)*75)/100+(valorhora*horasdominicfestdia));
		
		horasdominicfestnoct = Double.parseDouble (JOptionPane.showInputDialog("Digite las horas dominicales de noche que realizo el empleado"));
		salhordominicfestnoct = (((valorhora*horasdominicfestnoct)*110)/100+valorhora*horasdominicfestnoct);
		
		horextradia = Double.parseDouble (JOptionPane.showInputDialog("Digite las horas extras de dia que realizo el empleado"));
		salhorextrdia = (((valorhora*horextradia)*25)/100+valorhora*horextradia);
		
		horextranoct = Double.parseDouble (JOptionPane.showInputDialog("Digite las horas extras de noche que realizo el empleado"));
		salhorextrnoct = (((valorhora*horextranoct)*75)/100+valorhora*horextranoct);
		
		horextradomfesdia = Double.parseDouble (JOptionPane.showInputDialog("Digite las horas extras dominicales de dia que realizo el empleado "));
		salhorextradomfesdia = (valorhora*horextradomfesdia)*2;
		
		horextradomfesnoct = Double.parseDouble (JOptionPane.showInputDialog("Digite las horas extras dominicales de noche que realizo el empleado"));
		salhorextradomfesnoct = (((valorhora*horextradomfesnoct)*150)/100+valorhora*horextradomfesnoct);
		totalsalrecargo = totalauxtransp+salrecarnoct+salhordominicfestdia+salhordominicfestnoct+salhorextrdia+salhorextrnoct+salhorextradomfesdia+salhorextradomfesnoct;
		
		JOptionPane.showMessageDialog(null,"*-----------Fin de Recargos -------------*");
		
		totalsalneto = saldiastrabjo+totalsalrecargo;
		aporeps = (totalsalneto*4)/100;
		aporpension = aporeps;
		while (i4==0) {
			
			validarprestamo = JOptionPane.showInputDialog("El empleado cuenta con algun prestamo? y / n");
			switch (validarprestamo) {
			case "N": case "n":
				valorcuotaprestamo = 0;
				i4 = i4+1;
				break;
			case "Y": case "y":
				
				valorcuotaprestamo = Double.parseDouble (JOptionPane.showInputDialog("dijite el valor de la cuota"));
				i4 = i4+1;
				break;
			default:
				JOptionPane.showMessageDialog(null,"la respuesta debe ser y o n");
				i4 = 0;
			}
		}
		
		bonificacion = Double.parseDouble (JOptionPane.showInputDialog("Digite la bonficacion del empleado(si no tiene bonificacion poner 0)"));
		totaldeduccion = aporeps+aporpension+valorcuotaprestamo;
		totalsaldevengado = totalsalneto-totaldeduccion+bonificacion;
		
		JOptionPane.showMessageDialog(null,"     * Nombre del empleado: "+nombre+"\n   -   Sueldo base:  $"+sueldo+"\n     * Valor de dia:  $"+valordia+"\n     * Valor hora:  $"+valorhora+"\n     * Dias trabajados:"+diastrabajo+"\n     * Salario por dias trabajados:  $"+saldiastrabjo+"\n     * horas nocturnas: "+horasnoct+"\n     * salario por recargo nocturno:  $"+salrecarnoct+"\n     * Horas dominicales festivas dia: "+horasdominicfestdia+"\n     * Salario por Horas dominicales festivas dia:  $"+salhordominicfestdia+"\n     * Horas dominicales festivas noche: "+horasdominicfestnoct+"\n     * Salario por Horas dominicales festivas noche:  $"+salhordominicfestnoct+"\n     * Horas extras dia: "+horextradia+"\n     * Salario por horas Extras dia:  $"+salhorextrdia+"\n     * Horas extras noche:  "+horextranoct+"\n     * Salario por horas extra noche:  $"+salhorextrnoct+"\n     * Horas extras festivas dia:  "+horextradomfesdia+"\n     * Salario por horas extras festivas dia:  $"+salhorextradomfesdia+"\n     * Horas extras festivas noche:  "+horextradomfesnoct+"\n     * Salario por horas extras festivas noche:  $"+salhorextradomfesnoct+"\n     * Bonificaciones:  $"+bonificacion+"\n     * Total auxilio de transporte:  $"+totalauxtransp+"\n     * Total salario por recargo:  $"+totalsalrecargo+"\n     * Total Salario neto:  $"+totalsalneto);
		
		JOptionPane.showMessageDialog(null,"DEDUCCIONES --------"+"\n     * Aporte a EPS: $"+aporeps+"\n     * Aporte a Pension: $"+aporpension+"\n     * Cuota de prestamos: $"+valorcuotaprestamo+"\n     * Total Deducciones: -$"+totaldeduccion+"\n---------------------------------"+"\nTotal Salario devengado: $"+totalsaldevengado);
	}


}

