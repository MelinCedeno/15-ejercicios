/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corte2.Ejercicio8b3;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Melin
 */
public class CajaRegistradora implements ICajaRegistradora {
    private String nombre;
    private Map<Double, Integer> monedas; // Almacena los tipos de monedas y sus cantidades
    private static final double[] TIPOS_VALIDOS = {0.1, 0.2, 0.5, 1.0, 2.0, 5.0, 10.0, 20.0, 50.0}; // Tipos válidos de monedas

    public CajaRegistradora(String nombre) {
        this.nombre = nombre;
        this.monedas = new HashMap<>();
        for (double tipo : TIPOS_VALIDOS) {
            monedas.put(tipo, 0);
        }
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getNumTipoMonedas() {
        return monedas.size();
    }

    @Override
    public int getUnidadesTipoMoneda(double tipo) {
        return monedas.getOrDefault(tipo, -1);
    }

    @Override
    public boolean meterMonedas(double tipo, int unidades) {
        if (monedaValida(tipo) && unidades > 0) {
            monedas.put(tipo, monedas.get(tipo) + unidades);
            return true;
        }
        return false;
    }

    @Override
    public boolean monedaValida(double tipo) {
        for (double t : TIPOS_VALIDOS) {
            if (t == tipo) return true;
        }
        return false;
    }

    @Override
    public boolean sacarMonedas(double tipo, int unidades) {
        if (monedaValida(tipo) && unidades > 0 && monedas.get(tipo) >= unidades) {
            monedas.put(tipo, monedas.get(tipo) - unidades);
            return true;
        }
        return false;
    }

    @Override
    public void vaciarCajaRegistradora() {
        for (double tipo : TIPOS_VALIDOS) {
            monedas.put(tipo, 0);
        }
    }

    @Override
    public double[] getTiposDeMonedas() {
        return TIPOS_VALIDOS;
    }

    @Override
    public double getSaldo() {
        double saldo = 0;
        for (Map.Entry<Double, Integer> entry : monedas.entrySet()) {
            saldo += entry.getKey() * entry.getValue();
        }
        return saldo;
    }
}