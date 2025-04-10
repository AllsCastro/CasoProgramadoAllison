/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reservas.de.hotel;
import javax.swing.JOptionPane;
/**
 *
 * @author allis
 */

public class Hotel {
   Habitacion[][] habitaciones;
   int pisos;
   int habitacionesporpiso;
   
  public Hotel (int pisos, int habitacionesporpiso){
      this.pisos=pisos;
      this.habitacionesporpiso= habitacionesporpiso;
      habitaciones = new Habitacion [pisos][habitacionesporpiso];
      precargarHabitaciones();     
  }

    private void precargarHabitaciones() {
        int numero=1;
        for (int i=0; i < pisos; i++) {
          for(int j = 0; j < habitacionesporpiso; j++){
           String tipo= (j % 2 == 0) ? "Simple" : "Doble";
           double precio= (tipo.equals("Simple")) ? 10000.0 : 20000.0;
           habitaciones[i][j]=new Habitacion(numero, tipo, precio, "libre");
           numero++;
        }
        }
    }
  
    public String mostrarHabitaciones(){
     String resultado = "";
       for(int i= 0; i< pisos; i++) {
           for(int j = 0; j < habitacionesporpiso; j++) {
            resultado += habitaciones[i][j].getInfo()+ "\n";
           }
       }
       return resultado;
   }
   public String reservarHabitacion(int numero){
       for(int i= 0; i< pisos; i++){
         for(int j= 0; j < habitacionesporpiso; j++){
           if(habitaciones[i][j].numero == numero){
               if(habitaciones[i][j].estado.equals("libre")){
                   habitaciones[i][j].estado= "ocupada";
                   return "Reserva realiazada con éxito.";
               } else{
                  return "La habitacion no esta disponible:";
               }
              }
             }
       
       }
       return null;
   }
}