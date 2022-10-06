/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;


public class ventana extends javax.swing.JFrame {

    /**
     * Creates new form ventana
     */
    public ventana () {
        initComponents();
        this.setTitle("INVENTARIO DE VACUNACIÓN");
        this.setLocation(400,220); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TXT_COMBOBOX = new javax.swing.JComboBox<>();
        TXT_GESTOR = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JLabel();
        txt_usuariofield = new javax.swing.JTextField();
        txt_password = new javax.swing.JLabel();
        Password2 = new javax.swing.JPasswordField();
        txt_entrar = new javax.swing.JButton();
        L_FONDOS = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TXT_COMBOBOX.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EMPLEDO", "ADMINISTRADOR ", " " }));
        TXT_COMBOBOX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXT_COMBOBOXActionPerformed(evt);
            }
        });
        getContentPane().add(TXT_COMBOBOX, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 110, 20));

        TXT_GESTOR.setText("GESTOR:");
        getContentPane().add(TXT_GESTOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 50, 20));

        txt_usuario.setText("USUARIO:");
        getContentPane().add(txt_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 60, 20));

        txt_usuariofield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuariofieldActionPerformed(evt);
            }
        });
        txt_usuariofield.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_usuariofieldKeyTyped(evt);
            }
        });
        getContentPane().add(txt_usuariofield, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 120, 30));

        txt_password.setText("PASSWORD:");
        getContentPane().add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 70, 30));
        getContentPane().add(Password2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 120, 30));

        txt_entrar.setText("ENTRAR");
        getContentPane().add(txt_entrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        L_FONDOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEN/leaf-gc299f005d_1920.jpg"))); // NOI18N
        L_FONDOS.setMaximumSize(new java.awt.Dimension(1500, 800));
        L_FONDOS.setMinimumSize(new java.awt.Dimension(1500, 800));
        getContentPane().add(L_FONDOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXT_COMBOBOXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXT_COMBOBOXActionPerformed
    }//GEN-LAST:event_TXT_COMBOBOXActionPerformed

    private void txt_usuariofieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuariofieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuariofieldActionPerformed

    private void txt_usuariofieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuariofieldKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuariofieldKeyTyped

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
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel L_FONDOS;
    private javax.swing.JPasswordField Password2;
    private javax.swing.JComboBox<String> TXT_COMBOBOX;
    private javax.swing.JLabel TXT_GESTOR;
    private javax.swing.JButton txt_entrar;
    private javax.swing.JLabel txt_password;
    private javax.swing.JLabel txt_usuario;
    private javax.swing.JTextField txt_usuariofield;
    // End of variables declaration//GEN-END:variables
}
