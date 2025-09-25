/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico3_IntroduccionAPOO;

/**
 *
 * @author Maxi
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido + " | Curso: " + curso + " | Calificación: " + calificacion);
    }

    void subirCalificacion(double puntos) {
        calificacion += puntos;
        System.out.println("Subió la calificación en " + puntos + " puntos.");
    }

    void bajarCalificacion(double puntos) {
        calificacion -= puntos;
        if (calificacion < 0) calificacion = 0;
        System.out.println("Bajó la calificación en " + puntos + " puntos.");
    }
}
