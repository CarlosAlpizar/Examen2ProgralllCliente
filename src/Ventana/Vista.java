/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import Datos.Cliente;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Vista extends javax.swing.JFrame {

    /**
     * @return the ComboCateg
     */
    public javax.swing.JComboBox<String> getComboCateg() {
        return ComboCateg;
    }

    /**
     * @param ComboCateg the ComboCateg to set
     */
    public void setComboCateg(javax.swing.JComboBox<String> ComboCateg) {
        this.ComboCateg = ComboCateg;
    }

    /**
     * @return the ComboEstado
     */
    public javax.swing.JComboBox<String> getComboEstado() {
        return ComboEstado;
    }

    /**
     * @param ComboEstado the ComboEstado to set
     */
    public void setComboEstado(javax.swing.JComboBox<String> ComboEstado) {
        this.ComboEstado = ComboEstado;
    }

    /**
     * @return the Table
     */
    public javax.swing.JTable getTable() {
        return Table;
    }

    /**
     * @param Table the Table to set
     */
    public void setTable(javax.swing.JTable Table) {
        this.Table = Table;
    }

    /**
     * @return the TxImpuesto
     */
    public javax.swing.JTextField getTxImpuesto() {
        return TxImpuesto;
    }

    /**
     * @param TxImpuesto the TxImpuesto to set
     */
    public void setTxImpuesto(javax.swing.JTextField TxImpuesto) {
        this.TxImpuesto = TxImpuesto;
    }

    /**
     * @return the TxInventario
     */
    public javax.swing.JTextField getTxInventario() {
        return TxInventario;
    }

    /**
     * @param TxInventario the TxInventario to set
     */
    public void setTxInventario(javax.swing.JTextField TxInventario) {
        this.TxInventario = TxInventario;
    }

    /**
     * @return the TxNombre
     */
    public javax.swing.JTextField getTxNombre() {
        return TxNombre;
    }

    /**
     * @param TxNombre the TxNombre to set
     */
    public void setTxNombre(javax.swing.JTextField TxNombre) {
        this.TxNombre = TxNombre;
    }

    /**
     * @return the TxPanel
     */
    public javax.swing.JTextPane getTxPanel() {
        return TxPanel;
    }

    /**
     * @param TxPanel the TxPanel to set
     */
    public void setTxPanel(javax.swing.JTextPane TxPanel) {
        this.TxPanel = TxPanel;
    }

    /**
     * @return the TxPrecio
     */
    public javax.swing.JTextField getTxPrecio() {
        return TxPrecio;
    }

    /**
     * @param TxPrecio the TxPrecio to set
     */
    public void setTxPrecio(javax.swing.JTextField TxPrecio) {
        this.TxPrecio = TxPrecio;
    }

    /**
     * Creates new form Vista
     */
    Cliente cliente = new Cliente();
    private String nombre, descripcion, precio, impuesto, categoria, estado, inventario;

    public Vista() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        TxNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ComboEstado = new javax.swing.JComboBox<>();
        BtnAgregar = new javax.swing.JButton();
        BtnEliCate = new javax.swing.JButton();
        BtnConsulta = new javax.swing.JButton();
        BtnActua = new javax.swing.JButton();
        BtnElim = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        TxPrecio = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxPanel = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        TxImpuesto = new javax.swing.JTextField();
        ComboCateg = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxInventario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("MANTENIMIENTO DE ARTICULOS");

        jLabel2.setText("NOMBRE: ");
        jLabel2.setPreferredSize(new java.awt.Dimension(73, 14));

        jLabel3.setText("DESCRIPCIÓN:");

        TxNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxNombreActionPerformed(evt);
            }
        });

        jLabel4.setText("CATEGORÍA: ");

        ComboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "DISPONIBLE", "BAJO", "AGOTADO" }));

        BtnAgregar.setText("AGREGAR");
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });

        BtnEliCate.setText("ELIMINAR CATEGORIA");

        BtnConsulta.setText("CONSULTAR ");

        BtnActua.setText("ACTUALIZAR");
        BtnActua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActuaActionPerformed(evt);
            }
        });

        BtnElim.setText("ELIMINAR");

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Descripcion", "Precio", "Impuesto", "Categoria", "Estado", "Inventario"
            }
        ));
        jScrollPane1.setViewportView(Table);

        jLabel5.setText("PRECIO:");
        jLabel5.setPreferredSize(new java.awt.Dimension(73, 14));

        jScrollPane2.setViewportView(TxPanel);

        jLabel6.setText("IMPUESTO");
        jLabel6.setPreferredSize(new java.awt.Dimension(74, 14));

        TxImpuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxImpuestoActionPerformed(evt);
            }
        });

        ComboCateg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "SALUD (1)", "EDUCACION (2)", "MUSICA (3)", "ANTIGÜEDADES (4)", "FERRETERIA (5)", "ROPA (6)", "TECNOLOGIA (7)", " " }));
        ComboCateg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCategActionPerformed(evt);
            }
        });

        jLabel7.setText("ESTADO");

        jLabel8.setText("INVENTARIO");
        jLabel8.setPreferredSize(new java.awt.Dimension(73, 14));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(312, 312, 312))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)
                            .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(TxInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnEliCate)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(BtnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BtnActua, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(61, 61, 61)
                                        .addComponent(BtnElim, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnConsulta))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(95, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnElim)
                            .addComponent(BtnActua))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnEliCate))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(jLabel3)
                                .addGap(109, 109, 109)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(ComboCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(101, 101, 101)
                                        .addComponent(BtnAgregar))
                                    .addComponent(ComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxNombreActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed

        String insert = "insert_", into = "into_", tabla = "articulo_";

        nombre = TxNombre.getText() + "_";
        descripcion = TxPanel.getText() + "_";
        precio = TxPrecio.getText() + "_";
        impuesto = TxImpuesto.getText() + "_";
        categoria = ComboCateg.getSelectedItem().toString();
        if (categoria.equals("SALUD (1)")) {
            categoria = "1" + "_";
        } else if (categoria.equals("EDUCACION (2)")) {
            categoria = "2" + "_";
        } else if (categoria.equals("MUSICA (3)")) {
            categoria = "3" + "_";
        } else if (categoria.equals("ANTIGÜEDADES (4)")) {
            categoria = "4" + "_";
        } else if (categoria.equals("FERRETERIA (5)")) {
            categoria = "5" + "_";
        } else if (categoria.equals("ROPA (6)")) {
            categoria = "6" + "_";
        } else if (categoria.equals("TECNOLOGIA (7)")) {
            categoria = "7" + "_";
        } else {
            JOptionPane.showMessageDialog(null, "Categoria no selecciona");
            return;
        }

        estado = ComboEstado.getSelectedItem().toString() + "_";
        inventario = TxInventario.getText();

        String mensaje;
        mensaje = insert + into + tabla + nombre + descripcion + precio + impuesto + categoria + estado + inventario;

        cliente.enviarMensaje("localhost", 9000, mensaje);

    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void ComboCategActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCategActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboCategActionPerformed

    private void TxImpuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxImpuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxImpuestoActionPerformed

    private void BtnActuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnActuaActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActua;
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnConsulta;
    private javax.swing.JButton BtnEliCate;
    private javax.swing.JButton BtnElim;
    private javax.swing.JComboBox<String> ComboCateg;
    private javax.swing.JComboBox<String> ComboEstado;
    private javax.swing.JTable Table;
    private javax.swing.JTextField TxImpuesto;
    private javax.swing.JTextField TxInventario;
    private javax.swing.JTextField TxNombre;
    private javax.swing.JTextPane TxPanel;
    private javax.swing.JTextField TxPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
