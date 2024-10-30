/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corte2.Ejercicio83;

/**
 *
 * @author Melin
 */
public class Furgoneta extends Vehiculo {
    private final double capacidadCarga; 

    public Furgoneta(String marca, double precioCompra, double capacidadCarga) {
        super(marca, precioCompra);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double precioVenta() {
        double precioVentaInicial = super.precioVenta();
        if (capacidadCarga > 10) {
            return precioVentaInicial * 1.2; 
        }
        return precioVentaInicial;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }
}
