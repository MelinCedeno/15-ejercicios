/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corte2.Ejercicio813;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Melin
 */
class Almacen {
    private List<IProducto> productos;

    public Almacen() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(IProducto producto) {
        productos.add(producto);
    }

    public void listarProductos() {
        for (IProducto producto : productos) {
            if (producto instanceof Producto) {
                Producto p = (Producto) producto;
                System.out.printf("Producto: %s, Precio: %.2f\n", p.getNombre(), p.calcularPrecio());
            }
        }
    }

    public void productosEnPeligro() {
        for (IProducto producto : productos) {
            if (producto instanceof CarneFresca) {
                CarneFresca carneFresca = (CarneFresca) producto;
                if (carneFresca.getDiasCaducidad() < 10) {
                    System.out.printf("Carne en peligro: %s, Días de caducidad: %d\n", carneFresca.getNombre(), carneFresca.getDiasCaducidad());
                }
            }
        }
    }

    public double calcularPrecioMedio() {
        double total = 0;
        int cantidad = productos.size();
        for (IProducto producto : productos) {
            total += producto.calcularPrecio();
        }
        return cantidad == 0 ? 0 : total / cantidad;
    }

    public void eliminarBandejas() {
        Iterator<IProducto> iterator = productos.iterator();
        while (iterator.hasNext()) {
            IProducto producto = iterator.next();
            if (producto instanceof CarneCongeladaPiezaEntera) {
                CarneCongeladaPiezaEntera carneCongelada = (CarneCongeladaPiezaEntera) producto;
                if (carneCongelada.isEnBandeja()) {
                    iterator.remove();
                }
            }
        }
    }

    void agregarProducto(CarneFresca carneFresca) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}