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
public class EjercicioDePractica2 {
    
    /*
        Crear un programa que permita al usuario ingresar
        el largo, ancho y el precio del metro cuadrado de
        un terreno y devuelva el precio total y cuanto alambre
        se necesita para cercarlo con 3 vueltas
    */
    
    // Constantes
    final static int CANTIDAD_DE_VUELTAS = 3;
    
    public static void main(String[] args){
    
        // Declaracion de variables 
        double largoTerreno, anchoTerreno, precioMetroCuadrado, precioTotal, metrosAlambre;
        Scanner input = new Scanner(System.in);
        
        // Pedir datos al usuario
        System.out.println("Ingrese el largo del terreno: ");
        largoTerreno = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese el ancho del terreno");
        anchoTerreno = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese el precio del metro cuadrado: ");
        precioMetroCuadrado = Double.parseDouble(input.nextLine());
        
        // Calculos
        precioTotal = (largoTerreno * anchoTerreno) * precioMetroCuadrado;
        metrosAlambre = ((largoTerreno * 2) + (anchoTerreno * 2)) * CANTIDAD_DE_VUELTAS;
        
        // Mostrar resultados
        System.out.println("El costo total del terreno es de: " + precioTotal);
        System.out.println("La cantidad de alambre necesaria sera de: " + metrosAlambre + " metros");
        
    }
    
}
