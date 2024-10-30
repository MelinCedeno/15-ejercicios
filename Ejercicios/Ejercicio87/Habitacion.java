/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corte2.Ejercicio87;

/**
 *
 * @author Melin
 */
public class Habitacion {
    private String nombre;
    private Alfombra[] alfombras;
    private int contador; 

    public Habitacion(String nombre) {
        this.nombre = nombre;
        this.alfombras = new Alfombra[10]; 
        this.contador = 0;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean agregarAlfombra(Alfombra alf) {
        if (contador < alfombras.length) {
            alfombras[contador++] = alf;
            return true;
        }
        return false;
    }

    public double calcularPrecioTotal() {
        double total = 0;
        for (Alfombra alfombra : alfombras) {
            if (alfombra != null) {
                total += alfombra.calcularPrecio();
            }
        }
        return total;
    }

    public double calcularPrecioAlfombrasCuadradas() {
        double total = 0;
        for (Alfombra alfombra : alfombras) {
            if (alfombra instanceof AlfombraCuadrada) {
                total += alfombra.calcularPrecio();
            }
        }
        return total;
    }
}


