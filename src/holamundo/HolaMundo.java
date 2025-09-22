/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author Maxi
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2;
        double resultado;
        
        System.out.println("Ingrese el primer numero: ");
        num1 = Integer.parseInt(input.nextLine());
        System.out.println("Ingrese el segundo numero: ");
        num2 = Integer.parseInt(input.nextLine());
        
        // Division sin casting
        resultado = num1 / num2;
        System.out.println("El resultado de la division sin casting es: " + resultado);
        
        // Division con casting
        resultado = (double) num1 / num2;
        System.out.println("El resultado de la division usando casting es: " + resultado);
      
    }
    
}
