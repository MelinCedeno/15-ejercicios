/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corte2.Ejercicio83;

/**
 *
 * @author Melin
 */
public abstract class Vehiculo {
    protected String marca;
    protected double precioCompra;

    public Vehiculo(String marca, double precioCompra) {
        this.marca = marca;
        this.precioCompra = precioCompra;
    }

    public double precioVenta() {
        return precioCompra * 1.6; 
    }

    public String getMarca() {
        return marca;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }
}
