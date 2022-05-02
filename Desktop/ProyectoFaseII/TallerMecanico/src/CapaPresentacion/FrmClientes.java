/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package CapaPresentacion;

import CapaEntidades.EntidadClientes;
import CapaEntidades.EntidadProveedores;
import CapaLogica.BLClientes;
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
public class FrmClientes extends javax.swing.JInternalFrame {
    DefaultTableModel modelo;
    /**
     * Creates new form FrmClientes
     */
    public FrmClientes() throws Exception{
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

        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabelID = new javax.swing.JLabel();
        jLabelTelefono1 = new javax.swing.JLabel();
        txtTelefono1 = new javax.swing.JTextField();
        jLabelEstado = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono2 = new javax.swing.JTextField();
        jLabelTelefono2 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        cbmTipoDoc = new javax.swing.JComboBox<>();
        jLabelCorreo = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabelCedula = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabelIdTipoDoc = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblClientes = new javax.swing.JTable();
        txtDireccion = new javax.swing.JTextField();
        jLabelNombre = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        Clientes = new javax.swing.JTextField();

        btnEliminar.setBackground(new java.awt.Color(255, 0, 51));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(153, 0, 0));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabelID.setText("ID");

        jLabelTelefono1.setText("Telefono1");

        txtTelefono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefono1ActionPerformed(evt);
            }
        });

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

        txtTelefono2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefono2ActionPerformed(evt);
            }
        });

        jLabelTelefono2.setText("Telefono2");

        btnBuscar.setBackground(new java.awt.Color(0, 51, 255));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        txtId.setEditable(false);

        cbmTipoDoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cedula Física", "Cedula Jurídica", "Pasaporte", "Residencia" }));

        jLabelCorreo.setText("Correo");

        jLabelCedula.setText("Cédula");

        jLabelDireccion.setText("Dirección");

        btnGuardar.setBackground(new java.awt.Color(51, 153, 0));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabelIdTipoDoc.setText("Tipo Doc");

        tblClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        tblClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblClientes);

        jLabelNombre.setText("Nombre");

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        txtEstado.setEditable(false);

        Clientes.setEditable(false);
        Clientes.setBackground(new java.awt.Color(153, 153, 153));
        Clientes.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        Clientes.setForeground(new java.awt.Color(255, 255, 255));
        Clientes.setText(" Clientes");
        Clientes.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

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
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCedula)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabelCedula)
                                .addGap(53, 53, 53))
                            .addComponent(txtTelefono1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelIdTipoDoc)
                                .addGap(181, 181, 181)
                                .addComponent(jLabelNombre)
                                .addGap(224, 224, 224)
                                .addComponent(jLabelDireccion)
                                .addGap(73, 73, 73))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTelefono2)
                                    .addComponent(cbmTipoDoc, 0, 156, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(18, 18, 18))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelEstado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelID)
                        .addGap(319, 319, 319)
                        .addComponent(Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabelTelefono1)
                        .addGap(132, 132, 132)
                        .addComponent(jLabelTelefono2)
                        .addGap(187, 187, 187)
                        .addComponent(jLabelCorreo)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelEstado)
                                .addComponent(jLabelID))
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbmTipoDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelIdTipoDoc)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabelDireccion)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelCedula)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelTelefono1)
                    .addComponent(jLabelTelefono2)
                    .addComponent(jLabelCorreo))
                .addGap(18, 18, 18)
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

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:

        BLClientes logica = new BLClientes();
        EntidadClientes clientes;
        try {
            clientes = GenerarEntidad();
            if(clientes.getExiste()){
                if(logica.Eliminar(clientes) > 0){
                    JOptionPane.showMessageDialog(this, logica.getMensaje());
                    Limpiar();
                    CargarDatos("estado = 1");
                }else{
                    JOptionPane.showMessageDialog(this, "No fue posible eliminar el cliente");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Debe seleccionar el cliente que desea eliminar");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    
    private EntidadClientes GenerarEntidad(){
        EntidadClientes proveedor = new EntidadClientes();
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
                if(cbmTipoDoc.getSelectedItem().toString().equals("Cedula Física")){
                proveedor.setIdTipodoc(1);
           
                
                }
                
                else if(cbmTipoDoc.getSelectedItem().toString().equals("Cedula Jurídica")){
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
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtTelefono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefono1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefono1ActionPerformed

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

    private void txtTelefono2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefono2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefono2ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:

        FrmBuscarClientes buscar = new FrmBuscarClientes(null, true);
        buscar.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                try {
                    int id = buscar.ObtenerId();
                    String condicion = "";
                    BLClientes logica = new BLClientes();
                    EntidadClientes usuarios;
                    if (id > -1) {
                        condicion = String.format("estado = 1 and Id=%d", id);
                        usuarios = logica.ObtenerUnCliente(condicion);
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
        tblClientes.setModel(modelo);
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cedula");
        modelo.addColumn("Estado");
        modelo.addColumn("Direccion");
        modelo.addColumn("Teléfono1");
        modelo.addColumn("Teléfono2");
        modelo.addColumn("Correo");
        modelo.addColumn("IdTipodoc");

         }
    
    
     //MÉTODO PARA MOSTRAR LA TABLA
    private void CargarDatos(String condicion) throws Exception {
        BLClientes logica = new BLClientes();
        List<EntidadClientes> lista;
        LimpiarTabla();
        Object[] fila = new Object[9];
        try {
            lista = logica.ListarClientes(condicion);
            for (EntidadClientes cli : lista) {
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
        
    
    
    
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        BLClientes logica = new BLClientes();
        EntidadClientes clientes = GenerarEntidad();
        try {
            if (clientes.getExiste()) {
                logica.Modificar(clientes);
            }
            else{
                logica.Insertar(clientes);
            }
            Limpiar();
            CargarDatos("estado = 1");
            JOptionPane.showMessageDialog(this, logica.getMensaje());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "ERROR " + ex.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tblClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblClientesMouseClicked
        // TODO add your handling code here:
        //AL DARLE DOBLE CLIC A LA TABLA CARGAR LOS DATOS DE UN DETERMINADO CLIENTE

        BLClientes logica = new BLClientes();
        EntidadClientes proveedor;
        String condicion;
        try {
            if (evt.getClickCount() == 2) {
                int fila = tblClientes.rowAtPoint(evt.getPoint());
                txtId.setText(tblClientes.getValueAt(fila, 0).toString());
                txtNombre.setText(tblClientes.getValueAt(fila, 1).toString());
                txtCedula.setText(tblClientes.getValueAt(fila, 2).toString());
                txtEstado.setText(tblClientes.getValueAt(fila, 3).toString());
                txtDireccion.setText(tblClientes.getValueAt(fila, 4).toString());
                txtTelefono1.setText(tblClientes.getValueAt(fila, 5).toString());
                txtTelefono2.setText(tblClientes.getValueAt(fila, 6).toString());
                txtCorreo.setText(tblClientes.getValueAt(fila, 7).toString());

                condicion = String.format("estado = 1 and id=%s", txtId.getText());
                proveedor = logica.ObtenerUnCliente(condicion);
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
    }//GEN-LAST:event_tblClientesMouseClicked

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Clientes;
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
    private javax.swing.JTable tblClientes;
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
