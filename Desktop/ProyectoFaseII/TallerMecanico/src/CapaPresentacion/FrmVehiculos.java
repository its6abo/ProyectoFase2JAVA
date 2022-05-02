/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */

package CapaPresentacion;

import CapaEntidades.EntidadVehiculos;
import CapaLogica.BLVehiculos;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gabri
 */
public class FrmVehiculos extends javax.swing.JInternalFrame {
DefaultTableModel modelo;
    /** Creates new form FrmVehiculos */
    public FrmVehiculos() {
        initComponents();
        
         txtId.setVisible(false);
         txtEstado.setVisible(false);
         jLabelID.setVisible(false);
        jLabelEstado.setVisible(false);
        
        
        try {
            CargarDatos("");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error" + ex.getMessage());
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtId = new javax.swing.JTextField();
        jLabelPlaca = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        cbmTipoVehiculo = new javax.swing.JComboBox<>();
        jLabelID = new javax.swing.JLabel();
        txtEstado = new javax.swing.JTextField();
        txtPlaca = new javax.swing.JTextField();
        jLabelEstado = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jLabelIdTipoVehiculo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblVehiculos = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        cbmIdEstilo = new javax.swing.JComboBox<>();
        jLabelIdEstilo = new javax.swing.JLabel();
        jLabelIdMarca = new javax.swing.JLabel();
        cbmIdMarca = new javax.swing.JComboBox<>();
        jLabelIdTipoCombustible = new javax.swing.JLabel();
        cbmIdTipoCombustible = new javax.swing.JComboBox<>();
        jLabelIdTipoTrasmision = new javax.swing.JLabel();
        cbmIdTipoTransmision = new javax.swing.JComboBox<>();
        jTextVehiculos = new javax.swing.JTextField();

        setMinimumSize(new java.awt.Dimension(15, 15));

        txtId.setEditable(false);
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabelPlaca.setText("Placa");

        btnSalir.setBackground(new java.awt.Color(153, 0, 0));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        cbmTipoVehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Automovil", "Moto", "Camión", "Bus" }));

        jLabelID.setText("ID");

        txtEstado.setEditable(false);
        txtEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstadoActionPerformed(evt);
            }
        });

        jLabelEstado.setText("Estado");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(51, 153, 0));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabelIdTipoVehiculo.setText("Tipo Vehiculo");

        tblVehiculos.setModel(new javax.swing.table.DefaultTableModel(
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
        tblVehiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblVehiculosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblVehiculos);

        btnBuscar.setBackground(new java.awt.Color(0, 51, 255));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
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

        cbmIdEstilo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hatchback", "Sedán", "Pick Up", "Deportivo" }));

        jLabelIdEstilo.setText("Estilo");

        jLabelIdMarca.setText("Marca");

        cbmIdMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Toyota", "Isuzu", "Mitsubishi", "Honda" }));

        jLabelIdTipoCombustible.setText("Combustible");

        cbmIdTipoCombustible.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Diesel", "Gasolina", "Gas", "Eléctrico" }));

        jLabelIdTipoTrasmision.setText("Tipo Transmision");

        cbmIdTipoTransmision.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manual", "Automática", "Dual", "Tiptronic" }));

        jTextVehiculos.setEditable(false);
        jTextVehiculos.setBackground(new java.awt.Color(153, 153, 153));
        jTextVehiculos.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 24)); // NOI18N
        jTextVehiculos.setForeground(new java.awt.Color(255, 255, 255));
        jTextVehiculos.setText(" Vehículos");
        jTextVehiculos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextVehiculosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 862, Short.MAX_VALUE))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabelPlaca)
                        .addGap(123, 123, 123)
                        .addComponent(jLabelIdTipoVehiculo)
                        .addGap(88, 88, 88)
                        .addComponent(jLabelIdEstilo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelIdMarca)
                        .addGap(95, 95, 95)
                        .addComponent(jLabelIdTipoCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(jLabelIdTipoTrasmision)
                        .addGap(44, 44, 44))))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelEstado)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelID)
                        .addGap(333, 333, 333)
                        .addComponent(jTextVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbmTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbmIdEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbmIdMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbmIdTipoCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbmIdTipoTransmision, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jTextVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelEstado)
                            .addComponent(jLabelID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabelPlaca))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbmIdMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbmIdTipoCombustible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbmIdEstilo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbmTipoVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cbmIdTipoTransmision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelIdTipoVehiculo)
                            .addComponent(jLabelIdMarca)
                            .addComponent(jLabelIdTipoCombustible)
                            .addComponent(jLabelIdEstilo)
                            .addComponent(jLabelIdTipoTrasmision))))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        //
        Limpiar();
        
        

    }//GEN-LAST:event_btnLimpiarActionPerformed
                public void    Limpiar(){
            txtId.setText(null);
            txtEstado.setText(null);
            txtPlaca.setText(null);
                                    }
    
    
    
    
        private EntidadVehiculos GenerarEntidad(){
        EntidadVehiculos vehiculos = new EntidadVehiculos();
        if (!txtId.getText().equals("")) {
            vehiculos.setExiste(true);
            vehiculos.setId(Integer.parseInt(txtId.getText()));
        }
               
                vehiculos.setPlaca(txtPlaca.getText());
                vehiculos.setEstado(Boolean.valueOf(txtEstado.getText()));
              

                
                
                
                
                if(cbmTipoVehiculo.getSelectedItem().toString().equals("Automovil")){
                vehiculos.setIdTipoVehiculo(1);
           
                
                }
                
                else if(cbmTipoVehiculo.getSelectedItem().toString().equals("Moto")){
                vehiculos.setIdTipoVehiculo(2);
           
                
                }
                
                else if(cbmTipoVehiculo.getSelectedItem().toString().equals("Camión")){
                vehiculos.setIdTipoVehiculo(3);
           
                
                }
                   
                else if(cbmTipoVehiculo.getSelectedItem().toString().equals("Bus")){
                vehiculos.setIdTipoVehiculo(4);
           
                
                }
                
                else if(cbmIdEstilo.getSelectedItem().toString().equals("Hatchback")){
                vehiculos.setIdEstilo(1);
           
                
                }
                
                else if(cbmIdEstilo.getSelectedItem().toString().equals("Sedán")){
                vehiculos.setIdEstilo(2);
           
                
                }

                else if(cbmIdEstilo.getSelectedItem().toString().equals("Pick Up")){
                vehiculos.setIdEstilo(3);
           
                
                }

                else if(cbmIdEstilo.getSelectedItem().toString().equals("Deportivo")){
                vehiculos.setIdEstilo(4);
           
                
                }   
                
                
                else if(cbmIdMarca.getSelectedItem().toString().equals("Toyota")){
                vehiculos.setIdMarca(1);
           
                
                }                  
 
                else if(cbmIdMarca.getSelectedItem().toString().equals("Isuzu")){
                vehiculos.setIdMarca(2);
           
                
                }                      
                
                else if(cbmIdMarca.getSelectedItem().toString().equals("Mitsubishi")){
                vehiculos.setIdMarca(3);
           
                
                }      
                
                else if(cbmIdMarca.getSelectedItem().toString().equals("Honda")){
                vehiculos.setIdMarca(4);
           
                
                }                      
                
                else if(cbmIdTipoCombustible.getSelectedItem().toString().equals("Diesel")){
                vehiculos.setIdTipoCombustible(1);
                      
                }  
                
                 else if(cbmIdTipoCombustible.getSelectedItem().toString().equals("Gasolina")){
                vehiculos.setIdTipoCombustible(2);
                      
                }                 
                
                else if(cbmIdTipoCombustible.getSelectedItem().toString().equals("Gas")){
                vehiculos.setIdTipoCombustible(3);
                      
                }  

                else if(cbmIdTipoCombustible.getSelectedItem().toString().equals("Eléctrico")){
                vehiculos.setIdTipoCombustible(4);
                      
                }  

                else if(cbmIdTipoTransmision.getSelectedItem().toString().equals("Manual")){
                vehiculos.setIdTipoTrasmision(1);
                      
                }  
                
                  else if(cbmIdTipoTransmision.getSelectedItem().toString().equals("Automática")){
                vehiculos.setIdTipoTrasmision(2);
                      
                }                
                
                else if(cbmIdTipoTransmision.getSelectedItem().toString().equals("Dual")){
                vehiculos.setIdTipoTrasmision(3);
                      
                }                  


                else if(cbmIdTipoTransmision.getSelectedItem().toString().equals("Tiptronic")){
                vehiculos.setIdTipoTrasmision(4);
                      
                }  

                
        return vehiculos;
         }
    

    
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        BLVehiculos logica = new BLVehiculos();
        EntidadVehiculos vehiculos = GenerarEntidad();
        try {
            if (vehiculos.getExiste()) {
                logica.Modificar(vehiculos);
            }
            else{
                logica.Insertar(vehiculos);
            }
            Limpiar();
            CargarDatos("estado = 1");
            JOptionPane.showMessageDialog(this, logica.getMensaje());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "ERROR " + ex.getMessage());
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void tblVehiculosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblVehiculosMouseClicked
        // TODO add your handling code here:
        //AL DARLE DOBLE CLIC A LA TABLA CARGAR LOS DATOS DE UN DETERMINADO CLIENTE

        BLVehiculos logica = new BLVehiculos();
        EntidadVehiculos vehiculo;
        String condicion;
        try {
            if (evt.getClickCount() == 2) {
                int fila = tblVehiculos.rowAtPoint(evt.getPoint());
                txtId.setText(tblVehiculos.getValueAt(fila, 0).toString());
                txtPlaca.setText(tblVehiculos.getValueAt(fila, 1).toString());
                txtEstado.setText(tblVehiculos.getValueAt(fila, 2).toString());


                condicion = String.format("estado = 1 and id=%s", txtId.getText());
                vehiculo = logica.ObtenerUnVehiculo(condicion);
                txtId.setText(String.valueOf(vehiculo.getId()));
                txtPlaca.setText(vehiculo.getPlaca());
                txtEstado.setText(String.valueOf(vehiculo.getEstado()));

            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_tblVehiculosMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:

        FrmBuscarClientes buscar = new FrmBuscarClientes(null, true);
        buscar.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e) {
                try {
                    int id = buscar.ObtenerId();
                    String condicion = "";
                    BLVehiculos logica = new BLVehiculos();
                    EntidadVehiculos usuarios;
                    if (id > -1) {
                        condicion = String.format("estado = 1 and Id=%d", id);
                        usuarios = logica.ObtenerUnVehiculo(condicion);
                        txtId.setText(String.valueOf(usuarios.getId()));
                        txtPlaca.setText(usuarios.getPlaca());
                        txtEstado.setText(String.valueOf(usuarios.getEstado()));

                    }
                    else{
                        txtId.setText(null);
                        txtPlaca.setText(null);  
                        txtEstado.setText(null);

                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }
        });
        buscar.setVisible(true);
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:

        BLVehiculos logica = new BLVehiculos();
        EntidadVehiculos clientes;
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

    private void jTextVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextVehiculosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextVehiculosActionPerformed

    
    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
    
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstadoActionPerformed
        
    }//GEN-LAST:event_txtEstadoActionPerformed

    
            private void LimpiarTabla(){
        modelo = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };     
        tblVehiculos.setModel(modelo);
        modelo.addColumn("Id");
        modelo.addColumn("Placa");
        modelo.addColumn("idTipoVehiculo");
        modelo.addColumn("idEstilo");
        modelo.addColumn("idMarca");
        modelo.addColumn("idTipoCombustible");
        modelo.addColumn("idTipoTransmision");
        modelo.addColumn("estado");
         }
    
    
     //MÉTODO PARA MOSTRAR LA TABLA
    private void CargarDatos(String condicion) throws Exception {
        BLVehiculos logica = new BLVehiculos();
        List<EntidadVehiculos> lista;
        LimpiarTabla();
        Object[] fila = new Object[8];
        try {
            lista = logica.ListarVehiculos(condicion);
            for (EntidadVehiculos vehi : lista) {
                fila[0] = vehi.getId();
                fila[1] = vehi.getPlaca();
                fila[2] = vehi.getIdTipoVehiculo();
                fila[3] = vehi.getIdEstilo();
                fila[4] = vehi.getIdMarca();
                fila[5] = vehi.getIdTipoCombustible();
                fila[6] = vehi.getIdTipoTrasmision();
                fila[7] = vehi.getEstado(); 
                
                modelo.addRow(fila);
            }
        } catch (Exception ex) {
             JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbmIdEstilo;
    private javax.swing.JComboBox<String> cbmIdMarca;
    private javax.swing.JComboBox<String> cbmIdTipoCombustible;
    private javax.swing.JComboBox<String> cbmIdTipoTransmision;
    private javax.swing.JComboBox<String> cbmTipoVehiculo;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelIdEstilo;
    private javax.swing.JLabel jLabelIdMarca;
    private javax.swing.JLabel jLabelIdTipoCombustible;
    private javax.swing.JLabel jLabelIdTipoTrasmision;
    private javax.swing.JLabel jLabelIdTipoVehiculo;
    private javax.swing.JLabel jLabelPlaca;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextVehiculos;
    private javax.swing.JTable tblVehiculos;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables

}