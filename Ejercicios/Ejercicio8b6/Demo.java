/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corte2.Ejercicios.Ejercicio8b6;

/**
 *
 * @author Melin
 */
class Demo {
    // Método final que no se puede sobreescribir en la subclase
    public final void metodoFinal() {
        System.out.println("Este es el método final de la clase Demo.");
    }
    
    // Método no final que puede ser sobreescrito
    public void metodoNoFinal() {
        System.out.println("Este es el método no final de la clase Demo.");
    }
}

// Subclase SubDemo que hereda de Demo
class SubDemo extends Demo {
    // Sobrescribimos el método no final de la clase Demo
    @Override
    public void metodoNoFinal() {
        System.out.println("Este es el método sobreescrito en la clase SubDemo.");
    }
}