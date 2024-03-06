/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_vehiculo;

/**
 *
 * @author ihdzg
 */
public class EVA2_3_VEHICULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Vehiculo carrito = new Vehiculo();
        carrito.imptrimirDatos();
        
        Vehiculo carrillo = new Vehiculo("Chevrolet", "Camaro", "Rojo", 2017);
        carrillo.imptrimirDatos();
    }
    
}
