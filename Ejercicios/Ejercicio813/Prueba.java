/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corte2.Ejercicio813;

import java.util.Scanner;

/**
 *
 * @author Melin
 */
public class Prueba {
    public static void main(String[] args) {
        Almacen almacen = new Almacen();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú de Mercaregala ---");
            System.out.println("1. Añadir producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Productos en peligro");
            System.out.println("4. Calculo precio medio");
            System.out.println("5. Eliminar bandejas");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Seleccione el tipo de producto (1. Carne Fresca, 2. Carne Congelada Entera, 3. Carne Congelada Troceada, 4. Pescado): ");
                    int tipo = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer

                    System.out.print("Ingrese el nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingrese el peso del producto: ");
                    double peso = scanner.nextDouble();
                    System.out.print("Ingrese el precio por kilo del producto: ");
                    double precioKilo = scanner.nextDouble();

                    switch (tipo) {
                        case 1 -> {
                            System.out.print("Ingrese el origen (vacuno o avícola): ");
                            String origen = scanner.next();
                            System.out.print("Ingrese los días de caducidad: ");
                            int diasCaducidad = scanner.nextInt();
                            almacen.agregarProducto(new CarneFresca(nombre, peso, precioKilo, origen, diasCaducidad));
                    }
                        case 2 -> {
                            System.out.print("Ingrese el origen (vacuno o avícola): ");
                        String origen = scanner.next();
                        System.out.print("Ingrese la empresa distribuidora: ");
                        String distribuidora = scanner.next();
                        System.out.print("¿Viene en bandeja? (true/false): ");
                        boolean enBandeja = scanner.nextBoolean();
                        almacen.agregarProducto(new CarneCongeladaPiezaEntera(nombre, peso, precioKilo, origen, distribuidora, enBandeja));
                    }
                        case 3 -> {
                            System.out.print("Ingrese el origen (vacuno o avícola): ");
                        String origen = scanner.next();
                        System.out.print("Ingrese la empresa distribuidora: ");
                        String distribuidora = scanner.next();
                        System.out.print("Ingrese el número de piezas: ");
                        int numPiezas = scanner.nextInt();
                        almacen.agregarProducto(new CarneCongeladaPiezaTroceada(nombre, peso, precioKilo, origen, distribuidora, numPiezas));
                    }
                        case 4 -> {
                            System.out.print("Ingrese el tipo de pescado: ");
                            String tipoPescado = scanner.next();
                            almacen.agregarProducto(new Pescado(nombre, peso, precioKilo, tipoPescado));
                    }
                        default -> System.out.println("Tipo de producto no válido.");
                    }
                    break;

                case 2:
                    almacen.listarProductos();
                    break;
                case 3:
                    almacen.productosEnPeligro();
                    break;
                case 4:
                    System.out.printf("Precio medio: %.2f\n", almacen.calcularPrecioMedio());
                    break;
                case 5:
                    almacen.eliminarBandejas();
                    System.out.println("Carnes congeladas en bandeja eliminadas.");
                    break;
                case 6:
                    System.out.println("Saliendo del sistema.");
                    break;
                default:
                    System.out.println("Opción no válida, intente nuevamente.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}