/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vistas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Actualizar_cliente extends javax.swing.JFrame {

 
     PreparedStatement ps;
    ResultSet rs;
    
    
   
    public Connection conexion(){
         Connection conect = null;
    try{
Class.forName("org.gjt.mm.mysql.Driver");
conect = DriverManager.getConnection ("jdbc:mysql://localhost/edificios","root","");
}catch(Exception e){
    JOptionPane.showMessageDialog(null,"error "+e);
}
    return conect;
    }

    
    
    public Actualizar_cliente() {
        initComponents();
        this.setLocationRelativeTo(null);
         this.setResizable(false);
              this.setTitle("ArriendosTemporada - Desktop App");
         
setIconImage(new ImageIcon(getClass().getResource("/iconos/icono - agricultura.png")).getImage());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        rutCTXT = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        nombreTXT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        direccionTXT = new javax.swing.JTextField();
        guardarbtn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        contraseñaTXT = new javax.swing.JTextField();
        paisTXT = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        telefonoTXT = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        clienteTXT = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        buscarbnt = new javax.swing.JButton();
        volverbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setBackground(new java.awt.Color(0, 51, 153));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 153));
        jLabel12.setText("Actualizar Cliente");

        rutCTXT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rutCTXT.setForeground(new java.awt.Color(0, 51, 153));
        rutCTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutCTXTActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(0, 51, 153));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("Rut");

        jLabel1.setBackground(new java.awt.Color(0, 51, 153));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Nombre");

        nombreTXT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        nombreTXT.setForeground(new java.awt.Color(0, 51, 153));
        nombreTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTXTActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 51, 153));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setText("Direccion");

        direccionTXT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        direccionTXT.setForeground(new java.awt.Color(0, 51, 153));
        direccionTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionTXTActionPerformed(evt);
            }
        });

        guardarbtn.setBackground(new java.awt.Color(0, 51, 153));
        guardarbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        guardarbtn.setForeground(new java.awt.Color(255, 255, 255));
        guardarbtn.setText("Guardar Actualizacion");
        guardarbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarbtnActionPerformed(evt);
            }
        });

        jLabel10.setBackground(new java.awt.Color(0, 51, 153));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 153));
        jLabel10.setText("Contraseña");

        contraseñaTXT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        contraseñaTXT.setForeground(new java.awt.Color(0, 51, 153));
        contraseñaTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraseñaTXTActionPerformed(evt);
            }
        });

        paisTXT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        paisTXT.setForeground(new java.awt.Color(0, 51, 153));
        paisTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paisTXTActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(0, 51, 153));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 153));
        jLabel9.setText("Pais");

        jLabel6.setBackground(new java.awt.Color(0, 51, 153));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("Telefono");

        telefonoTXT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        telefonoTXT.setForeground(new java.awt.Color(0, 51, 153));
        telefonoTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoTXTActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 51, 153));

        clienteTXT.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        clienteTXT.setForeground(new java.awt.Color(0, 51, 153));
        clienteTXT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clienteTXTActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Rut Cliente");

        buscarbnt.setBackground(new java.awt.Color(255, 255, 255));
        buscarbnt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        buscarbnt.setForeground(new java.awt.Color(0, 51, 153));
        buscarbnt.setText("Buscar");
        buscarbnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarbntActionPerformed(evt);
            }
        });

        volverbtn.setBackground(new java.awt.Color(255, 255, 255));
        volverbtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        volverbtn.setForeground(new java.awt.Color(0, 51, 153));
        volverbtn.setText("Volver");
        volverbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(volverbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clienteTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buscarbnt, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(clienteTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarbnt)
                    .addComponent(volverbtn))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(66, 66, 66)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nombreTXT)
                                .addComponent(rutCTXT)
                                .addComponent(direccionTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(65, 65, 65)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel10)
                                    .addGap(10, 10, 10))
                                .addComponent(jLabel9))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(telefonoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(paisTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(contraseñaTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(guardarbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(jLabel12)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel12)
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(telefonoTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(86, 86, 86)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(contraseñaTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(rutCTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nombreTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paisTXT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(direccionTXT))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addComponent(guardarbtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void rutCTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutCTXTActionPerformed
      
       
        
    }//GEN-LAST:event_rutCTXTActionPerformed

    private void nombreTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTXTActionPerformed
        
    }//GEN-LAST:event_nombreTXTActionPerformed

    private void direccionTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionTXTActionPerformed

    }//GEN-LAST:event_direccionTXTActionPerformed

    private void contraseñaTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraseñaTXTActionPerformed
      
    }//GEN-LAST:event_contraseñaTXTActionPerformed

    private void paisTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paisTXTActionPerformed
        
    }//GEN-LAST:event_paisTXTActionPerformed

    private void telefonoTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telefonoTXTActionPerformed

    private void volverbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverbtnActionPerformed

         this.setVisible(false);
        Menu_Admin MA = new Menu_Admin();
        MA.setVisible(true);

    }//GEN-LAST:event_volverbtnActionPerformed

    private void buscarbntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarbntActionPerformed
      
        Connection con = null;
        
          try{

        con = conexion();
        ps = con.prepareStatement("SELECT RUT_CX, Nom_CX, Direccion_CX, Telefono_CX, Pais, Tipo_Usuario, Contraseña FROM cliente_externo WHERE RUT_CX = ? ");
        ps.setString(1, clienteTXT.getText());

        rs = ps.executeQuery();

        if(rs.next()){
        clienteTXT.setText(rs.getString("RUT_CX"));
        rutCTXT.setText(rs.getString("RUT_CX"));
        nombreTXT.setText(rs.getString("Nom_CX"));
        direccionTXT.setText(rs.getString("Direccion_CX"));
        telefonoTXT.setText(rs.getString("Telefono_CX"));
        paisTXT.setText(rs.getString("Pais"));
        contraseñaTXT.setText(rs.getString("Contraseña"));
//----------------------------------------------------------------------------------
        rutCTXT.setEnabled(false);

        }else{
        JOptionPane.showMessageDialog(null, "no existe");
        }
        
        } catch (SQLException e) {
             System.err.println(e);
         }

        
        
    }//GEN-LAST:event_buscarbntActionPerformed

    private void clienteTXTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clienteTXTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clienteTXTActionPerformed

    private void guardarbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarbtnActionPerformed

        Connection con = null;

        try{

            con = conexion();
            PreparedStatement ps = ps = con.prepareStatement ("UPDATE cliente_externo SET Nom_CX =?, Direccion_CX =?, Telefono_CX =?, Pais = ?, Contraseña = ? WHERE RUT_CX =? ");
            ps.setString(1, nombreTXT.getText());
            ps.setString(2, direccionTXT.getText());
            ps.setString(3, telefonoTXT.getText());
            ps.setString(4, paisTXT.getText());
            ps.setString(5, contraseñaTXT.getText());
            ps.setString(6, clienteTXT.getText());
            
            int rs = ps.executeUpdate();

            if(rs >0 ){
                JOptionPane.showMessageDialog(null,"Cliente actualizado con exito");
            }
        }catch (Exception e){
            System.err.println(e);
            JOptionPane.showMessageDialog(null,"ha ocurrido un error");
        }
    }//GEN-LAST:event_guardarbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Actualizar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actualizar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actualizar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actualizar_cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Actualizar_cliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarbnt;
    private javax.swing.JTextField clienteTXT;
    private javax.swing.JTextField contraseñaTXT;
    private javax.swing.JTextField direccionTXT;
    private javax.swing.JButton guardarbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField nombreTXT;
    private javax.swing.JTextField paisTXT;
    private javax.swing.JTextField rutCTXT;
    private javax.swing.JTextField telefonoTXT;
    private javax.swing.JButton volverbtn;
    // End of variables declaration//GEN-END:variables

}