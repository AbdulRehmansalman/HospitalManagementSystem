/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HospitalMangMent;

import javax.swing.JOptionPane;
import connection.Connecton;
import java.sql.*;

/**
 *
 * @author Dell
 */
public class patientRecord extends javax.swing.JFrame {

    /**
     * Creates new form patientRecord
     */
    public patientRecord() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        Close = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pid = new javax.swing.JTextField();
        pcontact = new javax.swing.JTextField();
        page = new javax.swing.JTextField();
        pname = new javax.swing.JTextField();
        gcombo = new javax.swing.JComboBox();
        pblood = new javax.swing.JTextField();
        paddress = new javax.swing.JTextField();
        pmajor = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        Save = new javax.swing.JLabel();

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HMS ICON/HMS ICON/add new patient background.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(280, 150));
        setUndecorated(true);
        setSize(new java.awt.Dimension(780, 550));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Close.setBackground(new java.awt.Color(102, 102, 102));
        Close.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HMS ICON/HMS ICON/Close.png"))); // NOI18N
        Close.setText("Close");
        Close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseActionPerformed(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(637, 436, 100, 45));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("PatientId:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 29, -1, -1));

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 71, -1, -1));

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contact No:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 113, -1, -1));

        jLabel4.setBackground(new java.awt.Color(102, 102, 102));
        jLabel4.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Age:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 155, 50, -1));

        jLabel5.setBackground(new java.awt.Color(102, 102, 102));
        jLabel5.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Gender:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 206, -1, -1));

        jLabel6.setBackground(new java.awt.Color(102, 102, 102));
        jLabel6.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("BloodGroup:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 249, -1, -1));

        jLabel7.setBackground(new java.awt.Color(102, 102, 102));
        jLabel7.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Address:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 298, -1, -1));

        jLabel8.setBackground(new java.awt.Color(102, 102, 102));
        jLabel8.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Any Major Disese Suffered Earlier");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 353, 272, -1));

        pid.setBackground(new java.awt.Color(255, 255, 255));
        pid.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(pid, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 27, 119, -1));

        pcontact.setBackground(new java.awt.Color(255, 255, 255));
        pcontact.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(pcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 111, 119, -1));

        page.setBackground(new java.awt.Color(255, 255, 255));
        page.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(page, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 153, 119, -1));

        pname.setBackground(new java.awt.Color(255, 255, 255));
        pname.setForeground(new java.awt.Color(0, 0, 0));
        pname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pnameActionPerformed(evt);
            }
        });
        getContentPane().add(pname, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 69, 119, -1));

        gcombo.setBackground(new java.awt.Color(255, 255, 255));
        gcombo.setForeground(new java.awt.Color(204, 204, 204));
        gcombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female", "Other", " ", " " }));
        gcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gcomboActionPerformed(evt);
            }
        });
        getContentPane().add(gcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 203, 119, -1));

        pblood.setBackground(new java.awt.Color(255, 255, 255));
        pblood.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(pblood, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 250, 119, -1));

        paddress.setBackground(new java.awt.Color(255, 255, 255));
        paddress.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(paddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(527, 296, 119, -1));

        pmajor.setBackground(new java.awt.Color(255, 255, 255));
        pmajor.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(pmajor, new org.netbeans.lib.awtextra.AbsoluteConstraints(197, 391, 324, -1));

        btnsave.setFont(new java.awt.Font("DialogInput", 1, 14)); // NOI18N
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HMS ICON/HMS ICON/save-icon--1.png"))); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 100, -1));

        Save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HMS ICON/HMS ICON/add new patient background.jpg"))); // NOI18N
        Save.setText("jLabel10");
        getContentPane().add(Save, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void gcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gcomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gcomboActionPerformed

    private void pnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pnameActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
       String patid =  pid.getText();
        String patname = pname.getText();
        String contact = pcontact.getText();
        String age = page.getText();
        String gender = (String) gcombo.getSelectedItem();
        String address = paddress.getText();
        String bloodgroup = pblood.getText();
        String majordisese = pmajor.getText();
        
        try {
            Connection con = Connecton.getCon();
            PreparedStatement pst = con.prepareStatement("insert into hospital Values(?,?,?,?,?,?,?,?)");
            pst.setString(1,patid);
            pst.setString(2, patname);
            pst.setString(3, contact);
            pst.setString(4, age);
            pst.setString(5, gender);
            pst.setString(6, address);
            pst.setString(7, bloodgroup);
            pst.setString(8, majordisese);
            pst.executeUpdate();

            JOptionPane.showMessageDialog(this, " Data Inserted Successfully");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, " Data Inserted UnSuccessfully");

            e.printStackTrace();
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void CloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseActionPerformed
        int s = JOptionPane.showConfirmDialog(null, "Did you really close the application", "Select", JOptionPane.YES_NO_OPTION);

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
            java.util.logging.Logger.getLogger(patientRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(patientRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(patientRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(patientRecord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new patientRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Close;
    private javax.swing.JLabel Save;
    private javax.swing.JButton btnsave;
    private javax.swing.JComboBox gcombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField paddress;
    private javax.swing.JTextField page;
    private javax.swing.JTextField pblood;
    private javax.swing.JTextField pcontact;
    private javax.swing.JTextField pid;
    private javax.swing.JTextField pmajor;
    private javax.swing.JTextField pname;
    // End of variables declaration//GEN-END:variables
}
