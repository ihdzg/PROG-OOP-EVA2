/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eva2_11_has_a;

/**
 *
 * @author ihdzg
 */
public class Direccion {
    private String calle;
    private String colonia;
    private int CP;
    private String numero;
    private String cuidad;
    private String estado;

    public Direccion() {
        this.calle = "";
        this.colonia = "";
        this.CP = 0;
        this.numero = "";
        this.cuidad = "";
        this.estado = "";
    }

    public Direccion(String calle, String colonia, int CP, String numero, String Ciudad, String Estado) {
        this.calle = calle;
        this.colonia = colonia;
        this.CP = CP;
        this.numero = numero;
        this.cuidad = Ciudad;
        this.estado = Estado;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public int getCP() {
        return CP;
    }

    public void setCP(int CP) {
        this.CP = CP;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCiudad() {
        return cuidad;
    }

    public void setCiudad(String Ciudad) {
        this.cuidad = cuidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String Estado) {
        this.estado = estado;
    }
    @Override
    public String toString(){
        String cade = "Calle: " + calle + "\n" + 
                      "Colonia: " + colonia + "\n" +
                      "Codigo Postal: " + CP + "\n" +
                      "Numero: " + numero + "\n" +
                      "Cuidad: " + cuidad + "\n" +
                      "Estado: " + estado + "\n";
        return cade;
    }
    
    
    
}

