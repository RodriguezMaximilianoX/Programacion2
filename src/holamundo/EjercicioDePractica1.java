package holamundo;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maxi
 */
public class EjercicioDePractica1 {
    
    // Escribir un programa que calcule la edad del usuario
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int anioNacimiento, anioActual, edad;
        
        // Pedir al usuario su año de nacimiento
        System.out.println("Ingrese su año de nacimiento");
        anioNacimiento = input.nextInt();
        
        // Pedir al usuario el año actual
        System.out.println("Ingrese el año actual");
        anioActual = input.nextInt();
        
        // Calcular la edad con la diferencia
        edad = anioActual - anioNacimiento;
        
        // Mostrar el resultado al usuario
        System.out.println("Su edad es: " + edad);
        
    }
    
}
