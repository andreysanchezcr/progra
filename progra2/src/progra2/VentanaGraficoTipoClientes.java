package progra2;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;
import static progra2.VentanaGraficoTipoClientes.pastel;

/**
 * Implementacion de la clase VentanaGraficoTipoClientes
 * @author Familia Alpizar R
 */
public class VentanaGraficoTipoClientes extends javax.swing.JDialog implements MouseListener,MouseMotionListener{
    
    javax.swing.JButton cambio=new javax.swing.JButton();
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        if(evt.getSource()==cambio){
            System.out.println("Esta en este print");
        }
            }
        public static ChartPanel barras() {
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
        return chartPanel;
    }

    public static ChartPanel pastel(){
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
        return chartPanel;
    }

    /**
     * Constructor de la clase VentanaGraficoTipoClientes
     */
    
    public VentanaGraficoTipoClientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        cambio.setBounds(500, 10, 30, 30);
        //nitComponents();
        this.getContentPane().setBackground(Color.white);
        javax.swing.JPanel hola = new javax.swing.JPanel();
        hola.setBounds(100, 100, 100, 100);
        //hola.add(pastel());
        this.setBounds(1, 1, 1000, 1000
        );

//        cambio.addMouseListener(this);
        cambio.setText("Pastel");
        cambio.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                eventoCambio(e);
            }
        });
        hola.add(cambio);
        hola.add(barras());
        
        
        this.add(hola);
        
        

    }
    void eventoCambio(ActionEvent ae){
        ChartPanel grafic=pastel();
        grafic.setBounds(100, 100, 100, 100);


        if(ae.getSource()==cambio&&cambio.getText()=="Barras"){
            
            //this.getContentPane().remove(cambio);
            //cambio.setBounds(100,100,100,100);
            ChartPanel grafico = barras()
                    ;
            grafico.setBounds(100, 100, 100, 100);
            this.getContentPane().removeAll();
            this.getContentPane().add(cambio);
            this.getContentPane().add(grafico);
            //this.getContentPane().add(cambio);
             cambio.setText("Pastel");
         
        
        System.out.println("Esta en este boton");
        }
        else{
            this.getContentPane().removeAll();
            this.getContentPane().add(cambio);
            this.getContentPane().add(grafic);
             cambio.setText("Barras");
         

            System.out.println("No entro en el bton");
    }}

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        graficos = new javax.swing.JTabbedPane();
        panelGraficoBarras = new javax.swing.JPanel();
        panelGraficoPastel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

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

        jLabel1.setText("Esto es un label");

        javax.swing.GroupLayout panelGraficoPastelLayout = new javax.swing.GroupLayout(panelGraficoPastel);
        panelGraficoPastel.setLayout(panelGraficoPastelLayout);
        panelGraficoPastelLayout.setHorizontalGroup(
            panelGraficoPastelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGraficoPastelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(433, Short.MAX_VALUE))
        );
        panelGraficoPastelLayout.setVerticalGroup(
            panelGraficoPastelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGraficoPastelLayout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addContainerGap(301, Short.MAX_VALUE))
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
            @Override
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panelGraficoBarras;
    private javax.swing.JPanel panelGraficoPastel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
            System.out.println("Estas en este boton");
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mousePressed(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
