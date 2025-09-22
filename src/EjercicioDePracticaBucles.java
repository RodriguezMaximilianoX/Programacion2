
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Maxi
 */
public class EjercicioDePracticaBucles {
    
    public static void main(String[] args){
        int x = factorial(5);
        System.out.println(x);
    } 
    
    public static int factorial(int num){
        if (num == 0) {
            return 1;
        } else{
            return factorial(num - 1) * num;
        }
    }
    
}
