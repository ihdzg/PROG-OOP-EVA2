/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_has_a;

/**
 *
 * @author ihdzg
 */
public class EVA2_11_HAS_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Direccion direc = new Direccion ("Monte Encino", "ATENAS", 31146, "15502", "Chihuahua", "Chihuahua");
        Persona perso = new Persona( "Ivan", "Herandez", 18, direc);
        
        System.out.println(perso);
        
    }
    
}
