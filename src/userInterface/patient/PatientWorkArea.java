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
package userInterface.patient;

import baseClasses.network.Network;
import baseClasses.patient.Patient;
import baseClasses.userAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userInterface.doctor.ViewPatientProfiles;

/**
 *
 * @author Abhishek
 */
public class PatientWorkArea extends javax.swing.JPanel {

    /**
     * Creates new form PatientWorkArea
     */
    private Network internationalNetwork;
    private UserAccount userAccount;
    
    public PatientWorkArea(Network internationalNetwork, UserAccount userAccount) {
        initComponents();
        this.internationalNetwork = internationalNetwork;
        this.userAccount = userAccount;
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
        btnComposeNewMail = new javax.swing.JButton();
        btnCheckMails = new javax.swing.JButton();
        btnViewProfile = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setDividerLocation(300);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baseClasses/healtech logo.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 921, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 600, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jSplitPane1.setRightComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baseClasses/healtech small.png"))); // NOI18N

        btnComposeNewMail.setBackground(new java.awt.Color(255, 255, 255));
        btnComposeNewMail.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnComposeNewMail.setForeground(new java.awt.Color(0, 153, 0));
        btnComposeNewMail.setText("Compose Mail");
        btnComposeNewMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComposeNewMailActionPerformed(evt);
            }
        });

        btnCheckMails.setBackground(new java.awt.Color(255, 255, 255));
        btnCheckMails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCheckMails.setForeground(new java.awt.Color(0, 153, 0));
        btnCheckMails.setText("Inbox");
        btnCheckMails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckMailsActionPerformed(evt);
            }
        });

        btnViewProfile.setBackground(new java.awt.Color(255, 255, 255));
        btnViewProfile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnViewProfile.setForeground(new java.awt.Color(0, 153, 0));
        btnViewProfile.setText("View Profile");
        btnViewProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewProfileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
            .addComponent(btnComposeNewMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCheckMails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnViewProfile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(btnComposeNewMail)
                .addGap(36, 36, 36)
                .addComponent(btnCheckMails)
                .addGap(27, 27, 27)
                .addComponent(btnViewProfile)
                .addGap(0, 401, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnComposeNewMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComposeNewMailActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new ComposeMail(internationalNetwork, userAccount));
        

    }//GEN-LAST:event_btnComposeNewMailActionPerformed

    private void btnCheckMailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckMailsActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new Inbox(userAccount.getWorkQueue()));
                
    }//GEN-LAST:event_btnCheckMailsActionPerformed

    private void btnViewProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewProfileActionPerformed
        // TODO add your handling code here:
        JPanel userProcessContainer = new JPanel();
         userProcessContainer.setLayout(new CardLayout());
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add(new ViewPatientProfiles((Patient)userAccount.getPerson(),userProcessContainer));
        layout.next(userProcessContainer);
        
        jSplitPane1.setRightComponent(userProcessContainer);
        
        
        
        
        
    }//GEN-LAST:event_btnViewProfileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCheckMails;
    private javax.swing.JButton btnComposeNewMail;
    private javax.swing.JButton btnViewProfile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
