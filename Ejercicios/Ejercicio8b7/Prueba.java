/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corte2.Ejercicio8b7;

/**
 *
 * @author Melin
 */
public class Prueba {
    public static void main(String[] args) {
        Comparador a = new Comparador(5);
        Comparador b = new Comparador(10);
        
        System.out.println("a es mayor que b: " + a.esMayor(b));
        System.out.println("a es menor que b: " + a.esMenor(b));
        System.out.println("a es igual a b: " + a.esIgual(b));
        
        Comparador c = new Comparador(5);
        System.out.println("a es igual a c: " + a.esIgual(c));
    }
}