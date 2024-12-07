package Service;

import java.awt.HeadlessException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Repository.citasRepository;
import Repository.citasDController;

public class registrarCita extends javax.swing.JFrame {

    // Hacemos conexion a MYSQL
    citasRepository c = new citasRepository();
    Connection conectar = c.obtener_conexion();


    public registrarCita() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_save = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_turn = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_client = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jc_date = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        combo_hora = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txt_doctor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(252, 243, 207));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar Cita", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 18))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_save.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_save.setText("Agregar");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        jPanel1.add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Turno:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 40, -1, -1));
        jPanel1.add(txt_turn, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 36, 82, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Cliente:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 76, -1, -1));

        txt_client.setEditable(false);
        txt_client.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.add(txt_client, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 200, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Fecha Cita:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 108, -1, 29));

        jc_date.setBackground(new java.awt.Color(255, 255, 255));
        jc_date.setDateFormatString("yyyy/MM/dd");
        jPanel1.add(jc_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(137, 108, 198, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Doctor:");
        jLabel4.setToolTipText("");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 185, -1, 35));

        combo_hora.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        combo_hora.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "08:00:00", "09:00:00", "10:00:00", "11:00:00", "12:00:00", "13:00:00", "14:00:00", "15:00:00", "16:00:00" }));
        jPanel1.add(combo_hora, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 190, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Hora Cita:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 150, -1, 29));

        btn_cancel.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btn_cancel.setText("Cancelar");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        jButton1.setBackground(new java.awt.Color(252, 243, 207));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/buscar.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 30, 30));

        jButton3.setBackground(new java.awt.Color(252, 243, 207));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/buscar.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 30, 30));

        txt_doctor.setEditable(false);
        txt_doctor.setBackground(new java.awt.Color(255, 255, 255));
        txt_doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_doctorActionPerformed(evt);
            }
        });
        jPanel1.add(txt_doctor, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 200, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed

        //Aquí guardamos la cita
        try {
            String query = "{call maximo_cita_dia(?)}";
            CallableStatement st = conectar.prepareCall(query);
            ResultSet rs = st.executeQuery();
            st.setString(1, ((JTextField) jc_date.getDateEditor().getUiComponent()).getText());
            while (rs.next()) {

                String num_citas = rs.getString("total_citas");
                System.out.println(rs.getString("total_citas"));
                if (Integer.parseInt(num_citas) < 2) {
                    JOptionPane.showMessageDialog(null, "Error");
                } else {
                    JOptionPane.showMessageDialog(null, "Error else");
                }
            }

        } catch (SQLException e) {
            System.out.println(e);
        }

        //------------------------------------------------------------------------
        try {
            CallableStatement insert = conectar.prepareCall("{call agregar_cita(?,?,?,?,?)}");
            insert.setString(1, txt_turn.getText());
            insert.setString(2, txt_client.getText());
            insert.setString(3, ((JTextField) jc_date.getDateEditor().getUiComponent()).getText());
            insert.setString(4, combo_hora.getSelectedItem().toString());
            insert.setString(5, txt_doctor.getText());

            //ejecutamos query
            insert.execute();
            //presentamos mensaje de registro, lo llamamos de la clase datos
            citasDController d = new citasDController();
            d.capturar_datos();
            d.mostrar_datos();
            this.dispose();

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR, INTENTE NUEVAMENTE!!!\n" + e);
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        vistaPacientes mc = new vistaPacientes();
        mc.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        vistaDoctores mc = new vistaDoctores();
        mc.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_doctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_doctorActionPerformed

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
            java.util.logging.Logger.getLogger(registrarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrarCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    public static javax.swing.JButton btn_save;
    public static javax.swing.JComboBox<String> combo_hora;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    public static com.toedter.calendar.JDateChooser jc_date;
    public static javax.swing.JTextField txt_client;
    public static javax.swing.JTextField txt_doctor;
    public static javax.swing.JTextField txt_turn;
    // End of variables declaration//GEN-END:variables
}
