/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.*;
import vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andrés Cañón M.
 */
public class ControladorUsuario implements ActionListener{
    JInternalFrameUsuarios vistaUsuario = new JInternalFrameUsuarios();
    JInternalFramePredios vistaPredios = new JInternalFramePredios();
    UsuarioDAO modeloUsuario = new UsuarioDAO();

    public ControladorUsuario(JInternalFrameUsuarios vistaUsuario, UsuarioDAO modeloUsuario) {
        this.vistaUsuario = vistaUsuario;
        this.modeloUsuario = modeloUsuario;
        this.vistaPredios = vistaPredios;
        this.vistaUsuario.btnNuevo.addActionListener(this);
        this.vistaUsuario.btnGuardar.addActionListener(this);
        this.vistaUsuario.btnEditar.addActionListener(this);
        this.vistaUsuario.btnEliminar.addActionListener(this);
        this.vistaUsuario.btnCancelar.addActionListener(this);
        this.vistaUsuario.btnBuscar.addActionListener(this);
        this.llenarTablaUsuarios(vistaUsuario.tblDatosUsuarios);
        
        inactivarControles();
    }
    
    public void InicializarControladorUsuario(){
        
    }
    
    public void limpiarFormulario(){
        vistaUsuario.txtIdUsuario.setText("");
        vistaUsuario.txtNombres.setText("");
        vistaUsuario.txtApellidos.setText("");
        vistaUsuario.txtCargo.setText("");
        vistaUsuario.txtArea.setText("");
        vistaUsuario.txtUsername.setText("");
        vistaUsuario.cboxSeleccionarTipo.setSelectedIndex(0);
        vistaUsuario.pwdIngresarPassword.setText("");
        vistaUsuario.pwdIngresarPassword1.setText("");
        vistaUsuario.btnNuevo.setEnabled(true);
        vistaUsuario.btnCancelar.setEnabled(false);
        inactivarControles();
    }
    
    public void inactivarControles(){        
        vistaUsuario.txtIdUsuario.setEditable(false);
        vistaUsuario.txtNombres.setEditable(false);
        vistaUsuario.txtApellidos.setEditable(false);
        vistaUsuario.txtCargo.setEditable(false);
        vistaUsuario.txtArea.setEditable(false);
        vistaUsuario.txtUsername.setEditable(false);
        vistaUsuario.cboxSeleccionarTipo.setSelectedIndex(0);
        vistaUsuario.pwdIngresarPassword.setEditable(false);
        vistaUsuario.pwdIngresarPassword1.setEditable(false);
        vistaUsuario.btnGuardar.setEnabled(false);
        vistaUsuario.cboxSeleccionarTipo.setEnabled(false);
    }

    public void activarControles(){        
        vistaUsuario.txtIdUsuario.setEditable(true);
        vistaUsuario.txtNombres.setEditable(true);
        vistaUsuario.txtApellidos.setEditable(true);
        vistaUsuario.txtCargo.setEditable(true);
        vistaUsuario.txtArea.setEditable(true);
        vistaUsuario.txtUsername.setEditable(true);
        vistaUsuario.cboxSeleccionarTipo.setSelectedIndex(0);
        vistaUsuario.cboxSeleccionarTipo.setEnabled(true);
        vistaUsuario.pwdIngresarPassword.setEditable(true);
        vistaUsuario.pwdIngresarPassword1.setEditable(true);
        vistaUsuario.btnGuardar.setEnabled(true);
        vistaUsuario.btnCancelar.setEnabled(true);
    }
    
public void llenarTablaUsuarios(JTable tabla){
        DefaultTableModel  modeloTabla = new DefaultTableModel();
        tabla.setModel(modeloTabla);
        
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("NOMBRES");
        modeloTabla.addColumn("APELLIDOS");
        modeloTabla.addColumn("USERNAME");
        modeloTabla.addColumn("TIPO");
        modeloTabla.addColumn("CARGO");
        modeloTabla.addColumn("AREA");
        
        Object[] columna = new Object[7];

        int numeroRegistros = modeloUsuario.listarUsuarios().size();

        for (int i = 0; i < numeroRegistros; i++) {
            columna[0] = modeloUsuario.listarUsuarios().get(i).getIdUsuario();
            columna[1] = modeloUsuario.listarUsuarios().get(i).getNombres();
            columna[2] = modeloUsuario.listarUsuarios().get(i).getApellidos();
            columna[3] = modeloUsuario.listarUsuarios().get(i).getUsername();
            columna[4] = modeloUsuario.listarUsuarios().get(i).getTipoUsuario();
            columna[5] = modeloUsuario.listarUsuarios().get(i).getCargo();
            columna[6] = modeloUsuario.listarUsuarios().get(i).getArea();
            modeloTabla.addRow(columna);
        }
    }    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == vistaUsuario.btnGuardar){
            String clave1 = String.valueOf(vistaUsuario.pwdIngresarPassword.getPassword());
            String clave2 = String.valueOf(vistaUsuario.pwdIngresarPassword1.getPassword());
            if(clave1.equals(clave2)){
                String idUsuario = vistaUsuario.txtIdUsuario.getText();
                String username = vistaUsuario.txtUsername.getText();
                String clave = String.valueOf(vistaUsuario.pwdIngresarPassword.getPassword());
                String tipousuario = (String) vistaUsuario.cboxSeleccionarTipo.getSelectedItem();
                String nombres = vistaUsuario.txtNombres.getText();
                String apellidos = vistaUsuario.txtApellidos.getText();
                String cargo = vistaUsuario.txtCargo.getText();
                String area = vistaUsuario.txtArea.getText();
                String resultado = modeloUsuario.insertarUsuario(idUsuario, username, clave, tipousuario, nombres, apellidos, cargo, area);

                if(resultado != null){
                    JOptionPane.showMessageDialog(null, resultado);
                    limpiarFormulario();
                    llenarTablaUsuarios(vistaUsuario.tblDatosUsuarios);
                }else{
                    JOptionPane.showMessageDialog(null, "Error guardando el registro");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden, por favor intente nuevamente.");
            }
        }
        
        if(e.getSource() == vistaUsuario.btnCancelar){
            JOptionPane.showMessageDialog(null, "¡Acción Cancelada!");
            limpiarFormulario();
            llenarTablaUsuarios(vistaUsuario.tblDatosUsuarios);
        }
        
        if(e.getSource() == vistaUsuario.btnNuevo){
            limpiarFormulario();
            activarControles();
            vistaUsuario.btnEditar.setEnabled(false);
            vistaUsuario.btnEliminar.setEnabled(false);
            vistaUsuario.btnNuevo.setEnabled(false);
        }
        
    }    
}
