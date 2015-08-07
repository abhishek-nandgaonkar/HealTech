/*
 * Copyright (C) 2014 Abhishek
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package userInterface.encounter;

import baseClasses.doctor.Doctor;
import baseClasses.patient.Patient;

/**
 *
 * @author Abhishek
 */
public class Encounter extends javax.swing.JPanel {

    /**
     * Creates new form Encounter
     */
    private Doctor doctor;
    private Patient patient;
    
    public Encounter(Doctor doctor, Patient patient) {
        initComponents();
        this.doctor = doctor;
        this.patient = patient;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnFindPatients = new javax.swing.JButton();
        btnManagePatients = new javax.swing.JButton();
        btnManagePatients1 = new javax.swing.JButton();
        btnUpdatePatientProfile = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setDividerLocation(300);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baseClasses/healtech logo.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 1118, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 708, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jSplitPane1.setRightComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baseClasses/healtech small.png"))); // NOI18N

        btnFindPatients.setBackground(new java.awt.Color(255, 255, 255));
        btnFindPatients.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFindPatients.setForeground(new java.awt.Color(0, 153, 0));
        btnFindPatients.setText("Request Lab Test");
        btnFindPatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindPatientsActionPerformed(evt);
            }
        });

        btnManagePatients.setBackground(new java.awt.Color(255, 255, 255));
        btnManagePatients.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnManagePatients.setForeground(new java.awt.Color(0, 153, 0));
        btnManagePatients.setText("Add Notes");
        btnManagePatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePatientsActionPerformed(evt);
            }
        });

        btnManagePatients1.setBackground(new java.awt.Color(255, 255, 255));
        btnManagePatients1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnManagePatients1.setForeground(new java.awt.Color(0, 153, 0));
        btnManagePatients1.setText("Prescription");
        btnManagePatients1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePatients1ActionPerformed(evt);
            }
        });

        btnUpdatePatientProfile.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdatePatientProfile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdatePatientProfile.setForeground(new java.awt.Color(0, 153, 0));
        btnUpdatePatientProfile.setText("Update Patient Profile");
        btnUpdatePatientProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePatientProfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFindPatients, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManagePatients, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnManagePatients1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUpdatePatientProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnFindPatients)
                .addGap(40, 40, 40)
                .addComponent(btnManagePatients)
                .addGap(43, 43, 43)
                .addComponent(btnManagePatients1)
                .addGap(44, 44, 44)
                .addComponent(btnUpdatePatientProfile)
                .addGap(0, 454, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindPatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindPatientsActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnFindPatientsActionPerformed

    private void btnManagePatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePatientsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManagePatientsActionPerformed

    private void btnManagePatients1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePatients1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnManagePatients1ActionPerformed

    private void btnUpdatePatientProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePatientProfileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdatePatientProfileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFindPatients;
    private javax.swing.JButton btnManagePatients;
    private javax.swing.JButton btnManagePatients1;
    private javax.swing.JButton btnUpdatePatientProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}