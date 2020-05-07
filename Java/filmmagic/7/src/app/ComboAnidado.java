package app;

import modelo.estados;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import modelo.localidades;
import modelo.municipios;

public class ComboAnidado extends javax.swing.JFrame {
    
    public ComboAnidado() {
        initComponents();
        setLocationRelativeTo(null);
        estados cc = new estados();
        
        DefaultComboBoxModel modelEstado = new DefaultComboBoxModel(cc.mostrarEstados());
        cbxEstado.setModel(modelEstado);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cbxEstado = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbxMunicipio = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        cbxLocalidad = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDatos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("Estado:");

        cbxEstado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxEstadoItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Municipio: ");

        cbxMunicipio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxMunicipio.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxMunicipioItemStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Localidad:");

        cbxLocalidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxLocalidad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxLocalidadItemStateChanged(evt);
            }
        });

        txtDatos.setColumns(20);
        txtDatos.setRows(5);
        jScrollPane2.setViewportView(txtDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbxLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(cbxMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxMunicipio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbxLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxEstadoItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            estados est = (estados) cbxEstado.getSelectedItem();
            municipios mun = new municipios();
            DefaultComboBoxModel modelMunicipio = new DefaultComboBoxModel(mun.mostrarMunicipio(est.getId()));
            cbxMunicipio.setModel(modelMunicipio);
            cbxLocalidad.removeAllItems();
            txtDatos.setText("");
        }

    }//GEN-LAST:event_cbxEstadoItemStateChanged

    private void cbxMunicipioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxMunicipioItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            municipios mun = (municipios) cbxMunicipio.getSelectedItem();
            localidades loc = new localidades();
            DefaultComboBoxModel modelLocalidad = new DefaultComboBoxModel(loc.mostrarLocalidad(mun.getId()));
            cbxLocalidad.setModel(modelLocalidad);
        }
    }//GEN-LAST:event_cbxMunicipioItemStateChanged

    private void cbxLocalidadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxLocalidadItemStateChanged
        
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            estados est = (estados) cbxEstado.getSelectedItem();
            municipios mun = (municipios) cbxMunicipio.getSelectedItem();
            localidades loc = (localidades) cbxLocalidad.getSelectedItem();
            
            txtDatos.setText("Estado: " + est.getNombre() + " \nMunicipio: " + mun.getNombre() + " \nLocaidad: " + loc.getNombre());
            
        }

    }//GEN-LAST:event_cbxLocalidadItemStateChanged
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ComboAnidado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComboAnidado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComboAnidado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComboAnidado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ComboAnidado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JComboBox<String> cbxLocalidad;
    private javax.swing.JComboBox<String> cbxMunicipio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea txtDatos;
    // End of variables declaration//GEN-END:variables
}
