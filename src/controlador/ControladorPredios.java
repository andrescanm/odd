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
import javax.swing.JOptionPane;

/**
 *
 * @author Pavilion
 */
public class ControladorPredios implements ActionListener {

    JInternalFramePredios vistaPredios = new JInternalFramePredios();
    
    public ControladorPredios(JInternalFramePredios vistaPredios) {
        this.vistaPredios = vistaPredios;
        vistaPredios.btnSeleccionarArchivo.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*Si se presiona el botón seleccionar archivo*/
        if (e.getSource() == this.vistaPredios.btnSeleccionarArchivo) {
            /*Se agrega un archivo por medio de un JFileChooser y se guarda
            en la variable 'archivo' de tipo File*/
            JFileChooser seleccion = new JFileChooser();
            File archivo;
            if (seleccion.showDialog(null, "Abrir archivo") == JFileChooser.APPROVE_OPTION) {
                archivo = seleccion.getSelectedFile();
            }
        }
    }
}
