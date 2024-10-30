/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package corte2.Ejercicio8b3;

/**
 *
 * @author Melin
 */
public interface ICajaRegistradora {
    String getNombre();
    int getNumTipoMonedas();
    int getUnidadesTipoMoneda(double tipo);
    boolean meterMonedas(double tipo, int unidades);
    boolean monedaValida(double tipo);
    boolean sacarMonedas(double tipo, int unidades);
    void vaciarCajaRegistradora();
    double[] getTiposDeMonedas();
    double getSaldo();
}