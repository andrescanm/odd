/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Pavilion
 */
public class JInternalFramePredios extends javax.swing.JInternalFrame {

    /**
     * Creates new form JInternalFramePredios
     */
    public JInternalFramePredios() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCampos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroCuentaContrato = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNumeroAviso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtLocalidad = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNombreSubscriptor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtNumUnidadesHabitacionales = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtNumUnidadesNoHabitacionales = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNombreSubscriptor1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNumUnidadesHabitacionales1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtNumUnidadesNoHabitacionales1 = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnEliminar1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanelBusqueda = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblBuscar = new javax.swing.JLabel();
        cboxSeleccionarAtributoBuscar = new javax.swing.JComboBox<>();
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);

        jPanelCampos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Administración de predios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 2, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel1.setText("Id. Predio:");

        txtId.setEditable(false);
        txtId.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtId.setEnabled(false);
        txtId.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtId.setMaximumSize(new java.awt.Dimension(145, 25));
        txtId.setMinimumSize(new java.awt.Dimension(145, 25));
        txtId.setPreferredSize(new java.awt.Dimension(145, 25));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setText("N° Cuenta Contrato:");

        txtNumeroCuentaContrato.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtNumeroCuentaContrato.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtNumeroCuentaContrato.setMaximumSize(new java.awt.Dimension(145, 25));
        txtNumeroCuentaContrato.setMinimumSize(new java.awt.Dimension(145, 25));
        txtNumeroCuentaContrato.setPreferredSize(new java.awt.Dimension(145, 25));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setText("Dirección:");

        txtDireccion.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtDireccion.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtDireccion.setMaximumSize(new java.awt.Dimension(145, 25));
        txtDireccion.setMinimumSize(new java.awt.Dimension(145, 25));
        txtDireccion.setPreferredSize(new java.awt.Dimension(145, 25));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setText("Número aviso:");

        txtNumeroAviso.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtNumeroAviso.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtNumeroAviso.setMaximumSize(new java.awt.Dimension(145, 25));
        txtNumeroAviso.setMinimumSize(new java.awt.Dimension(145, 25));
        txtNumeroAviso.setPreferredSize(new java.awt.Dimension(145, 25));

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel5.setText("Localidad:");

        txtLocalidad.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtLocalidad.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtLocalidad.setMaximumSize(new java.awt.Dimension(145, 25));
        txtLocalidad.setMinimumSize(new java.awt.Dimension(145, 25));
        txtLocalidad.setPreferredSize(new java.awt.Dimension(145, 25));

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel6.setText("Nombre Subscriptor:");

        txtNombreSubscriptor.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtNombreSubscriptor.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtNombreSubscriptor.setMaximumSize(new java.awt.Dimension(145, 25));
        txtNombreSubscriptor.setMinimumSize(new java.awt.Dimension(145, 25));
        txtNombreSubscriptor.setPreferredSize(new java.awt.Dimension(145, 25));

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel7.setText("N° Unidades habitacionales:");

        txtNumUnidadesHabitacionales.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtNumUnidadesHabitacionales.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtNumUnidadesHabitacionales.setMaximumSize(new java.awt.Dimension(145, 25));
        txtNumUnidadesHabitacionales.setMinimumSize(new java.awt.Dimension(145, 25));
        txtNumUnidadesHabitacionales.setPreferredSize(new java.awt.Dimension(145, 25));

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel8.setText("N° Unidades No habitacionales:");

        txtNumUnidadesNoHabitacionales.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtNumUnidadesNoHabitacionales.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtNumUnidadesNoHabitacionales.setMaximumSize(new java.awt.Dimension(145, 25));
        txtNumUnidadesNoHabitacionales.setMinimumSize(new java.awt.Dimension(145, 25));
        txtNumUnidadesNoHabitacionales.setPreferredSize(new java.awt.Dimension(145, 25));

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel9.setText("Volumen de producción:");

        txtNombreSubscriptor1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtNombreSubscriptor1.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtNombreSubscriptor1.setMaximumSize(new java.awt.Dimension(145, 25));
        txtNombreSubscriptor1.setMinimumSize(new java.awt.Dimension(145, 25));
        txtNombreSubscriptor1.setPreferredSize(new java.awt.Dimension(145, 25));

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel10.setText("Frecuencia:");

        txtNumUnidadesHabitacionales1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtNumUnidadesHabitacionales1.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtNumUnidadesHabitacionales1.setMaximumSize(new java.awt.Dimension(145, 25));
        txtNumUnidadesHabitacionales1.setMinimumSize(new java.awt.Dimension(145, 25));
        txtNumUnidadesHabitacionales1.setPreferredSize(new java.awt.Dimension(145, 25));

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel11.setText("Horario:");

        txtNumUnidadesNoHabitacionales1.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtNumUnidadesNoHabitacionales1.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtNumUnidadesNoHabitacionales1.setMaximumSize(new java.awt.Dimension(145, 25));
        txtNumUnidadesNoHabitacionales1.setMinimumSize(new java.awt.Dimension(145, 25));
        txtNumUnidadesNoHabitacionales1.setPreferredSize(new java.awt.Dimension(145, 25));

        btnNuevo.setText("Nuevo");
        btnNuevo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnNuevo.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        btnGuardar.setText("Guardar");
        btnGuardar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        btnEditar.setText("Editar");
        btnEditar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEditar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        btnEliminar.setText("Eliminar");
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        btnEliminar1.setText("Cancelar");
        btnEliminar1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEliminar1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel12.setText("Observaciones:");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanelCamposLayout = new javax.swing.GroupLayout(jPanelCampos);
        jPanelCampos.setLayout(jPanelCamposLayout);
        jPanelCamposLayout.setHorizontalGroup(
            jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCamposLayout.createSequentialGroup()
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCamposLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2)
                        .addGap(4, 4, 4)
                        .addComponent(txtNumeroCuentaContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel6))
                    .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelCamposLayout.createSequentialGroup()
                            .addGap(65, 65, 65)
                            .addComponent(jLabel1)
                            .addGap(4, 4, 4)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelCamposLayout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jLabel4)
                            .addGap(4, 4, 4)
                            .addComponent(txtNumeroAviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtNumUnidadesHabitacionales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelCamposLayout.createSequentialGroup()
                            .addGap(33, 33, 33)
                            .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel10)
                                .addComponent(jLabel12))
                            .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelCamposLayout.createSequentialGroup()
                                    .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelCamposLayout.createSequentialGroup()
                                            .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanelCamposLayout.createSequentialGroup()
                                                    .addGap(3, 3, 3)
                                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanelCamposLayout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanelCamposLayout.createSequentialGroup()
                                                    .addGap(145, 145, 145)
                                                    .addComponent(jLabel11)
                                                    .addGap(3, 3, 3))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCamposLayout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)))))
                                        .addGroup(jPanelCamposLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtNumUnidadesHabitacionales1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelCamposLayout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addComponent(txtNumUnidadesNoHabitacionales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanelCamposLayout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtNombreSubscriptor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtNumUnidadesNoHabitacionales1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(jPanelCamposLayout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCamposLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(txtNombreSubscriptor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelCamposLayout.createSequentialGroup()
                        .addComponent(btnNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar1)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanelCamposLayout.setVerticalGroup(
            jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCamposLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(11, 11, 11)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNumeroCuentaContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2))
                    .addGroup(jPanelCamposLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtNombreSubscriptor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(9, 9, 9)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCamposLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNumeroAviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNumUnidadesHabitacionales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCamposLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(txtNombreSubscriptor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelCamposLayout.createSequentialGroup()
                        .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelCamposLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(txtNumUnidadesNoHabitacionales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9)))
                            .addGroup(jPanelCamposLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))
                        .addGap(9, 9, 9)
                        .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtNumUnidadesHabitacionales1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)
                                .addComponent(txtNumUnidadesNoHabitacionales1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminar)
                    .addComponent(btnEliminar1))
                .addContainerGap())
        );

        jPanelBusqueda.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Búsquedas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 2, 12))); // NOI18N
        jPanelBusqueda.setMaximumSize(new java.awt.Dimension(480, 270));
        jPanelBusqueda.setMinimumSize(new java.awt.Dimension(480, 270));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        lblBuscar.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblBuscar.setText("Buscar por:");

        cboxSeleccionarAtributoBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione...", "ID", "Nombre subscriptor", "N° Cuenta contrato", "Dirección", "Localidad" }));

        txtBuscar.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        txtBuscar.setAutoscrolls(false);
        txtBuscar.setMargin(new java.awt.Insets(1, 1, 1, 1));
        txtBuscar.setMaximumSize(new java.awt.Dimension(145, 25));
        txtBuscar.setMinimumSize(new java.awt.Dimension(145, 25));
        txtBuscar.setPreferredSize(new java.awt.Dimension(145, 25));

        btnBuscar.setText("Buscar");
        btnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnBuscar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBuscar.setMaximumSize(new java.awt.Dimension(89, 33));
        btnBuscar.setMinimumSize(new java.awt.Dimension(89, 33));
        btnBuscar.setPreferredSize(new java.awt.Dimension(89, 33));

        javax.swing.GroupLayout jPanelBusquedaLayout = new javax.swing.GroupLayout(jPanelBusqueda);
        jPanelBusqueda.setLayout(jPanelBusquedaLayout);
        jPanelBusquedaLayout.setHorizontalGroup(
            jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelBusquedaLayout.createSequentialGroup()
                        .addComponent(lblBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboxSeleccionarAtributoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanelBusquedaLayout.setVerticalGroup(
            jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBusquedaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBusquedaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBuscar)
                    .addComponent(cboxSeleccionarAtributoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnEliminar1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cboxSeleccionarAtributoBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanelBusqueda;
    private javax.swing.JPanel jPanelCampos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblBuscar;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtNombreSubscriptor;
    private javax.swing.JTextField txtNombreSubscriptor1;
    private javax.swing.JTextField txtNumUnidadesHabitacionales;
    private javax.swing.JTextField txtNumUnidadesHabitacionales1;
    private javax.swing.JTextField txtNumUnidadesNoHabitacionales;
    private javax.swing.JTextField txtNumUnidadesNoHabitacionales1;
    private javax.swing.JTextField txtNumeroAviso;
    private javax.swing.JTextField txtNumeroCuentaContrato;
    // End of variables declaration//GEN-END:variables
}
