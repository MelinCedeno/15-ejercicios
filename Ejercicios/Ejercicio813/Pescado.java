/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corte2.Ejercicio813;

/**
 *
 * @author Melin
 */
class Pescado extends Producto {
    private String tipoPescado;

    public Pescado(String nombre, double peso, double precioKilo, String tipoPescado) {
        super(nombre, peso, precioKilo);
        this.tipoPescado = tipoPescado;
    }
}