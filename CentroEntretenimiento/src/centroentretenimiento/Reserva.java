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
public class Reserva {
    //Codigo para el menu y pedir informacion 
    
    //Variables 
    private Clases[] clase;
    
    //Instanciamos las clases
    public Reserva(){
        clase = new Clases[2];
        clase[0] = new Clases ("Baile", 30);
        clase[1] = new Clases ("Yoga", 30);
    }
    
    //Codigo para el menu de las clases 
    public void mostrarMenu(){
        String menu = "Bienvenidos a las clases de yoga y baile\n" +
                      "Porfavor, seleccione una opcion\n" +
                      "1. Reservar clase\n"+
                      "2. Liberar espacio\n" +
                      "3. Mostrar la reserva\n" +
                      "4. Salir";
        String opcionString = JOptionPane.showInputDialog(menu);
        
        if (opcionString != null){
            int opcion = Integer.parseInt(opcionString);
            ejecutarOpcion (opcion);
        }
    }
    
    public void ejecutarOpcion (int opcion){
        switch (opcion){
            case 1:
                String nombreEmpleado = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
                String idString = JOptionPane.showInputDialog("Ingrese el ID del empleado:");
                int empleadoID = Integer.parseInt(idString);
                String claseString = JOptionPane.showInputDialog("Eliga la clase que desee: (1.Baile, 2.Yoga)");
                int seleccionDeClase = Integer.parseInt(claseString);
                if (seleccionDeClase >= 1 && seleccionDeClase <= 2){
                    if (clase [seleccionDeClase - 1].reservarClase(empleadoID)){
                        JOptionPane.showMessageDialog(null, "Su reserva se hizo exitosamente");
                    } else {
                        JOptionPane.showMessageDialog(null, "NO hay espacios disponibles para reservar");
                    } 
                } else {
                    JOptionPane.showMessageDialog(null, "Clase no valida.");
                }
                break;
                
            case 2: 
                idString = JOptionPane.showInputDialog("Ingrese el Id del empleado:");
                empleadoID = Integer.parseInt(idString);
                claseString = JOptionPane.showInputDialog("Eliga la clase que desee liberar espacio: (1.Baile, 2. Yoga)");
                seleccionDeClase = Integer.parseInt(claseString);
                if (seleccionDeClase >= 1 && seleccionDeClase <= 2){
                    if (clase [seleccionDeClase - 1].liberarEspacio(empleadoID)){
                        JOptionPane.showMessageDialog(null, "Su reserva fue liberada exitosamente"); 
                    } else {
                        JOptionPane.showMessageDialog(null, "No pudimos encontrar su ID.");  
                    }
                } else {
                    JOptionPane.showMessageDialog(null,"Clase no valida." );
                }
                break;
                
            case 3:
                for (Clases clase : clase){
                    clase.mostrarReserva();
                }
                break;
                
            case 4: 
                JOptionPane.showMessageDialog(null, "Saliendo del sistema.");
                System.exit(0);
                break;
            
            default:
                JOptionPane.showMessageDialog(null, "OPcion no valida. Intente nuevamente");  
                    
        }
    }
    
}
    

