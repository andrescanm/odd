/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.*;
import vista.*;
import controlador.*;

/**
 *
 * @author Andrés Cañón M.
 */
public class ControladorLogin implements ActionListener {

    JFrameLogin vistaLogin = new JFrameLogin();
    JFramePrincipal vistaPrincipal = new JFramePrincipal();
    UsuarioDTO usuarioValido = new UsuarioDTO();
    UsuarioDAO modeloUsuario = new UsuarioDAO();

    public ControladorLogin(JFrameLogin vistaLogin, UsuarioDAO modeloUsuario) {
        this.vistaLogin = vistaLogin;
        this.modeloUsuario = modeloUsuario;
        this.vistaLogin.setVisible(true);
        this.vistaLogin.btnIniciarSesion.addActionListener(this);
        this.vistaLogin.btnSalir.addActionListener(this);
    }

    public void InicializarControladorUsuario() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*Si se presiona el botón iniciar sesión*/
        if (e.getSource() == vistaLogin.btnIniciarSesion) {
            /*Recoger usuario, clave*/
            String username = vistaLogin.txtUsername.getText();
            String clave = String.valueOf(vistaLogin.txtClave.getPassword());
            try {
                /*Enviar usuario y clave al método verificarUsuario*/
                usuarioValido = modeloUsuario.verificarUsuario(username, clave);
                /*Si las credenciales de autenticación son válidas se da acceso al sistema*/
                if (usuarioValido != null) {
                    vistaLogin.setVisible(false);
                    JOptionPane.showMessageDialog(vistaLogin, "Datos correctos, bienvenido(a):\n" + usuarioValido.getNombres());
                    ControladorPrincipal cp = new ControladorPrincipal(vistaPrincipal, usuarioValido);
                } else {
                    /*Si el usuario no es válido se solicita reintento y se limpian los controles*/
                    JOptionPane.showMessageDialog(vistaLogin, "Usuario y/o clave incorrectos, por favor intente nuevamente.");
                    vistaLogin.txtUsername.setText("");
                    vistaLogin.txtClave.setText("");
                    vistaLogin.txtUsername.requestFocusInWindow();
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ControladorLogin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(ControladorLogin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(ControladorLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        /*Si se presiona el botón cancelar*/
        if (e.getSource() == vistaLogin.btnSalir) {
            System.exit(0);
        }
    }
}
