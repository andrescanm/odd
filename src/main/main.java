/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import modelo.*;
import vista.*;
import controlador.*;
/**
 *
 * @author Andrés Cañón M.
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JFrameLogin vistaLogin = new JFrameLogin();
        UsuarioDAO modeloUsuario = new UsuarioDAO();
        ControladorLogin controladorLogin = new ControladorLogin(vistaLogin, modeloUsuario);
    }
    
}
