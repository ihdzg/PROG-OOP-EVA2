/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_sobrecarga_metodos;

/**
 *
 * @author ihdzg
 */
public class EVA2_SOBRECARGA_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("la suma de 4 + 5 es: " + sumar(5,4));
        System.out.println("La suma de 3.1 + 2.5: " + sumar(3.1,2.5));
        System.out.println("La suma de hola + mundo es: " + sumar("Hola"," mundo"));
        sumar();
    }
    
    //SUMAR: METODO CON SOBRECARGA, MISMO NOMBRE PARA 3 METOOS DIFERENTES
    
    public static int sumar(int num1, int num2){
        return num1 + num2;
    }
    
    public static double sumar(double num1, double num2){
        return num1 + num2;
    }
    
    public static String sumar(String num1, String num2){
        return num1 + num2;
    }
    
    public static void sumar(){
        System.out.println("Metodo que no hace nada");
    }
    
}
