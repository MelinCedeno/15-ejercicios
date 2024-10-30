/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corte2.Ejercicio83;

/**
 *
 * @author Melin
 */
public class Coche extends Vehiculo {
    private int puertas;

    public Coche(String marca, double precioCompra, int puertas) {
        super(marca, precioCompra);
        this.puertas = puertas;
    }

    @Override
    public double precioVenta() {
        return super.precioVenta();
    }

    public int getPuertas() {
        return puertas;
    }
}
