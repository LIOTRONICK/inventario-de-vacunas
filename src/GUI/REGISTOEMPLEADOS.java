package GUI;

import java.sql.Connection;
import java.sql.Statement;



 
public class REGISTOEMPLEADOS extends javax.swing.JFrame {
   Connection con = null;
   Statement atat = null;
   
 
    public REGISTOEMPLEADOS() {
        initComponents();
        this.setTitle("REGISTRO USUARIOS");
        this.setLocation(400,220);
        
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    





    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_fechadenacimiento = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JLabel();
        txt_estadodevacunaion = new javax.swing.JLabel();
        txt_tipodevacuna = new javax.swing.JLabel();
        txt_fechadevacuna = new javax.swing.JLabel();
        txt_dosis = new javax.swing.JLabel();
        txt_fechadenaci = new javax.swing.JTextField();
        txt_direcciondom = new javax.swing.JTextField();
        txt_movil = new javax.swing.JTextField();
        txt_tipovacuna = new javax.swing.JTextField();
        txt_estadovacina1 = new javax.swing.JRadioButton();
        txt_estadovacuna2 = new javax.swing.JRadioButton();
        txt_fechavacuna = new javax.swing.JTextField();
        txt_ndosis = new javax.swing.JSpinner();
        txt_guardar2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        txt_fechadenacimiento.setText("FECHA DE NACIMIENTO:");

        txt_direccion.setText("DIRECCION DE DOMICILIO:");

        txt_telefono.setText("TELEFONO MOVIL:");

        txt_estadodevacunaion.setText("ESTADO DE VACUNACION:");

        txt_tipodevacuna.setText("TIPO DE VACUNA:");

        txt_fechadevacuna.setText("FECHA DE VACUNA:");

        txt_dosis.setText("NUMERO DE DOSIS:");

        txt_fechadenaci.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fechadenaciKeyTyped(evt);
            }
        });

        txt_direcciondom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_direcciondomKeyTyped(evt);
            }
        });

        txt_movil.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_movilKeyTyped(evt);
            }
        });

        txt_tipovacuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tipovacunaActionPerformed(evt);
            }
        });

        txt_estadovacina1.setText("VACUNADO");
        txt_estadovacina1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_estadovacina1KeyTyped(evt);
            }
        });

        txt_estadovacuna2.setText("NO VACUNAO");
        txt_estadovacuna2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_estadovacuna2KeyTyped(evt);
            }
        });

        txt_fechavacuna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_fechavacunaKeyTyped(evt);
            }
        });

        txt_ndosis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_ndosisKeyTyped(evt);
            }
        });

        txt_guardar2.setText("GUARDAR");
        txt_guardar2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_guardar2KeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_fechadenacimiento)
                            .addComponent(txt_direccion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_direcciondom, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_fechadenaci, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(88, 88, 88)
                                .addComponent(txt_telefono))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_estadodevacunaion, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_tipodevacuna, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_dosis, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_fechadevacuna, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_movil, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tipovacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_estadovacina1)
                                .addGap(18, 18, 18)
                                .addComponent(txt_estadovacuna2))
                            .addComponent(txt_fechavacuna, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ndosis, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(51, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt_guardar2)
                .addGap(202, 202, 202))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_fechadenacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fechadenaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_direccion)
                    .addComponent(txt_direcciondom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_telefono)
                    .addComponent(txt_movil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_estadovacina1)
                            .addComponent(txt_estadodevacunaion)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txt_estadovacuna2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_tipovacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_tipodevacuna))))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_fechavacuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_fechadevacuna))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_ndosis, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_dosis))
                .addGap(37, 37, 37)
                .addComponent(txt_guardar2)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_tipovacunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tipovacunaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tipovacunaActionPerformed

    private void txt_fechadenaciKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fechadenaciKeyTyped
         char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();

    }//GEN-LAST:event_txt_fechadenaciKeyTyped

    private void txt_estadovacina1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_estadovacina1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_estadovacina1KeyTyped

    private void txt_estadovacuna2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_estadovacuna2KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_estadovacuna2KeyTyped

    private void txt_movilKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_movilKeyTyped
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();

    }//GEN-LAST:event_txt_movilKeyTyped

    private void txt_direcciondomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_direcciondomKeyTyped
        
    }//GEN-LAST:event_txt_direcciondomKeyTyped

    private void txt_ndosisKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_ndosisKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ndosisKeyTyped

    private void txt_guardar2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_guardar2KeyTyped
        
        String cadena2,cadena3,cadena4,cadena5,cadena6,cadena7,cadena8,cadena9;
        
        cadena2 = txt_fechadenaci.getText();
        cadena3 = txt_direcciondom.getText();
        cadena4 = txt_movil.getText();
        cadena5 = txt_ndosis.();
        cadena6 = txt_tipovacunaAction.getText();
        cadena7 = txt_estadovacuna2.getSelectedItem().toString();
        cadena8 = txt_estadovacina1.getSelectedItem().toString();
        cadena9 = txt_fechavacuna.getText();
        
        if (txt_nombre.getText().equals("") || (txt_domicilio.getText().equals("")) || (txt_telefono.getText().equals("")) || (txt_nick.getText().equals(""))
           || (txt_password.getText().equals("")) || (cmb_tipoUsuario.getSelectedItem().equals(null))) {
            
            javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txt_nombre.requestFocus();
        }

    }//GEN-LAST:event_txt_guardar2KeyTyped

    private void txt_fechavacunaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_fechavacunaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fechavacunaKeyTyped

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
            java.util.logging.Logger.getLogger(REGISTROEMPLEADOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(REGISTROEMPLEADOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(REGISTROEMPLEADOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(REGISTROEMPLEADOS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTROEMPLEADOS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txt_direccion;
    private javax.swing.JTextField txt_direcciondom;
    private javax.swing.JLabel txt_dosis;
    private javax.swing.JLabel txt_estadodevacunaion;
    private javax.swing.JRadioButton txt_estadovacina1;
    private javax.swing.JRadioButton txt_estadovacuna2;
    private javax.swing.JTextField txt_fechadenaci;
    private javax.swing.JLabel txt_fechadenacimiento;
    private javax.swing.JLabel txt_fechadevacuna;
    private javax.swing.JTextField txt_fechavacuna;
    private javax.swing.JButton txt_guardar2;
    private javax.swing.JTextField txt_movil;
    private javax.swing.JSpinner txt_ndosis;
    private javax.swing.JLabel txt_telefono;
    private javax.swing.JLabel txt_tipodevacuna;
    private javax.swing.JTextField txt_tipovacuna;
    // End of variables declaration//GEN-END:variables
}
