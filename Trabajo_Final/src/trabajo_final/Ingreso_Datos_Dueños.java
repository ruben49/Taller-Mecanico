package trabajo_final;

import java.awt.BorderLayout;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JOptionPane;


public class Ingreso_Datos_Dueños extends javax.swing.JFrame {
    private Validaciones Validar = new Validaciones();
    
    private boolean swRut = false;
    private boolean swBtnGuardar = false;
    
    
    public Ingreso_Datos_Dueños() {
        initComponents();
        BtnSiguiente.setEnabled(false);
        BtnGuardar.setEnabled(false);
        this.setSize(539, 231);
        CbEdad.setSelectedIndex(0);
        LblError_Rut.setVisible(false);
        LblError_Monto.setVisible(false);
        PnlAuto.setVisible(false);
        this.setSize(483, 258);
        this.setLayout(null);
        
        this.add(PnlDueño);
        this.add(PnlAuto);
        
        PnlDueño.setBounds(6, 8, 465, 190);
        PnlAuto.setBounds(6, 8, 465, 190);
        BtnSiguiente.setBounds(389,200,80, 23);
        BtnGuardar.setBounds(389,200,80, 23);
        BtnAtras.setBounds(299,200,80, 23);
        BtnGuardar.setVisible(false);
        BtnAtras.setVisible(false);
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

        jCheckBox1 = new javax.swing.JCheckBox();
        BtnSiguiente = new javax.swing.JButton();
        PnlDueño = new javax.swing.JPanel();
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
        BtnGuardar = new javax.swing.JButton();
        BtnAtras = new javax.swing.JButton();
        PnlAuto = new javax.swing.JPanel();
        LblEdad1 = new javax.swing.JLabel();
        CbAno_Fab = new javax.swing.JComboBox();
        TxtPatente = new javax.swing.JTextField();
        LblPatente = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TxtAreaDetalle = new javax.swing.JTextArea();
        LblAvaluo = new javax.swing.JLabel();
        LblTipo_Vehiculo = new javax.swing.JLabel();
        CbTipo_Vehiculo = new javax.swing.JComboBox();
        LblError_Monto = new javax.swing.JLabel();
        LblMarca = new javax.swing.JLabel();
        TxtAvaluo = new javax.swing.JTextField();
        TxtMarca = new javax.swing.JTextField();

        jCheckBox1.setText("jCheckBox1");

        setResizable(false);

        BtnSiguiente.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        BtnSiguiente.setText("Siguiente");
        BtnSiguiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnSiguienteMouseClicked(evt);
            }
        });
        BtnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSiguienteActionPerformed(evt);
            }
        });

        PnlDueño.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Propietario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10))); // NOI18N
        PnlDueño.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

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

        javax.swing.GroupLayout PnlDueñoLayout = new javax.swing.GroupLayout(PnlDueño);
        PnlDueño.setLayout(PnlDueñoLayout);
        PnlDueñoLayout.setHorizontalGroup(
            PnlDueñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlDueñoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PnlDueñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlDueñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(LblPrimer_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(LblRut, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(LblSegundo_Nombre)
                    .addComponent(LblApellido_Materno)
                    .addComponent(LblApellido_Paterno))
                .addGap(37, 37, 37)
                .addGroup(PnlDueñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlDueñoLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(LblError_Rut))
                    .addGroup(PnlDueñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(PnlDueñoLayout.createSequentialGroup()
                            .addGroup(PnlDueñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(TxtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtSegundo_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtPrimer_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtApellido_Materno, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TxtApellido_Paterno, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PnlDueñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PnlDueñoLayout.createSequentialGroup()
                                    .addGap(33, 33, 33)
                                    .addComponent(LblEdad)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(CbEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PnlDueñoLayout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(247, Short.MAX_VALUE))
        );
        PnlDueñoLayout.setVerticalGroup(
            PnlDueñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlDueñoLayout.createSequentialGroup()
                .addGroup(PnlDueñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PnlDueñoLayout.createSequentialGroup()
                        .addComponent(LblError_Rut)
                        .addGap(8, 8, 8)
                        .addGroup(PnlDueñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblRut)
                            .addComponent(TxtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblEdad)
                            .addComponent(CbEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(PnlDueñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PnlDueñoLayout.createSequentialGroup()
                                .addGroup(PnlDueñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LblPrimer_Nombre)
                                    .addComponent(TxtPrimer_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PnlDueñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LblSegundo_Nombre)
                                    .addComponent(TxtSegundo_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(PnlDueñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblApellido_Paterno)
                            .addComponent(TxtApellido_Paterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(PnlDueñoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblApellido_Materno)
                            .addComponent(TxtApellido_Materno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        BtnGuardar.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        BtnGuardar.setText("Guardar");
        BtnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnGuardarMouseClicked(evt);
            }
        });
        BtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGuardarActionPerformed(evt);
            }
        });

        BtnAtras.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        BtnAtras.setText("Atras");
        BtnAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnAtrasMouseClicked(evt);
            }
        });
        BtnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAtrasActionPerformed(evt);
            }
        });

        PnlAuto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Vehículo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10))); // NOI18N
        PnlAuto.setPreferredSize(new java.awt.Dimension(497, 229));

        LblEdad1.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        LblEdad1.setText("Año de Fabricación");

        CbAno_Fab.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        CbAno_Fab.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013" }));
        CbAno_Fab.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CbAno_FabItemStateChanged(evt);
            }
        });
        CbAno_Fab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbAno_FabActionPerformed(evt);
            }
        });

        TxtPatente.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        TxtPatente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtPatenteActionPerformed(evt);
            }
        });
        TxtPatente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TxtPatenteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtPatenteKeyTyped(evt);
            }
        });

        LblPatente.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        LblPatente.setText("Número de Patente");

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 10))); // NOI18N
        jPanel3.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N

        TxtAreaDetalle.setColumns(20);
        TxtAreaDetalle.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        TxtAreaDetalle.setRows(5);
        TxtAreaDetalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtAreaDetalleKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(TxtAreaDetalle);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );

        LblAvaluo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        LblAvaluo.setText("Avalúo Fiscal");

        LblTipo_Vehiculo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        LblTipo_Vehiculo.setText("Tipo de Vehículo");

        CbTipo_Vehiculo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
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

        javax.swing.GroupLayout PnlAutoLayout = new javax.swing.GroupLayout(PnlAuto);
        PnlAuto.setLayout(PnlAutoLayout);
        PnlAutoLayout.setHorizontalGroup(
            PnlAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlAutoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PnlAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PnlAutoLayout.createSequentialGroup()
                        .addComponent(LblPatente)
                        .addGap(18, 18, 18)
                        .addComponent(TxtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PnlAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblEdad1)
                    .addComponent(LblTipo_Vehiculo)
                    .addComponent(LblAvaluo)
                    .addComponent(LblMarca))
                .addGap(23, 23, 23)
                .addGroup(PnlAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PnlAutoLayout.createSequentialGroup()
                        .addComponent(LblError_Monto)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(PnlAutoLayout.createSequentialGroup()
                        .addGroup(PnlAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TxtAvaluo)
                            .addComponent(CbAno_Fab, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CbTipo_Vehiculo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(PnlAutoLayout.createSequentialGroup()
                                .addComponent(TxtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        PnlAutoLayout.setVerticalGroup(
            PnlAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PnlAutoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PnlAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtPatente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblPatente)
                    .addComponent(CbAno_Fab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblEdad1))
                .addGap(18, 18, 18)
                .addGroup(PnlAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PnlAutoLayout.createSequentialGroup()
                        .addGroup(PnlAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblTipo_Vehiculo)
                            .addComponent(CbTipo_Vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PnlAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblMarca)
                            .addComponent(TxtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(PnlAutoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblAvaluo)
                            .addComponent(TxtAvaluo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblError_Monto))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnAtras)
                .addGap(18, 18, 18)
                .addComponent(BtnGuardar)
                .addGap(18, 18, 18)
                .addComponent(BtnSiguiente)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlDueño, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(PnlAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PnlDueño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(PnlAuto, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnSiguiente)
                    .addComponent(BtnGuardar)
                    .addComponent(BtnAtras))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSiguienteActionPerformed
        
    }//GEN-LAST:event_BtnSiguienteActionPerformed

    private void TxtRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtRutActionPerformed

    private void TxtPrimer_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPrimer_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPrimer_NombreActionPerformed

    private void TxtSegundo_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtSegundo_NombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtSegundo_NombreActionPerformed

    private void TxtApellido_PaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApellido_PaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApellido_PaternoActionPerformed

    private void TxtApellido_MaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtApellido_MaternoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtApellido_MaternoActionPerformed

    private void BtnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnGuardarMouseClicked
      swBtnGuardar = true; 
        
      try{
       Integer.parseInt(TxtAvaluo.getText());
      }catch(NumberFormatException error)  {
          swBtnGuardar = false;
      }
        
      if(swBtnGuardar){
          
            if(CbAno_Fab.getSelectedIndex()  > 0  && !TxtPatente.getText().equals(null) && !TxtAvaluo.getText().equals(null) && !TxtMarca.getText().equals(null)){
         
          
          //Guardar en Base de Datos
          //primera inserción
                
                Conectar Conect = new Conectar();
                String mSql = "INSERT INTO duenos (id_rut, primer_nombre, segundo_nombre, apellido_paterno, apellido_materno, edad, email, domicilio) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";  
                
                try{
          
          Conect.Abrir();
          PreparedStatement St1 = (PreparedStatement) Conect.getConexion().prepareStatement(mSql);
          St1.setString(1, TxtRut.getText());
          St1.setString(2, TxtPrimer_Nombre.getText());
          St1.setString(3, TxtSegundo_Nombre.getText());
          St1.setString(4, TxtApellido_Paterno.getText());
          St1.setString(5, TxtApellido_Materno.getText());
          St1.setInt(6, Integer.parseInt(CbEdad.getSelectedItem().toString()));
          St1.setString(7, TxtCorreo_Email.getText());
          St1.setString(8, TxtDomicilio.getText());
          
          
          St1.executeUpdate();
          Conect.Cerrar();
          
          
          
      }catch (SQLException | ClassNotFoundException error){
          
          JOptionPane.showMessageDialog(this,"Error al grabar el registro" + error, "ERROR", JOptionPane.ERROR_MESSAGE);
          
      }

          //Segunda inserción       

          
          Conect = new Conectar();
                String mSq3 = "INSERT INTO vehiculos (id_patente, detalle, marca, tipo, ano_fabricacion, avaluo_fiscal, id_rut) VALUES (?, ?, ?, ?, ?, ?, ?)";  
                
                try{
          
          Conect.Abrir();
          PreparedStatement St3 = (PreparedStatement) Conect.getConexion().prepareStatement(mSq3);
          St3.setString(1, TxtPatente.getText());
          St3.setString(2, TxtAreaDetalle.getText());
          St3.setString(3, TxtMarca.getText());
          St3.setInt(4, CbTipo_Vehiculo.getSelectedIndex());
          St3.setInt(5, Integer.parseInt(CbAno_Fab.getSelectedItem().toString()));
          St3.setInt(6, Integer.parseInt(TxtAvaluo.getText()));
          St3.setString(7, TxtRut.getText());
                
          St3.executeUpdate();
          Conect.Cerrar();
     
          }catch (Exception error){
          
          JOptionPane.showMessageDialog(this,"Error al grabar el registro" + error, "ERROR", JOptionPane.ERROR_MESSAGE);
          
      }  
    //termina el evento
          BtnGuardar.setEnabled(false);
          dispose();
            }
      
      }else{
          LblError_Monto.setVisible(true);
      }
  
      JOptionPane.showMessageDialog(null, "Por favor, reinicie la aplicación para actualizar los reportes", "AVISO", JOptionPane.INFORMATION_MESSAGE);
      
    }//GEN-LAST:event_BtnGuardarMouseClicked

    private void BtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnGuardarActionPerformed

    private void BtnAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnAtrasMouseClicked
        PnlDueño.setVisible(true);
        BtnSiguiente.setVisible(true);
        PnlAuto.setVisible(false);
        BtnAtras.setVisible(false);
        BtnGuardar.setVisible(false);     
    }//GEN-LAST:event_BtnAtrasMouseClicked

    private void BtnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAtrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAtrasActionPerformed

    private void TxtRutKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtRutKeyTyped
        if(TxtRut.getText().length() == 10){
            evt.consume();
        }
      
    }//GEN-LAST:event_TxtRutKeyTyped

    private void TxtDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDomicilioActionPerformed

    private void CbEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbEdadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbEdadActionPerformed

    private void BtnSiguienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnSiguienteMouseClicked
        
        if(Validar.Validar_Rut(TxtRut.getText())){
            swRut = true;
        }else{
            swRut = false;
        }

        if(swRut){
            LblError_Rut.setVisible(false);
            
            //Cambiar botones despues de presionar siguiente
            /*ademas aqui validar q este todo seleccionado para que realice la 
            instruccioón o si no al poner un
            rut valido, aun estando deshabilitado el boton siguiente igualmente
            cambiara de panel
            */

         if(CbEdad.getSelectedIndex() > 0 && !TxtRut.getText().equals(null) && !TxtPrimer_Nombre.getText().equals(null) && !TxtSegundo_Nombre.equals(null) && !TxtApellido_Paterno.getText().equals(null) && !TxtApellido_Materno.getText().equals(null) &&  !TxtDomicilio.getText().equals(null) && !TxtDomicilio.getText().equals(null) && !TxtCorreo_Email.getText().equals(null)){
           
            PnlDueño.setVisible(false);
            BtnSiguiente.setVisible(false);
            PnlAuto.setVisible(true);
            BtnAtras.setVisible(true);
            BtnGuardar.setVisible(true);
           }
           
        }else{
            if(swRut == false){
                LblError_Rut.setVisible(true);
            }
        }
            

    }//GEN-LAST:event_BtnSiguienteMouseClicked

    private void CbAno_FabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbAno_FabActionPerformed

    }//GEN-LAST:event_CbAno_FabActionPerformed

    private void TxtPatenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtPatenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtPatenteActionPerformed

    private void TxtPatenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPatenteKeyTyped
        if(TxtPatente.getText().length() == 6){
            evt.consume();
        }
    }//GEN-LAST:event_TxtPatenteKeyTyped

    private void TxtAreaDetalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtAreaDetalleKeyTyped
        TxtAreaDetalle.setLineWrap(true);
        TxtAreaDetalle.setWrapStyleWord(true);
        if(TxtAreaDetalle.getText().length() == 200){
            evt.consume();
        }
    }//GEN-LAST:event_TxtAreaDetalleKeyTyped

    private void TxtAvaluoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtAvaluoActionPerformed

    }//GEN-LAST:event_TxtAvaluoActionPerformed

    private void TxtRutKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtRutKeyPressed
   /*este*/     if(CbEdad.getSelectedIndex() > 0 && !TxtRut.getText().equals(null) && !TxtPrimer_Nombre.getText().equals(null) && !TxtSegundo_Nombre.equals(null) && !TxtApellido_Paterno.getText().equals(null) && !TxtApellido_Materno.getText().equals(null) &&  !TxtDomicilio.getText().equals(null) && !TxtDomicilio.getText().equals(null) && !TxtCorreo_Email.getText().equals(null)){
           BtnSiguiente.setEnabled(true);
        }else{
            BtnSiguiente.setEnabled(false);
        }
            
    }//GEN-LAST:event_TxtRutKeyPressed

    private void TxtPrimer_NombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPrimer_NombreKeyPressed
        /*este*/     if(CbEdad.getSelectedIndex() > 0 && !TxtRut.getText().equals(null) && !TxtPrimer_Nombre.getText().equals(null) && !TxtSegundo_Nombre.equals(null) && !TxtApellido_Paterno.getText().equals(null) && !TxtApellido_Materno.getText().equals(null) &&  !TxtDomicilio.getText().equals(null) && !TxtDomicilio.getText().equals(null) && !TxtCorreo_Email.getText().equals(null)){
           BtnSiguiente.setEnabled(true);
        }else{
            BtnSiguiente.setEnabled(false);
        }
    }//GEN-LAST:event_TxtPrimer_NombreKeyPressed

    private void TxtSegundo_NombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtSegundo_NombreKeyPressed
        /*este*/     if(CbEdad.getSelectedIndex() > 0 && !TxtRut.getText().equals(null) && !TxtPrimer_Nombre.getText().equals(null) && !TxtSegundo_Nombre.equals(null) && !TxtApellido_Paterno.getText().equals(null) && !TxtApellido_Materno.getText().equals(null) &&  !TxtDomicilio.getText().equals(null) && !TxtDomicilio.getText().equals(null) && !TxtCorreo_Email.getText().equals(null)){
           BtnSiguiente.setEnabled(true);
        }else{
            BtnSiguiente.setEnabled(false);
        }
    }//GEN-LAST:event_TxtSegundo_NombreKeyPressed

    private void TxtApellido_PaternoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtApellido_PaternoKeyPressed
        /*este*/     if(CbEdad.getSelectedIndex() > 0 && !TxtRut.getText().equals(null) && !TxtPrimer_Nombre.getText().equals(null) && !TxtSegundo_Nombre.equals(null) && !TxtApellido_Paterno.getText().equals(null) && !TxtApellido_Materno.getText().equals(null) &&  !TxtDomicilio.getText().equals(null) && !TxtDomicilio.getText().equals(null) && !TxtCorreo_Email.getText().equals(null)){
           BtnSiguiente.setEnabled(true);
        }else{
            BtnSiguiente.setEnabled(false);
        }
    }//GEN-LAST:event_TxtApellido_PaternoKeyPressed

    private void TxtApellido_MaternoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtApellido_MaternoKeyPressed
        /*este*/     if(CbEdad.getSelectedIndex() > 0 && !TxtRut.getText().equals(null) && !TxtPrimer_Nombre.getText().equals(null) && !TxtSegundo_Nombre.equals(null) && !TxtApellido_Paterno.getText().equals(null) && !TxtApellido_Materno.getText().equals(null) &&  !TxtDomicilio.getText().equals(null) && !TxtDomicilio.getText().equals(null) && !TxtCorreo_Email.getText().equals(null)){
           BtnSiguiente.setEnabled(true);
        }else{
            BtnSiguiente.setEnabled(false);
        }
    }//GEN-LAST:event_TxtApellido_MaternoKeyPressed

    private void TxtDomicilioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtDomicilioKeyPressed
        /*este*/     if(CbEdad.getSelectedIndex() > 0 && !TxtRut.getText().equals(null) && !TxtPrimer_Nombre.getText().equals(null) && !TxtSegundo_Nombre.equals(null) && !TxtApellido_Paterno.getText().equals(null) && !TxtApellido_Materno.getText().equals(null) &&  !TxtDomicilio.getText().equals(null) && !TxtDomicilio.getText().equals(null) && !TxtCorreo_Email.getText().equals(null)){
           BtnSiguiente.setEnabled(true);
        }else{
            BtnSiguiente.setEnabled(false);
        }
    }//GEN-LAST:event_TxtDomicilioKeyPressed

    private void CbEdadItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbEdadItemStateChanged
        /*este*/     if(CbEdad.getSelectedIndex() > 0 && !TxtRut.getText().equals(null) && !TxtPrimer_Nombre.getText().equals(null) && !TxtSegundo_Nombre.equals(null) && !TxtApellido_Paterno.getText().equals(null) && !TxtApellido_Materno.getText().equals(null) &&  !TxtDomicilio.getText().equals(null) && !TxtDomicilio.getText().equals(null) && !TxtCorreo_Email.getText().equals(null)){
           BtnSiguiente.setEnabled(true);
        }else{
            BtnSiguiente.setEnabled(false);
        }
    }//GEN-LAST:event_CbEdadItemStateChanged

    private void TxtPatenteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtPatenteKeyPressed
    /**/    if(CbAno_Fab.getSelectedIndex()  > 0 && CbTipo_Vehiculo.getSelectedIndex() > 0 && !TxtPatente.getText().equals(null) && !TxtAvaluo.getText().equals(null) && !TxtMarca.getText().equals(null)){
            BtnGuardar.setEnabled(true);
        }else{
            BtnGuardar.setEnabled(false);
        }
    }//GEN-LAST:event_TxtPatenteKeyPressed

    private void CbAno_FabItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbAno_FabItemStateChanged
    /**/    if(CbAno_Fab.getSelectedIndex()  > 0 && CbTipo_Vehiculo.getSelectedIndex() > 0 && !TxtPatente.getText().equals(null) && !TxtAvaluo.getText().equals(null) && !TxtMarca.getText().equals(null)){
            BtnGuardar.setEnabled(true);
        }else{
            BtnGuardar.setEnabled(false);
        }
    }//GEN-LAST:event_CbAno_FabItemStateChanged

    private void TxtAvaluoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtAvaluoKeyPressed
    /**/    if(CbAno_Fab.getSelectedIndex()  > 0 && CbTipo_Vehiculo.getSelectedIndex() > 0 && !TxtPatente.getText().equals(null) && !TxtAvaluo.getText().equals(null) && !TxtMarca.getText().equals(null)){
            BtnGuardar.setEnabled(true);
        }else{
            BtnGuardar.setEnabled(false);
        }
    }//GEN-LAST:event_TxtAvaluoKeyPressed

    private void TxtCorreo_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCorreo_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCorreo_EmailActionPerformed

    private void TxtCorreo_EmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtCorreo_EmailKeyPressed
         /*este*/     if(CbEdad.getSelectedIndex() > 0 && !TxtRut.getText().equals(null) && !TxtPrimer_Nombre.getText().equals(null) && !TxtSegundo_Nombre.equals(null) && !TxtApellido_Paterno.getText().equals(null) && !TxtApellido_Materno.getText().equals(null) &&  !TxtDomicilio.getText().equals(null) && !TxtDomicilio.getText().equals(null) && !TxtCorreo_Email.getText().equals(null)){
           BtnSiguiente.setEnabled(true);
        }else{
            BtnSiguiente.setEnabled(false);
        }
    }//GEN-LAST:event_TxtCorreo_EmailKeyPressed

    private void TxtMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtMarcaActionPerformed

    private void TxtMarcaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtMarcaKeyPressed
        /**/    if(CbAno_Fab.getSelectedIndex()  > 0 && CbTipo_Vehiculo.getSelectedIndex() > 0 && !TxtPatente.getText().equals(null) && !TxtAvaluo.getText().equals(null) && !TxtMarca.getText().equals(null)){
            BtnGuardar.setEnabled(true);
        }else{
            BtnGuardar.setEnabled(false);
        }
    }//GEN-LAST:event_TxtMarcaKeyPressed

    private void CbTipo_VehiculoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CbTipo_VehiculoItemStateChanged
        /**/    if(CbAno_Fab.getSelectedIndex()  > 0 && CbTipo_Vehiculo.getSelectedIndex() > 0 && !TxtPatente.getText().equals(null) && !TxtAvaluo.getText().equals(null) && !TxtMarca.getText().equals(null)){
            BtnGuardar.setEnabled(true);
        }else{
            BtnGuardar.setEnabled(false);
        }
    }//GEN-LAST:event_CbTipo_VehiculoItemStateChanged

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
            java.util.logging.Logger.getLogger(Ingreso_Datos_Dueños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso_Datos_Dueños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso_Datos_Dueños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso_Datos_Dueños.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso_Datos_Dueños().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAtras;
    private javax.swing.JButton BtnGuardar;
    private javax.swing.JButton BtnSiguiente;
    private javax.swing.JComboBox CbAno_Fab;
    private javax.swing.JComboBox CbEdad;
    private javax.swing.JComboBox CbTipo_Vehiculo;
    private javax.swing.JLabel LblApellido_Materno;
    private javax.swing.JLabel LblApellido_Paterno;
    private javax.swing.JLabel LblAvaluo;
    private javax.swing.JLabel LblEdad;
    private javax.swing.JLabel LblEdad1;
    private javax.swing.JLabel LblError_Monto;
    private javax.swing.JLabel LblError_Rut;
    private javax.swing.JLabel LblMarca;
    private javax.swing.JLabel LblPatente;
    private javax.swing.JLabel LblPrimer_Nombre;
    private javax.swing.JLabel LblRut;
    private javax.swing.JLabel LblSegundo_Nombre;
    private javax.swing.JLabel LblTipo_Vehiculo;
    private javax.swing.JPanel PnlAuto;
    private javax.swing.JPanel PnlDueño;
    private javax.swing.JTextField TxtApellido_Materno;
    private javax.swing.JTextField TxtApellido_Paterno;
    private javax.swing.JTextArea TxtAreaDetalle;
    private javax.swing.JTextField TxtAvaluo;
    private javax.swing.JTextField TxtCorreo_Email;
    private javax.swing.JTextField TxtDomicilio;
    private javax.swing.JTextField TxtMarca;
    private javax.swing.JTextField TxtPatente;
    private javax.swing.JTextField TxtPrimer_Nombre;
    private javax.swing.JTextField TxtRut;
    private javax.swing.JTextField TxtSegundo_Nombre;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
