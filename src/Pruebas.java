
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maxi
 */
public class Pruebas {
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);

        String contrasena;

        String contrasenaCorrecta = "admin123";



        
        int contador = 0;
        while(contador < 3){
            System.out.println("Corriendo dentro del bucle while");
            contador ++;
        }
        for (int i = 0; i < 10; i+= 2) {
            System.out.println("Corriendo dentro del bucle For");
            System.out.println("Valor de i= " + i);
        }
        do {
            System.out.println("Ejecutando el bucle Do While sin validar la condicion");
        } while (1 > 2);
        do {
             System.out.print("Ingrese la contraseña: ");

            contrasena = scan.nextLine();
        } while (!contrasena.equals(contrasenaCorrecta));
         System.out.println("¡Contraseña correcta! Acceso concedido.");
    }
    
}
