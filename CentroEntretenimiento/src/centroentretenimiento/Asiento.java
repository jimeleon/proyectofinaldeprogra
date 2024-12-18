/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centroentretenimiento;

/**
 *
 * @author Jimena
 */
public class Asiento {
    //Creamos el codigo para que los asientos esten ocupados o libres
    
    //Atributos del asiento
    private boolean ocupado;
    private Empleado empleado;
    
    public Asiento(){
        this.ocupado = false;
        this.empleado = null;
    }
    
    public boolean estaOcupado (){return ocupado;}
    
    //Metodos del asiento
    public void reservar (Empleado empleado){
        this.ocupado = true;
        this.empleado = empleado;
    }
    
    public void liberar (){
        this.ocupado = false;
        this.empleado = null;
    }
    public String getEstaOcupado(){
        return this.ocupado? "O":"L";
    }
    public Empleado getEmpleado(){return empleado;}
}

    

