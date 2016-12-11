/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.*;
import vista.*;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author Pavilion
 */
public class ControladorPrincipal implements ActionListener {

    JFramePrincipal vistaPrincipal = new JFramePrincipal();
    UsuarioDTO usuarioValido = new UsuarioDTO();

    public ControladorPrincipal(JFramePrincipal vistaPrincipal, UsuarioDTO usuarioValido) {
        this.vistaPrincipal = vistaPrincipal;
        this.usuarioValido = usuarioValido;
        vistaPrincipal.lblUsuarioLogin.setText("Bienvenido(a): " + usuarioValido.getNombres() + " " + usuarioValido.getApellidos());
        vistaPrincipal.setVisible(true);
        vistaPrincipal.menuItemUsuarios.addActionListener(this);
        vistaPrincipal.menuItemPredios.addActionListener(this);
        vistaPrincipal.menuItemSalir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*Si se selecciona la opción usuarios del menú se intancia la vista y
        el modelo de usuario y se envian como parámetros a una intancia
        del controlador de usuarios*/
        if (e.getSource() == vistaPrincipal.menuItemUsuarios) {
            JInternalFrameUsuarios vistaUsuario = new JInternalFrameUsuarios();
            UsuarioDAO modeloUsuario = new UsuarioDAO();
            vistaPrincipal.jDesktopPane1.add(vistaUsuario);
            vistaUsuario.setVisible(true);
            ControladorUsuario controladorUsuario = new ControladorUsuario(vistaUsuario, modeloUsuario);
        }

        if (e.getSource() == vistaPrincipal.menuItemPredios) {
            JInternalFramePredios vistaPredios = new JInternalFramePredios();
            vistaPrincipal.jDesktopPane1.add(vistaPredios);
            vistaPredios.setVisible(true);
            ControladorPredios controladorPredios = new ControladorPredios(vistaPredios);
        }

        if (e.getSource() == vistaPrincipal.menuItemSalir) {
            System.exit(0);
        }
    }

}
