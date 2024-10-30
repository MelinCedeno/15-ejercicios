/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corte2.Ejercicio813;

/**
 *
 * @author Melin
 */
abstract class CarneCongelada extends Carne {
    protected String distribuidora;

    public CarneCongelada(String nombre, double peso, double precioKilo, String origen, String distribuidora) {
        super(nombre, peso, precioKilo, origen);
        this.distribuidora = distribuidora;
    }
}
class CarneCongeladaPiezaEntera extends CarneCongelada {
    private boolean enBandeja;

    public CarneCongeladaPiezaEntera(String nombre, double peso, double precioKilo, String origen, String distribuidora, boolean enBandeja) {
        super(nombre, peso, precioKilo, origen, distribuidora);
        this.enBandeja = enBandeja;
    }

    public boolean isEnBandeja() {
        return enBandeja;
    }
}
class CarneCongeladaPiezaTroceada extends CarneCongelada {
    private int numPiezas;

    public CarneCongeladaPiezaTroceada(String nombre, double peso, double precioKilo, String origen, String distribuidora, int numPiezas) {
        super(nombre, peso, precioKilo, origen, distribuidora);
        this.numPiezas = numPiezas;
    }
}