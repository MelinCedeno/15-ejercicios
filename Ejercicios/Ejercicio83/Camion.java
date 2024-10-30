/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corte2.Ejercicio83;

/**
 *
 * @author Melin
 */
  public class Camion extends Vehiculo {
    private final double tamanoRemolque;
    private final int numeroEjes;

    public Camion(String marca, double precioCompra, double tamanoRemolque, int numeroEjes) {
        super(marca, precioCompra);
        this.tamanoRemolque = tamanoRemolque;
        this.numeroEjes = numeroEjes;
    }
    @Override
    public double precioVenta() {
        return super.precioVenta() * numeroEjes; // Multiplica por el número de ejes
    }

    public double getTamanoRemolque() {
        return tamanoRemolque;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }
}