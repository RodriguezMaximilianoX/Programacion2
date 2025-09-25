/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico4;

/**
 *
 * @author Maxi
 */
public class Principal {
    public static void main(String[] args) {
        // Instanciando empleados con ambos constructores
        Empleado e1 = new Empleado(100, "Juan Pérez", "Gerente", 80000);
        Empleado e2 = new Empleado("María López", "Secretaria");
        Empleado e3 = new Empleado("Carlos Gómez", "Programador");

        // Aplicando aumentos de salario
        e1.actualizarSalario(10.0);   // Aumento del 10%
        e2.actualizarSalario(5000);   // Aumento fijo de 5000
        e3.actualizarSalario(15.0);   // Aumento del 15%

        // Mostrando información de cada empleado
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // Mostrando total de empleados creados
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}
