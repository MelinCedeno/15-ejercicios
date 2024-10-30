/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corte2.Ejercicio82;

/**
 *
 * @author Melin
 */
  public class Main {
    public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Rojo", 20000, 0.1, 2018);
        coche1.setDniTitular("12345678A");
        coche1.setMatricula("ABC1234");

        System.out.println("Coche 1: " + coche1.getMarca() + ", " + coche1.getColor() + ", " + coche1.getPrecio() + "€");
        System.out.println("DNI Titular: " + coche1.getDniTitular());
        System.out.println("Matrícula: " + coche1.getMatricula());

        Coche coche2 = new Coche("Ford", "Azul", 15000, 0.2, 2020);
        coche2.setDniTitular("87654321B");
        coche2.setMatricula("XYZ5678");

        coche1.comprarCoche(coche2);
        System.out.println("Nuevo DNI Titular de Coche 1 después de la compra: " + coche1.getDniTitular());

        CocheMatriculado cocheMatriculado = new CocheMatriculado(
                "Honda", "Negro", 22000, 0.15, 2012,
                "LMN2345", "11223344C", 2012, 5
        );

        System.out.println("Coche Matriculado: " + cocheMatriculado.getMarca() + ", " + cocheMatriculado.getColor());
        System.out.println("Impuesto de Matriculación: " + cocheMatriculado.getImpuestoMatriculacion() + "€");
        
        cocheMatriculado.setPrecio(24000);
        cocheMatriculado.setImpuestoMatriculacion(0); 
        System.out.println("Nuevo Impuesto de Matriculación: " + cocheMatriculado.getImpuestoMatriculacion() + "€");
    }
}  
