/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package centroentretenimiento;

import javax.swing.JOptionPane;

/**
 *
 * @author Jimena
 */
public class SaladeCine {
    //Creamos la informacion de las salas de cine
    
   //Atributos de la sala de cine
    private String nombrepeli;
    private Asiento[][] asientos;
    
    
    //Metodos
    public SaladeCine(String nombrepeli, int filas, int columnas){
        this.nombrepeli = nombrepeli;
        asientos = new Asiento[filas][columnas];
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                asientos[i][j] = new Asiento();
              
            }
            
        }
        
    }
    public String getNombrePeli(){return nombrepeli;}
    public void setNombrePeli (String nombre) {this.nombrepeli = nombre;}
    public Asiento[][] getAsientos() {return asientos;}
    
    
    
    //Codigo para mostrar la interfaz grafica de los asientos
    public void mostrarAsientos(){
        System.out.println("Pelicula:" +nombrepeli);
        System.out.println("L: libre, O: ocupado");
        System.out.println("  _________ Pantalla");
        System.out.println();
        String[] clasificarFilas = {"A","B","C","D","E","F"};        
        for(int i =0; i < asientos.length; i++){
           System.out.print(clasificarFilas[i] + " ");
           for(int j = 0; j< asientos.length; j++){
               System.out.print(asientos[i][j].getEstaOcupado()+" ");
           }
           System.out.println();
          
        }
        for (int j = 0; j < asientos[0].length; j++){
            System.out.print(" "+(j+1));
        }
        System.out.println();
    }
    
    // Codigo para el menu principal del cine 
    public static void mostrarMenuCine (Cine cine){
        boolean salir = false;
        
        while (!salir){
            String menu = "Bienvenidos al cine\n" +
                          "Seleccione la opción que deseas:\n" +
                          "1. Mostrar salas y asientos\n" +
                          "2. Reservar asiento\n" +
                          "3. Liberar asiento\n" +
                          "4. Cambiar película y tamaño de sala\n" +
                          "5. Salir";
            
        String opcionString = JOptionPane.showInputDialog(menu);
        if (opcionString == null) {
            salir = true; 
            continue;
        }
        int opcion = Integer.parseInt(opcionString);
        
        switch (opcion) {
            case 1:
                cine.mostrarSalas();
                break;
            case 2:
                String numSalaString = JOptionPane.showInputDialog("Ingrese el número de sala (son 3):");
                int numSala = Integer.parseInt(numSalaString);
                String idEmpleadoString = JOptionPane.showInputDialog("Ingrese el ID del empleado:");
                int idEmpleado = Integer.parseInt(idEmpleadoString);
                String nombreEmpleado = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
                String filaString = JOptionPane.showInputDialog("Ingrese fila del asiento(6):");
                int fila = Integer.parseInt(filaString) - 1; // Ajustar a índice 0
                String columnaString = JOptionPane.showInputDialog("Ingrese columna del asiento(6):");
                int columna = Integer.parseInt(columnaString) - 1; // Ajustar a índice 0
                cine.asignarAsiento(numSala, idEmpleado, nombreEmpleado, fila, columna);
                break;
                
            case 3:
                numSalaString = JOptionPane.showInputDialog("Ingrese el número de sala:");
                numSala = Integer.parseInt(numSalaString);
                filaString = JOptionPane.showInputDialog("Ingrese fila del asiento:");
                fila = Integer.parseInt(filaString) - 1; // Ajustar a índice 0
                columnaString = JOptionPane.showInputDialog("Ingrese columna del asiento:");
                columna = Integer.parseInt(columnaString) - 1; // Ajustar a índice 0
                cine.liberarAsiento(numSala, fila, columna);
                break;
                
            case 4:
                numSalaString = JOptionPane.showInputDialog("Ingrese el número de sala a cambiar:");
                numSala = Integer.parseInt(numSalaString);
                String nuevoNombrePeli = JOptionPane.showInputDialog("Ingrese el nuevo nombre de la película:");
                String nuevasFilasString = JOptionPane.showInputDialog("Ingrese número de filas:");
                int nuevasFilas = Integer.parseInt(nuevasFilasString);
                String nuevasColumnasString = JOptionPane.showInputDialog("Ingrese número de columnas:");
                int nuevasColumnas = Integer.parseInt(nuevasColumnasString);
                cine.cambiarSala(numSala, nuevoNombrePeli, nuevasFilas, nuevasColumnas);
                break;
                
            case 5:
                salir = true;
                break;
                
                default:
                JOptionPane.showMessageDialog(null, "Opción no válida. Intente nuevamente.");
            }
        }
    }
}


    