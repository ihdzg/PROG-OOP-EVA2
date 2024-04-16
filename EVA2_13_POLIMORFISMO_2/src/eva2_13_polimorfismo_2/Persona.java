/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_13_polimorfismo_2;

/**
 *
 * @author ihdzg
 */         //Persona extiende de mostrar datos
public class Persona implements MostrarDatos{
    private String nombre;
        private String apellido;

        public Persona() {
            this.nombre = "";
            this.apellido = "";
        }

        public Persona(String nombre, String apellido) {
            this.nombre = nombre;
            this.apellido = apellido;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }
        
        @Override
        public String toString(){
            return nombre + " " + apellido;
        }
        
        public void imprimirDatos(){
            System.out.println("Nombre: " + nombre + "\n" +
                               "Apellidos: " + apellido);
        }
}
