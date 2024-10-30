/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corte2.Ejercicio8b7;

/**
 *
 * @author Melin
 */
public class Comprador {
    
}
class Comparador implements IRelaciones {
    private int valor;

    // Constructor
    public Comparador(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    // Implementación de esMayor
    @Override
    public boolean esMayor(Object b) {
        if (b instanceof Comparador) {
            Comparador comparador = (Comparador) b;
            return this.valor > comparador.getValor();
        }
        return false;
    }

    // Implementación de esMenor
    @Override
    public boolean esMenor(Object b) {
        if (b instanceof Comparador comparador) {
            return this.valor < comparador.getValor();
        }
        return false;
    }

    // Implementación de esIgual
    @Override
    public boolean esIgual(Object b) {
        if (b instanceof Comparador comparador) {
            return this.valor == comparador.getValor();
        }
        
        return false;
    }
}
