/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana;

import Datos.RemitenteCliente;
import Datos.ServidorCliente;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
    RemitenteCliente cliente = new RemitenteCliente();
    private String nombre, descripcion, precio, impuesto, categoria, estado, inventario;
    DefaultTableModel Tcategoria = new DefaultTableModel();
    ServidorCliente servidorcliente = new ServidorCliente();
    

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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TxAgregaCate = new javax.swing.JTextField();
        BtnAgregarCat = new javax.swing.JButton();

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
        ComboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboEstadoActionPerformed(evt);
            }
        });

        BtnAgregar.setText("AGREGAR ARTICULO");
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

        jLabel5.setText("PRECIO:");
        jLabel5.setPreferredSize(new java.awt.Dimension(73, 14));

        jScrollPane2.setViewportView(TxPanel);

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

        jTabbedPane1.addTab("Articulos", jScrollPane1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Articulo"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Categorias", jPanel2);

        jLabel9.setText("IMPUESTO:");

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("AGREGAR ARTICULOS");

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("AGREGAR/ELIMINAR CATEGORIA ");

        jLabel12.setText("NOMBRE DE CATEGORIA");

        TxAgregaCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxAgregaCateActionPerformed(evt);
            }
        });

        BtnAgregarCat.setText("AGREGAR CATEGORIA");
        BtnAgregarCat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarCatActionPerformed(evt);
            }
        });

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
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ComboEstado, 0, 98, Short.MAX_VALUE)
                                    .addComponent(ComboCateg, 0, 1, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BtnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(BtnEliCate)
                                            .addComponent(jLabel12))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TxAgregaCate, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(29, 29, 29)
                                                .addComponent(BtnAgregarCat)))))
                                .addGap(60, 60, 60))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(8, 8, 8)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8))
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(TxInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(TxPrecio)
                                        .addComponent(jScrollPane2)
                                        .addComponent(TxImpuesto)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(TxNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(BtnActua, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(BtnElim, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(59, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(244, 244, 244))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnConsulta)
                            .addComponent(BtnActua)
                            .addComponent(BtnElim))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(71, 71, 71))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(TxInventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxImpuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel4)
                                            .addComponent(ComboCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(ComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7))))
                                .addGap(13, 13, 13)
                                .addComponent(BtnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxAgregaCate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12)))
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnAgregarCat)
                    .addComponent(BtnEliCate))
                .addContainerGap(47, Short.MAX_VALUE))
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
            JOptionPane.showMessageDialog(null, "Categoria no seleccionada");
            return;
        }

        estado = ComboEstado.getSelectedItem().toString();
        if (estado.equals("DISPONIBLE")) {
            estado = ComboEstado.getSelectedItem().toString() + "_";
        } else if (estado.equals("BAJO")) {
            estado = ComboEstado.getSelectedItem().toString() + "_";
        } else if (estado.equals("AGOTADO")) {
            estado = ComboEstado.getSelectedItem().toString() + "_";
        } else {
            JOptionPane.showMessageDialog(null, "Estado no seleccionado");
            return;
        }

        inventario = TxInventario.getText();

        String mensaje;
        mensaje = insert + into + tabla + nombre + descripcion + precio + impuesto + categoria + estado + inventario;

        RemitenteCliente.enviar("localhost", 9000, mensaje);

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

    private void ComboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboEstadoActionPerformed

    private void TxAgregaCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxAgregaCateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxAgregaCateActionPerformed

    private void BtnAgregarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarCatActionPerformed
         String insert = "insert_", into = "into_", tabla = "categoria_";
         categoria = TxAgregaCate.getText() + "_";
         
         String mensaje;
        mensaje = insert + into + tabla + categoria;
        
        RemitenteCliente.enviar("localhost", 9000, mensaje);
        String Mensaje = servidorcliente.enviarcategoria(categoria);
        System.out.println(Mensaje);
        System.out.println("este es el mensaje");
    }//GEN-LAST:event_BtnAgregarCatActionPerformed

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
    private javax.swing.JButton BtnAgregarCat;
    private javax.swing.JButton BtnConsulta;
    private javax.swing.JButton BtnEliCate;
    private javax.swing.JButton BtnElim;
    private javax.swing.JComboBox<String> ComboCateg;
    private javax.swing.JComboBox<String> ComboEstado;
    private javax.swing.JTable Table;
    private javax.swing.JTextField TxAgregaCate;
    private javax.swing.JTextField TxImpuesto;
    private javax.swing.JTextField TxInventario;
    private javax.swing.JTextField TxNombre;
    private javax.swing.JTextPane TxPanel;
    private javax.swing.JTextField TxPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
