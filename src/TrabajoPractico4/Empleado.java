/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrabajoPractico4;

/**
 *
 * @author Maxi
 */
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    private static int generadorId = 1;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    
    public Empleado(String nombre, String puesto) {
        this.id = generadorId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 30000.0; 
        totalEmpleados++;
    }

    @Override
    public String toString() {
        return "Empleados{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }
    
    private static int mostrarTotalEmpleados(){ 
        return totalEmpleados;
    }
    
    public double actualizarSalario(double porcAumento){
        return salario + salario*porcAumento/100;
    }
    
    public double actualizarSalario(int montoAumento){
        return salario + montoAumento;
    }
    
    public int getId() { 
        return id; 
    }
    
    public String getNombre() {
        return nombre; 
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre; 
    }
    
    public String getPuesto() {
        return puesto; 
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto; 
    }
    
    public double getSalario() {
        return salario; 
    }
    
    public void setSalario(double salario) {
        this.salario = salario; 
    }
}
