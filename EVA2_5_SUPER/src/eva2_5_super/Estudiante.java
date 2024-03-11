/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_5_super;

/**
 *
 * @author ihdzg
 */

//           Hija       de      Padre
//           Subclase   de      Sucerclase
public class Estudiante extends Persona {
    private String noControl;
    private String carrera;

    public Estudiante() {
        super(); //LLAMADA AL CONSTRUCTOR DE LA SUPERCLASE
        noControl = "23550366";
        carrera = "ISC";
    }

    public Estudiante(String noControl, String carrera) {
        this.noControl = noControl;
        this.carrera = carrera;
    }

    //REGLA DE HERENCIA: SIEMPRE HAY QUE LLAMAR AL CONSTRUCTOR DE LA SUPERCLASE
    //SIEMPRE TIENE QUE SER LA PRIMERA INSTRUCCION DEL CONSTRUCTOR
    public Estudiante(String noControl, String carrera, String nombre, String apPaterno, String apMaterno, int edad, char genero) {
        super(nombre, apPaterno, apMaterno, edad, genero);
        this.noControl = noControl;
        this.carrera = carrera;
    }
    
    
    
    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    
    @Override
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("Numero de Control: " + noControl);
        System.out.println("Carrera: " + carrera);
    }
    
}
