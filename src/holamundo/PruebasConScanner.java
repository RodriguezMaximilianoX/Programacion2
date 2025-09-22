/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class PruebasConScanner {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        int edad;
        
        System.out.println("Ingrese su edad");
        edad = Integer.parseInt(input.nextLine());
        
        System.out.println("Ingrese su nombre");
        nombre = input.nextLine();
        
        System.out.println("El nombre es: " + nombre);
        System.out.println("Su edad es: " + edad);
        
    }
    
}
