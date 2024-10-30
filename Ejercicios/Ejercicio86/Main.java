/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corte2.Ejercicio86;

/**
 *
 * @author Melin
 */
public class Main {
    public static void main(String[] args) {
        ProfesorEmerito profesorEmerito = new ProfesorEmerito("Juan Pérez", 65, 30, 5);
        
        System.out.println("Nombre: " + profesorEmerito.getNombre());
        System.out.println("Edad: " + profesorEmerito.getEdad());
        System.out.println("Años consolidados: " + profesorEmerito.getAñosConsolidados());
        System.out.println("Años emérito: " + profesorEmerito.getAñosEmerito());
        System.out.println("Salario base: " + profesorEmerito.obtenerSalarioBase());
    }
}

