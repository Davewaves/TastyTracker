/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.reseñas;

import com.reseñas.Menu;
import java.awt.Color;
import static java.awt.image.ImageObserver.WIDTH;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import javaswingdev.drawer.Drawer;
import javaswingdev.drawer.DrawerController;
import javaswingdev.drawer.DrawerItem;
import javaswingdev.drawer.EventDrawer;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Davewaves
 */
public class MisReseñas extends javax.swing.JFrame {

    private MisReseñas misReseñasFrame;
    private DefaultTableModel mt = new DefaultTableModel();
    private HashMap<Integer, Integer> indiceRegistroMap = new HashMap<>(); // Mapeo de índices de fila en la tabla a índices de registro en FuncionesArrayList
    private DrawerController drawer;

    private String Nombre;
    private String Servicio;
    private Date FechaSeleccionada;
    private int Calificacion = 0;
    private String Reseña;

    // Establecer el Formato de Fecha:
    private String formatDate(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        return formatter.format(date);
    }

    //Método para cargar datos dentro del ArrayList
    private void cargarDatos() {
        ArrayList<Registro> registros = FuncionesArrayList.getRegistros();
        for (int i = 0; i < registros.size(); i++) {
            Registro registro = registros.get(i);
            String fechaFormateada = formatDate(registro.getFechaSeleccionada());
            mt.addRow(new Object[]{
                fechaFormateada,
                registro.getNombre(),
                registro.getServicio(),
                registro.getCalificacion(),
                registro.getReseña(),
                i // Agrega el índice real como última columna
            });
        }

    }

    // Método para recargar toda la tabla
    private void recargarTabla() {
        mt.setRowCount(0); // Limpiar la tabla
        cargarDatos(); // Cargar datos nuevamente
    }

    // ULTIMO CAMBIO
    @Override
    public void setVisible(boolean visible) {
        if (visible) {
            // Limpiar la tabla antes de recargar los datos
            mt.setRowCount(0);
            cargarDatos();
        }
        super.setVisible(visible);
    }

    // Metodo para añadir nuevas filas a la tabla
    public void setDatos(Date FechaSeleccionada, String Nombre, String Servicio, int Calificacion, String Reseña) {
        this.FechaSeleccionada = FechaSeleccionada;
        this.Nombre = Nombre;
        this.Servicio = Servicio;
        this.Calificacion = Calificacion;
        this.Reseña = Reseña;
        // Se añade una nueva fila a la tabla esta nueva fila contiene los valores de los parámetros
        mt.addRow(new Object[]{FechaSeleccionada, Nombre, Servicio, Calificacion, Reseña});
    }

    //METODO CONSTRUCTOR
    public MisReseñas() {
        initComponents();
        String titulosTabla[] = {"Fecha", "Restaurante", "Servicio", "Calificación", "Reseña", "Índice"};
        mt.setColumnIdentifiers(titulosTabla);
        jTableDatos.setModel(mt);

        // Llamar a cargarDatos() aquí
        cargarDatos();
        // MENU DESPLEGABLE
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

    }

    /*private void cargarReseñasEnTabla() {
        for (Registro registro : FuncionesArrayList.getRegistros()) {
            mt.addRow(new Object[]{
                registro.getFechaSeleccionada(),
                registro.getNombre(),
                registro.getServicio(),
                registro.getCalificacion(),
                registro.getReseña()
            });
        }
    }*/
    private void abrirReseña() {
        com.reseñas.Reseña reseña = new com.reseñas.Reseña();
        reseña.setVisible(true);
        this.setVisible(false);
    }

