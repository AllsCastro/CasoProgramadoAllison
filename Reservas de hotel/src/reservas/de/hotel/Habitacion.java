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
//La informacion de las habitaciones que va querer
public class Habitacion {
    int numero;
    String tipo; 
    double precio;
    String estado;
    
    
   public Habitacion (int numero, String tipo, double precio, String estado) {
    this.numero=numero; 
    this.tipo=tipo; 
    this.precio=precio;
    this.estado=estado;
   }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
  

    @Override
    public String toString() {
        return "Informacion{" + "Numero=" + numero + ", Tipo=" + tipo + ", Precio=" + precio + ", Estado=" + estado + '}';
    }

    String getInfo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}


