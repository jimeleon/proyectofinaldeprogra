/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centroentretenimiento;

/**
 *
 * @author Jimena
 */
public class Clases {
    //Codigo para la informacion de las clases de baile y yoga 
    
    //Variables 
    private String nombre;
    private int capacidad;
    private int[] reservas;
    private int contadorDeReservas;
    
    //Constructores 
    public Clases (String nombre, int capacidad){
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.reservas = new int[capacidad];
        this.contadorDeReservas = 0;
    }
    
    //Getters 
    public String getNombre(){
        return nombre;
    }
    
    public int getContadorDeReserva(){
        return contadorDeReservas;
    }
    
    //Metodos 
    public boolean reservarClase (int empleadoId){
        if (contadorDeReservas < capacidad){
            reservas[contadorDeReservas] = empleadoId;
            contadorDeReservas++;
            return true;
        }
        return false;
    }
    
    public boolean liberarEspacio (int empleadoId){
        for (int i = 0; i < contadorDeReservas; i++ ) {
            if (reservas [i] == empleadoId){
                reservas[i] = reservas[contadorDeReservas - 1];
                contadorDeReservas--;
                return true;
            }
        }
        return false;
            
    }
    public void mostrarReserva (){
        System.out.println("Clase reservada para "  + nombre + ":");
        for (int i = 0; i<contadorDeReservas; i++){
            System.out.println("Con el ID:" + reservas[i]);
        }
    }   
    
}
  
    

