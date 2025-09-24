/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programacion2.TrabajoPractico3_IntroduccionAPOO;

/**
 *
 * @author Maxi
 */
public class NaveEspacial {
    String nombre;
    int combustible;
    final int CAPACIDAD_MAX = 100;

    NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }

    void despegar() {
        System.out.println(nombre + " ha despegado.");
    }

    void avanzar(int distancia) {
        int consumo = distancia / 2; // 1 unidad de combustible cada 2 de distancia
        if (consumo <= combustible) {
            combustible -= consumo;
            System.out.println(nombre + " avanzó " + distancia + " km y consumió " + consumo + " de combustible.");
        } else {
            System.out.println("No hay suficiente combustible para avanzar " + distancia + " km.");
        }
    }

    void recargarCombustible(int cantidad) {
        if (combustible + cantidad > CAPACIDAD_MAX) {
            combustible = CAPACIDAD_MAX;
            System.out.println("Tanque lleno al máximo (" + CAPACIDAD_MAX + ").");
        } else {
            combustible += cantidad;
            System.out.println("Se recargaron " + cantidad + " unidades de combustible.");
        }
    }

    void mostrarEstado() {
        System.out.println("Nave: " + nombre + " | Combustible restante: " + combustible + "/" + CAPACIDAD_MAX);
    }
}
