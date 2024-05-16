/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.register;

/**
 *
 * @author Davewaves
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
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
        TxtTemperatura2 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BtnCrearCuenta = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        TxtTemperatura3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        TxtTemperatura4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(204, 204, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/REGISTRO 200PX.png"))); // NOI18N
        Background.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 70));

        TxtTemperatura2.setForeground(new java.awt.Color(204, 204, 204));
        TxtTemperatura2.setText("Ingrese su nombre");
        TxtTemperatura2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTemperatura2ActionPerformed(evt);
            }
        });
        Background.add(TxtTemperatura2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 248, 20));

        jPasswordField1.setText("jPasswordField1");
        Background.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 250, 20));

        jLabel3.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("CONTRASEÑA:");
        Background.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("CORREO ELECTRÓNICO");
        Background.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        BtnCrearCuenta.setBackground(new java.awt.Color(0, 153, 102));
        BtnCrearCuenta.setFont(new java.awt.Font("Roboto Black", 1, 12)); // NOI18N
        BtnCrearCuenta.setForeground(new java.awt.Color(255, 255, 255));
        BtnCrearCuenta.setText("CREAR CUENTA");
        BtnCrearCuenta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BtnCrearCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCrearCuentaActionPerformed(evt);
            }
        });
        Background.add(BtnCrearCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, 110, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/ISOLOGO 130Px.png"))); // NOI18N
        Background.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 130, -1));

        TxtTemperatura3.setForeground(new java.awt.Color(204, 204, 204));
        TxtTemperatura3.setText("Ingrese su usuario");
        TxtTemperatura3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTemperatura3ActionPerformed(evt);
            }
        });
        Background.add(TxtTemperatura3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 248, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("FECHA DE NACIMIENTO:");
        Background.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jPasswordField2.setText("jPasswordField1");
        Background.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 250, 20));

        jLabel8.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("CONFIRMAR CONTRASEÑA:");
        Background.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        TxtTemperatura4.setForeground(new java.awt.Color(204, 204, 204));
        TxtTemperatura4.setText("Ingrese su nombre");
        TxtTemperatura4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtTemperatura4ActionPerformed(evt);
            }
        });
        Background.add(TxtTemperatura4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 248, 20));

        jLabel9.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("INGRESE UN USUARIO:");
        Background.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "No Binario", "Otro" }));
        jComboBox1.setToolTipText("Prueba");
        Background.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, -1, 20));

        jCheckBox1.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 102, 204));
        jCheckBox1.setText("Acepto los Términos y condiciones.");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        Background.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 230, 20));

        jLabel10.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("NOMBRE COMPLETO");
        Background.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel11.setFont(new java.awt.Font("Roboto Black", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("SELECCIONE SU GENERO:");
        Background.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jToggleButton1.setText("jToggleButton1");
        Background.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 90, 20));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/Logo 50.png"))); // NOI18N
        Background.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtTemperatura2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTemperatura2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTemperatura2ActionPerformed

    private void BtnCrearCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCrearCuentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnCrearCuentaActionPerformed

    private void TxtTemperatura3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTemperatura3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTemperatura3ActionPerformed

    private void TxtTemperatura4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtTemperatura4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtTemperatura4ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton BtnCrearCuenta;
    private javax.swing.JTextField TxtTemperatura2;
    private javax.swing.JTextField TxtTemperatura3;
    private javax.swing.JTextField TxtTemperatura4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
