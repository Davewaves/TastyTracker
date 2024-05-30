package com.reseñas;

import com.reseñas.Menu;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javaswingdev.drawer.EventDrawer;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

public class Reseña extends javax.swing.JFrame {

    private DrawerController drawer;
    private int Calificacion = 0;
    private ButtonGroup buttonGroup = new ButtonGroup();

    public Reseña() {
        initComponents();
        drawer = Drawer.newDrawer(this)
                .header(new Menu())
                .drawerWidth(150)
                .headerHeight(40)
                .background(Color.black)
                .drawerBackground(new Color(255, 255, 255))
                .space(3)
                .addChild(new DrawerItem("Crear Reseña").icon(new ImageIcon(getClass().getResource("/com/images/botones/mas24px.png"))).build())
                .addChild(new DrawerItem("Mis Reseñas").icon(new ImageIcon(getClass().getResource("/com/images/botones/misreseñas24Px.png"))).build())
                .addChild(new DrawerItem("Eventos").icon(new ImageIcon(getClass().getResource("/com/images/botones/noticias24px.png"))).build())
                .addFooter(new DrawerItem("Cerrar Sesión").icon(new ImageIcon(getClass().getResource("/com/images/botones/salir32px.png"))).build())
                .event(new EventDrawer() {
                    @Override
                    public void selected(int index, DrawerItem item) {
                        if (drawer.isShow()) {
                            drawer.hide();
                        }

                        switch (index) {
                            case 0: // Primer elemento seleccionado
                                abrirReseña();
                                break;
                            case 1: // Segundo elemento seleccionado
                                abrirMisReseñas();
                                break;
                            case 2: // Tercer elemento seleccionado
                                abrirEventos();
                                break;
                            case 3: // Tercer elemento seleccionado
                                cerrarSesion();
                                break;
                        }

                    }

                })
                .build();

        // Configuración de los botones de calificación como JToggleButton
        configurarBoton(BtnStar1, 1);
        configurarBoton(BtnStar2, 2);
        configurarBoton(BtnStar3, 3);
        configurarBoton(BtnStar4, 4);
        configurarBoton(BtnStar5, 5);

    }

    private void configurarBoton(JToggleButton boton, int calificacion) {
        boton.setText(String.valueOf(calificacion));
        boton.setForeground(Color.WHITE);
        boton.setFont(new Font("Roboto Black", Font.PLAIN, 10));
        boton.setIcon(new ImageIcon(getClass().getResource("/com/images/estrellaFinal24Px.png")));
        boton.setSelectedIcon(new ImageIcon(getClass().getResource("/com/images/estrellaFinalSelected24Px.png")));
        boton.setBorder(null);
        boton.setBorderPainted(false);
        boton.setContentAreaFilled(false);
        boton.setHorizontalTextPosition(SwingConstants.CENTER);
        boton.setIconTextGap(0);
        boton.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        boton.setHorizontalTextPosition(SwingConstants.CENTER);

        boton.addActionListener(e -> {
            Calificacion = calificacion;
        });

        buttonGroup.add(boton);
    }

    private void abrirReseña() {
        if (drawer.isShow()) {
            drawer.hide();
        }
    }

    private void abrirMisReseñas() {
        com.reseñas.MisReseñas misReseñas = new com.reseñas.MisReseñas();
        misReseñas.setVisible(true);
        this.setVisible(false);
    }

    private void abrirEventos() {
        com.noticias.Eventos noticias = new com.noticias.Eventos();
        noticias.setVisible(true);
        this.setVisible(false);
    }

