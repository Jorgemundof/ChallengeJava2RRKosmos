package Service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Repository.citasRepository;

public class menuPrincipal extends javax.swing.JFrame {

// Hacemos conexión a MYSQL
    citasRepository c = new citasRepository();
    Connection conectar = c.obtener_conexion();

    DefaultTableModel model;

    String[] Campos_tabla = {"TURNO", "CLIENTE", "FECHA CITA", "HORA CITA", "DOCTOR"};
    String[] informacion = new String[50];

    public void mostrar_citashoy() {
        //Query para para realizar la consulta en la base de datos...
        String Query = "SELECT * FROM citas WHERE  fecha_cita = current_date()";
        model = new DefaultTableModel(null, Campos_tabla);
        try {
            Statement st = (Statement) conectar.createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {
                informacion[0] = rs.getString("turno");
                informacion[1] = rs.getString("cliente");
                informacion[2] = rs.getString("fecha_cita");
                informacion[3] = rs.getString("hora_cita");
                informacion[4] = rs.getString("doctor");
                model.addRow(informacion);
            }
            tabla_citas.setModel(model);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    public menuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        mostrar_citashoy();

        this.setTitle("Challenge Java 2EE Kosmos");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_citas = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tabla_citas = new JTable()
        {
            public boolean isCellEditable(int row, int column)
            {
                for (int i = 0; i< tabla_citas.getRowCount();i++)
                {
                    if(row==i)
                    {
                        return false;
                    }
                }
                return true;
            }
        };
        tabla_citas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "", "", "", "", ""
            }
        ));
        tabla_citas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_citasMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabla_citas);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 650, 190));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jButton1.setBackground(new java.awt.Color(204, 204, 204));
        jButton1.setBorderPainted(false);
        jButton1.setLabel("Pacientes Registrados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setBorderPainted(false);
        jButton3.setLabel("Agendar cita");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(204, 204, 204));
        jButton4.setText("Doctores Registrados");
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 330));

        jButton8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton8.setText("Consultas de hoy");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        jButton7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton7.setText("Todas las citas");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Buscar paciente:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 120, 30));

        txt_search.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_searchKeyPressed(evt);
            }
        });
        jPanel1.add(txt_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, 230, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        listaPacientes s = new listaPacientes();
        s.setVisible(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        String Query = "SELECT * FROM citas";
        model = new DefaultTableModel(null, Campos_tabla);
        try {
            Statement st = (Statement) conectar.createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {
                informacion[0] = rs.getString("turno");
                informacion[1] = rs.getString("cliente");
                informacion[2] = rs.getString("fecha_cita");
                informacion[3] = rs.getString("hora_cita");
                informacion[4] = rs.getString("doctor");
                model.addRow(informacion);
            }
            tabla_citas.setModel(model);
        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        mostrar_citashoy();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void tabla_citasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_citasMouseClicked
        int columna = tabla_citas.getSelectedRow();
        if (evt.getClickCount() == 2) {

            registrarCita addc = new registrarCita();
            addc.setVisible(true);

            registrarCita.txt_turn.setText(tabla_citas.getModel().getValueAt(columna, 0).toString());
            registrarCita.txt_client.setText(tabla_citas.getModel().getValueAt(columna, 1).toString());

//---------------------------------------------------------------------------
            ////importamos librerias para darle formato a nuestra fecha
            SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yy-MM-dd");
            String fecha = tabla_citas.getModel().getValueAt(columna, 2).toString();
            Date dato = null;//date es un libreria
            try {
                dato = formatoDelTexto.parse(fecha);
            } catch (ParseException ex) {
                System.out.println(ex);
            }
            registrarCita.jc_date.setDate(dato);
//-------------------------------------------------------------------------------------------
            registrarCita.combo_hora.setSelectedItem(tabla_citas.getModel().getValueAt(columna, 3).toString());

            registrarCita.btn_save.setEnabled(false);
        }
    }//GEN-LAST:event_tabla_citasMouseClicked

    private void txt_searchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyPressed
        //Query para para realizar consulta por medio LIKE...
        String Query = "SELECT * FROM citas WHERE cliente LIKE '%" + txt_search.getText() + "%' ";
        model = new DefaultTableModel(null, Campos_tabla);

        try {
            Statement st = (Statement) conectar.createStatement();
            ResultSet rs = st.executeQuery(Query);

            while (rs.next()) {
                informacion[0] = rs.getString("turno");
                informacion[1] = rs.getString("cliente");
                informacion[2] = rs.getString("fecha_cita");
                informacion[3] = rs.getString("hora_cita");
                informacion[4] = rs.getString("doctor");
                model.addRow(informacion);
            }
            tabla_citas.setModel(model);
        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_txt_searchKeyPressed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Instanciamos la interfaz para posteriormente mostrarla
        registrarCita cita = new registrarCita();
        //Mostramos la interfaz
        cita.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        listaDoctores s = new listaDoctores();
        s.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabla_citas;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
