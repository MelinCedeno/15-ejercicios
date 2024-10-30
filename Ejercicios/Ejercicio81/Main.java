/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corte2.Ejercicio81;

/**
 *
 * @author Melin
 */
public class Main {
    public static void main(String[] args) {
        Forma[] formas = new Forma[4];

        // Creando 2 cuadrados y 2 triángulos
        formas[0] = new Cuadrado("Cuadrado1", 0, 0, "Rojo", 5);
        formas[1] = new Cuadrado("Cuadrado2", 1, 1, "Azul", 3);
        formas[2] = new Triangulo("Triángulo1", 2, 2, "Verde", 4, 3);
        formas[3] = new Triangulo("Triángulo2", 3, 3, "Amarillo", 6, 2);

        double sumaAreas = 0;
        double sumaAreasCuadrados = 0;
        int contadorCuadrados = 0;

        for (Forma forma : formas) {
            double area = forma.calcularArea();
            sumaAreas += area;

            if (forma instanceof Cuadrado) {
                sumaAreasCuadrados += area;
                contadorCuadrados++;
            }
        }

        System.out.println("Suma de las áreas de todas las formas: " + sumaAreas);
        if (contadorCuadrados > 0) {
            double mediaCuadrados = sumaAreasCuadrados / contadorCuadrados;
            System.out.println("Media de las áreas de los cuadrados: " + mediaCuadrados);
        } else {
            System.out.println("No hay cuadrados en el array.");
        }
    }
}
