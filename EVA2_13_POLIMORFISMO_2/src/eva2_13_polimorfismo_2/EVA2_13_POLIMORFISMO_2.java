/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_13_polimorfismo_2;

/**
 *
 * @author ihdzg
 */
public class EVA2_13_POLIMORFISMO_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /* Persona perso1 = new Persona("Ivan","Garcia");
        Persona perso2 = new Persona("Guero","Palma");
        Persona perso3 = new Persona("Tigriullo","Ramirez");
        
        Estudiante estu1 = new Estudiante("2323", "Fernando", "Fernandez");
        Estudiante estu2 = new Estudiante("5656", "Uriel", "Cano");
        Estudiante estu3 = new Estudiante("8989", "Nata", "Montana");
        
        imprimirDatos(perso1);
        imprimirDatos(perso2);
        imprimirDatos(perso3);
        imprimirDatos(estu1);
        imprimirDatos(estu2);
        imprimirDatos(estu3); */
        
        Estudiante estudiantes[] = new Estudiante[3000];
        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i] = new Estudiante("5656", "Gabito", "Ballesteros");
        }
       
        for (int i = 0; i < estudiantes.length; i++) {
            imprimirDatos(estudiantes[i]);
        }
         
    }
    
    public static void imprimirDatos(MostrarDatos datos){
        datos.imprimirDatos();
        //CASTING
        Estudiante estu;
        Persona perso;
        if(datos instanceof Estudiante){
             estu = (Estudiante)datos;
             
        }else{
            perso = (Persona)datos;
            
        }
    }   
}
