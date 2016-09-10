/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CapaInterfaces;

/**
 *
 * @author Alejandro
 */
public class BusquedaActivo extends javax.swing.JDialog {

    /**
     * Creates new form BusquedaActivo
     */
    public BusquedaActivo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField3 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        rbtn_tipo = new javax.swing.JRadioButton();
        rbtn_serie_activo = new javax.swing.JRadioButton();
        rbtn_codigoinstitucional_activo = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        rbtn_marca_activo = new javax.swing.JRadioButton();
        rbtn_procesador_activo = new javax.swing.JRadioButton();
        rbtn_memoria_activo = new javax.swing.JRadioButton();
        rbtn_discoduro_activo = new javax.swing.JRadioButton();
        combo_marca_activo = new javax.swing.JComboBox();
        combo_procesador_activo = new javax.swing.JComboBox();
        combo_memoria_activo = new javax.swing.JComboBox();
        combo_discoduro_activo = new javax.swing.JComboBox();
        combo_tipo_activo = new javax.swing.JComboBox();
        combo_estado_activo = new javax.swing.JComboBox();
        txt_serie_activo = new javax.swing.JTextField();
        txt_codigoInternoInsticucional_activo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_activo = new javax.swing.JTable();
        rbtn_estado_activo = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_limpiar = new javax.swing.JButton();
        btn_imprimir = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btn_buscar_activo = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btn_editar_activo = new javax.swing.JButton();
        btn_eliminar_activo = new javax.swing.JButton();
        btn_restaurar = new javax.swing.JButton();
        btn_darbaja = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextField3.setText("jTextField3");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Búsqueda de Activos ");

        jPanel2.setBackground(new java.awt.Color(232, 232, 232));

