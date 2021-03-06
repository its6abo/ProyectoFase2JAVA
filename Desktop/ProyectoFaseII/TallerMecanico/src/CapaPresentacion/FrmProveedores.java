/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package CapaPresentacion;

import CapaEntidades.EntidadProveedores;
import CapaLogica.BLProveedores;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gabri
 */
public class FrmProveedores extends javax.swing.JInternalFrame {
    DefaultTableModel modelo;

    /**
     * Creates new form FrmProveedores
     */
    public FrmProveedores() throws Exception{
        initComponents();
         txtId.setVisible(false);
         txtEstado.setVisible(false);
         jLabelID.setVisible(false);
        jLabelEstado.setVisible(false);
        
        CargarDatos("estado = 1");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelEstado = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        txtCorreo = new javax.swing.JTextField();
        jLabelTelefono2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabelCorreo = new javax.swing.JLabel();
        jLabelCedula = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblProveedores = new javax.swing.JTable();
        txtCedula = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        jLabelID = new javax.swing.JLabel();
        txtTelefono1 = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        cbmTipoDoc = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelIdTipoDoc = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        jLabelTelefono1 = new javax.swing.JLabel();
        txtTelefono2 = new javax.swing.JTextField();
        Proveedores = new javax.swing.JTextField();

        jLabelEstado.setText("Estado");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        jLabelTelefono2.setText("Telefono2");

        txtId.setEditable(false);

        jLabelCorreo.setText("Correo");

        jLabelCedula.setText("C??dula");

        btnGuardar.setBackground(new java.awt.Color(51, 153, 0));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(
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
        tblProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProveedoresMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblProveedores);

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 0, 51));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabelID.setText("ID");

        txtTelefono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefono1ActionPerformed(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(0, 51, 255));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        cbmTipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula F??sica", "Cedula Jur??dica", "Pasaporte", "Residencia" }));

        jLabelDireccion.setText("Direcci??n");

        jLabelIdTipoDoc.setText("Tipo Doc");

        jLabelNombre.setText("Nombre");

        txtEstado.setEditable(false);

        btnSalir.setBackground(new java.awt.Color(153, 0, 0));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabelTelefono1.setText("Telefono1");

        txtTelefono2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefono2ActionPerformed(evt);
            }
        });

        Proveedores.setEditable(false);
        Proveedores.setBackground(new java.awt.Color(153, 153, 153));
        Proveedores.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        Proveedores.setForeground(new java.awt.Color(255, 255, 255));
        Proveedores.setText(" Proveedores");
        Proveedores.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Proveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProveedoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelEstado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(312, 312, 312)
                                .addComponent(Proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(cbmTipoDoc, 0, 222, Short.MAX_VALUE)
                                                .addGap(10, 10, 10)
                                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtTelefono1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(txtTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(10, 10, 10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(37, 37, 37)
                                        .addComponent(jLabelIdTipoDoc)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelCedula)
                                        .addGap(70, 70, 70))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(jLabelTelefono1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabelTelefono2)
                                        .addGap(55, 55, 55)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabelDireccion)
                                                .addGap(150, 150, 150))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                                .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(97, 97, 97)
                                                .addComponent(jLabelCorreo)
                                                .addGap(102, 102, 102))
                                            .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(jLabelNombre)
                                                .addGap(120, 120, 120)))
                                        .addGap(274, 274, 274)))))))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelEstado)
                        .addComponent(jLabelID))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(Proveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbmTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelIdTipoDoc))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabelCedula))))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefono1)
                    .addComponent(jLabelTelefono2)
                    .addComponent(jLabelCorreo)
                    .addComponent(jLabelDireccion))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        //
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed
    
            public void    Limpiar(){
            txtId.setText(null);
            txtNombre.setText(null);
            txtCedula.setText(null);
            txtEstado.setText(null);
            txtDireccion.setText(null);
            txtTelefono1.setText(null);
            txtTelefono2.setText(null);
            txtCorreo.setText(null);
                                    }
    

    
    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        BLProveedores logica = new BLProveedores();
        EntidadProveedores proveedores = GenerarEntidad();
        try {
            if (proveedores.getExiste()) {
                logica.Modificar(proveedores);
            }
            else{
                logica.Insertar(proveedores);
            }
            Limpiar();
            CargarDatos("estado = 1");
            JOptionPane.showMessageDialog(this, logica.getMensaje());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "ERROR " + ex.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tblProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProveedoresMouseClicked
        // TODO add your handling code here:
        //AL DARLE DOBLE CLIC A LA TABLA CARGAR LOS DATOS DE UN DETERMINADO CLIENTE

        BLProveedores logica = new BLProveedores();
        EntidadProveedores proveedor;
        String condicion;
        try {
            if (evt.getClickCount() == 2) {
                int fila = tblProveedores.rowAtPoint(evt.getPoint());
                txtId.setText(tblProveedores.getValueAt(fila, 0).toString());
                txtNombre.setText(tblProveedores.getValueAt(fila, 1).toString());
                txtCedula.setText(tblProveedores.getValueAt(fila, 2).toString());
                txtEstado.setText(tblProveedores.getValueAt(fila, 3).toString());
                txtDireccion.setText(tblProveedores.getValueAt(fila, 4).toString());
                txtTelefono1.setText(tblProveedores.getValueAt(fila, 5).toString());
                txtTelefono2.setText(tblProveedores.getValueAt(fila, 6).toString());
                txtCorreo.setText(tblProveedores.getValueAt(fila, 7).toString());
                

                condicion = String.format("id=%s", txtId.getText());
                proveedor = logica.ObtenerUnProveedor(condicion);
                txtId.setText(String.valueOf(proveedor.getId()));
                txtNombre.setText(proveedor.getNombre());
                txtCedula.setText(proveedor.getCedula());
                txtEstado.setText(String.valueOf(proveedor.isEstado()));
                txtDireccion.setText(proveedor.getDireccion());
                txtTelefono1.setText(proveedor.getTelefono1());
                txtTelefono2.setText(proveedor.getTelefono2());
                txtCorreo.setText(proveedor.getCorreo());

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_tblProveedoresMouseClicked

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:

        BLProveedores logica = new BLProveedores();
        EntidadProveedores proveedor;
        try {
            proveedor = GenerarEntidad();
            if(proveedor.getExiste()){
                if(logica.Eliminar(proveedor) > 0){
                    JOptionPane.showMessageDialog(this, logica.getMensaje());
                    Limpiar();
                    CargarDatos("estado = 1");
                }else{
                    JOptionPane.showMessageDialog(this, "No fue posible eliminar el proveedor");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Debe seleccionar el proveedor que desea eliminar");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void txtTelefono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefono1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefono1ActionPerformed

    
    
      private EntidadProveedores GenerarEntidad(){
        EntidadProveedores proveedor = new EntidadProveedores();
        if (!txtId.getText().equals("")) {
            proveedor.setExiste(true);
            proveedor.setId(Integer.parseInt(txtId.getText()));
        }
                //mpresa.setId(Integer.parseInt(txtId.getText()));
                proveedor.setNombre(txtNombre.getText());
                proveedor.setCedula(txtCedula.getText());
                proveedor.setEstado(Boolean.valueOf(txtEstado.getText()));
              //usuarios.setEstado(Boolean.valueOf(txtEstado.getText()));
                proveedor.setDireccion(txtDireccion.getText());
                proveedor.setTelefono1(txtTelefono1.getText());
                proveedor.setTelefono2(txtTelefono2.getText());
                proveedor.setCorreo(txtCorreo.getText());
                if(cbmTipoDoc.getSelectedItem().toString().equals("Cedula F??sica")){
                proveedor.setIdTipodoc(1);
           
                
                }
                
                else if(cbmTipoDoc.getSelectedItem().toString().equals("Cedula Jur??dica")){
                proveedor.setIdTipodoc(2);
           
                
                }
                
                else if(cbmTipoDoc.getSelectedItem().toString().equals("Pasaporte")){
                proveedor.setIdTipodoc(3);
           
                
                }
                   
                else if(cbmTipoDoc.getSelectedItem().toString().equals("Residencia")){
                proveedor.setIdTipodoc(4);
           
                
                }
                

        return proveedor;
         }
    
    
    
 
    
    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:

        FrmBuscarProveedores buscar = new FrmBuscarProveedores(null, true);
        buscar.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                try {
                    int id = buscar.ObtenerId();
                    String condicion = "";
                    BLProveedores logica = new BLProveedores();
                    EntidadProveedores usuarios;
                    if (id > -1) {
                        condicion = String.format("estado = 1 and Id=%d", id);
                        usuarios = logica.ObtenerUnProveedor(condicion);
                        txtId.setText(String.valueOf(usuarios.getId()));
                        txtNombre.setText(usuarios.getNombre());
                        txtCedula.setText(String.valueOf(usuarios.getCedula()));
                        txtEstado.setText(String.valueOf(usuarios.isEstado()));
                        txtDireccion.setText(String.valueOf(usuarios.getDireccion()));
                        txtTelefono1.setText(String.valueOf(usuarios.getTelefono1()));
                        txtTelefono2.setText(String.valueOf(usuarios.getTelefono2()));
                        txtCorreo.setText(String.valueOf(usuarios.getCorreo()));
                    }
                    else{
                        txtId.setText(null);
                        txtNombre.setText(null);
                        txtCedula.setText(null);
                        txtEstado.setText(null);
                        txtDireccion.setText(null);
                        txtTelefono1.setText(null);
                        txtTelefono2.setText(null);
                        txtCorreo.setText(null);
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
        buscar.setVisible(true);

    }//GEN-LAST:event_btnBuscarActionPerformed

    
    
        private void LimpiarTabla(){
        modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };     
        tblProveedores.setModel(modelo);
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cedula");
        modelo.addColumn("Estado");
        modelo.addColumn("Direccion");
        modelo.addColumn("Tel??fono1");
        modelo.addColumn("Tel??fono2");
        modelo.addColumn("Correo");
        modelo.addColumn("IdTipodoc");

         }
    
    //M??TODO PARA MOSTRAR LA TABLA
    private void CargarDatos(String condicion) throws Exception {
        BLProveedores logica = new BLProveedores();
        List<EntidadProveedores> lista;
        LimpiarTabla();
        Object[] fila = new Object[9];
        try {
            lista = logica.ListarProveedor(condicion);
            for (EntidadProveedores cli : lista) {
                fila[0] = cli.getId();
                fila[1] = cli.getNombre();
                fila[2] = cli.getCedula();
                fila[3] = cli.isEstado();
                fila[4] = cli.getDireccion();
                fila[5] = cli.getTelefono1();
                fila[6] = cli.getTelefono2();
                fila[7] = cli.getCorreo(); 
                fila[8] = cli.getIdTipodoc();
                
                modelo.addRow(fila);
            }
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    

    
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtTelefono2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefono2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefono2ActionPerformed

    private void ProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProveedoresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Proveedores;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbmTipoDoc;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelIdTipoDoc;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTelefono1;
    private javax.swing.JLabel jLabelTelefono2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblProveedores;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono1;
    private javax.swing.JTextField txtTelefono2;
    // End of variables declaration//GEN-END:variables
}
