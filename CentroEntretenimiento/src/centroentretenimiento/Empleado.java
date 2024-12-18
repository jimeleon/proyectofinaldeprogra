/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centroentretenimiento;

/**
 *
 * @author Jimena
 */
public class Empleado {
    // Creamos la informacion de los empleados para almacenarla
    
    //Atributos del empleado
    private int id;
    private String nombre;
    
    //Inicialización de las variables del empleado
    public Empleado (int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    }
    //Obtener el id y nombre del empleado
    public int getId () {return id;}
    public String getNombre () {return nombre;}
    
}

    