        rbtn_tipo.setText("Tipo");
        rbtn_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_tipoActionPerformed(evt);
            }
        });

        rbtn_serie_activo.setText("Serie");

        rbtn_codigoinstitucional_activo.setText("Código Institucional");
        rbtn_codigoinstitucional_activo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_codigoinstitucional_activoActionPerformed(evt);
            }
        });

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        rbtn_marca_activo.setText("Marca");
        rbtn_marca_activo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtn_marca_activoActionPerformed(evt);
            }
        });

        rbtn_procesador_activo.setText("Procesador");

        rbtn_memoria_activo.setText("Memoria");

        rbtn_discoduro_activo.setText("Disco Duro");

        combo_marca_activo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar...", "Item 1", "Item 2", "Item 3", "Item 4" }));

        combo_procesador_activo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar...", "Item 1", "Item 2", "Item 3", "Item 4" }));

        combo_memoria_activo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar...", "Item 1", "Item 2", "Item 3", "Item 4" }));

        combo_discoduro_activo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar...", "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbtn_marca_activo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(combo_marca_activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rbtn_procesador_activo)
                .addGap(10, 10, 10)
                .addComponent(combo_procesador_activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(rbtn_memoria_activo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo_memoria_activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(rbtn_discoduro_activo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(combo_discoduro_activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtn_marca_activo)
                    .addComponent(rbtn_procesador_activo)
                    .addComponent(rbtn_memoria_activo)
                    .addComponent(rbtn_discoduro_activo)
                    .addComponent(combo_marca_activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_procesador_activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_memoria_activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_discoduro_activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        rbtn_marca_activo.getAccessibleContext().setAccessibleName("rb_Marca");
        rbtn_procesador_activo.getAccessibleContext().setAccessibleName("rb_Procesador");
        rbtn_memoria_activo.getAccessibleContext().setAccessibleName("rb_Memoria");
        rbtn_discoduro_activo.getAccessibleContext().setAccessibleName("rb_Disco_Duro");

        combo_tipo_activo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar...", "Item 1", "Item 2", "Item 3", "Item 4" }));

        combo_estado_activo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccionar...", "Item 1", "Item 2", "Item 3", "Item 4" }));

        tabla_activo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Tipo ", "Marca", "Procesador", "Memoria ", "Disco Duro", "Modelo", "Serie", "Costo", "Fecha Compra", "Cod. Institucional"
            }
        ));
        tabla_activo.removeColumn(tabla_activo.getColumnModel().getColumn(0));
        jScrollPane3.setViewportView(tabla_activo);

        rbtn_estado_activo.setText("Estado");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Búsqueda de Activos ");

        jPanel1.setBackground(new java.awt.Color(117, 214, 255));

        btn_limpiar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Erick\\Documents\\NetBeansProjects\\Control_Activos_Fijos\\ControlActivosFijos\\src\\Icons\\add-new-file (1).png")); // NOI18N
        btn_limpiar.setText("Limpiar");
        btn_limpiar.setBorder(null);
        btn_limpiar.setBorderPainted(false);
        btn_limpiar.setContentAreaFilled(false);

        btn_imprimir.setIcon(new javax.swing.ImageIcon("C:\\Users\\Erick\\Documents\\NetBeansProjects\\Control_Activos_Fijos\\ControlActivosFijos\\src\\Icons\\printer- (1).png")); // NOI18N
        btn_imprimir.setText("Imprimir");
        btn_imprimir.setBorder(null);
        btn_imprimir.setBorderPainted(false);
        btn_imprimir.setContentAreaFilled(false);

        btn_regresar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Erick\\Documents\\NetBeansProjects\\Control_Activos_Fijos\\ControlActivosFijos\\src\\Icons\\logout (1).png")); // NOI18N
        btn_regresar.setText("Regresar");
        btn_regresar.setBorder(null);
        btn_regresar.setBorderPainted(false);
        btn_regresar.setContentAreaFilled(false);

        jPanel6.setBackground(new java.awt.Color(68, 69, 69));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_limpiar)
                .addGap(18, 18, 18)
                .addComponent(btn_imprimir)
                .addGap(18, 18, 18)
                .addComponent(btn_regresar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_limpiar)
                    .addComponent(btn_imprimir)
                    .addComponent(btn_regresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btn_buscar_activo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Erick\\Documents\\NetBeansProjects\\Control_Activos_Fijos\\ControlActivosFijos\\src\\Icons\\magnifier-tool (1).png")); // NOI18N
        btn_buscar_activo.setBorder(null);
        btn_buscar_activo.setBorderPainted(false);
        btn_buscar_activo.setContentAreaFilled(false);

        btn_editar_activo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Erick\\Documents\\NetBeansProjects\\Control_Activos_Fijos\\ControlActivosFijos\\src\\Icons\\1\\pencil (1).png")); // NOI18N
        btn_editar_activo.setToolTipText("");
        btn_editar_activo.setBorder(null);
        btn_editar_activo.setBorderPainted(false);
        btn_editar_activo.setContentAreaFilled(false);

        btn_eliminar_activo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Erick\\Documents\\NetBeansProjects\\Control_Activos_Fijos\\ControlActivosFijos\\src\\Icons\\1\\rubbish-bin (2).png")); // NOI18N
        btn_eliminar_activo.setBorder(null);
        btn_eliminar_activo.setBorderPainted(false);
        btn_eliminar_activo.setContentAreaFilled(false);

        btn_restaurar.setIcon(new javax.swing.ImageIcon("C:\\Users\\Erick\\Documents\\NetBeansProjects\\Control_Activos_Fijos\\ControlActivosFijos\\src\\Icons\\1\\pulgar-hacia-arriba (1).png")); // NOI18N
        btn_restaurar.setBorder(null);
        btn_restaurar.setBorderPainted(false);
        btn_restaurar.setContentAreaFilled(false);

        btn_darbaja.setIcon(new javax.swing.ImageIcon("C:\\Users\\Erick\\Documents\\NetBeansProjects\\Control_Activos_Fijos\\ControlActivosFijos\\src\\Icons\\1\\pulgar-abajo (1).png")); // NOI18N
        btn_darbaja.setBorder(null);
        btn_darbaja.setBorderPainted(false);
        btn_darbaja.setContentAreaFilled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_restaurar))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_editar_activo)
                            .addComponent(btn_eliminar_activo)
                            .addComponent(btn_darbaja))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btn_editar_activo)
                .addGap(18, 18, 18)
                .addComponent(btn_eliminar_activo)
                .addGap(18, 18, 18)
                .addComponent(btn_restaurar)
                .addGap(18, 18, 18)
                .addComponent(btn_darbaja)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(rbtn_tipo)
                        .addGap(18, 18, 18)
                        .addComponent(combo_tipo_activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(rbtn_estado_activo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combo_estado_activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtn_serie_activo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_serie_activo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rbtn_codigoinstitucional_activo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_codigoInternoInsticucional_activo, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_buscar_activo)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(61, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rbtn_tipo)
                            .addComponent(rbtn_serie_activo)
                            .addComponent(rbtn_codigoinstitucional_activo)
                            .addComponent(combo_tipo_activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combo_estado_activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_serie_activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_codigoInternoInsticucional_activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtn_estado_activo))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn_buscar_activo))
                .addGap(64, 64, 64)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        rbtn_tipo.getAccessibleContext().setAccessibleName("rb_Tipo");
        rbtn_serie_activo.getAccessibleContext().setAccessibleName("rb_Serie");
        rbtn_codigoinstitucional_activo.getAccessibleContext().setAccessibleName("rb_Código_Instutucional");
        combo_tipo_activo.getAccessibleContext().setAccessibleName("cb_Tipo");
        combo_estado_activo.getAccessibleContext().setAccessibleName("cb_estado");
        txt_serie_activo.getAccessibleContext().setAccessibleName("txt_Serie");
        txt_codigoInternoInsticucional_activo.getAccessibleContext().setAccessibleName("txt_Codigo_Institucional");
        txt_codigoInternoInsticucional_activo.getAccessibleContext().setAccessibleDescription("");
        rbtn_estado_activo.getAccessibleContext().setAccessibleName("rb_Estado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtn_codigoinstitucional_activoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_codigoinstitucional_activoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_codigoinstitucional_activoActionPerformed

    private void rbtn_marca_activoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_marca_activoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_marca_activoActionPerformed

    private void rbtn_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtn_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtn_tipoActionPerformed

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
            java.util.logging.Logger.getLogger(BusquedaActivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusquedaActivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusquedaActivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusquedaActivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                BusquedaActivo dialog = new BusquedaActivo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btn_buscar_activo;
    private javax.swing.JButton btn_darbaja;
    private javax.swing.JButton btn_editar_activo;
    private javax.swing.JButton btn_eliminar_activo;
    private javax.swing.JButton btn_imprimir;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton btn_restaurar;
    private javax.swing.JComboBox combo_discoduro_activo;
    private javax.swing.JComboBox combo_estado_activo;
    private javax.swing.JComboBox combo_marca_activo;
    private javax.swing.JComboBox combo_memoria_activo;
    private javax.swing.JComboBox combo_procesador_activo;
    private javax.swing.JComboBox combo_tipo_activo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JRadioButton rbtn_codigoinstitucional_activo;
    private javax.swing.JRadioButton rbtn_discoduro_activo;
    private javax.swing.JRadioButton rbtn_estado_activo;
    private javax.swing.JRadioButton rbtn_marca_activo;
    private javax.swing.JRadioButton rbtn_memoria_activo;
    private javax.swing.JRadioButton rbtn_procesador_activo;
    private javax.swing.JRadioButton rbtn_serie_activo;
    private javax.swing.JRadioButton rbtn_tipo;
    private javax.swing.JTable tabla_activo;
    private javax.swing.JTextField txt_codigoInternoInsticucional_activo;
    private javax.swing.JTextField txt_serie_activo;
    // End of variables declaration//GEN-END:variables
}
