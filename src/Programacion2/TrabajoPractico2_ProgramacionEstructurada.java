
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maxi
 */
public class TrabajoPractico2_ProgramacionEstructurada {
    
    public static void main(String[] args){
        /*Escribe un programa en Java que solicite al usuario un año y determine si es
      bisiesto. Un año es bisiesto si es divisible por 4, pero no por 100, salvo que sea
      divisible por 400.
    */
    /*
    Scanner input = new Scanner(System.in);
    int anio;
    
    System.out.print("Ingrese un año para saber si es bisiesto: ");
    anio = Integer.parseInt(input.nextLine());
    
    if (anio % 4 == 0) {
        System.out.println("El año es bisiesto");
    } else if (anio % 100 != 0 ) {
        if (anio % 400 == 0) {
            System.out.println("El año es bisiesto");
        } else{
            System.out.println("El año no es bisiesto");
        }
    }
    */
    
    /*
    Escribe un programa en Java que pida al usuario tres números enteros y
    determine cuál es el mayor.
    */
    Scanner input = new Scanner(System.in);
    int x, y, z, mayor; 
    System.out.println("Ingrese el primer numero: ");
    x = Integer.parseInt(input.nextLine());
    System.out.println("Ingrese el segundo numero: ");
    y = Integer.parseInt(input.nextLine());
    System.out.println("Ingrese el tercer numero: ");
    z = Integer.parseInt(input.nextLine());
        
        mayor = x;
    
        if (y > mayor) {
            mayor = y;
        }
        if (z > mayor) {
            mayor = z;
        }
        
        System.out.println("El mayor numero es " + mayor);
    }
    
}
