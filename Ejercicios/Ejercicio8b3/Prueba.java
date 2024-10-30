/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corte2.Ejercicio8b3;

import java.util.Scanner;

/**
 *
 * @author Melin
 */
public class Prueba {
    public static void main(String[] args) {
        CajaRegistradora caja = new CajaRegistradora("Caja Principal");
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Caja Registradora ---");
            System.out.println("1. Ingresar monedas");
            System.out.println("2. Listar contenido");
            System.out.println("3. Mostrar saldo");
            System.out.println("4. Extraer monedas");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el tipo de moneda: ");
                    double tipoIngreso = scanner.nextDouble();
                    System.out.print("Ingrese el número de unidades: ");
                    int unidadesIngreso = scanner.nextInt();
                    if (caja.meterMonedas(tipoIngreso, unidadesIngreso)) {
                        System.out.println("Monedas ingresadas correctamente.");
                    } else {
                        System.out.println("Error: tipo de moneda no válido o cantidad incorrecta.");
                    }
                    break;

                case 2:
                    System.out.println("--- Contenido de la caja ---");
                    for (double tipo : caja.getTiposDeMonedas()) {
                        int cantidad = caja.getUnidadesTipoMoneda(tipo);
                        if (cantidad > 0) {
                            System.out.printf("Tipo de moneda: %.2f, Cantidad: %d\n", tipo, cantidad);
                        }
                    }
                    break;

                case 3:
                    System.out.printf("Saldo actual en la caja: %.2f\n", caja.getSaldo());
                    break;

                case 4:
                    System.out.print("Ingrese el tipo de moneda a extraer: ");
                    double tipoExtraccion = scanner.nextDouble();
                    System.out.print("Ingrese el número de unidades a extraer: ");
                    int unidadesExtraccion = scanner.nextInt();
                    if (caja.sacarMonedas(tipoExtraccion, unidadesExtraccion)) {
                        System.out.println("Monedas extraídas correctamente.");
                    } else {
                        System.out.println("Error: tipo de moneda no válido o cantidad insuficiente.");
                    }
                    break;

                case 5:
                    System.out.println("Saliendo del sistema.");
                    break;

                default:
                    System.out.println("Opción no válida, intente nuevamente.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}