/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corte2.Ejercicio87;

/**
 *
 * @author Melin
 */
public class AlfombraRedonda extends Alfombra {
    private int radio;

    public AlfombraRedonda(String color, int precioMetro, int radio) {
        super(color, precioMetro);
        this.radio = radio;
    }
    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public double calcularSuperficie() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPrecio() {
        return calcularSuperficie() * getPrecioMetro();
    }
}  
