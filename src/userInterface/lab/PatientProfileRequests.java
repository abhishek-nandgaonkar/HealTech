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
package userInterface.lab;

import baseClasses.patient.Patient;
import baseClasses.userAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import workQueue.LabWorkRequest;
import workQueue.WorkQueue;
import workQueue.WorkRequest;

/**
 *
 * @author Abhishek
 */
public class PatientProfileRequests extends javax.swing.JPanel {

    /**
     * Creates new form Labs
     */
    WorkQueue workQueue;
    UserAccount userAccount;
    JPanel userProcessContainer;
    private Patient patient;
    private LabWorkRequest labWorkRequest;
    
    public PatientProfileRequests(WorkQueue workQueue, UserAccount userAccount,  JPanel userProcessContainer) {
        initComponents();
        this.workQueue = workQueue;
        this.userAccount = userAccount;
        this.userProcessContainer = userProcessContainer;
        //btnBuildPatientProfile.setEnabled(false);
        populateWorkRequestTable();
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
        lblName1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDrugDetails = new javax.swing.JTable();
        btnAssignToMe = new javax.swing.JButton();
        btnBuildPatientProfile = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baseClasses/healtech logo.PNG"))); // NOI18N

        lblName1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblName1.setForeground(new java.awt.Color(0, 153, 51));
        lblName1.setText("Patient Profile Requests");

        tblDrugDetails.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblDrugDetails.setForeground(new java.awt.Color(0, 204, 51));
        tblDrugDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug", "Sender", "Message", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDrugDetails);
        if (tblDrugDetails.getColumnModel().getColumnCount() > 0) {
            tblDrugDetails.getColumnModel().getColumn(0).setResizable(false);
            tblDrugDetails.getColumnModel().getColumn(1).setResizable(false);
            tblDrugDetails.getColumnModel().getColumn(2).setResizable(false);
            tblDrugDetails.getColumnModel().getColumn(3).setResizable(false);
        }

        btnAssignToMe.setBackground(new java.awt.Color(255, 255, 255));
        btnAssignToMe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAssignToMe.setForeground(new java.awt.Color(0, 153, 0));
        btnAssignToMe.setText("Assign To Me");
        btnAssignToMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignToMeActionPerformed(evt);
            }
        });

        btnBuildPatientProfile.setBackground(new java.awt.Color(255, 255, 255));
        btnBuildPatientProfile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBuildPatientProfile.setForeground(new java.awt.Color(0, 153, 0));
        btnBuildPatientProfile.setText("Build Patient Profile");
        btnBuildPatientProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuildPatientProfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 1415, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAssignToMe, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                    .addComponent(btnBuildPatientProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(366, 366, 366))
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(lblName1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAssignToMe)
                        .addGap(68, 68, 68)
                        .addComponent(btnBuildPatientProfile)))
                .addGap(11, 11, 11)
                .addComponent(jLabel1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToMeActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDrugDetails.getSelectedRow();
        
        if(selectedRow > -1)
        {
             labWorkRequest = (LabWorkRequest) tblDrugDetails.getValueAt(selectedRow, 0);
            labWorkRequest.setReceiver(userAccount);
            labWorkRequest.setStatus("Pending");
            patient = labWorkRequest.getPatient();
            System.out.println("Printing from Patient Profile Requests" + patient);
            System.out.println(labWorkRequest.getPatient());
        }
        
        populateWorkRequestTable();
    }//GEN-LAST:event_btnAssignToMeActionPerformed

    private void btnBuildPatientProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuildPatientProfileActionPerformed
        // TODO add your handling code here:
        if(labWorkRequest.getStatus().equals("Pending")){
        
        userProcessContainer.setLayout(new CardLayout());
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add(new BuildPatientProfile( patient, userProcessContainer, labWorkRequest));
        layout.next(userProcessContainer);
        }
        else
            JOptionPane.showMessageDialog(this, "Please assign the lab request before working on it", "Error", JOptionPane.ERROR_MESSAGE);
        
    }//GEN-LAST:event_btnBuildPatientProfileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssignToMe;
    private javax.swing.JButton btnBuildPatientProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName1;
    private javax.swing.JTable tblDrugDetails;
    // End of variables declaration//GEN-END:variables

    private void populateWorkRequestTable()
    {
        //LabWorkRequest labWorkRequest;
        LabWorkRequest labWorkRequest =null;
        DefaultTableModel dtm = (DefaultTableModel) tblDrugDetails.getModel();
        dtm.setRowCount(0);
        System.out.println("Printing from the PaitentPRofiel Requests");
        System.out.println("Work queue length: " + workQueue.getWorkRequestList().size());
        for(WorkRequest wr: workQueue.getWorkRequestList())
        {
            if((wr.getClass() == LabWorkRequest.class))
            {
                labWorkRequest = (LabWorkRequest) wr;
                Object[] row = new Object[4];
                row[0] = labWorkRequest;
                row[1] = labWorkRequest.getSender();
                row[2] = labWorkRequest.getMessage();
                row[3] = labWorkRequest.getStatus();
                dtm.addRow(row);
                
                
            }
        }
    }
}