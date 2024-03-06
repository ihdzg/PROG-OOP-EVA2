/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_3_vehiculo;

/**
 *
 * @author ihdzg
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private String color;
    private int anio;

    public Vehiculo() {
        this.marca = "SIN MARCA";
        this.modelo = "SIN MODELO";
        this.color = "SIN COLOR";
        this.anio = 0;
    }

    public Vehiculo(String Marca, String modelo, String color, int anio) {
        this.marca = Marca;
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String Marca) {
        this.marca = Marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public void imptrimirDatos(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Año: " + anio);
    }
}
