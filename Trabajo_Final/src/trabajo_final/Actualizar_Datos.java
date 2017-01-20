package trabajo_final;

import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Actualizar_Datos extends javax.swing.JFrame {
   
   public static boolean swBtnActualizar = false;
   
   public static Mnt_Vehiculos Visible;
   
  
   
    public Actualizar_Datos() throws SQLException, ClassNotFoundException {
        
        initComponents();
        Visible = new Mnt_Vehiculos();
        BtnEliminar.setEnabled(false);
        BtnActualizar.setEnabled(false);
        BtnSalir.setEnabled(false);
        this.setSize(539, 231);
        CbEdad.setSelectedIndex(0);
        LblError_Rut.setVisible(false);
        LblError_Monto.setVisible(false);
        PnlActualizar_Vehiculo.setVisible(false);
        PnlActualizar_Dueño.setVisible(false);
        
        if(Visible.getSwVisible() == false){
            PnlActualizar_Dueño.setVisible(true);
            swBtnActualizar = true; 
        }
        
        if(Visible.getSwVisible() == true){
            PnlActualizar_Vehiculo.setVisible(false);
            swBtnActualizar = false; 
        }
        


        this.setSize(483, 258);
        this.setLayout(null);
        
        this.add(PnlActualizar_Dueño);
        this.add(PnlActualizar_Vehiculo);
        
        PnlActualizar_Dueño.setBounds(6, 8, 465, 190);
        PnlActualizar_Vehiculo.setBounds(6, 8, 465, 190);
        
        BtnSalir.setBounds(389,200,80, 23);
        BtnActualizar.setBounds(299,200,80, 23);
        BtnEliminar.setBounds(209,200,80, 23);
        Cargar_Combo();
    }
      
         public void Cargar_Combo(){
      
     
      Conectar Conexion = new Conectar();
      String mSql = "SELECT * FROM tipo_vehiculos";   
       
     
      try{
          
          Conexion.Abrir();
          java.sql.PreparedStatement St = (java.sql.PreparedStatement) Conexion.getConexion().prepareStatement(mSql);
          ResultSet Tabla = St.executeQuery();
          
          
          
          while(Tabla.next()){    
              CbTipo_Vehiculo.addItem(Tabla.getString(2));
              
        
          }             
          
         
          Conexion.Cerrar();
          
        }catch (SQLException | ClassNotFoundException error){
          
         
      }
        
    }
    
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnActualizar = new javax.swing.JButton();
        BtnSalir = new javax.swing.JButton();
        PnlActualizar_Vehiculo = new javax.swing.JPanel();
        LblEdad3 = new javax.swing.JLabel();
        CbAno_Fab_id = new javax.swing.JComboBox();
        TxtPatente_ID = new javax.swing.JTextField();
        LblPatente2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TxtAreaDetalle_id = new javax.swing.JTextArea();
        LblAvaluo = new javax.swing.JLabel();
        LblTipo_Vehiculo = new javax.swing.JLabel();
        CbTipo_Vehiculo = new javax.swing.JComboBox();
        LblError_Monto = new javax.swing.JLabel();
        LblMarca = new javax.swing.JLabel();
        TxtAvaluo = new javax.swing.JTextField();
        TxtMarca = new javax.swing.JTextField();
        BtnEliminar = new javax.swing.JButton();
        PnlActualizar_Dueño = new javax.swing.JPanel();
        TxtRut = new javax.swing.JTextField();
        LblRut = new javax.swing.JLabel();
        LblPrimer_Nombre = new javax.swing.JLabel();
        LblSegundo_Nombre = new javax.swing.JLabel();
        LblApellido_Paterno = new javax.swing.JLabel();
        LblApellido_Materno = new javax.swing.JLabel();
        TxtPrimer_Nombre = new javax.swing.JTextField();
        TxtSegundo_Nombre = new javax.swing.JTextField();
        TxtApellido_Paterno = new javax.swing.JTextField();
        TxtApellido_Materno = new javax.swing.JTextField();
        CbEdad = new javax.swing.JComboBox();
        LblEdad = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        TxtDomicilio = new javax.swing.JTextField();
        LblError_Rut = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        TxtCorreo_Email = new javax.swing.JTextField();

        BtnActualizar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        BtnActualizar.setText("Actualizar");
        BtnActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnActualizarMouseClicked(evt);
            }
        });

        BtnSalir.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        BtnSalir.setText("Salir");
        BtnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSalirMouseClicked(evt);
            }
        });

        PnlActualizar_Vehiculo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Vehículo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10))); // NOI18N
        PnlActualizar_Vehiculo.setPreferredSize(new java.awt.Dimension(497, 229));

        LblEdad3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        LblEdad3.setText("Año de Fabricación");

        CbAno_Fab_id.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        CbAno_Fab_id.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013" }));
        CbAno_Fab_id.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbAno_Fab_idItemStateChanged(evt);
            }
        });
        CbAno_Fab_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbAno_Fab_idActionPerformed(evt);
            }
        });

        TxtPatente_ID.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        TxtPatente_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPatente_IDActionPerformed(evt);
            }
        });
        TxtPatente_ID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtPatente_IDKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPatente_IDKeyTyped(evt);
            }
        });

        LblPatente2.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        LblPatente2.setText("Número de Patente");

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10))); // NOI18N
        jPanel5.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        TxtAreaDetalle_id.setColumns(20);
        TxtAreaDetalle_id.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        TxtAreaDetalle_id.setRows(5);
        TxtAreaDetalle_id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtAreaDetalle_idKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(TxtAreaDetalle_id);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );

        LblAvaluo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        LblAvaluo.setText("Avalúo Fiscal");

        LblTipo_Vehiculo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        LblTipo_Vehiculo.setText("Tipo de Vehículo");

        CbTipo_Vehiculo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        CbTipo_Vehiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Autobús", "Automóvil", "Camión", "Camioneta", "Cuadrimoto", "Furgon", "Motocicleta", "Tricimoto", "Microbús", "Remolque" }));
        CbTipo_Vehiculo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbTipo_VehiculoItemStateChanged(evt);
            }
        });

        LblError_Monto.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        LblError_Monto.setForeground(new java.awt.Color(255, 0, 0));
        LblError_Monto.setText("Monto Inválido");

        LblMarca.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        LblMarca.setText("Marca");

        TxtAvaluo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        TxtAvaluo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtAvaluoActionPerformed(evt);
            }
        });
        TxtAvaluo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtAvaluoKeyPressed(evt);
            }
        });

        TxtMarca.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        TxtMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtMarcaActionPerformed(evt);
            }
        });
        TxtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtMarcaKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout PnlActualizar_VehiculoLayout = new javax.swing.GroupLayout(PnlActualizar_Vehiculo);
        PnlActualizar_Vehiculo.setLayout(PnlActualizar_VehiculoLayout);
        PnlActualizar_VehiculoLayout.setHorizontalGroup(
            PnlActualizar_VehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlActualizar_VehiculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlActualizar_VehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PnlActualizar_VehiculoLayout.createSequentialGroup()
                        .addComponent(LblPatente2)
                        .addGap(18, 18, 18)
                        .addComponent(TxtPatente_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlActualizar_VehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblEdad3)
                    .addComponent(LblTipo_Vehiculo)
                    .addComponent(LblAvaluo)
                    .addComponent(LblMarca))
                .addGap(23, 23, 23)
                .addGroup(PnlActualizar_VehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlActualizar_VehiculoLayout.createSequentialGroup()
                        .addComponent(LblError_Monto)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PnlActualizar_VehiculoLayout.createSequentialGroup()
                        .addGroup(PnlActualizar_VehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtAvaluo)
                            .addComponent(CbAno_Fab_id, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CbTipo_Vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PnlActualizar_VehiculoLayout.createSequentialGroup()
                        .addComponent(TxtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PnlActualizar_VehiculoLayout.setVerticalGroup(
            PnlActualizar_VehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlActualizar_VehiculoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PnlActualizar_VehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtPatente_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblPatente2)
                    .addComponent(CbAno_Fab_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblEdad3))
                .addGap(18, 18, 18)
                .addGroup(PnlActualizar_VehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PnlActualizar_VehiculoLayout.createSequentialGroup()
                        .addGroup(PnlActualizar_VehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblTipo_Vehiculo)
                            .addComponent(CbTipo_Vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PnlActualizar_VehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblMarca)
                            .addComponent(TxtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(PnlActualizar_VehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblAvaluo)
                            .addComponent(TxtAvaluo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblError_Monto))
        );

        BtnEliminar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        BtnEliminar.setText("Eliminar");
        BtnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnEliminarMouseClicked(evt);
            }
        });

        PnlActualizar_Dueño.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Propietario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10))); // NOI18N
        PnlActualizar_Dueño.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        TxtRut.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        TxtRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtRutActionPerformed(evt);
            }
        });
        TxtRut.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtRutKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtRutKeyTyped(evt);
            }
        });

        LblRut.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        LblRut.setText("Rut");

        LblPrimer_Nombre.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        LblPrimer_Nombre.setText("Primer Nombre");

        LblSegundo_Nombre.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        LblSegundo_Nombre.setText("Segundo Nombre");

        LblApellido_Paterno.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        LblApellido_Paterno.setText("Apellido Paterno");

        LblApellido_Materno.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        LblApellido_Materno.setText("Apellido Materno");

        TxtPrimer_Nombre.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        TxtPrimer_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPrimer_NombreActionPerformed(evt);
            }
        });
        TxtPrimer_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtPrimer_NombreKeyPressed(evt);
            }
        });

        TxtSegundo_Nombre.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        TxtSegundo_Nombre.setToolTipText("");
        TxtSegundo_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtSegundo_NombreActionPerformed(evt);
            }
        });
        TxtSegundo_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtSegundo_NombreKeyPressed(evt);
            }
        });

        TxtApellido_Paterno.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        TxtApellido_Paterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApellido_PaternoActionPerformed(evt);
            }
        });
        TxtApellido_Paterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtApellido_PaternoKeyPressed(evt);
            }
        });

        TxtApellido_Materno.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        TxtApellido_Materno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtApellido_MaternoActionPerformed(evt);
            }
        });
        TxtApellido_Materno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtApellido_MaternoKeyPressed(evt);
            }
        });

        CbEdad.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        CbEdad.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99" }));
        CbEdad.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbEdadItemStateChanged(evt);
            }
        });
        CbEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbEdadActionPerformed(evt);
            }
        });

        LblEdad.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        LblEdad.setText("Edad");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Domicilio", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10))); // NOI18N

        TxtDomicilio.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        TxtDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDomicilioActionPerformed(evt);
            }
        });
        TxtDomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtDomicilioKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TxtDomicilio, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TxtDomicilio, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        LblError_Rut.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        LblError_Rut.setForeground(new java.awt.Color(255, 0, 0));
        LblError_Rut.setText("Rut inválido");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dirección de Correo Electrónico", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10))); // NOI18N

        TxtCorreo_Email.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        TxtCorreo_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCorreo_EmailActionPerformed(evt);
            }
        });
        TxtCorreo_Email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtCorreo_EmailKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(TxtCorreo_Email, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addGap(2, 2, 2))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TxtCorreo_Email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout PnlActualizar_DueñoLayout = new javax.swing.GroupLayout(PnlActualizar_Dueño);
        PnlActualizar_Dueño.setLayout(PnlActualizar_DueñoLayout);
        PnlActualizar_DueñoLayout.setHorizontalGroup(
            PnlActualizar_DueñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlActualizar_DueñoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PnlActualizar_DueñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlActualizar_DueñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(LblPrimer_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblRut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(LblSegundo_Nombre)
                    .addComponent(LblApellido_Materno)
                    .addComponent(LblApellido_Paterno))
                .addGap(37, 37, 37)
                .addGroup(PnlActualizar_DueñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlActualizar_DueñoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(LblError_Rut))
                    .addGroup(PnlActualizar_DueñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PnlActualizar_DueñoLayout.createSequentialGroup()
                            .addGroup(PnlActualizar_DueñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtSegundo_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtPrimer_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtApellido_Materno, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtApellido_Paterno, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PnlActualizar_DueñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PnlActualizar_DueñoLayout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addComponent(LblEdad)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(CbEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PnlActualizar_DueñoLayout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PnlActualizar_DueñoLayout.setVerticalGroup(
            PnlActualizar_DueñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlActualizar_DueñoLayout.createSequentialGroup()
                .addGroup(PnlActualizar_DueñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PnlActualizar_DueñoLayout.createSequentialGroup()
                        .addComponent(LblError_Rut)
                        .addGap(8, 8, 8)
                        .addGroup(PnlActualizar_DueñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblRut)
                            .addComponent(TxtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblEdad)
                            .addComponent(CbEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(PnlActualizar_DueñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlActualizar_DueñoLayout.createSequentialGroup()
                                .addGroup(PnlActualizar_DueñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LblPrimer_Nombre)
                                    .addComponent(TxtPrimer_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PnlActualizar_DueñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LblSegundo_Nombre)
                                    .addComponent(TxtSegundo_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(PnlActualizar_DueñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblApellido_Paterno)
                            .addComponent(TxtApellido_Paterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(PnlActualizar_DueñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblApellido_Materno)
                            .addComponent(TxtApellido_Materno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(BtnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BtnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PnlActualizar_Vehiculo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(PnlActualizar_Dueño, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(PnlActualizar_Vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSalir)
                    .addComponent(BtnActualizar)
                    .addComponent(BtnEliminar))
                .addGap(44, 44, 44)
                .addComponent(PnlActualizar_Dueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnActualizarMouseClicked
   //Para Los vehiculos
       
         

        
      
      if(swBtnActualizar == false){        
         if(CbAno_Fab_id.getSelectedIndex()  > 0 && CbTipo_Vehiculo.getSelectedIndex() > 0 && !TxtPatente_ID.getText().equals(null) && !TxtAvaluo.getText().equals(null) && !TxtMarca.getText().equals(null)){
           
              Conectar Conect = new Conectar();
           
              String mSqlEditar2 = "UPDATE vehiculos SET id_patente = ?, detalle = ?, marca = ?, tipo = ?, ano_fabricacion = ?, avaluo_fiscal = ? WHERE id_patente = ?";

           
              //Segundo Update Vehiculos
               try{
          
          Conect.Abrir();
          PreparedStatement St_Vehiculos2 = (PreparedStatement) Conect.getConexion().prepareStatement(mSqlEditar2);
          St_Vehiculos2.setString(1, TxtPatente_ID.getText());
          St_Vehiculos2.setString(2, TxtAreaDetalle_id.getText());
          St_Vehiculos2.setString(3, TxtMarca.getText().toString());
          St_Vehiculos2.setInt(4, CbTipo_Vehiculo.getSelectedIndex());
          St_Vehiculos2.setInt(5, Integer.parseInt(CbAno_Fab_id.getSelectedItem().toString()));
          St_Vehiculos2.setInt(6, Integer.parseInt(TxtAvaluo.getText()));
          St_Vehiculos2.setString(1, TxtPatente_ID.getText());
          
          St_Vehiculos2.executeUpdate();
          Conect.Cerrar();
          
          
          
          }catch (SQLException | ClassNotFoundException error){
          
           JOptionPane.showMessageDialog(this,"Error al grabar el registro" + error, "ERROR", JOptionPane.ERROR_MESSAGE);
          
         }
         }
         }else{
          LblError_Monto.setVisible(true);
      }
 
      
      
    
     
        //Para los Dueños
        
        if(swBtnActualizar == true){
    
          if(CbEdad.getSelectedIndex() > 0 && !TxtRut.getText().equals(null) && !TxtPrimer_Nombre.getText().equals(null) && !TxtSegundo_Nombre.equals(null) && !TxtApellido_Paterno.getText().equals(null) && !TxtApellido_Materno.getText().equals(null) &&  !TxtDomicilio.getText().equals(null) && !TxtDomicilio.getText().equals(null) && !TxtCorreo_Email.getText().equals(null)){
      
           Conectar Conect = new Conectar();
              String mSqlEditar1 = "UPDATE duenos SET id_rut = ?, primer_nombre = ?, segundo_nombre = ?, apellido_paterno = ?, apellido_materno = ?, edad = ?, email = ? , domicilio = ? WHERE id_rut = ?";
              
               
           // Primer  Update Dueños   
              try{
          
          Conect.Abrir();
          PreparedStatement St_Duenos1 = (PreparedStatement) Conect.getConexion().prepareStatement(mSqlEditar1);
          St_Duenos1 .setString(1, TxtRut.getText().toString());
          St_Duenos1 .setString(2, TxtPrimer_Nombre.getText().toString());
          St_Duenos1 .setString(3, TxtSegundo_Nombre.getText().toString());
          St_Duenos1 .setString(4, TxtApellido_Paterno.getText().toString());
          St_Duenos1 .setString(5, TxtApellido_Materno.getText().toString());
          St_Duenos1 .setInt(6, Integer.parseInt(CbEdad.getSelectedItem().toString()));
          St_Duenos1 .setString(7, TxtCorreo_Email.getText().toString());
          St_Duenos1 .setString(8, TxtDomicilio.getText().toString());
          St_Duenos1 .setString(1, TxtRut.getText().toString());
          
          
          St_Duenos1 .executeUpdate();
          Conect.Cerrar();
          
          
          }catch (SQLException | ClassNotFoundException error){
          
              JOptionPane.showMessageDialog(this,"Error al grabar el registro" + error, "ERROR", JOptionPane.ERROR_MESSAGE);
         }
              

           
         
        
          
          }
          BtnActualizar.setEnabled(false);
        }
    }//GEN-LAST:event_BtnActualizarMouseClicked

    private void CbAno_Fab_idItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbAno_Fab_idItemStateChanged
       /**/    if(Visible.getSwVisible() == false && CbAno_Fab_id.getSelectedIndex()  > 0 && CbTipo_Vehiculo.getSelectedIndex() > 0 && !TxtPatente_ID.getText().equals(null) && !TxtAvaluo.getText().equals(null) && !TxtMarca.getText().equals(null)){
            BtnActualizar.setEnabled(true);
            BtnEliminar.setEnabled(true);
        }else{
            BtnActualizar.setEnabled(false);
            BtnEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_CbAno_Fab_idItemStateChanged

    private void CbAno_Fab_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbAno_Fab_idActionPerformed

    }//GEN-LAST:event_CbAno_Fab_idActionPerformed

    private void TxtPatente_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPatente_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPatente_IDActionPerformed

    private void TxtPatente_IDKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPatente_IDKeyPressed
     /**/    if(Visible.getSwVisible() == false && CbAno_Fab_id.getSelectedIndex()  > 0 && CbTipo_Vehiculo.getSelectedIndex() > 0 && !TxtPatente_ID.getText().equals(null) && !TxtAvaluo.getText().equals(null) && !TxtMarca.getText().equals(null)){
            BtnActualizar.setEnabled(true);
            BtnEliminar.setEnabled(true);
        }else{
            BtnActualizar.setEnabled(false);
            BtnEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_TxtPatente_IDKeyPressed

    private void TxtPatente_IDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPatente_IDKeyTyped
        if(TxtPatente_ID.getText().length() == 6){
            evt.consume();
        }
    }//GEN-LAST:event_TxtPatente_IDKeyTyped

    private void TxtAreaDetalle_idKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtAreaDetalle_idKeyTyped
        /**/    if(Visible.getSwVisible() == false && CbAno_Fab_id.getSelectedIndex()  > 0 && CbTipo_Vehiculo.getSelectedIndex() > 0 && !TxtPatente_ID.getText().equals(null) && !TxtAvaluo.getText().equals(null) && !TxtMarca.getText().equals(null)){
            BtnActualizar.setEnabled(true);
            BtnEliminar.setEnabled(true);
        }else{
            BtnActualizar.setEnabled(false);
            BtnEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_TxtAreaDetalle_idKeyTyped

    private void CbTipo_VehiculoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbTipo_VehiculoItemStateChanged
        /**/    if(Visible.getSwVisible() == false && CbAno_Fab_id.getSelectedIndex()  > 0 && CbTipo_Vehiculo.getSelectedIndex() > 0 && !TxtPatente_ID.getText().equals(null) && !TxtAvaluo.getText().equals(null) && !TxtMarca.getText().equals(null)){
            BtnActualizar.setEnabled(true);
            BtnEliminar.setEnabled(true);
        }else{
            BtnActualizar.setEnabled(false);
            BtnEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_CbTipo_VehiculoItemStateChanged

    private void TxtAvaluoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAvaluoActionPerformed

    }//GEN-LAST:event_TxtAvaluoActionPerformed

    private void TxtAvaluoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtAvaluoKeyPressed
        /**/    if(Visible.getSwVisible() == false && CbAno_Fab_id.getSelectedIndex()  > 0 && CbTipo_Vehiculo.getSelectedIndex() > 0 && !TxtPatente_ID.getText().equals(null) && !TxtAvaluo.getText().equals(null) && !TxtMarca.getText().equals(null)){
            BtnActualizar.setEnabled(true);
            BtnEliminar.setEnabled(true);
        }else{
            BtnActualizar.setEnabled(false);
            BtnEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_TxtAvaluoKeyPressed

    private void TxtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtMarcaActionPerformed

    private void TxtMarcaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtMarcaKeyPressed
       /**/    if(Visible.getSwVisible() == false && CbAno_Fab_id.getSelectedIndex()  > 0 && CbTipo_Vehiculo.getSelectedIndex() > 0 && !TxtPatente_ID.getText().equals(null) && !TxtAvaluo.getText().equals(null) && !TxtMarca.getText().equals(null)){
            BtnActualizar.setEnabled(true);
            BtnEliminar.setEnabled(true);
        }else{
            BtnActualizar.setEnabled(false);
            BtnEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_TxtMarcaKeyPressed

    private void BtnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnEliminarMouseClicked
      if(Visible.getSwVisible() == false){  
          
          //Para los vehiculos
        Conectar Conect = new Conectar();
      String mSql = "DELETE FROM vehiculos WHERE id_patente = ?";   
      int nRespuesta = 0;
       
      
      nRespuesta = JOptionPane.showConfirmDialog(this, "Esto hará que se elimine todos los registros de la Base de Datos", "¿Esta Seguro de eliminar este Registro?", JOptionPane.YES_NO_OPTION);
      
      if(nRespuesta == JOptionPane.YES_OPTION){
          
          try{
            Conect.Abrir();
            PreparedStatement St = (PreparedStatement) Conect.getConexion().prepareStatement(mSql);
            St.setString(1, TxtPatente_ID.getText());
            St.executeUpdate();
            Conect.Cerrar();
            
            
            BtnEliminar.setEnabled(false);
            
          
          }catch (SQLException | ClassNotFoundException error){
          
          JOptionPane.showMessageDialog(this,"No se pudo eliminar el Registro porque tiene dependencia de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
          
          }
      }
      }
      
      
      //Para los dueños
     
      if(Visible.getSwVisible()){
      
          Conectar Conect = new Conectar();
          String mSql = "DELETE FROM duenos WHERE id_rut = ?";   
          int nRespuesta = 0;
       
      
      nRespuesta = JOptionPane.showConfirmDialog(this, "Esto hará que se elimine todos los registros de la Base de Datos", "¿Esta Seguro de eliminar este Registro?", JOptionPane.YES_NO_OPTION);
      
      if(nRespuesta == JOptionPane.YES_OPTION){
          
          try{
            Conect.Abrir();
            PreparedStatement St = (PreparedStatement) Conect.getConexion().prepareStatement(mSql);
            St.setString(1, TxtRut.getText());
            St.executeUpdate();
            Conect.Cerrar();

            
            BtnEliminar.setEnabled(false);
            
          
          }catch (SQLException | ClassNotFoundException error){
          
          JOptionPane.showMessageDialog(this,"No se pudo eliminar el Registro porque tiene dependencia de datos", "ERROR", JOptionPane.ERROR_MESSAGE);
          
          }
          
   
      }
      }
        
    }//GEN-LAST:event_BtnEliminarMouseClicked

    private void TxtRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtRutActionPerformed

    private void TxtRutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtRutKeyPressed
        /*este*/     if(Visible.getSwVisible() == true && CbEdad.getSelectedIndex() > 0 && !TxtRut.getText().equals(null) && !TxtPrimer_Nombre.getText().equals(null) && !TxtSegundo_Nombre.equals(null) && !TxtApellido_Paterno.getText().equals(null) && !TxtApellido_Materno.getText().equals(null) &&  !TxtDomicilio.getText().equals(null) && !TxtDomicilio.getText().equals(null) && !TxtCorreo_Email.getText().equals(null)){
            BtnActualizar.setEnabled(true);
            BtnEliminar.setEnabled(true);
        }else{
            BtnActualizar.setEnabled(false);
            BtnEliminar.setEnabled(false);
        }

    }//GEN-LAST:event_TxtRutKeyPressed

    private void TxtRutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtRutKeyTyped
        if(TxtRut.getText().length() == 10){
            evt.consume();
        }

    }//GEN-LAST:event_TxtRutKeyTyped

    private void TxtPrimer_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPrimer_NombreActionPerformed
        
    }//GEN-LAST:event_TxtPrimer_NombreActionPerformed

    private void TxtPrimer_NombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrimer_NombreKeyPressed
       /*este*/     if(Visible.getSwVisible() == true && CbEdad.getSelectedIndex() > 0 && !TxtRut.getText().equals(null) && !TxtPrimer_Nombre.getText().equals(null) && !TxtSegundo_Nombre.equals(null) && !TxtApellido_Paterno.getText().equals(null) && !TxtApellido_Materno.getText().equals(null) &&  !TxtDomicilio.getText().equals(null) && !TxtDomicilio.getText().equals(null) && !TxtCorreo_Email.getText().equals(null)){
            BtnActualizar.setEnabled(true);
            BtnEliminar.setEnabled(true);
        }else{
            BtnActualizar.setEnabled(false);
            BtnEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_TxtPrimer_NombreKeyPressed

    private void TxtSegundo_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSegundo_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSegundo_NombreActionPerformed

    private void TxtSegundo_NombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtSegundo_NombreKeyPressed
       /*este*/     if(Visible.getSwVisible() == true && CbEdad.getSelectedIndex() > 0 && !TxtRut.getText().equals(null) && !TxtPrimer_Nombre.getText().equals(null) && !TxtSegundo_Nombre.equals(null) && !TxtApellido_Paterno.getText().equals(null) && !TxtApellido_Materno.getText().equals(null) &&  !TxtDomicilio.getText().equals(null) && !TxtDomicilio.getText().equals(null) && !TxtCorreo_Email.getText().equals(null)){
            BtnActualizar.setEnabled(true);
            BtnEliminar.setEnabled(true);
        }else{
            BtnActualizar.setEnabled(false);
            BtnEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_TxtSegundo_NombreKeyPressed

    private void TxtApellido_PaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApellido_PaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApellido_PaternoActionPerformed

    private void TxtApellido_PaternoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtApellido_PaternoKeyPressed
       /*este*/     if(Visible.getSwVisible() == true && CbEdad.getSelectedIndex() > 0 && !TxtRut.getText().equals(null) && !TxtPrimer_Nombre.getText().equals(null) && !TxtSegundo_Nombre.equals(null) && !TxtApellido_Paterno.getText().equals(null) && !TxtApellido_Materno.getText().equals(null) &&  !TxtDomicilio.getText().equals(null) && !TxtDomicilio.getText().equals(null) && !TxtCorreo_Email.getText().equals(null)){
            BtnActualizar.setEnabled(true);
            BtnEliminar.setEnabled(true);
        }else{
            BtnActualizar.setEnabled(false);
            BtnEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_TxtApellido_PaternoKeyPressed

    private void TxtApellido_MaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApellido_MaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApellido_MaternoActionPerformed

    private void TxtApellido_MaternoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtApellido_MaternoKeyPressed
       /*este*/     if(Visible.getSwVisible() == true && CbEdad.getSelectedIndex() > 0 && !TxtRut.getText().equals(null) && !TxtPrimer_Nombre.getText().equals(null) && !TxtSegundo_Nombre.equals(null) && !TxtApellido_Paterno.getText().equals(null) && !TxtApellido_Materno.getText().equals(null) &&  !TxtDomicilio.getText().equals(null) && !TxtDomicilio.getText().equals(null) && !TxtCorreo_Email.getText().equals(null)){
            BtnActualizar.setEnabled(true);
            BtnEliminar.setEnabled(true);
        }else{
            BtnActualizar.setEnabled(false);
            BtnEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_TxtApellido_MaternoKeyPressed

    private void CbEdadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbEdadItemStateChanged
        /*este*/     if(Visible.getSwVisible() == true && CbEdad.getSelectedIndex() > 0 && !TxtRut.getText().equals(null) && !TxtPrimer_Nombre.getText().equals(null) && !TxtSegundo_Nombre.equals(null) && !TxtApellido_Paterno.getText().equals(null) && !TxtApellido_Materno.getText().equals(null) &&  !TxtDomicilio.getText().equals(null) && !TxtDomicilio.getText().equals(null) && !TxtCorreo_Email.getText().equals(null)){
            BtnActualizar.setEnabled(true);
            BtnEliminar.setEnabled(true);
        }else{
            BtnActualizar.setEnabled(false);
            BtnEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_CbEdadItemStateChanged

    private void CbEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbEdadActionPerformed

    private void TxtDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDomicilioActionPerformed

    private void TxtDomicilioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDomicilioKeyPressed
       /*este*/     if(Visible.getSwVisible() == true && CbEdad.getSelectedIndex() > 0 && !TxtRut.getText().equals(null) && !TxtPrimer_Nombre.getText().equals(null) && !TxtSegundo_Nombre.equals(null) && !TxtApellido_Paterno.getText().equals(null) && !TxtApellido_Materno.getText().equals(null) &&  !TxtDomicilio.getText().equals(null) && !TxtDomicilio.getText().equals(null) && !TxtCorreo_Email.getText().equals(null)){
            BtnActualizar.setEnabled(true);
            BtnEliminar.setEnabled(true);
        }else{
            BtnActualizar.setEnabled(false);
            BtnEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_TxtDomicilioKeyPressed

    private void TxtCorreo_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCorreo_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCorreo_EmailActionPerformed

    private void TxtCorreo_EmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCorreo_EmailKeyPressed
       /*este*/     if(Visible.getSwVisible() == true && CbEdad.getSelectedIndex() > 0 && !TxtRut.getText().equals(null) && !TxtPrimer_Nombre.getText().equals(null) && !TxtSegundo_Nombre.equals(null) && !TxtApellido_Paterno.getText().equals(null) && !TxtApellido_Materno.getText().equals(null) &&  !TxtDomicilio.getText().equals(null) && !TxtDomicilio.getText().equals(null) && !TxtCorreo_Email.getText().equals(null)){
            BtnActualizar.setEnabled(true);
            BtnEliminar.setEnabled(true);
        }else{
            BtnActualizar.setEnabled(false);
            BtnEliminar.setEnabled(false);
        }
    }//GEN-LAST:event_TxtCorreo_EmailKeyPressed

    private void BtnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSalirMouseClicked
        dispose();
    }//GEN-LAST:event_BtnSalirMouseClicked

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
            java.util.logging.Logger.getLogger(Actualizar_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Actualizar_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Actualizar_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Actualizar_Datos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Actualizar_Datos().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Actualizar_Datos.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Actualizar_Datos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnEliminar;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JComboBox CbAno_Fab_id;
    private javax.swing.JComboBox CbEdad;
    public static javax.swing.JComboBox CbTipo_Vehiculo;
    private javax.swing.JLabel LblApellido_Materno;
    private javax.swing.JLabel LblApellido_Paterno;
    private javax.swing.JLabel LblAvaluo;
    private javax.swing.JLabel LblEdad;
    private javax.swing.JLabel LblEdad3;
    private javax.swing.JLabel LblError_Monto;
    private javax.swing.JLabel LblError_Rut;
    private javax.swing.JLabel LblMarca;
    private javax.swing.JLabel LblPatente2;
    private javax.swing.JLabel LblPrimer_Nombre;
    private javax.swing.JLabel LblRut;
    private javax.swing.JLabel LblSegundo_Nombre;
    private javax.swing.JLabel LblTipo_Vehiculo;
    private javax.swing.JPanel PnlActualizar_Dueño;
    private javax.swing.JPanel PnlActualizar_Vehiculo;
    private javax.swing.JTextField TxtApellido_Materno;
    private javax.swing.JTextField TxtApellido_Paterno;
    private javax.swing.JTextArea TxtAreaDetalle_id;
    private javax.swing.JTextField TxtAvaluo;
    private javax.swing.JTextField TxtCorreo_Email;
    private javax.swing.JTextField TxtDomicilio;
    private javax.swing.JTextField TxtMarca;
    private javax.swing.JTextField TxtPatente_ID;
    private javax.swing.JTextField TxtPrimer_Nombre;
    private javax.swing.JTextField TxtRut;
    private javax.swing.JTextField TxtSegundo_Nombre;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
