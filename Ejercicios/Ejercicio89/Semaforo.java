/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corte2.Ejercicio89;

/**
 *
 * @author Melin
 */
public class Semaforo {
    private String color;

    public Semaforo() {
        this.color = "rojo";
    }
    public void cambio() {
        switch (color) {
            case "rojo":
                color = "verde";
                break;
            case "verde":
                color = "amarillo";
                break;
            case "amarillo":
                color = "rojo";
                break;
        }
        System.out.println("El semáforo ahora está en color: " + color);
    }
}
