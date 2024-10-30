/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corte2.Ejercicio86;

/**
 *
 * @author Melin
 */
  public class ProfesorEmerito extends Profesor {
    private int añosEmerito;
    public ProfesorEmerito(String nombre, int edad, int añosConsolidados, int añosEmerito) {
        super(nombre, edad, añosConsolidados); 
        this.añosEmerito = añosEmerito;
    }
    public double obtenerSalarioBase() {
        return 925 + añosConsolidados * 12.25 + 23.40 * añosEmerito;
    }
    public int getAñosEmerito() {
        return añosEmerito;
    }
}  
