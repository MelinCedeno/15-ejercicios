/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corte2.Ejercicio810;

/**
 *
 * @author Melin
 */
public class ProbarReloj {
    public static void main(String[] args) {
        Reloj reloj = new Reloj(10, 30, 45);
        
        System.out.println("Hora inicial: " + reloj);
        
        reloj.setHora(12);
        reloj.setMinuto(45);
        reloj.setSegundo(50);
        System.out.println("Hora modificada: " + reloj);

        reloj.adelantarReloj(80);
        System.out.println("Después de adelantar 80 segundos: " + reloj);
        
        reloj.atrasarReloj(150);
        System.out.println("Después de atrasar 150 segundos: " + reloj);
    }
}
