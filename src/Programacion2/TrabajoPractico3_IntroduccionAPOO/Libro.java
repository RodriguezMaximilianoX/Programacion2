/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programacion2.TrabajoPractico3_IntroduccionAPOO;

/**
 *
 * @author Maxi
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion);
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnioPublicacion() { return anioPublicacion; }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion >= 1450 && anioPublicacion <= 2025) {
            this.anioPublicacion = anioPublicacion;
            System.out.println("Año de publicación actualizado a: " + anioPublicacion);
        } else {
            System.out.println("Error: Año de publicación inválido (" + anioPublicacion + ")");
        }
    }
}
