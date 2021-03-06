/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package CapaPresentacion;

import CapaEntidades.EntidadEmpresas;
import CapaLogica.BLEmpresas;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gabri
 */
public class FrmEmpresas extends javax.swing.JInternalFrame {
DefaultTableModel modelo;
    /**
     * Creates new form FrmEmpresas
     */
    public FrmEmpresas() throws Exception {
        initComponents();
         txtId.setVisible(false);
         jLabelID.setVisible(false);
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

        jLabelID = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabelNombre = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        jLabelNombreComercial = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        jLabelCedula = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblEmpresa = new javax.swing.JTable();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelTelefono1 = new javax.swing.JLabel();
        jLabelTelefono2 = new javax.swing.JLabel();
        jLabelCorreo = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtTelefono1 = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono2 = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtNombreComercial = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        Empresas = new javax.swing.JTextField();

        jLabelID.setText("ID");

        btnBuscar.setBackground(new java.awt.Color(0, 51, 255));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabelNombre.setText("Nombre");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabelNombreComercial.setText("Nombre Comercial");

        btnGuardar.setBackground(new java.awt.Color(51, 153, 0));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
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

        btnSalir.setBackground(new java.awt.Color(153, 0, 0));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabelCedula.setText("C??dula");

        tblEmpresa.setModel(new javax.swing.table.DefaultTableModel(
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
        tblEmpresa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpresaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblEmpresa);

        jLabelDireccion.setText("Direcci??n");

        jLabelTelefono1.setText("Telefono1");

        jLabelTelefono2.setText("Telefono2");

        jLabelCorreo.setText("Correo");

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        txtTelefono1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefono1ActionPerformed(evt);
            }
        });

        txtTelefono2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefono2ActionPerformed(evt);
            }
        });

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });

        txtId.setEditable(false);

        Empresas.setEditable(false);
        Empresas.setBackground(new java.awt.Color(153, 153, 153));
        Empresas.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        Empresas.setForeground(new java.awt.Color(255, 255, 255));
        Empresas.setText("  Empresas");
        Empresas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Empresas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpresasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(jLabelDireccion))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabelNombre))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtDireccion)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabelID, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(jLabelTelefono1)
                                .addGap(132, 132, 132)
                                .addComponent(jLabelTelefono2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelCorreo)
                                .addGap(83, 83, 83))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(txtTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(txtTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(jLabelNombreComercial)
                                        .addGap(43, 43, 43))
                                    .addComponent(txtNombreComercial, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCedula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabelCedula)
                                        .addGap(47, 47, 47)))
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Empresas, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(360, 360, 360)))))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabelID)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelNombre))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(Empresas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtNombreComercial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelNombreComercial))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelCedula)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDireccion)
                    .addComponent(jLabelTelefono1)
                    .addComponent(jLabelTelefono2)
                    .addComponent(jLabelCorreo))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        
        FrmBuscarEmpresas buscar = new FrmBuscarEmpresas(null, true);
        buscar.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                try {
                    int id = buscar.ObtenerId();
                    String condicion = "";
                    BLEmpresas logica = new BLEmpresas();
                    EntidadEmpresas empresa;
                    if (id > -1) {
                        condicion = String.format("estado = 1 and Id=%d", id);
                        empresa = logica.ObtenerUnaEmpresa(condicion);
                txtId.setText(String.valueOf(empresa.getId()));
                  txtNombre.setText(empresa.getNombre());
                txtCedula.setText(empresa.getCedula());
                txtDireccion.setText(empresa.getDireccion());
                txtTelefono1.setText(empresa.getTelefono1());
                txtTelefono2.setText(empresa.getTelefono2());
                txtCorreo.setText(empresa.getCorreo());
                txtNombreComercial.setText(empresa.getNombreComercial());
                    }
                    else{
                        txtId.setText(null);
                    txtNombre.setText(null);
                    txtNombreComercial.setText(null);
                    txtCedula.setText(null);
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
    
    
    //PREPARAR TABLA??PARA QUE NO SE PUEDA MODIFICAR
    //AGREGAR ENCABEZADOS
    private void LimpiarTabla(){
        modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };     
        tblEmpresa.setModel(modelo);
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("Cedula");
        modelo.addColumn("Direccion");
        modelo.addColumn("Tel??fono1");
        modelo.addColumn("Tel??fono2");
        modelo.addColumn("Correo");
        modelo.addColumn("NombreComercial");
    }
    
    //M??TODO PARA MOSTRAR LA TABLA
    private void CargarDatos(String condicion) throws Exception {
        BLEmpresas logica = new BLEmpresas();
        List<EntidadEmpresas> lista;
        LimpiarTabla();
        Object[] fila = new Object[8];
        try {
            lista = logica.ListarEmpresas(condicion);
            for (EntidadEmpresas cli : lista) {
                fila[0] = cli.getId();
                fila[1] = cli.getNombre();
                fila[2] = cli.getCedula();
                fila[3] = cli.getDireccion();
                fila[4] = cli.getTelefono1();
                fila[5] = cli.getTelefono2();
                fila[6] = cli.getCorreo();
                fila[7] = cli.getNombreComercial();
                modelo.addRow(fila);
            }
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    
    
    
        private EntidadEmpresas GenerarEntidad(){
        EntidadEmpresas empresa = new EntidadEmpresas();
        if (!txtId.getText().equals("")) {
            empresa.setExiste(true);
            empresa.setId(Integer.parseInt(txtId.getText()));
        }
                //mpresa.setId(Integer.parseInt(txtId.getText()));
                empresa.setNombre(txtNombre.getText());
                empresa.setCedula(txtCedula.getText());
              //  empresa.setEstado(Boolean.valueOf(txtEstado.getText()));
                empresa.setDireccion(txtDireccion.getText());
                empresa.setTelefono1(txtTelefono1.getText());
                empresa.setTelefono2(txtTelefono2.getText());
                empresa.setCorreo(txtCorreo.getText());
                empresa.setNombreComercial(txtNombreComercial.getText());

        return empresa;
         }
    
    
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        //
     Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        BLEmpresas logica = new BLEmpresas();
        EntidadEmpresas empresa = GenerarEntidad();
        try {
           if (empresa.getExiste()) {
               logica.Modificar(empresa);
            }
            else{
               logica.Insertar(empresa);
            }
            Limpiar();
            CargarDatos("estado = 1");
            JOptionPane.showMessageDialog(this, logica.getMensaje());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "ERROR " + ex.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        
        BLEmpresas logica = new BLEmpresas();
        EntidadEmpresas empresas;
        try {
            empresas = GenerarEntidad();
            if(empresas.getExiste()){
                if(logica.Eliminar(empresas) > 0){
                    JOptionPane.showMessageDialog(this, logica.getMensaje());
                    Limpiar();
                    CargarDatos("estado = 1");
                }else{
                    JOptionPane.showMessageDialog(this, "No fue posible eliminar la empresa");
                }
            }else{
                JOptionPane.showMessageDialog(this, "Debe seleccionar la empresa que desea eliminar");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void tblEmpresaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpresaMouseClicked
        // TODO add your handling code here:
        //AL DARLE DOBLE CLIC A LA TABLA CARGAR LOS DATOS DE UN DETERMINADO CLIENTE
        
        BLEmpresas logica = new BLEmpresas();
        EntidadEmpresas empresa;
        String condicion;
        try {
            if (evt.getClickCount() == 2) {
                int fila = tblEmpresa.rowAtPoint(evt.getPoint());
                txtId.setText(tblEmpresa.getValueAt(fila, 0).toString());
                                txtNombre.setText(tblEmpresa.getValueAt(fila, 1).toString());
                                txtCedula.setText(tblEmpresa.getValueAt(fila, 2).toString());
                                txtDireccion.setText(tblEmpresa.getValueAt(fila, 3).toString());
                                txtTelefono1.setText(tblEmpresa.getValueAt(fila, 4).toString());
                                txtTelefono2.setText(tblEmpresa.getValueAt(fila, 5).toString());
                                txtCorreo.setText(tblEmpresa.getValueAt(fila, 6).toString());
                                txtNombreComercial.setText(tblEmpresa.getValueAt(fila, 7).toString());
                                
                condicion = String.format("estado = 1 and id=%s", txtId.getText());
                empresa = logica.ObtenerUnaEmpresa(condicion);
                txtId.setText(String.valueOf(empresa.getId()));
                txtNombre.setText(empresa.getNombre());
                txtCedula.setText(empresa.getCedula());
                txtDireccion.setText(empresa.getDireccion());
                txtTelefono1.setText(empresa.getTelefono1());
                txtTelefono2.setText(empresa.getTelefono2());
                txtCorreo.setText(empresa.getCorreo());
                txtNombreComercial.setText(empresa.getNombreComercial());
                
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }//GEN-LAST:event_tblEmpresaMouseClicked

public void    Limpiar(){
txtId.setText(null);
txtNombre.setText(null);
txtNombreComercial.setText(null);
txtCedula.setText(null);
txtDireccion.setText(null);
txtTelefono1.setText(null);
txtTelefono2.setText(null);
txtCorreo.setText(null);
}
    
    
    
    
    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtTelefono1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefono1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefono1ActionPerformed

    private void txtTelefono2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefono2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefono2ActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void EmpresasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpresasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpresasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Empresas;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabelCedula;
    private javax.swing.JLabel jLabelCorreo;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombreComercial;
    private javax.swing.JLabel jLabelTelefono1;
    private javax.swing.JLabel jLabelTelefono2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblEmpresa;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreComercial;
    private javax.swing.JTextField txtTelefono1;
    private javax.swing.JTextField txtTelefono2;
    // End of variables declaration//GEN-END:variables
}
