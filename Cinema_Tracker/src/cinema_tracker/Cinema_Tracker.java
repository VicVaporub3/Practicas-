/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cinema_tracker;

import java.awt.PopupMenu;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author invitado
 */
public class Cinema_Tracker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    public class CinemaTracker extends JFrame{
        private JComboBox<String> peliculaCombo;
        private JComboBox<String> horarioCombo;
        private JComboBox<String> filaCombo;
        private JComboBox<String> asientoCombo;
        private JCheckBox comidaCheckBox;
        private JTextField dineroEntregadoField;
        private JTextArea resultadoArea;
        private JButton calcularButton;
        private JButton pagarButton;
        
        private double precioEntrada;
        private double precioComida;
        private double descuento;
        private double totalPagar;
        
        
        public CinemaTracker(){
            // Configurar la ventana
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setTitle("Sistema de cine");
            setSize(400, 400);
            setLocationRelativeTo(null);
            setLayout(null);
            
            // Etiqueta y combo de seleccion de pelicula
            JLabel peliulaLabel = new JLabel("Pelicula: ");
            peliculaLabel.setBounds(10, 10, 100, 25);
            PopupMenu peliculaLabel = null;
            add(peliculaLabel);

        peliculaCombo = new JComboBox<>();
        peliculaCombo.addItem("Pelicula 1");
        peliculaCombo.addItem("Pelicula 2");
        peliculaCombo.setBounds(120, 10, 200, 25);
        add(peliculaCombo);

           
        }
        
        
        
    }
}
