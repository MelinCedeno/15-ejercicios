/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corte2.Ejercicio87;

/**
 *
 * @author Melin
 */
   public class Main {
    public static void main(String[] args) {
        Habitacion habitacion = new Habitacion("Sala de Estar");
        AlfombraRedonda alfombra1 = new AlfombraRedonda("Roja", 50, 3);
        AlfombraCuadrada alfombra2 = new AlfombraCuadrada("Azul", 40, 4);
        AlfombraCuadrada alfombra3 = new AlfombraCuadrada("Verde", 40, 5);
        habitacion.agregarAlfombra(alfombra1);
        habitacion.agregarAlfombra(alfombra2);
        habitacion.agregarAlfombra(alfombra3);
        System.out.println("Precio total de las alfombras en la habitación: " + habitacion.calcularPrecioTotal());
        System.out.println("Precio total de las alfombras cuadradas: " + habitacion.calcularPrecioAlfombrasCuadradas());
    }
} 
