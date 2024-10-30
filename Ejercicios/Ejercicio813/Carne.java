/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corte2.Ejercicio813;

/**
 *
 * @author Melin
 */
abstract class Carne extends Producto {
    protected String origen;

    public Carne(String nombre, double peso, double precioKilo, String origen) {
        super(nombre, peso, precioKilo);
        if (origen.equalsIgnoreCase("vacuno") || origen.equalsIgnoreCase("avícola")) {
            this.origen = origen;
        } else {
            throw new IllegalArgumentException("Origen no válido");
        }
    }
}
class CarneFresca extends Carne {
    private int diasCaducidad;

    public CarneFresca(String nombre, double peso, double precioKilo, String origen, int diasCaducidad) {
        super(nombre, peso, precioKilo, origen);
        this.diasCaducidad = diasCaducidad;
    }

    public int getDiasCaducidad() {
        return diasCaducidad;
    }
}