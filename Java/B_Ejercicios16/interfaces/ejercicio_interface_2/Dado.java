package ejercicio_interface_2;

import java.security.SecureRandom;
// import java.sql.Date;
import java.util.Calendar;
// import java.util.Random;

public class Dado {

    String imagen = "";
    int valor = 0;

   public Dado(){
     lanzarDado();

     
   }


   public int lanzarDado(){

    Calendar calendario = Calendar.getInstance();

    int min_val = 1;
    int max_val = 6;
    SecureRandom rand = new SecureRandom();
    rand.setSeed(calendario.get(Calendar.SECOND));
    int randomNum = rand.nextInt((max_val - min_val) + 1) + min_val;
    this.valor = randomNum;
    this.imagen = "assets/dado_"+this.valor+".png";

    return randomNum;
   
   }

   public int getValor() {
       return valor;
   }

   public void setImagen(String imagen) {
       this.imagen = imagen;
   }
  
   public String getImagen() {
       return imagen;
   }
    
}
