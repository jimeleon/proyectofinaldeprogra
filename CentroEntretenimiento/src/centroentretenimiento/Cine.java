/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centroentretenimiento;


/**
 *
 * @author Jimena
 */
public class Cine {
    //Creacion de las salas de cine en la oficina
    
    //Codigo para ver N salas
    private SaladeCine[] salas;
    
    public Cine (int numSalas){
        this.salas = new SaladeCine [numSalas];{
        for (int i = 0; i < numSalas; i++)
            salas[i] = new SaladeCine("Pelicula" + (i + 1), 6, 6);
        
        }
    }
    
    //Codigo para mostrar las peliculas y asiento de las salas, ademas de modificar estas opciones
    public void mostrarSalas (){
     for (int i = 0; i < salas.length; i++){
         System.out.println("Sala: " + (i + 1));
            salas[i].mostrarAsientos();
            System.out.println();
     }   
    }
    
    public void cambiarSala (int numSalas,  String nombrepeli, int filas, int columnas){
        if (numSalas > 0 && numSalas <= salas.length){
            salas[numSalas - 1] = new SaladeCine(nombrepeli, filas, columnas);
            System.out.println("Sala " + numSalas + " cambiada por  '" + nombrepeli + "' con tamaño de " + filas + "x" + columnas + ".");
        } 
        else {
        System.out.println("Número de sala incorrecta.");
             
        }
        
    }
    
    //Codigo para asignar o hacer reservas y liberar un asiento 
    public void asignarAsiento(int numSalas, int id, String nombre, int filas, int columnas) {
        if (numSalas > 0 && numSalas <= salas.length) {
            Empleado empleado = new Empleado(id, nombre);

            if (filas >= 0 && filas < salas[numSalas - 1].getAsientos().length &&
                columnas >= 0 && columnas < salas[numSalas - 1].getAsientos()[0].length &&
                !salas[numSalas - 1].getAsientos()[filas][columnas].estaOcupado()) {

                salas[numSalas - 1].getAsientos()[filas][columnas].reservar(empleado);
                System.out.println("Asiento en sala " + numSalas + " fila " + filas + ", columna " + columnas + " está reservado para " + nombre);
            } else {
                System.out.println("El asiento ya está ocupado o es incorrecto.");
            }
        } else {
            System.out.println("Número de sala incorrecto.");
        }
    }

    public void liberarAsiento (int numSalas, int filas, int columnas) {
        if (numSalas > 0 && numSalas <= salas.length) {
            if (filas >= 0 && filas < salas[numSalas - 1].getAsientos().length &&
                columnas >= 0 && columnas < salas[numSalas - 1].getAsientos()[0].length &&
                salas[numSalas - 1].getAsientos()[filas][columnas].estaOcupado()) {

                salas[numSalas - 1].getAsientos()[filas][columnas].liberar();
                System.out.println("Asiento en sala " + numSalas + " fila " + filas + ", columna " + columnas + " liberado correctamente.");
            } else {
                System.out.println("El asiento ya está libre o es incorrecto.");
            }
        } else {
            System.out.println("Número de sala incorrecto.");
        }
    }
       
}    

    

