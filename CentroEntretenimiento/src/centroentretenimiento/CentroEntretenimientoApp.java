/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package centroentretenimiento;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Jimena
 */
public class CentroEntretenimientoApp extends JFrame {
    private Cine cine;
    private Reserva reserva;


    public CentroEntretenimientoApp (){
    cine = new Cine(3);  // Inicializa el cine con 3 salas
    reserva = new Reserva(); // Inicializa las clases de yoga y baile
  

    
    setTitle("Bienvenidos al centro de entretenimiento y salud de FitFlix");
    setSize(600, 400);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLocationRelativeTo(null);
            
        
    // Crear el panel principal
    JPanel panel = new JPanel();
    panel.setLayout(new GridLayout(3, 1)); // Layout vertical

    // Título
    JLabel titleLabel = new JLabel("Bienvenidos al centro de entretenimiento y salud de FitFlix", SwingConstants.CENTER);
    titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
    panel.add(titleLabel);

    // Botones
    JButton btnCine = new JButton("CINE");
    JButton btnClases = new JButton("CLASES");

    // Agregar acción a los botones
    btnCine.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
    mostrarMenuCine();
        }
    });

    btnClases.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            mostrarMenuClases();
        }
    });

    panel.add(btnCine);
    panel.add(btnClases);
        
    add(panel); // Agregar el panel a la ventana
    }

    private void mostrarMenuCine() {
        SaladeCine.mostrarMenuCine(cine);
    }

    private void mostrarMenuClases() {
        reserva.mostrarMenu();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CentroEntretenimientoApp app = new CentroEntretenimientoApp();
            app.setVisible(true);
        });
    }
}
