package trabajo_final;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Registro_Duenos extends javax.swing.JFrame {


    public Registro_Duenos() {
        initComponents();
        
      Conectar Conect = new Conectar();
      String mSql = "SELECT id_rut, primer_nombre, segundo_nombre, apellido_paterno, apellido_materno, edad, email, domicilio FROM duenos";   
      int nFila = 0;

        
      try{
          
          Conect.Abrir();
          PreparedStatement St = (PreparedStatement) Conect.getConexion().prepareStatement(mSql);
          ResultSet Tabla = St.executeQuery();
       
          
          if(!Tabla.next()){  //Preguntamos si existen registros dentro del resultado aplicado SQL
             
          }
          else{        

              
              do{
              
                  Tabla_Duenos.setValueAt(Tabla.getString(1), nFila, 0);
                  Tabla_Duenos.setValueAt(Tabla.getString(2), nFila, 1);
                  Tabla_Duenos.setValueAt(Tabla.getString(3), nFila, 2);
                  Tabla_Duenos.setValueAt(Tabla.getString(4), nFila, 3);
                  Tabla_Duenos.setValueAt(Tabla.getString(5), nFila, 4);
                  Tabla_Duenos.setValueAt(Tabla.getInt(6), nFila, 5);
                  Tabla_Duenos.setValueAt(Tabla.getString(7), nFila, 6);
                  Tabla_Duenos.setValueAt(Tabla.getString(8), nFila, 7);
                    
                  nFila++; //Contador para insertando filas
              
              }while(Tabla.next()); //Recordar que este ciclo avanza hasta que llega el fin de archivo
              
          }
          
          Conect.Cerrar();
         
          
        }catch (SQLException | ClassNotFoundException error){
          
          JOptionPane.showMessageDialog(this,"Error de apertura de tablas " + error, "ERROR", JOptionPane.ERROR_MESSAGE);
         
      }

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnCancelar_Dueños = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Duenos = new javax.swing.JTable();

        setResizable(false);

        BtnCancelar_Dueños.setText("Cancelar");
        BtnCancelar_Dueños.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnCancelar_DueñosMouseClicked(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Reporte de todos los propietarios", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10))); // NOI18N

        Tabla_Duenos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Rut", "Primer Nombre", "Segundo Nombre", "Apellido Paterno", "Apellido Materno", "Edad", "E-Mail", "Dirección"
            }
        ));
        jScrollPane1.setViewportView(Tabla_Duenos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(790, 790, 790)
                .addComponent(BtnCancelar_Dueños)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BtnCancelar_Dueños)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelar_DueñosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnCancelar_DueñosMouseClicked
      dispose();
    }//GEN-LAST:event_BtnCancelar_DueñosMouseClicked

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
            java.util.logging.Logger.getLogger(Registro_Duenos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro_Duenos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro_Duenos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro_Duenos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro_Duenos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancelar_Dueños;
    private javax.swing.JTable Tabla_Duenos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
