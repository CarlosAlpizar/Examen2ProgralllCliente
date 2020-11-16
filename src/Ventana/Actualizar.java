/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Carlos Alpizar <carlosalpizarg@hotmail.com>
 */
public class Actualizar extends javax.swing.JFrame {

    /**
     * @return the Combo
     */
    public void setListener(Vista vista) {
        btnaceptar.addActionListener(vista);
    }

    public javax.swing.JComboBox<String> getCombo() {
        return Combo;
    }

    public JButton getBtnaceptar() {
        return btnaceptar;
    }

    /**
     * @param Combo the Combo to set
     */
    public void setCombo(javax.swing.JComboBox<String> Combo) {
        this.Combo = Combo;
    }

    /**
     * @return the TxAcDescrip
     */
    public javax.swing.JTextField getTxAcDescrip() {
        return TxAcDescrip;
    }

    /**
     * @param TxAcDescrip the TxAcDescrip to set
     */
    public void setTxAcDescrip(javax.swing.JTextField TxAcDescrip) {
        this.TxAcDescrip = TxAcDescrip;
    }

    /**
     * @return the TxAcImpuesto
     */
    public javax.swing.JTextField getTxAcImpuesto() {
        return TxAcImpuesto;
    }

    /**
     * @param TxAcImpuesto the TxAcImpuesto to set
     */
    public void setTxAcImpuesto(javax.swing.JTextField TxAcImpuesto) {
        this.TxAcImpuesto = TxAcImpuesto;
    }

    /**
     * @return the TxAcInventario
     */
    public javax.swing.JTextField getTxAcInventario() {
        return TxAcInventario;
    }

    /**
     * @param TxAcInventario the TxAcInventario to set
     */
    public void setTxAcInventario(javax.swing.JTextField TxAcInventario) {
        this.TxAcInventario = TxAcInventario;
    }

    /**
     * @return the TxAcNombre
     */
    public javax.swing.JTextField getTxAcNombre() {
        return TxAcNombre;
    }

    /**
     * @param TxAcNombre the TxAcNombre to set
     */
    public void setTxAcNombre(javax.swing.JTextField TxAcNombre) {
        this.TxAcNombre = TxAcNombre;
    }

    /**
     * @return the TxAcPrecio
     */
    public javax.swing.JTextField getTxAcPrecio() {
        return TxAcPrecio;
    }

    /**
     * @param TxAcPrecio the TxAcPrecio to set
     */
    public void setTxAcPrecio(javax.swing.JTextField TxAcPrecio) {
        this.TxAcPrecio = TxAcPrecio;
    }

    /**
     * @return the TxAcategotia
     */
    public javax.swing.JTextField getTxAcategotia() {
        return TxAcategotia;
    }

    /**
     * @param TxAcategotia the TxAcategotia to set
     */
    public void setTxAcategotia(javax.swing.JTextField TxAcategotia) {
        this.TxAcategotia = TxAcategotia;
    }

    public Actualizar() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxAcNombre = new javax.swing.JTextField();
        TxAcDescrip = new javax.swing.JTextField();
        TxAcPrecio = new javax.swing.JTextField();
        TxAcImpuesto = new javax.swing.JTextField();
        TxAcategotia = new javax.swing.JTextField();
        TxAcInventario = new javax.swing.JTextField();
        btnaceptar = new javax.swing.JButton();
        Combo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel1.setText("ACTUALIZAR ARTICULO");

        jLabel2.setText("NOMBRE");

        jLabel3.setText("DESCRIPCION");

        jLabel4.setText("PRECIO");

        jLabel5.setText("IMPUESTO");

        jLabel6.setText("CATEGORIA");

        jLabel7.setText("ESTADO");

        jLabel8.setText("INVENTARIO");

        btnaceptar.setText("ACEPTAR");
        btnaceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaceptarActionPerformed(evt);
            }
        });

        Combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "DISPONIBLE", "BAJO", "AGOTADO" }));
        Combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TxAcInventario, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(TxAcategotia)
                            .addComponent(TxAcImpuesto)
                            .addComponent(TxAcPrecio)
                            .addComponent(TxAcNombre)
                            .addComponent(TxAcDescrip)
                            .addComponent(Combo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnaceptar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TxAcNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxAcDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TxAcPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(TxAcImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(TxAcategotia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(Combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(TxAcInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(btnaceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnaceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaceptarActionPerformed
        if (validar()) {
            JOptionPane.showMessageDialog(null, "Formulario vacio");
        } else {
            setVisible(false);
        }

    }//GEN-LAST:event_btnaceptarActionPerformed

    private void ComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actualizar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actualizar().setVisible(true);
            }
        });
    }

    public boolean validar() {
        if (TxAcNombre.getText().equals("") || TxAcDescrip.getText().equals("") || TxAcPrecio.getText().equals("") || TxAcImpuesto.getText().equals("")
                || TxAcategotia.getText().equals("") || Combo.getSelectedItem().equals("SELECCIONE") || TxAcInventario.getText().equals("")) {
            return true;
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Combo;
    private javax.swing.JTextField TxAcDescrip;
    private javax.swing.JTextField TxAcImpuesto;
    private javax.swing.JTextField TxAcInventario;
    private javax.swing.JTextField TxAcNombre;
    private javax.swing.JTextField TxAcPrecio;
    private javax.swing.JTextField TxAcategotia;
    private javax.swing.JButton btnaceptar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
