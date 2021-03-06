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
package userInterface.FDA;

import baseClasses.userAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import workQueue.REMApprovalWorkRequest;
import workQueue.REMApprovalWorkRequest;
import workQueue.WorkQueue;
import workQueue.WorkRequest;

/**
 *
 * @author Abhishek
 */
public class REMApprovals extends javax.swing.JPanel {

    /**
     * Creates new form REMApprovals
     */
    WorkQueue workQueue;
    UserAccount userAccount;

    public REMApprovals(WorkQueue workQueue, UserAccount userAccount) {
        initComponents();
        this.workQueue = workQueue;
        this.userAccount = userAccount;
        txtResult.setEnabled(false);
        btnApprove.setEnabled(false);
        btnReject.setEnabled(false);
        btnAddNotes.setEnabled(false);
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
        btnApprove = new javax.swing.JButton();
        btnReject = new javax.swing.JButton();
        btnAddNotes = new javax.swing.JButton();
        txtResult = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baseClasses/healtech logo.PNG"))); // NOI18N

        lblName1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblName1.setForeground(new java.awt.Color(0, 153, 51));
        lblName1.setText("REM Approvals");

        tblDrugDetails.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblDrugDetails.setForeground(new java.awt.Color(0, 204, 51));
        tblDrugDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine", "Sender", "REM", "Status"
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

        btnApprove.setBackground(new java.awt.Color(255, 255, 255));
        btnApprove.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(0, 153, 0));
        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        btnReject.setBackground(new java.awt.Color(255, 255, 255));
        btnReject.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReject.setForeground(new java.awt.Color(0, 153, 0));
        btnReject.setText("Reject");
        btnReject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRejectActionPerformed(evt);
            }
        });

        btnAddNotes.setBackground(new java.awt.Color(255, 255, 255));
        btnAddNotes.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddNotes.setForeground(new java.awt.Color(0, 153, 0));
        btnAddNotes.setText("Add Notes");
        btnAddNotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNotesActionPerformed(evt);
            }
        });

        txtResult.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 1415, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(402, 402, 402)
                        .addComponent(lblName1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAssignToMe, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addComponent(btnApprove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReject, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnAddNotes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtResult))))
                .addGap(366, 366, 366))
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
                        .addGap(67, 67, 67)
                        .addComponent(btnApprove)
                        .addGap(67, 67, 67)
                        .addComponent(btnReject)
                        .addGap(87, 87, 87)
                        .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnAddNotes)))
                .addGap(11, 11, 11)
                .addComponent(jLabel1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAssignToMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignToMeActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDrugDetails.getSelectedRow();

        if (selectedRow > -1) {
            REMApprovalWorkRequest remApprovalWorkRequest = (REMApprovalWorkRequest) tblDrugDetails.getValueAt(selectedRow, 0);
            remApprovalWorkRequest.setReceiver(userAccount);
            remApprovalWorkRequest.setStatus("Pending");
        }
        txtResult.setEnabled(true);
        btnApprove.setEnabled(true);
        btnReject.setEnabled(true);
        btnAddNotes.setEnabled(true);
        JOptionPane.showMessageDialog(this, "You have assigned this request to yourself", "Success", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAssignToMeActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDrugDetails.getSelectedRow();

        if (selectedRow > -1) {
            REMApprovalWorkRequest remApprovalWorkRequest = (REMApprovalWorkRequest) tblDrugDetails.getValueAt(selectedRow, 0);
            remApprovalWorkRequest.setStatus("Approved");
            populateWorkRequestTable();

            JOptionPane.showMessageDialog(this, "The request has been approved", "Success", JOptionPane.INFORMATION_MESSAGE);

        } else {
            JOptionPane.showMessageDialog(this,
                    "Please select a record to proceed", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnRejectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRejectActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDrugDetails.getSelectedRow();

        if (selectedRow > -1) {
            REMApprovalWorkRequest remApprovalWorkRequest = (REMApprovalWorkRequest) tblDrugDetails.getValueAt(selectedRow, 0);
            remApprovalWorkRequest.setStatus("Rejected");
            populateWorkRequestTable();

            JOptionPane.showMessageDialog(this, "The request has been rejected", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Please select a record to proceed", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRejectActionPerformed

    private void btnAddNotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNotesActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDrugDetails.getSelectedRow();

        if (selectedRow > -1) {
            REMApprovalWorkRequest remApprovalWorkRequest = (REMApprovalWorkRequest) tblDrugDetails.getValueAt(selectedRow, 0);
            remApprovalWorkRequest.setTestResult(txtResult.getText());
        
        JOptionPane.showMessageDialog(this, "Note added successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(this, "Please select a record to proceed", "Error", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_btnAddNotesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNotes;
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnAssignToMe;
    private javax.swing.JButton btnReject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName1;
    private javax.swing.JTable tblDrugDetails;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables

    private void populateWorkRequestTable() {
        //REMApprovalWorkRequest remApprovalWorkRequest;
        REMApprovalWorkRequest remApprovalWorkRequest;
        DefaultTableModel dtm = (DefaultTableModel) tblDrugDetails.getModel();
        dtm.setRowCount(0);

        for (WorkRequest wr : workQueue.getWorkRequestList()) {
            if ((wr.getClass() == REMApprovalWorkRequest.class)) {
                remApprovalWorkRequest = (REMApprovalWorkRequest) wr;
                Object[] row = new Object[4];
                row[0] = remApprovalWorkRequest;
                row[1] = remApprovalWorkRequest.getSender();
                row[2] = remApprovalWorkRequest.getMessage();
                row[3] = remApprovalWorkRequest.getStatus();

                dtm.addRow(row);

            }
        }
    }
}
