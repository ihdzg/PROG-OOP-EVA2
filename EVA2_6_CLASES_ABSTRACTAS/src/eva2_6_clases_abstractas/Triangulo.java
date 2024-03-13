/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_6_clases_abstractas;

/**
 *
 * @author ihdzg
 */
public class Triangulo extends Figura {
    private double base = 20;
    private double altura = 25;
    
    @Override
    public double calcularArea() {
        return (base * altura)/2;
    }
    
    private double calcularHipo(){
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }
    
    @Override
    public double calcularPerimetro() {
        return base + altura + calcularHipo();
    }

    public Triangulo() {
    }

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
}
