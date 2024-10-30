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
class Pizza extends Receta {
    public Pizza(String nombre, ArrayList<String> ingredientes, ArrayList<String> pasosPreparacion) {
        super(nombre, ingredientes, pasosPreparacion);
    }

    @Override
    public int tiempoDePreparacion() {
        return 2 + getNombre().length();
    }

    @Override
    public boolean isVegetariano() {
        for (String ingrediente : getIngredientes()) {
            if (ingrediente.toLowerCase().contains("carne")) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String tipoPreparacion() {
        return "horno";
    }
}