/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programacion2.TrabajoPractico3_IntroduccionAPOO;

/**
 *
 * @author Maxi
 */
public class Gallina {
    int idGallina;
    int edad;
    int huevosPuestos;

    Gallina(int idGallina, int edad) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = 0;
    }

    void ponerHuevo() {
        huevosPuestos++;
        System.out.println("Gallina " + idGallina + " puso un huevo. Total: " + huevosPuestos);
    }

    void envejecer() {
        edad++;
        System.out.println("Gallina " + idGallina + " ahora tiene " + edad + " años.");
    }

    void mostrarEstado() {
        System.out.println("Gallina " + idGallina + " | Edad: " + edad + " | Huevos puestos: " + huevosPuestos);
    }
}
