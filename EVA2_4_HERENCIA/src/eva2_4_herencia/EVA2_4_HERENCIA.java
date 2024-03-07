/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_herencia;

/**
 *
 * @author ihdzg
 */
public class EVA2_4_HERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona perso = new Persona();
        perso.getNombre();
        
        Estudiante estu = new Estudiante();
        System.out.println("Nombre: " + estu.getNombre());
        System.out.println("Apellidosa: " + estu.getApellidos());
        System.out.println("Edad: " + estu.getEdad());
        
    }      
 }


  class Persona{
     private String nombre;
     private String apellidos;
     private int edad;
     
     public Persona(){
         this.nombre = "SIN NOIMBRE";
        this.apellidos = "SIN APELLIDOS";
        this.edad = 0;
     }

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}

class Estudiante extends Persona{
    private String noControl;
    
    
}