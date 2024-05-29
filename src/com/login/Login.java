/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.login;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Davewaves
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        Background = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        BtnRegistro = new javax.swing.JButton();
        TxtUsuario = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnIniciarSesion = new javax.swing.JButton();
        jLabelBienvenido = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/ISOLOGO 400PxX69.png"))); // NOI18N
        Background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 200, 60));

        BtnRegistro.setBackground(new java.awt.Color(245, 44, 44));
        BtnRegistro.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        BtnRegistro.setForeground(new java.awt.Color(255, 255, 255));
        BtnRegistro.setText("REGISTRO");
        BtnRegistro.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegistroActionPerformed(evt);
            }
        });
        Background.add(BtnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 110, 40));

        TxtUsuario.setText("Ingrese su usuario");
        TxtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtUsuarioActionPerformed(evt);
            }
        });
        Background.add(TxtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 248, 30));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("¡Olvide mi contraseña!");
        Background.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 130, 40));

        jPasswordField1.setText("jPasswordField1");
        Background.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 250, 30));

        jCheckBox1.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 51, 102));
        jCheckBox1.setText("Guardar mis datos");
        Background.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("CONTRASEÑA:");
        Background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 102, 0));
        jLabel4.setText("USUARIO:");
        Background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        BtnIniciarSesion.setBackground(new java.awt.Color(255, 102, 0));
        BtnIniciarSesion.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        BtnIniciarSesion.setForeground(new java.awt.Color(255, 255, 255));
        BtnIniciarSesion.setText("INICIAR SESION");
        BtnIniciarSesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIniciarSesionActionPerformed(evt);
            }
        });
        Background.add(BtnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 130, 40));

        jLabelBienvenido.setBackground(new java.awt.Color(0, 0, 0));
        jLabelBienvenido.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabelBienvenido.setForeground(new java.awt.Color(0, 0, 51));
        jLabelBienvenido.setText("Bienvenido, por favor inicie sesion:");
        Background.add(jLabelBienvenido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 200, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Logo 100.png"))); // NOI18N
        Background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegistroActionPerformed
        //Boton de Registro
        com.register.Register register = new com.register.Register();
        register.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnRegistroActionPerformed

    private void TxtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtUsuarioActionPerformed

    private void BtnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIniciarSesionActionPerformed
        //boton iniciar sesion        
        //boton iniciar sesion
        ArrayList<String> users = new ArrayList<>(); // Crear un ArrayList de usuarios
        ArrayList<String> passwords = new ArrayList<>(); // Crear un ArrayList de contraseñas
       
        //usuarios de prueba
        users.add("Kate");
        passwords.add("1234");
        users.add("David");
        passwords.add("4321");
        
        //obtiene valor de los campos
        String user = TxtUsuario.getText();
        String password = new String(jPasswordField1.getPassword());
        
        // busca el indice del valor de user si no existe devuelve -1
        int userIndex = users.indexOf(user);
        
        //verifica el nombre de usraio exista y si es asi verifica que la contraseña sea la misma
        if (userIndex != -1 && password.equals(passwords.get(userIndex))) {
            //inicio de sesion
            com.reseñas.Reseña reseña = new com.reseñas.Reseña();
            
            reseña.setVisible(true);
            this.setVisible(false);
        } else {
            //mensaje de error
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnIniciarSesionActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton BtnIniciarSesion;
    private javax.swing.JButton BtnRegistro;
    private javax.swing.JTextField TxtUsuario;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelBienvenido;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables
}
