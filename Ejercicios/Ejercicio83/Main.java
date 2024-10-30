/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corte2.Ejercicio83;

/**
 *
 * @author Melin
 */
public class Main {
    public static void main(String[] args) {
        Vehiculo[] camiones = new Camion[3];
        camiones[0] = new Camion("Volvo", 30000, 15, 2);
        camiones[1] = new Camion("Mercedes", 40000, 20, 3);
        camiones[2] = new Camion("MAN", 25000, 10, 2);
        System.out.println("Precios de venta de camiones:");
        for (Vehiculo camion : camiones) {
            System.out.printf("%s: %.2f€\n", camion.getMarca(), camion.precioVenta());
        }
        Vehiculo[] furgonetas = new Furgoneta[2];
        furgonetas[0] = new Furgoneta("Peugeot", 20000, 12);
        furgonetas[1] = new Furgoneta("Citroën", 18000, 8);
        System.out.println("\nPrecios de venta de furgonetas:");
        for (Vehiculo furgoneta : furgonetas) {
            System.out.printf("%s: %.2f€\n", furgoneta.getMarca(), furgoneta.precioVenta());
        }
        Vehiculo[] vehiculos = new Vehiculo[5];
        System.arraycopy(camiones, 0, vehiculos, 0, camiones.length);
        System.arraycopy(furgonetas, 0, vehiculos, camiones.length, furgonetas.length);
        System.out.println("\nPrecios de venta de todos los vehículos:");
        for (Vehiculo vehiculo : vehiculos) {
            System.out.printf("%s: %.2f€\n", vehiculo.getMarca(), vehiculo.precioVenta());
        }
    }
}