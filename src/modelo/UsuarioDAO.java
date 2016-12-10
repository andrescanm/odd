/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Pavilion
 */
public class UsuarioDAO {
    private Conexion conexion = null;

    public UsuarioDAO() {
        conexion = new Conexion();        
        if(conexion.accederBaseDatos() == null){            
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea crear la base de datos ahora?\n Esta acción es necesaria para ingresar al sistema.");
            if(respuesta == 0){
                conexion.crearBaseDatos();
            }else{
                JOptionPane.showMessageDialog(null, "No existe la base de datos, el sistema se cerrará.\n Vuelva a ejecutar el programa y cree la base de datos");
                System.exit(0);
            }
        }
    }
    
    public String insertarUsuario(String idUsuario, String username, String clave, String tipoUsuario, String nombres, String apellidos, String cargo, String area){
        String resultadoRegistro = null;
        Connection enlaceBaseDatos = conexion.accederBaseDatos();
        
        String insertarUsuario = "INSERT INTO usuarios (idUsuario,username,clave,tipousuario,nombres,apellidos,cargo,area) VALUES (?,?,?,?,?,?,?,?)";
        int numeroFilasAfectadas = 0;
        try {
            PreparedStatement ps = enlaceBaseDatos.prepareStatement(insertarUsuario);
            ps.setString(1, idUsuario);
            ps.setString(2, username);
            ps.setString(3, clave);
            ps.setString(4, tipoUsuario);
            ps.setString(5, nombres);
            ps.setString(6, apellidos);
            ps.setString(7, cargo);
            ps.setString(8, area);
            
            numeroFilasAfectadas = ps.executeUpdate();
            
            if(numeroFilasAfectadas > 0){
                resultadoRegistro = "Registro exitoso!";
            }            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return resultadoRegistro;
    }
    
    public UsuarioDTO verificarUsuario(String username, String clave) throws ClassNotFoundException, InstantiationException, IllegalAccessException{
        UsuarioDTO usuario = null;
        Connection accesoBaseDatos = conexion.accederBaseDatos();
        try{
            PreparedStatement ps = accesoBaseDatos.prepareStatement("SELECT * FROM usuarios WHERE username =? AND clave =?");
            ps.setString(1, username);
            ps.setString(2, clave);
            
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                usuario = new UsuarioDTO();
                usuario.setIdUsuario(rs.getString(1));
                usuario.setUsername(rs.getString(2));
                usuario.setClave(rs.getString(3));
                usuario.setTipoUsuario(rs.getString(4));
                usuario.setNombres(rs.getString(5));
                usuario.setApellidos(rs.getString(6));
                usuario.setCargo(rs.getString(7));
                usuario.setArea(rs.getString(8));              
                return usuario;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }        
        return usuario;
    }
}
