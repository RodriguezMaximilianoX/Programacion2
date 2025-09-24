
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
        
        int contador = 1;
        
        while(contador <= 3){
            System.out.println("Conteo externo: " + contador);
            for (int i = 1; i <= 4; i++) {
                System.out.println("Conteo interno: " + i);
            }
            contador ++;
        }
         
         
    }
    
}
