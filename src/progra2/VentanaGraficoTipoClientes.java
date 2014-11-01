
package progra2;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.xml.bind.Marshaller.Listener;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;

/**
 * Implementacion de la clase VentanaGraficoTipoClientes
 * @author Familia Alpizar R
 */
public class VentanaGraficoTipoClientes extends javax.swing.JFrame {
    
        private ChartPanel pastel() {

        // Fuente de Datos
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(8, "Mujeres", "Lunes");
        dataset.setValue(7, "Hombres", "Lunes");
        dataset.setValue(9, "Mujeres", "Martes");
        dataset.setValue(4, "Hombres", "Martes");
        dataset.setValue(4, "Mujeres", "Miercoles");
        dataset.setValue(5, "Hombres", "Miercoles");
        dataset.setValue(8, "Mujeres", "Jueves");
        dataset.setValue(9, "Hombres", "Jueves");
        dataset.setValue(7, "Mujeres", "Viernes");
        dataset.setValue(8, "Hombres", "Viernes");
        // Creando el Grafico
        JFreeChart chart = ChartFactory.createBarChart3D
        ("Participacion por Genero","Genero", "Dias",
        dataset, PlotOrientation.VERTICAL, true,true, false);
        chart.setBackgroundPaint(Color.cyan);
        chart.getTitle().setPaint(Color.black);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.red);
        // Mostrar Grafico
        ChartPanel chartPanel = new ChartPanel(chart);
        JButton cambio= new JButton("Cambio");
        cambio.setBounds(0 , 0, 10, 10);
        cambio.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
cambio(graficoBarras());            }
        });
        this.add(cambio);
        
        return chartPanel;
    }
        public void cambio(ChartPanel g ){
            this.getContentPane().removeAll();
            this.getContentPane().add(g);
        }
 
    private ChartPanel init2() {

        DefaultPieDataset pastel = new DefaultPieDataset();
        pastel.setValue("Programacion", 45);
        pastel.setValue("Electronica", 11);
        pastel.setValue("Hacking", 19.5);
        pastel.setValue("SEO", 30.5);
        pastel.setValue("Redes", 2.0);
 
        // Creando el Grafico
        JFreeChart chart = ChartFactory.createPieChart3D("Ejemplo de pastel", pastel, true, true, false);
        PiePlot3D pieplot3d = (PiePlot3D)chart.getPlot();
        pieplot3d.setDepthFactor(0.2); // Esto lo que dicta es la inclinacion del pastel
        pieplot3d.setStartAngle(290D); // Este es el angulo en el que se mostrara inicialmente
        pieplot3d.setDirection(Rotation.CLOCKWISE);
        pieplot3d.setForegroundAlpha(0.5F); //ESta es la cantidad de transparencia del pastel
        
        // Mostrar Grafico
        ChartPanel chartPanel = new ChartPanel(chart);
        JButton cambio = new JButton("Cambio");
        cambio.setBounds(100, 100, 100, 100);
        ActionListener ae = new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Entro");
                
                
            }
            
        };
        cambio.addActionListener(ae);
        this.add(cambio);

        return chartPanel;
    }

    /**
     * Constructor de la clase VentanaGraficoTipoClientes
     */
        
    private static ChartPanel graficoBarras() {
        // Fuente de Datos
        DefaultPieDataset pastel = new DefaultPieDataset();
        pastel.setValue("Programacion", 45);
        pastel.setValue("Electronica", 11);
        pastel.setValue("Hacking", 19.5);
        pastel.setValue("SEO", 30.5);
        pastel.setValue("Redes", 2.0);
 
        // Creando el Grafico
        JFreeChart chart = ChartFactory.createPieChart3D("Ejemplo de pastel", pastel, true, true, false);
        PiePlot3D pieplot3d = (PiePlot3D)chart.getPlot();
        pieplot3d.setDepthFactor(0.2); // Esto lo que dicta es la inclinacion del pastel
        pieplot3d.setStartAngle(290D); // Este es el angulo en el que se mostrara inicialmente
        pieplot3d.setDirection(Rotation.CLOCKWISE);
        pieplot3d.setForegroundAlpha(0.5F); //ESta es la cantidad de transparencia del pastel
        JButton cambio = new JButton();
        cambio.setBounds(0, 0, 100, 100);
        cambio.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
    cambio(pastel);            
            }
        });
        // Mostrar Grafico
        ChartPanel chartPanel = new ChartPanel(chart);
        return chartPanel;
    }
    public VentanaGraficoTipoClientes(java.awt.Frame parent, boolean modal) {

        super();
                JPanel panelGraficoBarrass=new JPanel();

        pastel();
        this.getContentPane().setBackground(Color.white);
        this.getContentPane().add(graficoBarras());
        javax.swing.JPanel      a = new javax.swing.JPanel(); 
        a.add(graficoBarras());
        this.add(a);
        this.repaint();
        this.setBounds(0, 0, 1000, 1000);
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        graficos = new javax.swing.JTabbedPane();
        panelGraficoBarras = new javax.swing.JPanel();
        panelGraficoPastel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gráficos según el tipo de cliente");

        panelGraficoBarras.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelGraficoBarrasLayout = new javax.swing.GroupLayout(panelGraficoBarras);
        panelGraficoBarras.setLayout(panelGraficoBarrasLayout);
        panelGraficoBarrasLayout.setHorizontalGroup(
            panelGraficoBarrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );
        panelGraficoBarrasLayout.setVerticalGroup(
            panelGraficoBarrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );

        graficos.addTab("Gráfico de Barras", panelGraficoBarras);

        panelGraficoPastel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelGraficoPastelLayout = new javax.swing.GroupLayout(panelGraficoPastel);
        panelGraficoPastel.setLayout(panelGraficoPastelLayout);
        panelGraficoPastelLayout.setHorizontalGroup(
            panelGraficoPastelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 542, Short.MAX_VALUE)
        );
        panelGraficoPastelLayout.setVerticalGroup(
            panelGraficoPastelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 399, Short.MAX_VALUE)
        );

        graficos.addTab("Gráfico Pastel", panelGraficoPastel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(graficos)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(graficos)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaGraficoTipoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaGraficoTipoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaGraficoTipoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaGraficoTipoClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                VentanaGraficoTipoClientes dialog = new VentanaGraficoTipoClientes(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JTabbedPane graficos;
    private javax.swing.JPanel panelGraficoBarras;
    private javax.swing.JPanel panelGraficoPastel;
    // End of variables declaration//GEN-END:variables
}
