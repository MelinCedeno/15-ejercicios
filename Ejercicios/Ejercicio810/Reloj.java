/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package corte2.Ejercicio810;

/**
 *
 * @author Melin
 */
public class Reloj {
    private int hora;
    private int minuto;
    private int segundo;

    public Reloj(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public Reloj(int hora, int minuto) {
        this(hora, minuto, 0);
    }

    public Reloj(int hora) {
        this(hora, 0, 0); 
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            System.out.println("Hora inválida, debe estar entre 0 y 23.");
        }
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        } else {
            System.out.println("Minuto inválido, debe estar entre 0 y 59.");
        }
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        } else {
            System.out.println("Segundo inválido, debe estar entre 0 y 59.");
        }
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void adelantarReloj(int cantidadDeSegundos) {
        if (cantidadDeSegundos < 0) return; 
        segundo += cantidadDeSegundos;
        ajustarTiempo();
    }

    public void atrasarReloj(int cantidadDeSegundos) {
        if (cantidadDeSegundos < 0) return; 
        segundo -= cantidadDeSegundos;
        ajustarTiempo();
    }

    private void ajustarTiempo() {
        if (segundo >= 60) {
            minuto += segundo / 60;
            segundo = segundo % 60;
        }
        if (minuto >= 60) {
            hora += minuto / 60;
            minuto = minuto % 60;
        }
        if (hora >= 24) {
            hora = hora % 24; 
        }
        if (segundo < 0) {
            minuto -= Math.abs(segundo) / 60 + 1;
            segundo = 60 + (segundo % 60);
        }
        if (minuto < 0) {
            hora -= Math.abs(minuto) / 60 + 1;
            minuto = 60 + (minuto % 60);
        }
        if (hora < 0) {
            hora = 24 + (hora % 24);
        }
    }
    
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}
