/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corte2.Ejercicio85;

/**
 *
 * @author Melin
 */
  public class Math2 implements IExtremos {

    @Override
    public int min(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío");
        }
        int minValue = a[0];
        for (int num : a) {
            if (num < minValue) {
                minValue = num;
            }
        }
        return minValue;
    }

    @Override
    public int max(int[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío");
        }
        int maxValue = a[0];
        for (int num : a) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }

    @Override
    public double min(double[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío");
        }
        double minValue = a[0];
        for (double num : a) {
            if (num < minValue) {
                minValue = num;
            }
        }
        return minValue;
    }

    @Override
    public double max(double[] a) {
        if (a == null || a.length == 0) {
            throw new IllegalArgumentException("El array no puede estar vacío");
        }
        double maxValue = a[0];
        for (double num : a) {
            if (num > maxValue) {
                maxValue = num;
            }
        }
        return maxValue;
    }
}  
