/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programacion2.TrabajoPractico3_IntroduccionAPOO;

/**
 *
 * @author Maxi
 */
public class Principal {
    public static void main(String[] args) {
        System.out.println("=== 1. REGISTRO DE ESTUDIANTES ===");
        Estudiante estudiante = new Estudiante("Juan", "Pérez", "Matemática", 7.5);
        estudiante.mostrarInfo();
        estudiante.subirCalificacion(1.0);
        estudiante.bajarCalificacion(0.5);
        estudiante.mostrarInfo();

        System.out.println("\n=== 2. REGISTRO DE MASCOTAS ===");
        Mascota mascota = new Mascota("Firulais", "Perro", 3);
        mascota.mostrarInfo();
        mascota.cumplirAnios();
        mascota.mostrarInfo();

        System.out.println("\n=== 3. ENCAPSULAMIENTO CON LIBRO ===");
        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);
        System.out.println("Intentando cambiar año a 1400 (inválido)...");
        libro.setAnioPublicacion(1400); // inválido
        System.out.println("Intentando cambiar año a 2020 (válido)...");
        libro.setAnioPublicacion(2020); // válido
        System.out.println("Libro final: " + libro.getTitulo() + " - " + libro.getAutor() + " - " + libro.getAnioPublicacion());

        System.out.println("\n=== 4. GESTIÓN DE GALLINAS ===");
        Gallina gallina1 = new Gallina(1, 1);
        Gallina gallina2 = new Gallina(2, 2);
        gallina1.envejecer();
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina2.envejecer();
        gallina2.ponerHuevo();
        gallina1.mostrarEstado();
        gallina2.mostrarEstado();

        System.out.println("\n=== 5. SIMULACIÓN DE NAVE ESPACIAL ===");
        NaveEspacial nave = new NaveEspacial("Apollo", 50);
        nave.despegar();
        nave.avanzar(100); // debería fallar por falta de combustible
        nave.recargarCombustible(30); // recargar
        nave.avanzar(20); // avanzar con combustible
        nave.mostrarEstado();
    }
}
