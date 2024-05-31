package peluqueria.igu;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import peluqueria.logica.Controllers;
import peluqueria.logica.Mascota;

public class EditarDatos extends javax.swing.JFrame {

    Controllers controladora = null;
    int num_cliente;
    Mascota masco;
    public EditarDatos(int num_cliente) {
        controladora = new Controllers();
        // this.num_cliente = num_cliente;
        initComponents();
        cargarDatos(num_cliente);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        raza = new javax.swing.JLabel();
        color = new javax.swing.JLabel();
        Alergia = new javax.swing.JLabel();
        AtencionEspecial = new javax.swing.JLabel();
        NombreDueño = new javax.swing.JLabel();
        CelularDueño = new javax.swing.JLabel();
        Observaciones = new javax.swing.JLabel();
        txtNombreMascota = new javax.swing.JTextField();
        txtRaza = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtNombreDueño = new javax.swing.JTextField();
        txtCelDueño = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservaaciones = new javax.swing.JTextArea();
        cmbAlergico = new javax.swing.JComboBox<>();
        cmbAtencioEspecial = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel3.setText("Editar Datos");

        nombre.setText("Nombre : ");

        raza.setText("Raza :");

        color.setText("Color :");

        Alergia.setText("Alergia :");

        AtencionEspecial.setText("Atencion especial :");

        NombreDueño.setText("Nombre dueño :");

        CelularDueño.setText("cel dueño :");

        Observaciones.setText("Observaciones");

        txtObservaaciones.setColumns(20);
        txtObservaaciones.setRows(5);
        jScrollPane1.setViewportView(txtObservaaciones);

        cmbAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));

        cmbAtencioEspecial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Si", "No" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(AtencionEspecial)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cmbAtencioEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(NombreDueño)
                                .addComponent(CelularDueño))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtNombreDueño)
                                .addComponent(txtCelDueño)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(nombre)
                                .addComponent(raza)
                                .addComponent(color)
                                .addComponent(Alergia))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNombreMascota)
                                        .addComponent(txtRaza)
                                        .addComponent(txtColor, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(52, 52, 52)
                                    .addComponent(cmbAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Observaciones)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(nombre)
                    .addComponent(txtNombreMascota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(raza)
                    .addComponent(txtRaza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(color)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Alergia)
                    .addComponent(cmbAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AtencionEspecial)
                    .addComponent(cmbAtencioEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreDueño)
                    .addComponent(txtNombreDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CelularDueño)
                    .addComponent(txtCelDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Observaciones)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/perro.jpg"))); // NOI18N

        btnLimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3792081-broom-halloween-magic-witch_109049.png"))); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Save_37110.png"))); // NOI18N
        btnGuardar.setText("Guardar Cambios");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(btnLimpiar)))))
                .addGap(33, 33, 33))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
      //  BOTON GUARDAR DATOS

        String nombreMascota = txtNombreMascota.getText();
        String raza = txtRaza.getText();
        String color = txtColor.getText();
        String observaciones = txtObservaaciones.getText();
        String alergico = (String) cmbAlergico.getSelectedItem();
        String atencionEspecial = (String) cmbAtencioEspecial.getSelectedItem();

         
        
        
        String nombreDuenio = txtNombreDueño.getText();
        String celDuenio = txtCelDueño.getText();
       controladora.modificarMascota(masco, nombreMascota,raza,color,observaciones,alergico,atencionEspecial,nombreDuenio,celDuenio);
        
           
        MostrarMensaje("se edito correctamente", "info", "edicion Correcta");
        
        VerDatos pantalla = new VerDatos();
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
        
        this.dispose();
        
       
           
   
           
    }//GEN-LAST:event_btnGuardarActionPerformed
  public void MostrarMensaje(String mensaje, String tipo, String titulo) {

        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        } else if (tipo.equals("error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialog = optionPane.createDialog(titulo);
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);

    }
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNombreMascota.setText("");
        txtRaza.setText("");
        txtColor.setText("");
        txtNombreDueño.setText("");
        txtCelDueño.setText("");
        txtObservaaciones.setText("");
        cmbAlergico.setSelectedIndex(0);
        cmbAtencioEspecial.setSelectedIndex(0);
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alergia;
    private javax.swing.JLabel AtencionEspecial;
    private javax.swing.JLabel CelularDueño;
    private javax.swing.JLabel NombreDueño;
    private javax.swing.JLabel Observaciones;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cmbAlergico;
    private javax.swing.JComboBox<String> cmbAtencioEspecial;
    private javax.swing.JLabel color;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel raza;
    private javax.swing.JTextField txtCelDueño;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtNombreDueño;
    private javax.swing.JTextField txtNombreMascota;
    private javax.swing.JTextArea txtObservaaciones;
    private javax.swing.JTextField txtRaza;
    // End of variables declaration//GEN-END:variables

    private void cargarDatos(int num_cliente) {

        this.masco = controladora.mostrarMascota(num_cliente);

        txtNombreMascota.setText(masco.getNombreMascota());
        txtRaza.setText(masco.getRaza());
        txtColor.setText(masco.getColor());
        txtNombreDueño.setText(masco.getDuenio().getNombre());
        txtCelDueño.setText(masco.getDuenio().getCelDuenio());
        txtObservaaciones.setText(masco.getObservaciones());
        if (masco.getAlergico().equals("Si")) {
            cmbAlergico.setSelectedIndex(1);
        } else if (masco.getAlergico().equals("No")) {

            cmbAlergico.setSelectedIndex(2);
        } else {
            cmbAlergico.setSelectedIndex(0);
        }
    

        if (masco.getAtencion_especial().equals("Si")) {
            cmbAtencioEspecial.setSelectedIndex(1);
        } else if (masco.getAtencion_especial().equals("No")) {
            cmbAtencioEspecial.setSelectedIndex(2);
        } else {
            cmbAtencioEspecial.setSelectedIndex(0);

        }

}

}