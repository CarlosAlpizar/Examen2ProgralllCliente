package Ventana;

import Cliente.RemitenteCliente;
import Datos.ServidorCliente;
import java.awt.AWTException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Vista extends javax.swing.JFrame implements ActionListener {
    
    String valores = new String();

    public void ActualizarTablas() {
        String mensaje = "refresh_" + puerto;
        RemitenteCliente.enviar("localhost", 9000, mensaje);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Vista.class.getName()).log(Level.SEVERE, null, ex);
        }

        ComboCateg.removeAllItems();
        String Mensaje = server.enviarCategoria();


        String[] tablas = Mensaje.split("/");
        String cate = tablas[1];
        String arti = tablas[0];

        String mensajelimpio = cate;
        String[] msjfinal = mensajelimpio.split(";");
        Tcategoria = new DefaultTableModel();
        Tcategoria.addColumn("ID");
        Tcategoria.addColumn("NOMBRE");
        for (String categoria : msjfinal) {
            String[] info = categoria.split("_");
            Object[] obj = new Object[2];

            obj[0] = info[0];
            obj[1] = info[1];
            Tcategoria.addRow(obj);

            ComboCateg.addItem(info[1]);

        }
        TablaCat.setModel(Tcategoria);

        Table.removeAll();
        Tarticulo = new DefaultTableModel();
        Tarticulo.addColumn("ID");
        Tarticulo.addColumn("NOMBRE");
        Tarticulo.addColumn("DESCRIPCION");
        Tarticulo.addColumn("PRECIO");
        Tarticulo.addColumn("IMPUESTO");
        Tarticulo.addColumn("CATEGORIA");
        Tarticulo.addColumn("ESTADO");
        Tarticulo.addColumn("INVENTARIO");

        String[] perro = arti.split(";");
        for (String articulo : perro) {
            String[] fila2 = articulo.split("_");
            Object[] obj2 = new Object[8];

            obj2[0] = fila2[0];
            obj2[1] = fila2[1];
            obj2[2] = fila2[2];
            obj2[3] = fila2[3];
            obj2[4] = fila2[4];
            obj2[5] = fila2[5];
            obj2[6] = fila2[6];
            obj2[7] = fila2[7];
            Tarticulo.addRow(obj2);

        }
        Table.setModel(Tarticulo);

    }

    public javax.swing.JTextField getTxBuscar() {
        return TxBuscar;
    }

    public void setTxBuscar(javax.swing.JTextField TxBuscar) {
        this.TxBuscar = TxBuscar;
    }

    public javax.swing.JComboBox<String> getComboCateg() {
        return ComboCateg;
    }

    public void setComboCateg(javax.swing.JComboBox<String> ComboCateg) {
        this.ComboCateg = ComboCateg;
    }

    public javax.swing.JComboBox<String> getComboEstado() {
        return ComboEstado;
    }

    public void setComboEstado(javax.swing.JComboBox<String> ComboEstado) {
        this.ComboEstado = ComboEstado;
    }

    public javax.swing.JTable getTable() {
        return Table;
    }

    public void setTable(javax.swing.JTable Table) {
        this.Table = Table;
    }

    public javax.swing.JTextField getTxImpuesto() {
        return TxImpuesto;
    }

    public void setTxImpuesto(javax.swing.JTextField TxImpuesto) {
        this.TxImpuesto = TxImpuesto;
    }

    public javax.swing.JTextField getTxInventario() {
        return TxInventario;
    }

    public void setTxInventario(javax.swing.JTextField TxInventario) {
        this.TxInventario = TxInventario;
    }

    public javax.swing.JTextField getTxNombre() {
        return TxNombre;
    }

    public void setTxNombre(javax.swing.JTextField TxNombre) {
        this.TxNombre = TxNombre;
    }

    public javax.swing.JTextPane getTxPanel() {
        return TxPanel;
    }

    public void setTxPanel(javax.swing.JTextPane TxPanel) {
        this.TxPanel = TxPanel;
    }

    public javax.swing.JTextField getTxPrecio() {
        return TxPrecio;
    }

    public void setTxPrecio(javax.swing.JTextField TxPrecio) {
        this.TxPrecio = TxPrecio;
    }

    RemitenteCliente cliente = new RemitenteCliente();
    private String nombre, descripcion, precio, impuesto, categoria, estado, inventario;
    DefaultTableModel Tcategoria = new DefaultTableModel();
    DefaultTableModel Tarticulo = new DefaultTableModel();

    static int puerto = (int) (Math.random() * (9050 - 9001)) + 9001;
    ServidorCliente server = new ServidorCliente(puerto);
    Actualizar ventanaAc = new Actualizar();

    public Vista() {
        initComponents();
        this.server = server;

    }

    public void iniciar() {

        try {

            Thread hilo = new Thread(server);
            hilo.start();
            setVisible(true);
            setLocationRelativeTo(null);
            

        } catch (Exception ex) {

            ex.printStackTrace();
        }

    }

    public Vista(ServidorCliente server) {
        initComponents();
        this.server = server;
        ActualizarTablas();
       
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
        BtnActua = new javax.swing.JButton();
        BtnElim = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        TxPrecio = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TxPanel = new javax.swing.JTextPane();
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
        TablaCat = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        TxAgregaCate = new javax.swing.JTextField();
        BtnAgregarCat = new javax.swing.JButton();
        TxBuscar = new javax.swing.JTextField();
        BtnActualizar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

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
        BtnEliCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliCateActionPerformed(evt);
            }
        });

        BtnActua.setText("REFRESCAR");
        BtnActua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActuaActionPerformed(evt);
            }
        });

        BtnElim.setText("ELIMINAR ARTICULO");
        BtnElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnElimActionPerformed(evt);
            }
        });

        jLabel5.setText("PRECIO:");
        jLabel5.setPreferredSize(new java.awt.Dimension(73, 14));

        jScrollPane2.setViewportView(TxPanel);

        TxImpuesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxImpuestoActionPerformed(evt);
            }
        });

        ComboCateg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1" }));
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
        Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table);

        jTabbedPane1.addTab("Articulos", jScrollPane1);

        TablaCat.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(TablaCat);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)
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

        TxBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxBuscarActionPerformed(evt);
            }
        });

        BtnActualizar.setText("ACTUALIZAR");
        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarActionPerformed(evt);
            }
        });

        jLabel13.setText("ID ARTICULO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BtnAgregar)
                            .addComponent(ComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel10)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(8, 8, 8)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(8, 8, 8)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TxImpuesto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                            .addComponent(TxInventario, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxPrecio, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ComboCateg, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnAgregarCat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxAgregaCate))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(TxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(BtnActualizar))
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BtnActua)
                                .addGap(86, 86, 86)
                                .addComponent(BtnElim)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtnEliCate)))
                        .addContainerGap(12, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxAgregaCate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnAgregarCat)
                            .addComponent(BtnActua)
                            .addComponent(BtnElim)
                            .addComponent(BtnEliCate))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BtnActualizar))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(71, 71, 71))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
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
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(ComboCateg, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ComboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))))
                        .addGap(28, 28, 28)
                        .addComponent(BtnAgregar)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
        String sies = "no";
        for (int i = 0; i < Table.getRowCount(); i++) {
           if(TxBuscar.getText().equals(Table.getValueAt(i, 0).toString())){
               sies = "si";
           }
        }
        
        System.out.println("sies: " + sies);
        if (sies.equals("no")) {
            JOptionPane.showMessageDialog(null, "Numero de articulo invalido");
        } else {
            
            ventanaAc.setListener(this);
            ventanaAc.setVisible(true);
        }
    }//GEN-LAST:event_BtnActualizarActionPerformed

    private void BtnAgregarCatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarCatActionPerformed
        if (validaEspaciosCategoria()) {
            JOptionPane.showMessageDialog(null, "Inserte una categoria");
        } else {

            String aux = TxAgregaCate.getText();
            String msj = puerto + "_" + "insert_" + "categoria_" + aux;
            RemitenteCliente.enviar("localhost", 9000, msj);
            
            reseteoCategoria();
            ActualizarTablas();
        }

    }//GEN-LAST:event_BtnAgregarCatActionPerformed

    private void TxAgregaCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxAgregaCateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxAgregaCateActionPerformed

    private void ComboCategActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCategActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboCategActionPerformed

    private void TxImpuestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxImpuestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxImpuestoActionPerformed

    private void BtnElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnElimActionPerformed

        int fila = Table.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccion un articulo en la tabla");
        } else {
            int confirme = JOptionPane.showConfirmDialog(null, "Seguro de eliminar este articulo ?", "Confirmacion", JOptionPane.YES_NO_OPTION);
            String value = (Table.getModel().getValueAt(fila, 0).toString());
            if (confirme == JOptionPane.YES_OPTION) {
                String mensaje = puerto + "_" + "delete_" + "articulo_" + value;
                RemitenteCliente.enviar("localhost", 9000, mensaje);
                ActualizarTablas();
            }
        }
    }//GEN-LAST:event_BtnElimActionPerformed

    private void BtnActuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActuaActionPerformed

        ActualizarTablas();
    }//GEN-LAST:event_BtnActuaActionPerformed

    private void BtnEliCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliCateActionPerformed
        int fila = TablaCat.getSelectedRow();
        

        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccion un articulo en la tabla");
        } else {

            int confirme = JOptionPane.showConfirmDialog(null, "Seguro de eliminar esta categoria ?", "Confirmacion", JOptionPane.YES_NO_OPTION);
            String value = (TablaCat.getModel().getValueAt(fila, 0).toString());
            if (confirme == JOptionPane.YES_OPTION) {
                String mensaje = puerto + "_" + "delete_" +  "categoria_" + value;
                RemitenteCliente.enviar("localhost", 9000, mensaje);
                ActualizarTablas();
            }

        }

    }//GEN-LAST:event_BtnEliCateActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed

        if (validaEspaciosArticulo()) {
            JOptionPane.showMessageDialog(null, "Formulario vacio");

        } else {

            String insert = "insert_", tabla = "articulo_";

            nombre = TxNombre.getText() + "_";
            descripcion = TxPanel.getText() + "_";
            precio = TxPrecio.getText() + "_";
            impuesto = TxImpuesto.getText() + "_";

            categoria = ComboCateg.getSelectedItem().toString() + "_";

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

            mensaje = puerto + "_" + insert + tabla + nombre + descripcion + precio + impuesto + categoria + estado + inventario;
            System.out.println(mensaje);
            RemitenteCliente.enviar("localhost", 9000, mensaje);
            reseteoArticulos();
            ActualizarTablas();

        }
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void ComboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboEstadoActionPerformed

    private void TxNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxNombreActionPerformed

    private void TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableMouseClicked
        DefaultTableModel model =  (DefaultTableModel)Table.getModel();
        int seleccionado  = Table.getSelectedRow();
        
        TxBuscar.setText(model.getValueAt(seleccionado, 0).toString());
    }//GEN-LAST:event_TableMouseClicked

    private void TxBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxBuscarActionPerformed
        TxBuscar.setEditable(false);
    }//GEN-LAST:event_TxBuscarActionPerformed

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
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnAgregarCat;
    private javax.swing.JButton BtnEliCate;
    private javax.swing.JButton BtnElim;
    private javax.swing.JComboBox<String> ComboCateg;
    private javax.swing.JComboBox<String> ComboEstado;
    private javax.swing.JTable TablaCat;
    private javax.swing.JTable Table;
    private javax.swing.JTextField TxAgregaCate;
    private javax.swing.JTextField TxBuscar;
    private javax.swing.JTextField TxImpuesto;
    private javax.swing.JTextField TxInventario;
    private javax.swing.JTextField TxNombre;
    private javax.swing.JTextPane TxPanel;
    private javax.swing.JTextField TxPrecio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == ventanaAc.getBtnaceptar()) {
            System.out.println("estoy escuchando");
            String id = TxBuscar.getText();
            nombre = ventanaAc.getTxAcNombre().getText() + "_";
            descripcion = ventanaAc.getTxAcDescrip().getText() + "_";
            precio = ventanaAc.getTxAcPrecio().getText() + "_";
            impuesto = ventanaAc.getTxAcImpuesto().getText() + "_";
            categoria = ventanaAc.getTxAcategotia().getText() + "_";
            estado = ventanaAc.getCombo().getSelectedItem() + "_";
            inventario = ventanaAc.getTxAcInventario().getText() + "_";

            String mensaje = puerto + "_" + "update_" + "articulo_" + Integer.parseInt(id) + "_" + nombre + descripcion + precio + impuesto + categoria + estado + inventario;

            RemitenteCliente.enviar("localhost", 9000, mensaje);
            ActualizarTablas();
        }

    }

    public boolean validaEspaciosArticulo() {
        if (TxNombre.getText().equals("") || TxPanel.getText().equals("") || TxPrecio.getText().equals("") || TxImpuesto.getText().equals("")
                || TxInventario.getText().equals("") || ComboEstado.getSelectedItem().equals("SELECCIONE") || ComboCateg.getSelectedItem().equals("")) {

            return true;
        }
        return false;
    }

    public boolean validaEspaciosCategoria() {
        if (TxAgregaCate.getText().equals("")) {
            return true;
        }
        return false;
    }

    public boolean validaEspacioId() {
        if (TxBuscar.getText().equals("")) {
            return true;
        }
        return false;
    }

    public void reseteoArticulos() {
        TxNombre.setText("");
        TxPanel.setText("");
        TxPrecio.setText("");
        TxImpuesto.setText("");
        TxInventario.setText("");
        ComboEstado.setSelectedIndex(0);

    }

    public void reseteoCategoria() {
        TxAgregaCate.setText("");
    }

    public void resteoId() {
        TxBuscar.setText("");
    }

}
