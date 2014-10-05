package progra2;

import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JPanel;
import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;

public class VentanaListaClientes extends JFrame {
    private boolean DEBUG = true;

    public VentanaListaClientes(Object[][] arreglo) {
        super("Ejemplo de tabla modificable");
        this.setBounds(0, 0, 800, 800);
        this.setVisible(true);


        /*Object[][] data = {
            {"Ricardo Andrey Sánchez Delgado", "andreysanchezcr@gmail.com", 
             "9 de la mañana", "Fecha", "Persona adulta mayor"},
            {"Elizabeth", "andrey1996cr42@hotmail.com", 
             "3 de la tarde", "23 de agosto", "Person discapacitada"}
        };//DEpende del tamaño de la tabla esta se va a modificar*/

        String[] columnas = {"Nombre", 
                                "Correo Electronico",
                                "Hora",
                                "Fecha",
                                "Tipo de cliente"};

        final JTable tabla = new JTable(arreglo, columnas);
        tabla.setPreferredScrollableViewportSize(new Dimension(500, 70));

        if (DEBUG) {
            tabla.addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e) {
                    imprimirTabla(tabla);
                }
            });
        }

        //Create the scroll pane and add the table to it. 
        JScrollPane panelscroll = new JScrollPane(tabla);

        //Add the scroll pane to this window.
        getContentPane().add(panelscroll, BorderLayout.CENTER);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    private VentanaListaClientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void imprimirTabla(JTable tabla) {
        int numFilas = tabla.getRowCount();
        int numColumnas = tabla.getColumnCount();
        javax.swing.table.TableModel model = tabla.getModel();

        System.out.println("Valor de la información: ");
        for (int i=0; i < numFilas; i++) {
            System.out.print("    Fila " + i + ":");
            for (int j=0; j < numColumnas; j++) {
                System.out.print("  " + model.getValueAt(i, j));
            }
            System.out.println();
        }
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Object[][] arreglo={{1,2,3,4}};//Se tiene que cumplir el tamaño establicido del arreglo;
        VentanaListaClientes frame = new VentanaListaClientes(arreglo);
        frame.pack();
        frame.setVisible(true);
    }
}
