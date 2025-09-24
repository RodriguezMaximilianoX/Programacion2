/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programacion2.TrabajoPractico3_IntroduccionAPOO;

/**
 *
 * @author Maxi
 */
public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    void mostrarInfo() {
        System.out.println("Mascota: " + nombre + " | Especie: " + especie + " | Edad: " + edad + " años");
    }

    void cumplirAnios() {
        edad++;
        System.out.println(nombre + " cumplió años y ahora tiene " + edad + " años.");
    }
}
