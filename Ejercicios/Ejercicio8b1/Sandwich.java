/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corte2.Ejercicio8b1;

import java.util.ArrayList;

/**
 *
 * @author Melin
 */
class Sandwich extends Receta {
    public Sandwich(String nombre, ArrayList<String> ingredientes, ArrayList<String> pasosPreparacion) {
        super(nombre, ingredientes, pasosPreparacion);
    }

    @Override
    public int tiempoDePreparacion() {
        int vocales = 0;
        for (char c : getNombre().toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vocales++;
            }
        }
        return 2 + vocales;
    }

    @Override
    public boolean isVegetariano() {
        return true;
    }

    @Override
    public String tipoPreparacion() {
        return "plancha";
    }
}

