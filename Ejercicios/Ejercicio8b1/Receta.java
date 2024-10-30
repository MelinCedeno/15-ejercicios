/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corte2.Ejercicio8b1;

/**
 *
 * @author Melin
 */
import java.util.ArrayList;
abstract class Receta implements IFastFood {
    private final String nombre;
    private final ArrayList<String> ingredientes;
    private final ArrayList<String> pasosPreparacion;

    public Receta(String nombre, ArrayList<String> ingredientes, ArrayList<String> pasosPreparacion) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
        this.pasosPreparacion = pasosPreparacion;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getIngredientes() {
        return ingredientes;
    }

    public ArrayList<String> getPasosPreparacion() {
        return pasosPreparacion;
    }
}
