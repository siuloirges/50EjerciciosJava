package Ejercicio9;

import java.security.SecureRandom;
import java.sql.Date;
import java.util.Calendar;
import java.util.Random;

public class Estudiante {

    String genero = "";
    String equipo = "";

   public Estudiante(){
     generarDatoAleatoreo();
   }


   public void generarDatoAleatoreo(){

    String[] equipos = new String[]{ "Real Madrid","barcelona","ninguno" }; 
    String[] generos = new String[]{ "Mujer","Hombre" }; 


    int min_val = 1;
    int max_val = 3;
    Calendar calendario = Calendar.getInstance();
    SecureRandom rand = new SecureRandom();
    rand.setSeed(calendario.get(Calendar.SECOND));
    int randomNum = rand.nextInt((max_val - min_val) + 1) + min_val;


     min_val = 1;
     max_val = 2;
    rand.setSeed(calendario.get(Calendar.SECOND));
    int randomNum2 = rand.nextInt((max_val - min_val) + 1) + min_val;
  
    this.equipo = equipos[randomNum-1];
    this.genero = generos[randomNum2-1];
   

   
   }

   public String getEquipo() {
       return  this.equipo;
   }

   public String getGenero() {
       return  this.genero;
   }


    
}
