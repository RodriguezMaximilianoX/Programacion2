
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
    /*
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
    System.out.println("El mayor numero es " + mayor);*/
    
    /*
        Escribe un programa en Java que solicite al usuario su edad y clasifique su etapa de vida según la siguiente tabla:
    */
    
        /*
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        if (edad < 0) {
            System.out.println("La edad no puede ser negativa.");
        } else if (edad <= 12) {
            System.out.println("Etapa de vida: Niño");
        } else if (edad <= 17) {
            System.out.println("Etapa de vida: Adolescente");
        } else if (edad <= 29) {
            System.out.println("Etapa de vida: Joven");
        } else if (edad <= 59) {
            System.out.println("Etapa de vida: Adulto");
        } else {
            System.out.println("Etapa de vida: Adulto mayor");
        }
    */
        
    /*
        Escribe un programa que solicite al usuario el precio de un producto y
        su categoría (A, B o C).
    */
        
    /*
        Scanner scanner = new Scanner(System.in);

        // Solicitar precio
        System.out.print("Ingrese el precio del producto: ");
        double precioOriginal = scanner.nextDouble();

        // Solicitar categoría
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        char categoria = scanner.next().toUpperCase().charAt(0);

        double descuento;

        // Determinar descuento según categoría
        switch (categoria) {
            case 'A' -> descuento = 0.10;
            case 'B' -> descuento = 0.15;
            case 'C' -> descuento = 0.20; 
            default -> {
                System.out.println("Categoría inválida. Debe ser A, B o C.");
                scanner.close();
                return;
            }
        }

        // Calcular precio final
        double montoDescuento = precioOriginal * descuento;
        double precioFinal = precioOriginal - montoDescuento;

        // Mostrar resultados
        System.out.println("Precio original: $" + precioOriginal);
        System.out.println("Descuento aplicado: $" + montoDescuento);
        System.out.println("Precio final: $" + precioFinal);
    */
    
    /*
    Escribe un programa que solicite números al usuario y sume solo los
    números pares. El ciclo debe continuar hasta que el usuario ingrese el número
    0, momento en el que se debe mostrar la suma total de los pares ingresados.    
    */
    
    /*
    Scanner scanner = new Scanner(System.in);
        int numero;
        int sumaPares = 0;

        do {
            System.out.print("Ingrese un número (0 para salir): ");
            numero = scanner.nextInt();

            if (numero % 2 == 0 && numero != 0) {
                sumaPares += numero;
            }
        } while (numero != 0);

        System.out.println("La suma total de los números pares ingresados es: " + sumaPares);
    */
        
        
    }
    
}