    private void abrirMisReseñas() {

        if (drawer.isShow()) {
            drawer.hide();
        }

        if (misReseñasFrame == null) {
            misReseñasFrame = new MisReseñas();
        }
        misReseñasFrame.setVisible(true);
        this.setVisible(false); // Ocultar el frame actual si es necesario

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

    public void actualizarReseñas() {

        cargarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        BtnEliminar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDatos = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        BtnMenu = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        TxtBusqueda = new javax.swing.JTextField();
        BtnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(0, 0, 51));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnEliminar.setBackground(new java.awt.Color(255, 51, 102));
        BtnEliminar.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        BtnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/botones/EliminarConEquis24px.png"))); // NOI18N
        BtnEliminar.setText("ELIMINAR");
        BtnEliminar.setBorder(null);
        BtnEliminar.setBorderPainted(false);
        BtnEliminar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        BtnEliminar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/botones/EliminarConEquisSelected24px.png"))); // NOI18N
        BtnEliminar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/botones/EliminarConEquisSelected24px.png"))); // NOI18N
        BtnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEliminarActionPerformed(evt);
            }
        });
        Background.add(BtnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 100, 40));

        jLabel10.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("BUSCAR POR NOMBRE:");
        Background.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Logo 50.png"))); // NOI18N
        Background.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Fecha", "Restaurante", "Servicio", "Calificación", "Reseña"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableDatos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTableDatos);

        Background.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 260, 210));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MIS RESEÑAS");
        Background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

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
        Background.add(BtnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 30));

        BtnBuscar.setBackground(new java.awt.Color(0, 102, 153));
        BtnBuscar.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        BtnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        BtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/botones/Buscar32px.png"))); // NOI18N
        BtnBuscar.setBorder(null);
        BtnBuscar.setBorderPainted(false);
        BtnBuscar.setContentAreaFilled(false);
        BtnBuscar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/botones/BuscarSelected32px.png"))); // NOI18N
        BtnBuscar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/botones/BuscarSelected32px.png"))); // NOI18N
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        Background.add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 40, 40));
        Background.add(TxtBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 190, 30));

        BtnEditar.setBackground(new java.awt.Color(0, 153, 102));
        BtnEditar.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        BtnEditar.setForeground(new java.awt.Color(255, 255, 255));
        BtnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/botones/Editar24px.png"))); // NOI18N
        BtnEditar.setText("EDITAR");
        BtnEditar.setBorder(null);
        BtnEditar.setBorderPainted(false);
        BtnEditar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/botones/EditarSelected24px.png"))); // NOI18N
        BtnEditar.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/botones/EditarSelected24px.png"))); // NOI18N
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarActionPerformed(evt);
            }
        });
        Background.add(BtnEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 110, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEliminarActionPerformed

        int selectedRow = jTableDatos.getSelectedRow();
        if (selectedRow >= 0) {
            int registroIndex = (int) jTableDatos.getValueAt(selectedRow, 5); // Obtener el índice real del registro
            FuncionesArrayList.eliminarRegistro(registroIndex);
            mt.setRowCount(0); // Limpiar la tabla antes de cargar los datos
            cargarDatos(); // Actualizar la tabla después de eliminar
        } else {
            JOptionPane.showMessageDialog(this, "Por favor seleccione una fila para eliminar.");
        }
    }//GEN-LAST:event_BtnEliminarActionPerformed

    private void BtnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMenuActionPerformed
        if (drawer.isShow()) {
            drawer.hide();
        } else {
            drawer.show();
        }
    }//GEN-LAST:event_BtnMenuActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        ArrayList<Registro> registro = FuncionesArrayList.getRegistros();
        boolean encontrado = false;
        mt.setRowCount(0); // Limpia la tabla antes de agregar nuevos resultados
        for (int i = 0; i < registro.size(); i++) {
            if (registro.get(i).getNombre().equalsIgnoreCase(TxtBusqueda.getText())) {
                encontrado = true;
                mt.addRow(new Object[]{
                    formatDate(registro.get(i).getFechaSeleccionada()),
                    registro.get(i).getNombre(),
                    registro.get(i).getServicio(),
                    registro.get(i).getCalificacion(),
                    registro.get(i).getReseña(),
                    i // Agrega el índice real como última columna
                });
            }
        }
        if (!encontrado) {
            JOptionPane.showMessageDialog(null, "Titulo no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void BtnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarActionPerformed

        int filaSel = jTableDatos.getSelectedRow(); // Obtiene el índice de la fila seleccionada
        if (filaSel >= 0) {
            int indiceReal = (int) mt.getValueAt(filaSel, 5); // Obtiene el índice real del registro
            Registro sel = FuncionesArrayList.getRegistros().get(indiceReal); // Obtiene el registro real
            com.reseñas.Editar abrir = new com.reseñas.Editar(); // Abre la pantalla de editar
            abrir.indice(indiceReal);
            abrir.llenarCampos(sel); // Usa el método llenarCampos() de la clase crear llevando el índice real
            abrir.setVisible(true);
            this.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Por favor, selecciona un registro para editar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnEditarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(MisReseñas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MisReseñas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MisReseñas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MisReseñas.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MisReseñas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnMenu;
    private javax.swing.JTextField TxtBusqueda;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableDatos;
    // End of variables declaration//GEN-END:variables
}
