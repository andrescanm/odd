/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Andrés Cañón M.
 */
public class Conexion {

    private Connection conexion = null;

    /**
     *
     * Crear la base de datos, se invoca si la base de datos no existe.
     */
    public Connection crearBaseDatos() {
        try {
            /*Driver Apache Derby - Base de datos Embebida*/
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            /*Obtener la conexión*/
            conexion = DriverManager.getConnection("jdbc:derby:.\\database\\optimizador.DB;create=true");
            if (conexion != null) {
                String crearTablaUsuario = "CREATE TABLE usuarios (idUsuario BIGINT NOT NULL, username VARCHAR(45) NOT NULL, clave VARCHAR(45) NOT NULL, tipousuario VARCHAR(45) NOT NULL, nombres VARCHAR(45) NOT NULL, apellidos VARCHAR(45) NOT NULL, cargo VARCHAR(45) NOT NULL, area VARCHAR(45) NOT NULL, PRIMARY KEY (idUsuario), UNIQUE (username))";
                String insertarUsuarioAdministrador = "INSERT INTO usuarios VALUES (1, 'admin', 'Admin@123', 'Administrador', 'Admin', 'Sistema', 'Administrador', 'Sistemas')";
                String crearTablaPredio = "CREATE TABLE predios (contrato VARCHAR(45) NOT NULL, plan VARCHAR(45) NOT NULL, localidad VARCHAR(45) NOT NULL, suscritor VARCHAR(128) NOT NULL, visitado VARCHAR(8), direccion VARCHAR(128) NOT NULL, vencimiento VARCHAR(45) NOT NULL, habitacionales VARCHAR(45), nohabitacionales VARCHAR(45) NOT NULL, basura VARCHAR(45) NOT NULL, numsemana VARCHAR(45) NOT NULL, tipo VARCHAR(45) NOT NULL, frecuencia VARCHAR(128) NOT NULL, horario VARCHAR(128) NOT NULL, observacion VARCHAR(128), PRIMARY KEY (contrato))";
                String desconectarDB = "disconnect";
                try {
                    PreparedStatement pst = null;
                    pst = conexion.prepareStatement(crearTablaUsuario);
                    pst.execute();
                    pst = conexion.prepareStatement(crearTablaPredio);
                    pst.execute();
                    pst = conexion.prepareStatement(insertarUsuarioAdministrador);
                    pst.execute();
                    pst.close();

                    JOptionPane.showMessageDialog(null, "Base de datos creada con éxito", "DB Creada", 1);
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(null, e.getCause());
                }
            }
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return conexion;
    }

    /**
     *
     * Acceder a la base de datos.
     */
    public Connection accederBaseDatos() {
        try {
            /*Driver Derby - Base de datos embebida*/
            Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
            /*Establecer la conexión a la base de datos*/
            conexion = DriverManager.getConnection("jdbc:derby:.\\database\\optimizador.DB");
        } catch (SQLException | ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "La base de datos no está creada, esto puede deberse a que esta es la primer vez que ejecuta la aplicación, haga clic en \'Aceptar\' para crear la base de datos.\n", "Base de datos no encontrada.", JOptionPane.INFORMATION_MESSAGE);
        }
        return conexion;
    }

    /**
     * Cierra la conexión a la base de datos.
     */
    public void cerrarConexionBaseDatos() {
        try {
            conexion.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
