/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalMangMent;

import javax.swing.JOptionPane;
import java.sql.*;
import connection.Connecton;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Dell
 */
public class diagnosis extends javax.swing.JFrame {

    /**
     * Creates new form diagnosis
     */
    public diagnosis() {
        initComponents();
        error.setVisible(false);
        combo.setVisible(false);
        crequired.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Search = new javax.swing.JButton();
        pid = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        error = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        wardreqq = new javax.swing.JLabel();
        crequired = new javax.swing.JLabel();
        wardreq = new javax.swing.JCheckBox();
        combo = new javax.swing.JComboBox();
        symptoms = new javax.swing.JTextField();
        diagnosis = new javax.swing.JTextField();
        medicine = new javax.swing.JTextField();
        save = new javax.swing.JButton();
        Close = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 150));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Patient ID:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 58, -1, 32));

        Search.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        Search.setForeground(new java.awt.Color(153, 255, 255));
        Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HMS ICON/HMS ICON/search.png"))); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 56, -1, 30));

        pid.setBackground(new java.awt.Color(204, 204, 204));
        pid.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(286, 56, 158, 30));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 153, 153));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 145, 770, 60));

        error.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        error.setForeground(new java.awt.Color(255, 51, 51));
        error.setText("Patient Id  Does Not Exist:)");
        getContentPane().add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 107, 233, -1));

        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Symptoms:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Diagnosis:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Medicines:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        wardreqq.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        wardreqq.setForeground(new java.awt.Color(0, 0, 0));
        wardreqq.setText("Ward Required:");
        getContentPane().add(wardreqq, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, -1, -1));

        crequired.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        crequired.setForeground(new java.awt.Color(102, 102, 102));
        crequired.setText("Ward Type:");
        getContentPane().add(crequired, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, 110, -1));

        wardreq.setBackground(new java.awt.Color(255, 255, 255));
        wardreq.setForeground(new java.awt.Color(51, 51, 51));
        wardreq.setText("Yes");
        wardreq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wardreqActionPerformed(evt);
            }
        });
        getContentPane().add(wardreq, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, -1, -1));

        combo.setBackground(new java.awt.Color(204, 204, 204));
        combo.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        combo.setForeground(new java.awt.Color(255, 255, 255));
        combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "General Ward", "Public Ward", "Private Ward", " " }));
        getContentPane().add(combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 136, -1));

        symptoms.setBackground(new java.awt.Color(204, 204, 204));
        symptoms.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(symptoms, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 139, 30));

        diagnosis.setBackground(new java.awt.Color(204, 204, 204));
        diagnosis.setForeground(new java.awt.Color(255, 255, 255));
        diagnosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagnosisActionPerformed(evt);
            }
        });
        getContentPane().add(diagnosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 139, 30));

        medicine.setBackground(new java.awt.Color(204, 204, 204));
        medicine.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(medicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, 139, 30));

        save.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        save.setForeground(new java.awt.Color(153, 255, 255));
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HMS ICON/HMS ICON/save-icon--1.png"))); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 100, 40));

        Close.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        Close.setForeground(new java.awt.Color(153, 255, 255));
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HMS ICON/HMS ICON/Close.png"))); // NOI18N
        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(646, 436, 100, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HMS ICON/HMS ICON/add new patient background.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        public int flag = 1;
    private void diagnosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagnosisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diagnosisActionPerformed

    private void wardreqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wardreqActionPerformed
        if (wardreq.isSelected()) {
            combo.setVisible(true);
            crequired.setVisible(true);
        } else {
            combo.setVisible(false);
            crequired.setVisible(false);
        }
    }//GEN-LAST:event_wardreqActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        if (flag == 1) {
            String patid = pid.getText();
            String Symptoms = symptoms.getText();
            String Diagnosis = diagnosis.getText();
            String Medicines = medicine.getText();
            String wardrequired;
            String wardtype;

            if (wardreq.isSelected()) {
                wardrequired = "true";
                wardtype = (String) combo.getSelectedItem();

            } else {
                wardrequired = "false";
                wardtype = "";

            }
            try {
                Connection con = Connecton.getCon();
                PreparedStatement pst = con.prepareStatement("Insert into diagnosis values(?,?,?,?,?,?)");
                pst.setString(1, patid);
                pst.setString(2, Symptoms);
                pst.setString(3, Diagnosis);
                pst.setString(4, Medicines);
                pst.setString(5, wardrequired);
                pst.setString(6, wardtype);
                pst.executeUpdate();

                JOptionPane.showMessageDialog(this, "Result Updated SuccesFully");

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            flag=0;
            JOptionPane.showMessageDialog(this, "Patient id Not Found");
        }

    }//GEN-LAST:event_saveActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        String patientid = pid.getText();
        try {
            Connection con = Connecton.getCon();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("Select * from hospital where patid='" + patientid + "'");
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            if (!rs.isFirst()) {
                error.setVisible(true);
              
            } else {
                pid.setEditable(false);
                error.setVisible(false);
                flag = 1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
         int s = JOptionPane.showConfirmDialog(null, "Did you really want to go to the login page", "Select", JOptionPane.YES_NO_OPTION);

        if (s == 0) {
            new login().setVisible(true);
        }
    }//GEN-LAST:event_CloseActionPerformed

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
            java.util.logging.Logger.getLogger(diagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(diagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(diagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(diagnosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new diagnosis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JButton Search;
    private javax.swing.JComboBox combo;
    private javax.swing.JLabel crequired;
    private javax.swing.JTextField diagnosis;
    private javax.swing.JLabel error;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField medicine;
    private javax.swing.JTextField pid;
    private javax.swing.JButton save;
    private javax.swing.JTextField symptoms;
    private javax.swing.JCheckBox wardreq;
    private javax.swing.JLabel wardreqq;
    // End of variables declaration//GEN-END:variables
}