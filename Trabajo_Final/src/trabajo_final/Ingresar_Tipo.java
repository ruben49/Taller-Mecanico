package trabajo_final;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Ingresar_Tipo extends javax.swing.JFrame {


    public Ingresar_Tipo() {
        initComponents();
        Cargar_Item();
        
    }

    public void Cargar_Item(){
         
        String mSQL = "SELECT COUNT(id_tipo) FROM tipo_vehiculos";
        
         try{
        Conectar conexion = new Conectar();
        conexion.Abrir();
        PreparedStatement St = (PreparedStatement) conexion.getConexion().prepareStatement(mSQL);
             ResultSet Tabla = St.executeQuery();
      
    
         while(Tabla.next()){ 
              
              this.LblID_tipo.setText(String.valueOf(Tabla.getInt(1)));
              
          }
        
        
        
        conexion.Cerrar();
         }catch(SQLException | ClassNotFoundException error){
                    JOptionPane.showMessageDialog(this, "Error al cargar el Item" + error);
         }
    
    }
    public void Cargar_Combo(){
      
     
      Conectar Conexion = new Conectar();
      String mSql = "SELECT * FROM tipo_vehiculo";   
       
     
      try{
          
          Conexion.Abrir();
          PreparedStatement St = (PreparedStatement) Conexion.getConexion().prepareStatement(mSql);
          ResultSet Tabla = St.executeQuery();
          
          while(Tabla.next()){ 
              
         
          }
         
          Conexion.Cerrar();
          
        }catch (SQLException | ClassNotFoundException error){
          
          
      }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TxtID_tipo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        LblID_tipo = new javax.swing.JLabel();
        BtnGrabar_Tipo = new javax.swing.JButton();
        BtnEliminar = new javax.swing.JButton();
        BtnActualizar = new javax.swing.JButton();

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingresar Tipo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10))); // NOI18N

        jLabel3.setText("Detalle");

        jLabel1.setText("ID Tipo");

        LblID_tipo.setText("          ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtID_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblID_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(LblID_tipo))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtID_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31))
        );

        BtnGrabar_Tipo.setText("Grabar");
        BtnGrabar_Tipo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnGrabar_TipoMouseClicked(evt);
            }
        });

        BtnEliminar.setText("Eliminar");
        BtnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEliminarMouseClicked(evt);
            }
        });

        BtnActualizar.setText("Actualizar");
        BtnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnActualizarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 28, Short.MAX_VALUE)
                        .addComponent(BtnActualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnGrabar_Tipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnEliminar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnGrabar_Tipo)
                    .addComponent(BtnEliminar)
                    .addComponent(BtnActualizar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnGrabar_TipoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGrabar_TipoMouseClicked
        
      Conectar Conect = new Conectar();
                String mSq3 = "INSERT INTO tipo_vehiculos (id_tipo, detalle) VALUES (?, ?)";  
                
                try{
          
          Conect.Abrir();
          PreparedStatement St3 = (PreparedStatement) Conect.getConexion().prepareStatement(mSq3);
          St3.setInt(1, Integer.parseInt(LblID_tipo.getText()));
          St3.setString(2, TxtID_tipo.getText());
          
                
          St3.executeUpdate();
          Conect.Cerrar();
     
          }catch (Exception error){
          
          JOptionPane.showMessageDialog(this,"Error al Grabar el registro" + error, "ERROR", JOptionPane.ERROR_MESSAGE);
          
      }  

          Cargar_Item();
 
    }//GEN-LAST:event_BtnGrabar_TipoMouseClicked

    private void BtnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnActualizarMouseClicked
        
        Conectar Conect = new Conectar();
                String mSq3 = "UPDATE  tipo_vehiculos SET id_tipo = ?, detalle = ? WHERE id_tipo = ?";  
                
                try{
          
          Conect.Abrir();
          PreparedStatement St3 = (PreparedStatement) Conect.getConexion().prepareStatement(mSq3);
          St3.setInt(1, Integer.parseInt(LblID_tipo.getText())  - 1);
          St3.setString(2, TxtID_tipo.getText());
          St3.setInt(3, Integer.parseInt(LblID_tipo.getText()) - 1);
                
          St3.executeUpdate();
          Conect.Cerrar();
     
          }catch (Exception error){
          
          JOptionPane.showMessageDialog(this,"Error al Actualizar el registro" + error, "ERROR", JOptionPane.ERROR_MESSAGE);
          
      }  
        Cargar_Item();
        
    }//GEN-LAST:event_BtnActualizarMouseClicked

    private void BtnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMouseClicked
        
                Conectar Conect = new Conectar();
                String mSq3 = "DELETE FROM tipo_vehiculos WHERE id_tipo = ?";  
                
          try{
          
          Conect.Abrir();
          PreparedStatement St3 = (PreparedStatement) Conect.getConexion().prepareStatement(mSq3);
          St3.setInt(1, Integer.parseInt(LblID_tipo.getText().toString())-1);
          
                
          St3.executeUpdate();
          Conect.Cerrar();
     
          }catch (Exception error){
          JOptionPane.showMessageDialog(this,"Error al Eliminar el registro" + error, "ERROR", JOptionPane.ERROR_MESSAGE);
          
          }  
          Cargar_Item();

    }//GEN-LAST:event_BtnEliminarMouseClicked


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
            java.util.logging.Logger.getLogger(Ingresar_Tipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Tipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Tipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Tipo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar_Tipo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnGrabar_Tipo;
    private javax.swing.JLabel LblID_tipo;
    private javax.swing.JTextField TxtID_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