    private void cerrarSesion() {
        JOptionPane.showMessageDialog(null, "Sesión Finalizada", "Salida", JOptionPane.INFORMATION_MESSAGE);
        System.exit(WIDTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxServicio = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextReseña = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        BtnCancelar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jDateChooser = new com.toedter.calendar.JDateChooser();
        BtnMenu = new javax.swing.JButton();
        BtnGuardar = new javax.swing.JButton();
        BtnStar0 = new javax.swing.JButton();
        TxtNombre = new javax.swing.JTextField();
        BtnStar2 = new javax.swing.JToggleButton();
        BtnStar1 = new javax.swing.JToggleButton();
        BtnStar3 = new javax.swing.JToggleButton();
        BtnStar4 = new javax.swing.JToggleButton();
        BtnStar5 = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 0, 51));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIPO DE SERVICIO");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jComboBoxServicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Servicio General", "Comida", "Atención Al Cliente", "Tiempo Del Servicio" }));
        jPanel1.add(jComboBoxServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 180, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Logo 64px.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOMBRE DEL RESTAURANTE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("RESEÑA");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("FECHA:");
        jLabel5.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jLabel5ComponentAdded(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 20));

        jTextReseña.setColumns(20);
        jTextReseña.setRows(5);
        jScrollPane1.setViewportView(jTextReseña);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 260, -1));

        jLabel7.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CALIFICACIÓN:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, 30));

        BtnCancelar.setBackground(new java.awt.Color(255, 51, 51));
        BtnCancelar.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        BtnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/botones/Cancelar24px.png"))); // NOI18N
        BtnCancelar.setText("CANCELAR");
        BtnCancelar.setBorder(null);
        BtnCancelar.setBorderPainted(false);
        BtnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnCancelar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/botones/CancelarSelected24px.png"))); // NOI18N
        BtnCancelar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/botones/CancelarSelected24px.png"))); // NOI18N
        BtnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 100, 40));

        jLabel13.setBackground(new java.awt.Color(204, 204, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/ISOLOGO 400PxX69.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 190, 60));
        jPanel1.add(jDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 120, -1));

        BtnMenu.setBackground(new java.awt.Color(0, 0, 51));
        BtnMenu.setFont(new java.awt.Font("Roboto Black", 1, 10)); // NOI18N
        BtnMenu.setForeground(new java.awt.Color(255, 255, 255));
        BtnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/botones/Menu32Px.png"))); // NOI18N
        BtnMenu.setBorder(null);
        BtnMenu.setBorderPainted(false);
        BtnMenu.setContentAreaFilled(false);
        BtnMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnMenu.setFocusPainted(false);
        BtnMenu.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BtnMenu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnMenu.setIconTextGap(-5);
        BtnMenu.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/botones/MenuSelected32Px.png"))); // NOI18N
        BtnMenu.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/botones/MenuSelected32Px.png"))); // NOI18N
        BtnMenu.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        BtnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMenuActionPerformed(evt);
            }
        });
        jPanel1.add(BtnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 40));

        BtnGuardar.setBackground(new java.awt.Color(0, 204, 255));
        BtnGuardar.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        BtnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/botones/Guardar24px.png"))); // NOI18N
        BtnGuardar.setText("GUARDAR");
        BtnGuardar.setBorder(null);
        BtnGuardar.setBorderPainted(false);
        BtnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnGuardar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/botones/GuardarSelected24px.png"))); // NOI18N
        BtnGuardar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/botones/GuardarSelected24px.png"))); // NOI18N
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(BtnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 100, 40));

        BtnStar0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/estrella.png"))); // NOI18N
        BtnStar0.setBorder(null);
        BtnStar0.setBorderPainted(false);
        BtnStar0.setContentAreaFilled(false);
        BtnStar0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/estrella (2).png"))); // NOI18N
        BtnStar0.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/estrella (2).png"))); // NOI18N
        jPanel1.add(BtnStar0, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, -1, -1));
        jPanel1.add(TxtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 180, -1));

        BtnStar2.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        BtnStar2.setForeground(new java.awt.Color(255, 255, 255));
        BtnStar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/estrellaFinal24Px.png"))); // NOI18N
        BtnStar2.setText("2");
        BtnStar2.setBorder(null);
        BtnStar2.setBorderPainted(false);
        BtnStar2.setContentAreaFilled(false);
        BtnStar2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnStar2.setIconTextGap(0);
        BtnStar2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/estrellaFinalSelected24Px.png"))); // NOI18N
        BtnStar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnStar2ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnStar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));

        BtnStar1.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        BtnStar1.setForeground(new java.awt.Color(255, 255, 255));
        BtnStar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/estrellaFinal24Px.png"))); // NOI18N
        BtnStar1.setText("1");
        BtnStar1.setBorder(null);
        BtnStar1.setBorderPainted(false);
        BtnStar1.setContentAreaFilled(false);
        BtnStar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnStar1.setIconTextGap(0);
        BtnStar1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/estrellaFinalSelected24Px.png"))); // NOI18N
        BtnStar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnStar1ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnStar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        BtnStar3.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        BtnStar3.setForeground(new java.awt.Color(255, 255, 255));
        BtnStar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/estrellaFinal24Px.png"))); // NOI18N
        BtnStar3.setText("3");
        BtnStar3.setBorder(null);
        BtnStar3.setBorderPainted(false);
        BtnStar3.setContentAreaFilled(false);
        BtnStar3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnStar3.setIconTextGap(0);
        BtnStar3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/estrellaFinalSelected24Px.png"))); // NOI18N
        BtnStar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnStar3ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnStar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, -1, -1));

        BtnStar4.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        BtnStar4.setForeground(new java.awt.Color(255, 255, 255));
        BtnStar4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/estrellaFinal24Px.png"))); // NOI18N
        BtnStar4.setText("4");
        BtnStar4.setBorder(null);
        BtnStar4.setBorderPainted(false);
        BtnStar4.setContentAreaFilled(false);
        BtnStar4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnStar4.setIconTextGap(0);
        BtnStar4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/estrellaFinalSelected24Px.png"))); // NOI18N
        BtnStar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnStar4ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnStar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));

        BtnStar5.setFont(new java.awt.Font("Roboto Black", 0, 10)); // NOI18N
        BtnStar5.setForeground(new java.awt.Color(255, 255, 255));
        BtnStar5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/estrellaFinal24Px.png"))); // NOI18N
        BtnStar5.setText("5");
        BtnStar5.setBorder(null);
        BtnStar5.setBorderPainted(false);
        BtnStar5.setContentAreaFilled(false);
        BtnStar5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnStar5.setIconTextGap(0);
        BtnStar5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/estrellaFinalSelected24Px.png"))); // NOI18N
        BtnStar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnStar5ActionPerformed(evt);
            }
        });
        jPanel1.add(BtnStar5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed

        String Nombre = TxtNombre.getText();
        String Servicio = (String) jComboBoxServicio.getSelectedItem();
        Date FechaSeleccionada = jDateChooser.getDate();
        String Reseña = jTextReseña.getText();

        // Validar que la fecha no sea nula
        if (FechaSeleccionada == null) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una fecha válida.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Convertir FechaSeleccionada a LocalDateTime para la validación
        LocalDateTime fechaSeleccion = LocalDateTime.ofInstant(FechaSeleccionada.toInstant(), ZoneId.systemDefault());
        LocalDateTime fechaActual = LocalDateTime.now();

        // Validar que la fecha seleccionada sea posterior a la fecha actual
        if (fechaSeleccion.isBefore(fechaActual)) {
            JOptionPane.showMessageDialog(this, "La fecha seleccionada debe ser posterior a la fecha actual.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar que la calificación sea mayor a 0
        if (Calificacion == 0) {
            JOptionPane.showMessageDialog(this, "Por favor, selecciona una calificación.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        //Instancia del JFRAME a buscar
        com.reseñas.MisReseñas JframeMisReseñas = new com.reseñas.MisReseñas();

        //Pasar datos obtenidos al método setDatos
        JframeMisReseñas.setDatos(FechaSeleccionada, Nombre, Servicio, Calificacion, Reseña);

        // Hcaer visible el JFRAME
        //JframeMisReseñas.setVisible(true);
        ArrayList<Registro> registros = FuncionesArrayList.getRegistros();
        Registro registro = new Registro(FechaSeleccionada, Nombre, Servicio, Calificacion, Reseña);
        FuncionesArrayList.agregarRegistro(registro);

        JOptionPane.showMessageDialog(this, "¡Reseña creada Exitosamente!", "Reseña Creada", JOptionPane.INFORMATION_MESSAGE);

        //Limpiar los modulos
        TxtNombre.setText("");
        jComboBoxServicio.removeAllItems();
        jDateChooser.setDate(null);
        Calificacion = 0;
        jTextReseña.setText("");
        buttonGroup.clearSelection();

        // Volver a agregar las opciones necesarias al JComboBoxServicio
        agregarOpcionesComboBoxServicio();
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenuActionPerformed
        if (drawer.isShow()) {
            drawer.hide();
        } else {
            drawer.show();
        }
    }//GEN-LAST:event_BtnMenuActionPerformed

    private void BtnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarActionPerformed

        // Limpiar los campos
        TxtNombre.setText("");
        jComboBoxServicio.removeAllItems();
        jDateChooser.setDate(null);
        Calificacion = 0;
        jTextReseña.setText("");

        // Limpiar la selección del ButtonGroup
        buttonGroup.clearSelection();

        // Volver a agregar las opciones necesarias al JComboBoxServicio
        agregarOpcionesComboBoxServicio();

    }//GEN-LAST:event_BtnCancelarActionPerformed

    private void agregarOpcionesComboBoxServicio() {
        // Agregar las opciones de prioridad al JComboBox
        jComboBoxServicio.addItem("Servicio General");
        jComboBoxServicio.addItem("Comida");
        jComboBoxServicio.addItem("Atención Al Cliente");
        jComboBoxServicio.addItem("Tiempo Del Servicio");

    }
    private void jLabel5ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabel5ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5ComponentAdded

    private void BtnStar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnStar5ActionPerformed
        Calificacion = 5;
    }//GEN-LAST:event_BtnStar5ActionPerformed

    private void BtnStar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnStar4ActionPerformed
        Calificacion = 4;
    }//GEN-LAST:event_BtnStar4ActionPerformed

    private void BtnStar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnStar3ActionPerformed
        Calificacion = 3;
    }//GEN-LAST:event_BtnStar3ActionPerformed

    private void BtnStar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnStar2ActionPerformed
        Calificacion = 2;
    }//GEN-LAST:event_BtnStar2ActionPerformed

    private void BtnStar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnStar1ActionPerformed
        Calificacion = 1;
    }//GEN-LAST:event_BtnStar1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Reseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reseña.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reseña().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnMenu;
    private javax.swing.JButton BtnStar0;
    private javax.swing.JToggleButton BtnStar1;
    private javax.swing.JToggleButton BtnStar2;
    private javax.swing.JToggleButton BtnStar3;
    private javax.swing.JToggleButton BtnStar4;
    private javax.swing.JToggleButton BtnStar5;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JComboBox<String> jComboBoxServicio;
    private com.toedter.calendar.JDateChooser jDateChooser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextReseña;
    // End of variables declaration//GEN-END:variables
}
