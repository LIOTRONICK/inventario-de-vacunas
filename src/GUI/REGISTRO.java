package GUI;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
import sun.util.logging.PlatformLogger.Level;




 
public class REGISTRO extends javax.swing.JFrame {
   Connection con = null;
   Statement atat = null;
   Statement stmt = null; 
   
 
    public REGISTRO() {
        initComponents();
        this.setTitle("REGISTRO USUARIOS");
        this.setLocation(400,220);
        
    }

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel2 = new javax.swing.JPanel();
        txt_nombre = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JLabel();
        txt_apellidos2 = new javax.swing.JTextField();
        txt_cedula = new javax.swing.JLabel();
        txt_cedula2 = new javax.swing.JTextField();
        txt_email = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        botonguardar2 = new javax.swing.JButton();
        txt_usuriocrea = new javax.swing.JLabel();
        txt_pass2 = new javax.swing.JLabel();
        txt_usuarionew = new javax.swing.JTextField();
        txt_passnew = new javax.swing.JTextField();
        txt_nombres3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel2.setBackground(new java.awt.Color(153, 255, 153));

        txt_nombre.setText("NOMBRES:");

        txt_apellidos.setText("APELLIDOS:");

        txt_apellidos2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidos2KeyTyped(evt);
            }
        });

        txt_cedula.setText("CEDULA:");

        txt_cedula2.setMaximumSize(new java.awt.Dimension(10, 10));
        txt_cedula2.setMinimumSize(new java.awt.Dimension(10, 10));
        txt_cedula2.setPreferredSize(new java.awt.Dimension(6, 26));
        txt_cedula2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cedula2KeyTyped(evt);
            }
        });

        txt_email.setText("E-MAIL:");

        botonguardar2.setText("GUARDAR");
        botonguardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonguardar2ActionPerformed(evt);
            }
        });

        txt_usuriocrea.setText("USUARIO:");

        txt_pass2.setText("PASSWORD:");

        txt_usuarionew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_usuarionewKeyTyped(evt);
            }
        });

        txt_passnew.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_passnewKeyTyped(evt);
            }
        });

        txt_nombres3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombres3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_apellidos)
                            .addComponent(txt_email))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_cedula2, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txt_nombres3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                .addComponent(txt_apellidos2, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(23, 23, 23)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_usuriocrea)
                            .addComponent(txt_pass2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_usuarionew)
                            .addComponent(txt_passnew, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(botonguardar2)))
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_cedula)
                    .addComponent(txt_cedula2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_usuriocrea)
                            .addComponent(txt_usuarionew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombres3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(16, 16, 16)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_pass2)
                    .addComponent(txt_apellidos2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_passnew, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(botonguardar2)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonguardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonguardar2ActionPerformed
       String cadena2,cadena3,cadena4,cadena5,cadena6,cadena7;
       
        cadena2 = txt_cedula2.getText();
        cadena3 = txt_nombres3.getText();
        cadena4 = txt_apellidos2.getText();
        cadena5 = txt_email.getText ();
        cadena6 =txt_usuarionew.getText();
        cadena7= txt_passnew.getText().toString();
        
        if (txt_cedula2.getText().equals("") || (txt_nombres3.getText().equals("")) || (txt_apellidos2.getText().equals("")) || (txt_email.getText().equals(""))
        || (txt_usuarionew.getText().equals("")) || (txt_passnew.getText().equals(""))) {

        javax.swing.JOptionPane.showMessageDialog(this,"Debe llenar todos los campos \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);
        txt_nombres3.requestFocus();
        }
          else {
                  
                  }
        try {
           
            String url = "jdbc:postgres://localhost/INVENTARIO_DE_VACUNACION";
            String usuario = "postgres";
            String contraseña = "asdASD/123"; 
            
             Class.forName("com.mysql.jdbc.Driver").newInstance(); 
             con = DriverManager.getConnection(url,usuario,contraseña); 
             if ( con != null ) 
                    System.out.println("Se ha establecido una conexión a la base de datos " +  
                                       "\n " + url ); 
  
            Statement stmt = con.createStatement(); 
                  stmt.executeUpdate("INSERT INTO usuarios VALUES('" + 0 + "','"+cadena2+"','"+cadena3+"','"+cadena4+"','"+cadena5+"','"+cadena6+"','"+cadena7+"')");
                  System.out.println("Los valores han sido agregados a la base de datos ");
                 
                   
        } catch (InstantiationException ex) {
      Logger.getLogger(registro.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IllegalAccessException | ClassNotFoundException | SQLException ex) {
           Logger.getLogger(registro.class.getName()).log(Level.SEVERE, null, ex);
       }
        
        finally {
            if (con != null) {
                try {
                    con.close();
                    stmt.close();
                } catch ( Exception e ) { 
                         System.out.println( e.getMessage());
                }
            }
        }
         javax.swing.JOptionPane.showMessageDialog(this,"Registro exitoso! \n","AVISO!",javax.swing.JOptionPane.INFORMATION_MESSAGE);


       
    }//GEN-LAST:event_botonguardar2ActionPerformed

    private void txt_apellidos2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidos2KeyTyped
    char c = evt.getKeyChar();
    if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume();
   
    }//GEN-LAST:event_txt_apellidos2KeyTyped

    private void txt_cedula2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedula2KeyTyped
     char c = evt.getKeyChar();
if (c< '0' || c>'9') evt.consume();
    

    }//GEN-LAST:event_txt_cedula2KeyTyped

    private void txt_usuarionewKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_usuarionewKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarionewKeyTyped

    private void txt_passnewKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_passnewKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passnewKeyTyped

    private void txt_nombres3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombres3ActionPerformed
        char c = evt.getkeychar();
    if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' ')) evt.consume();
    }//GEN-LAST:event_txt_nombres3ActionPerformed

 
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new REGISTRO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonguardar2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPanel panel2;
    private javax.swing.JLabel txt_apellidos;
    private javax.swing.JTextField txt_apellidos2;
    private javax.swing.JLabel txt_cedula;
    private javax.swing.JTextField txt_cedula2;
    private javax.swing.JLabel txt_email;
    private javax.swing.JLabel txt_nombre;
    private javax.swing.JTextField txt_nombres3;
    private javax.swing.JLabel txt_pass2;
    private javax.swing.JTextField txt_passnew;
    private javax.swing.JTextField txt_usuarionew;
    private javax.swing.JLabel txt_usuriocrea;
    // End of variables declaration//GEN-END:variables
}
