/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corte2.Ejercicio84;

import java.util.Scanner;

/**
 *
 * @author Melin
 */
 public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Empleado[] empleados = new Empleado[4];
            for (int i = 0; i < empleados.length; i++) {
                System.out.println("Ingrese los datos del empleado " + (i + 1) + ":");
                
                System.out.print("Nombre: ");
                String nombre = scanner.nextLine();
                
                System.out.print("Teléfono: ");
                String telefono = scanner.nextLine();
                
                empleados[i] = new Empleado(nombre, telefono);
            } 
            System.out.println("\nDatos de los empleados:");
            for (Empleado empleado : empleados) {
                System.out.println("Nombre: " + empleado.getNombre() + ", Teléfono: " + empleado.getTelefono());
            }  
            System.out.println("Número total de empleados: " + Empleado.getNumeroEmpleados());
        }
    }
}

