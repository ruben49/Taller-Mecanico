package trabajo_final;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Mnt_Vehiculos extends javax.swing.JFrame {


private Registro_Duenos Reporte_Duenos;
private Registro_Autos Reporte_Autos;

public Actualizar_Datos Actualizar_Datos;
public Ingresar_Tipo ingresar_tip;

public static boolean Buscado_Vehiculo;
public static boolean swVisible = false;
public String Patente;
public String Rut;


    public Mnt_Vehiculos(String xpass) throws SQLException, ClassNotFoundException {
        initComponents();
        ingresar_tip = new Ingresar_Tipo();
        Actualizar_Datos = new Actualizar_Datos();
        Reporte_Duenos = new Registro_Duenos();
        Reporte_Autos = new  Registro_Autos();
        Buscado_Vehiculo = false;
        
        Rut = "";
        Patente = "";
        Actualizar_Datos = new Actualizar_Datos();
        Reporte_Duenos.setVisible(false);
        Reporte_Autos.setVisible(false);  
        Actualizar_Datos.setVisible(false);
        ingresar_tip.setVisible(false);
    }
    
    public Mnt_Vehiculos() throws SQLException, ClassNotFoundException {
        
        
    }

    public  void setSwVisible(boolean swVisible){
        this.swVisible = swVisible;
    }
    
    public  boolean getSwVisible(){
        return this.swVisible;
    }
    
    public void setPatente(String Patente){
        this.Patente = Patente;
    }

    public String getPatente(){
        return this.Patente;
    }
    
    public void setRut(String Rut){
        this.Rut = Rut;
    }
    
    public String getRut(){
        return this.Rut;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        SbMnIngreso_Datos = new javax.swing.JMenuItem();
        SbMnIngresar_Tipo = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MnSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        SbMnReporte_Dueños = new javax.swing.JMenuItem();
        SbMnReporte_Vehiculos = new javax.swing.JMenuItem();
        MnBuscar = new javax.swing.JMenu();
        SbMnBuscar_Dueño = new javax.swing.JMenuItem();
        SbMnBuscar_Vehiculo = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro Vehicular");
        setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N

        jMenuBar1.setBorder(null);

        jMenu1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jMenu1.setText("Inicio");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jMenu4.setText("Registros                    ");
        jMenu4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        SbMnIngreso_Datos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        SbMnIngreso_Datos.setText("Ingresar Datos");
        SbMnIngreso_Datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SbMnIngreso_DatosActionPerformed(evt);
            }
        });
        jMenu4.add(SbMnIngreso_Datos);

        SbMnIngresar_Tipo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        SbMnIngresar_Tipo.setText("Ingresar Tipos de Vehiculos");
        SbMnIngresar_Tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SbMnIngresar_TipoActionPerformed(evt);
            }
        });
        jMenu4.add(SbMnIngresar_Tipo);

        jMenu1.add(jMenu4);
        jMenu1.add(jSeparator1);

        MnSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        MnSalir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        MnSalir.setText("Salir");
        MnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnSalirActionPerformed(evt);
            }
        });
        jMenu1.add(MnSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Utilidades");
        jMenu2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        jMenu6.setText("Generar Reporte...               ");
        jMenu6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        SbMnReporte_Dueños.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        SbMnReporte_Dueños.setText("solo Propietarios");
        SbMnReporte_Dueños.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SbMnReporte_DueñosActionPerformed(evt);
            }
        });
        jMenu6.add(SbMnReporte_Dueños);

        SbMnReporte_Vehiculos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        SbMnReporte_Vehiculos.setText("solo Vehiculos");
        SbMnReporte_Vehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SbMnReporte_VehiculosActionPerformed(evt);
            }
        });
        jMenu6.add(SbMnReporte_Vehiculos);

        jMenu2.add(jMenu6);

        MnBuscar.setText("Buscar...");
        MnBuscar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        SbMnBuscar_Dueño.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        SbMnBuscar_Dueño.setText("por Dueño");
        SbMnBuscar_Dueño.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SbMnBuscar_DueñoActionPerformed(evt);
            }
        });
        MnBuscar.add(SbMnBuscar_Dueño);

        SbMnBuscar_Vehiculo.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        SbMnBuscar_Vehiculo.setText("por Vehículo");
        SbMnBuscar_Vehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SbMnBuscar_VehiculoActionPerformed(evt);
            }
        });
        MnBuscar.add(SbMnBuscar_Vehiculo);

        jMenu2.add(MnBuscar);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 336, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SbMnIngreso_DatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SbMnIngreso_DatosActionPerformed
        Ingreso_Datos_Dueños Ingreso = new Ingreso_Datos_Dueños();
        if(evt.getSource() == SbMnIngreso_Datos){
            Ingreso.setLocationRelativeTo(null);
            Ingreso.setVisible(true);   
        }
         
    }//GEN-LAST:event_SbMnIngreso_DatosActionPerformed

    private void MnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnSalirActionPerformed
        if(evt.getSource() == MnSalir)
            System.exit(0);
    }//GEN-LAST:event_MnSalirActionPerformed

    private void SbMnReporte_DueñosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SbMnReporte_DueñosActionPerformed
       if(evt.getSource() == SbMnReporte_Dueños){
           Reporte_Duenos.setLocationRelativeTo(null);
           Reporte_Duenos.setVisible(true);
       }
    }//GEN-LAST:event_SbMnReporte_DueñosActionPerformed

    private void SbMnReporte_VehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SbMnReporte_VehiculosActionPerformed
        if(evt.getSource() == SbMnReporte_Vehiculos){
            Reporte_Duenos = new Registro_Duenos();

            Reporte_Autos.setLocationRelativeTo(null);
            Reporte_Autos.setVisible(true);
        }
    }//GEN-LAST:event_SbMnReporte_VehiculosActionPerformed

    private void SbMnBuscar_DueñoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SbMnBuscar_DueñoActionPerformed
             
                Conectar Conect = new Conectar();
     
                
                String mSql = "SELECT * FROM duenos WHERE id_rut = ?";   
      
      if(evt.getSource() == SbMnBuscar_Dueño){
            setRut(JOptionPane.showInputDialog(null, "Ingrese el Rut de la Persona", "Buscar Persona", JOptionPane.INFORMATION_MESSAGE));
        }
        
      try{
          
          Conect.Abrir();
          PreparedStatement St = (PreparedStatement) Conect.getConexion().prepareStatement(mSql);
          St.setString(1, getRut());
          ResultSet Tabla = St.executeQuery();
          
          
          if(!Tabla.next()){
              
              JOptionPane.showMessageDialog(this,"El Rut ingresada NO EXISTE", "ERROR", JOptionPane.ERROR_MESSAGE);
              
          }
          else{        
              setSwVisible(true);
              Actualizar_Datos.setLocationRelativeTo(null);
              Actualizar_Datos.setVisible(true);
          }
          Conect.Cerrar();
          
          
        }catch (Exception error){
          
          JOptionPane.showMessageDialog(this,"El Rut ingresado NO EXISTE " + error, "ERROR", JOptionPane.ERROR_MESSAGE);
          
      }
               
    }//GEN-LAST:event_SbMnBuscar_DueñoActionPerformed

    private void SbMnBuscar_VehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SbMnBuscar_VehiculoActionPerformed
        
        
        
        Conectar Conect = new Conectar();
      String mSql = "SELECT * FROM vehiculos WHERE id_patente = ?";   
      
      
      if(evt.getSource() == SbMnBuscar_Vehiculo){
      setPatente(JOptionPane.showInputDialog(null, "Ingrese la Patente del Vehiculo", "Buscar Vehiculo", JOptionPane.INFORMATION_MESSAGE));
       
        
      try{
          
          Conect.Abrir();
          PreparedStatement St = (PreparedStatement) Conect.getConexion().prepareStatement(mSql);
          St.setString(1, getPatente());
          ResultSet Tabla = St.executeQuery();
          
          
          if(!Tabla.next()){
              
              JOptionPane.showMessageDialog(this,"La Patente ingresada NO EXISTE", "ERROR", JOptionPane.ERROR_MESSAGE);
              
          }
          else{        
              setSwVisible(false);
              Actualizar_Datos.setLocationRelativeTo(null);
              Actualizar_Datos.setVisible(true);
              
          }
          Conect.Cerrar();
          
          
        }catch (SQLException | ClassNotFoundException error){
          
          JOptionPane.showMessageDialog(this,"La Patente ingresada NO EXISTE " + error, "ERROR", JOptionPane.ERROR_MESSAGE);
          
      }
        
 
        }
    }//GEN-LAST:event_SbMnBuscar_VehiculoActionPerformed

    private void SbMnIngresar_TipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SbMnIngresar_TipoActionPerformed
        ingresar_tip.setLocationRelativeTo(null);
        ingresar_tip.setVisible(true);
        
    }//GEN-LAST:event_SbMnIngresar_TipoActionPerformed

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
            java.util.logging.Logger.getLogger(Mnt_Vehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Mnt_Vehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Mnt_Vehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Mnt_Vehiculos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Mnt_Vehiculos().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Mnt_Vehiculos.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Mnt_Vehiculos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MnBuscar;
    private javax.swing.JMenuItem MnSalir;
    private javax.swing.JMenuItem SbMnBuscar_Dueño;
    private javax.swing.JMenuItem SbMnBuscar_Vehiculo;
    private javax.swing.JMenuItem SbMnIngresar_Tipo;
    private javax.swing.JMenuItem SbMnIngreso_Datos;
    private javax.swing.JMenuItem SbMnReporte_Dueños;
    private javax.swing.JMenuItem SbMnReporte_Vehiculos;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
