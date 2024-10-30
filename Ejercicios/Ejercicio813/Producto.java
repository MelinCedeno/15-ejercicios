/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corte2.Ejercicio813;

/**
 *
 * @author Melin
 */
abstract class Producto implements IProducto {
    protected String nombre;
    protected double peso;
    protected double precioKilo;

    public Producto(String nombre, double peso, double precioKilo) {
        this.nombre = nombre;
        this.peso = peso;
        this.precioKilo = precioKilo;
    }

    @Override
    public double calcularPrecio() {
        return peso * precioKilo;
    }

    public String getNombre() {
        return nombre;
    }
}