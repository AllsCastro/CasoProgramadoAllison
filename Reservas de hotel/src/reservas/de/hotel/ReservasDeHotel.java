/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reservas.de.hotel;
import javax.swing.JOptionPane;
/**
 *
 * @author allis
 */
public class ReservasDeHotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hotel hotel=new Hotel(3, 4); 
        
        String[]opciones={"Ver Habitaciones","Reservar habitacion","Salir"};
        int opcion;
        
        do{
            opcion= JOptionPane.showOptionDialog(null,
                    "Seleccione una opcion",
                    "Sistema de reservaciones del Hotel",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.INFORMATION_MESSAGE,
            null,
            opciones,
            opciones[0]);
            
    switch (opcion){
        case 0:
            JOptionPane.showMessageDialog(null, hotel.mostrarHabitaciones());
            break;
        case 1:
            String input= JOptionPane.showInputDialog("Ingrese el numero de habitacion a reservar:");
           if (input !=null){
               try {
                   int numero= Integer.parseInt(input);
                   String resultado= hotel.reservarHabitacion(numero);
                   JOptionPane.showMessageDialog(null, resultado); }
               catch (NumberFormatException e){
                   JOptionPane.showMessageDialog(null, "Por favor ingrese un numero valido");
               }
           }
           break;
        case 2:
            JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
            break;
    }
    
        } 
        while(opcion !=2);
        }
        }
            
    

            
          
    

