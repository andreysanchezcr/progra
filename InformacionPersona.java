package tareaprogramada2;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 * Implementacion de la clase InformacionPercona
 * @author Familia Alpizar R
 */
public class InformacionPersona extends javax.swing.JDialog {

    /**
     * Constructor de la clase InformacionPersona
     */
    public InformacionPersona(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.getContentPane().setBackground(Color.white); // fondo blanco
        
        //Permite que solo se seleccione un tipo de cliente
        grupoBotones.add(pDiscapacitada);
        grupoBotones.add(adultoMayor);
        grupoBotones.add(mEmbarazada);
        grupoBotones.add(cCorporativo);
        grupoBotones.add(cRegular);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones = new javax.swing.ButtonGroup();
        informacion = new javax.swing.JPanel();
        nombrePersona = new javax.swing.JTextField();
        correoElectronico = new javax.swing.JTextField();
        TipoPersona2 = new javax.swing.JPanel();
        pDiscapacitada = new javax.swing.JRadioButton();
        adultoMayor = new javax.swing.JRadioButton();
        mEmbarazada = new javax.swing.JRadioButton();
        cCorporativo = new javax.swing.JRadioButton();
        cRegular = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        registrarPersona = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        informacion.setBackground(new java.awt.Color(255, 255, 255));
        informacion.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Ingrese sus datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        TipoPersona2.setBackground(new java.awt.Color(255, 255, 255));
        TipoPersona2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true), "Tipo de persona", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        pDiscapacitada.setBackground(new java.awt.Color(255, 255, 255));
        pDiscapacitada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pDiscapacitada.setText("Persona con discapacidad");

        adultoMayor.setBackground(new java.awt.Color(255, 255, 255));
        adultoMayor.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adultoMayor.setText("Adulto Mayor");

        mEmbarazada.setBackground(new java.awt.Color(255, 255, 255));
        mEmbarazada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mEmbarazada.setText("Mujer embarazada");

        cCorporativo.setBackground(new java.awt.Color(255, 255, 255));
        cCorporativo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cCorporativo.setText("Cliente corporativo");

        cRegular.setBackground(new java.awt.Color(255, 255, 255));
        cRegular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cRegular.setText("Cliente Regular");

        javax.swing.GroupLayout TipoPersona2Layout = new javax.swing.GroupLayout(TipoPersona2);
        TipoPersona2.setLayout(TipoPersona2Layout);
        TipoPersona2Layout.setHorizontalGroup(
            TipoPersona2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TipoPersona2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(TipoPersona2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(adultoMayor)
                    .addComponent(pDiscapacitada)
                    .addComponent(mEmbarazada)
                    .addComponent(cRegular)
                    .addComponent(cCorporativo))
                .addContainerGap())
        );
        TipoPersona2Layout.setVerticalGroup(
            TipoPersona2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TipoPersona2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pDiscapacitada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adultoMayor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mEmbarazada)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cCorporativo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cRegular)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Correo electrónico:");

        registrarPersona.setText("Registrar");
        registrarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarPersonaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout informacionLayout = new javax.swing.GroupLayout(informacion);
        informacion.setLayout(informacionLayout);
        informacionLayout.setHorizontalGroup(
            informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionLayout.createSequentialGroup()
                .addGroup(informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informacionLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(27, 27, 27)
                        .addGroup(informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(informacionLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(TipoPersona2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, informacionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(registrarPersona)
                .addGap(33, 33, 33))
        );
        informacionLayout.setVerticalGroup(
            informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informacionLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nombrePersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(informacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(correoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(TipoPersona2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registrarPersona)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(informacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(informacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Recolecta los datos de los clientes para darles un turno segun su prioridad
     * @param evt 
     */
    private void registrarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarPersonaActionPerformed
        if ("".equals(nombrePersona.getText()) && "".equals(correoElectronico.getText())){
            JOptionPane.showMessageDialog(null, "Complete todos datos", "Atención", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_registrarPersonaActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(InformacionPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionPersona.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InformacionPersona dialog = new InformacionPersona(new javax.swing.JFrame(), true);
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
    private javax.swing.JPanel TipoPersona2;
    private javax.swing.JRadioButton adultoMayor;
    private javax.swing.JRadioButton cCorporativo;
    private javax.swing.JRadioButton cRegular;
    public javax.swing.JTextField correoElectronico;
    private javax.swing.ButtonGroup grupoBotones;
    private javax.swing.JPanel informacion;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton mEmbarazada;
    public javax.swing.JTextField nombrePersona;
    private javax.swing.JRadioButton pDiscapacitada;
    public javax.swing.JButton registrarPersona;
    // End of variables declaration//GEN-END:variables
}
