/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_11_has_a;

/**
 *
 * @author ihdzg
 */
public class Persona {
    private String nombre;
    private String ap;
    private int edad;
    private Direccion direccion;

    public Persona() {
        this.nombre = " ";
        this.ap = " ";
        this.edad = 0;
        
    }

    public Persona(String nombre, String ap, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.ap = ap;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAp() {
        return ap;
    }

    public void setAp(String ap) {
        this.ap = ap;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    
    
    @Override
    public String toString(){
        String cade = "Nombre: " + nombre + "\n" + 
                      "Apellido: " + ap + "\n" +
                      "Edad: " + edad + "\n" +
                      "Direccion ------ " + "\n" + direccion;
        return cade;
    }
  
}

