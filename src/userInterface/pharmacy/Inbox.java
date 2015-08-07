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
package userInterface.pharmacy;

import userInterface.pharmacy.*;
import userInterface.pharmacy.*;
import baseClasses.userAccount.UserAccount;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import workQueue.DoctorMail;
import workQueue.Mail;
import workQueue.PharmacyMail;
import workQueue.WorkQueue;
import workQueue.WorkRequest;

/**
 *
 * @author Abhishek
 */
public class Inbox extends javax.swing.JPanel {

    /**
     * Creates new form Inbox
     */
    WorkQueue workQueue;
    
    public Inbox(WorkQueue workQueue)
    {
        initComponents();
        this.workQueue = workQueue;
        
        populateInbox();
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
        lblName2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInbox = new javax.swing.JTable();
        btnOpenMail = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baseClasses/healtech logo.PNG"))); // NOI18N

        lblName2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblName2.setForeground(new java.awt.Color(0, 153, 51));
        lblName2.setText("Inbox");

        tblInbox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblInbox.setForeground(new java.awt.Color(0, 153, 51));
        tblInbox.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sender", "Date", "Subject", "Body"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jScrollPane1.setViewportView(tblInbox);
        if (tblInbox.getColumnModel().getColumnCount() > 0) {
            tblInbox.getColumnModel().getColumn(0).setResizable(false);
            tblInbox.getColumnModel().getColumn(1).setResizable(false);
            tblInbox.getColumnModel().getColumn(2).setResizable(false);
            tblInbox.getColumnModel().getColumn(3).setResizable(false);
        }

        btnOpenMail.setBackground(new java.awt.Color(255, 255, 255));
        btnOpenMail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnOpenMail.setForeground(new java.awt.Color(0, 153, 0));
        btnOpenMail.setText("Open Mail");
        btnOpenMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpenMailActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(556, 556, 556)
                .addComponent(btnOpenMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(563, 563, 563)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(671, 671, 671)
                        .addComponent(lblName2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblName2)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnOpenMail)
                        .addGap(35, 35, 35))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnOpenMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpenMailActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblInbox.getSelectedRow();
         if (selectedRow > -1) {
        Mail mail =(Mail) tblInbox.getValueAt(selectedRow, 0);
        
     JFrame frame = new JFrame("Mail from " + mail.getSender().getUsername());
        frame.setSize(1200,1000);
        frame.setVisible(true);
        
        
        
        if(selectedRow > -1)
        {
            frame.add(new userInterface.patient.ViewMail((Mail) tblInbox.getValueAt(selectedRow, 0)));
        }
         } else {
            JOptionPane.showMessageDialog(this, "Please select a value to proceed", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnOpenMailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOpenMail;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JTable tblInbox;
    // End of variables declaration//GEN-END:variables

    private void populateInbox()
    {
        DefaultTableModel dtm = (DefaultTableModel) tblInbox.getModel();
        dtm.setRowCount(0);
        PharmacyMail pharmacyMail = null;
        
        for(WorkRequest workRequest: workQueue.getWorkRequestList())
        {
            if(workRequest.getClass() == PharmacyMail.class)
            {
                pharmacyMail = (PharmacyMail) workRequest;
                Object[] row = new Object[4];
                row[0] = pharmacyMail.getSender();
                row[1] = pharmacyMail.getRequestDate();
                row[2] = pharmacyMail.getSubject();
                row[3] = pharmacyMail.getMessage();
                
                dtm.addRow(row);
            }
        }
        
    }
}
