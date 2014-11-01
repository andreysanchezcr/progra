package tareaprogramada2;

import java.awt.Color;

/**
 * Implementacion de la clase VentanaGraficoTipoClientes
 * @author Familia Alpizar R
 */
public class VentanaGraficoTipoClientes extends javax.swing.JDialog {

    /**
     * Constructor de la clase VentanaGraficoTipoClientes
     */
    public VentanaGraficoTipoClientes(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.getContentPane().setBackground(Color.white);
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
