/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corte2.Ejercicio8b1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
/**
 *
 * @author Melin
 */
class Restaurante {
    private final HashMap<String, IFastFood> mapaRecetasRestaurante;
    private final Menu menu;
    private static final int TIEMPO_MAXIMO_MENU = 30;

    public Restaurante() {
        mapaRecetasRestaurante = new HashMap<>();
        menu = new Menu();
    }

    // Método para crear y añadir una receta al mapa del restaurante
    public void crearReceta(String nombre, ArrayList<String> ingredientes, ArrayList<String> pasos, String tipo) {
        IFastFood receta = null;
        if ("pizza".equalsIgnoreCase(tipo)) {
            receta = new Pizza(nombre, ingredientes, pasos);
        } else if ("sandwich".equalsIgnoreCase(tipo)) {
            receta = new Sandwich(nombre, ingredientes, pasos);
        }

        if (receta != null) {
            mapaRecetasRestaurante.put(nombre, receta);
        }
    }

    // Añadir receta al menú verificando que no se sobrepase el tiempo máximo
    public void anadirRecetaAlMenu(IFastFood receta) throws TiempoException {
        int tiempoTotal = menu.getRecetas().stream().mapToInt(IFastFood::tiempoDePreparacion).sum() + receta.tiempoDePreparacion();
        if (tiempoTotal > TIEMPO_MAXIMO_MENU) {
            throw new TiempoException("El tiempo de preparación del menú supera el límite de " + TIEMPO_MAXIMO_MENU + " minutos.");
        }
        menu.getRecetas().add(receta);
    }

    // Añadir receta al menú pidiendo al usuario seleccionar una de las recetas existentes
    public void anadirRecetaAlMenu() throws TiempoException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione una receta del mapa para añadir al menú:");
        int index = 1;
        ArrayList<IFastFood> recetasList = new ArrayList<>(mapaRecetasRestaurante.values());
        for (IFastFood receta : recetasList) {
            System.out.println(index++ + ". " + ((Receta) receta).getNombre());
        }
        int opcion = scanner.nextInt();
        if (opcion > 0 && opcion <= recetasList.size()) {
            anadirRecetaAlMenu(recetasList.get(opcion - 1));
        }
    }

    // Calcular tiempo medio de preparación de las recetas del menú
    public double tiempoMedio() {
        if (menu.getRecetas().isEmpty()) return -1;
        int totalTiempo = menu.getRecetas().stream().mapToInt(IFastFood::tiempoDePreparacion).sum();
        return (double) totalTiempo / menu.getRecetas().size();
    }

    // Calcular porcentaje de recetas vegetarianas en el menú
    public double porcentajeVegetariano() {
        if (menu.getRecetas().isEmpty()) return 0;
        long countVegetariano = menu.getRecetas().stream().filter(IFastFood::isVegetariano).count();
        return (countVegetariano * 100.0) / menu.getRecetas().size();
    }
}