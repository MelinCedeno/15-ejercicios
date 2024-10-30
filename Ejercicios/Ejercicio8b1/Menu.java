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

class Menu {
    private ArrayList<IFastFood> recetas;

    public Menu() {
        this.recetas = new ArrayList<>();
    }

    public ArrayList<IFastFood> getRecetas() {
        return recetas;
    }

    public void setRecetas(ArrayList<IFastFood> recetas) {
        this.recetas = recetas;
    }
}