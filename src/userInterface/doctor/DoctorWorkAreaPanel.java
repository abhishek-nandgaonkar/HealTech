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
package userInterface.doctor;

import baseClasses.enterprise.CityEnterprise;
import baseClasses.enterprise.Enterprise;
import baseClasses.enterprise.HospitalEnterprise;
import baseClasses.network.Network;
import baseClasses.organization.DoctorOrganization;
import baseClasses.organization.Organization;
import baseClasses.userAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Abhishek
 */
public class DoctorWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorWorkAreaPanel
     */
    private Network internationalNetwork;
    private CityEnterprise inCityEnterprise;
    private UserAccount userAccount;
    private Organization inOrganization;
    private Enterprise inEnterprise;
    private HospitalEnterprise hospitalEnterprise;
    private DoctorOrganization doctorOrganization;
    
    public DoctorWorkAreaPanel(Network internationalNetwork, CityEnterprise inCityEnterprise, Organization inOrganization, UserAccount userAccount, Enterprise inEnterprise) {
        initComponents();
        this.internationalNetwork = internationalNetwork;
        this.inCityEnterprise = inCityEnterprise;
        this.inOrganization= inOrganization;
        this.userAccount = userAccount;
        this.inEnterprise = inEnterprise;
        
        if(inEnterprise.getClass() == HospitalEnterprise.class)
        {
            hospitalEnterprise= (HospitalEnterprise) inEnterprise;
        }
        
        if(inOrganization.getClass() == DoctorOrganization.class)
        {
            doctorOrganization= (DoctorOrganization) inOrganization;
        }
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
        btnFetchGlobalPatientProfile = new javax.swing.JButton();
        btnManagePatients = new javax.swing.JButton();
        btnBeginPatientInteraction = new javax.swing.JButton();
        btnPatientProfileStatus = new javax.swing.JButton();
        btnComposeNewMail = new javax.swing.JButton();
        btnCheckMails = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1515, 820));
        setLayout(new java.awt.BorderLayout());

        jSplitPane1.setDividerLocation(300);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baseClasses/healtech logo.PNG"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 1143, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(739, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        jSplitPane1.setRightComponent(jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baseClasses/healtech small.png"))); // NOI18N

        btnFetchGlobalPatientProfile.setBackground(new java.awt.Color(255, 255, 255));
        btnFetchGlobalPatientProfile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFetchGlobalPatientProfile.setForeground(new java.awt.Color(0, 153, 0));
        btnFetchGlobalPatientProfile.setText("Fetch Global Patient Profile");
        btnFetchGlobalPatientProfile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFetchGlobalPatientProfileActionPerformed(evt);
            }
        });

        btnManagePatients.setBackground(new java.awt.Color(255, 255, 255));
        btnManagePatients.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnManagePatients.setForeground(new java.awt.Color(0, 153, 0));
        btnManagePatients.setText("Manage Patients");
        btnManagePatients.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManagePatientsActionPerformed(evt);
            }
        });

        btnBeginPatientInteraction.setBackground(new java.awt.Color(255, 255, 255));
        btnBeginPatientInteraction.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBeginPatientInteraction.setForeground(new java.awt.Color(0, 153, 0));
        btnBeginPatientInteraction.setText("Initiate Patient Interaction");
        btnBeginPatientInteraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBeginPatientInteractionActionPerformed(evt);
            }
        });

        btnPatientProfileStatus.setBackground(new java.awt.Color(255, 255, 255));
        btnPatientProfileStatus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPatientProfileStatus.setForeground(new java.awt.Color(0, 153, 0));
        btnPatientProfileStatus.setText("Patient Profile Status");
        btnPatientProfileStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientProfileStatusActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnFetchGlobalPatientProfile, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
            .addComponent(btnManagePatients, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnBeginPatientInteraction, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPatientProfileStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnComposeNewMail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnCheckMails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(btnFetchGlobalPatientProfile)
                .addGap(47, 47, 47)
                .addComponent(btnManagePatients)
                .addGap(43, 43, 43)
                .addComponent(btnBeginPatientInteraction)
                .addGap(38, 38, 38)
                .addComponent(btnPatientProfileStatus)
                .addGap(50, 50, 50)
                .addComponent(btnComposeNewMail)
                .addGap(36, 36, 36)
                .addComponent(btnCheckMails)
                .addGap(0, 245, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        add(jSplitPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnFetchGlobalPatientProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFetchGlobalPatientProfileActionPerformed
        // TODO add your handling code here:
        JPanel userProcessContainer = new JPanel();
        userProcessContainer.setLayout(new CardLayout());
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add(new FindGlobalPatientProfiles(internationalNetwork, userAccount, inCityEnterprise, userProcessContainer));
        layout.next(userProcessContainer);
        
        jSplitPane1.setRightComponent(userProcessContainer);
        
        //jSplitPane1.setRightComponent(new FindGlobalPatientProfiles(internationalNetwork, userAccount, inCityEnterprise));
    }//GEN-LAST:event_btnFetchGlobalPatientProfileActionPerformed

    private void btnManagePatientsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManagePatientsActionPerformed
        // TODO add your handling code here:
         JPanel userProcessContainer = new JPanel();
        userProcessContainer.setLayout(new CardLayout());
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add(new ManagePatients(inCityEnterprise, inOrganization, userAccount, userProcessContainer));
        layout.next(userProcessContainer);
        
        jSplitPane1.setRightComponent(userProcessContainer);
        
        //jSplitPane1.setRightComponent(new ManagePatients(inCityEnterprise, inOrganization, userAccount));
    }//GEN-LAST:event_btnManagePatientsActionPerformed

    private void btnBeginPatientInteractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBeginPatientInteractionActionPerformed
        // TODO add your handling code here:3
        JPanel userProcessContainer = new JPanel();
        userProcessContainer.setLayout(new CardLayout());
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add(new BeginPatientInteractionIntro( inCityEnterprise,  inOrganization,  userAccount, userProcessContainer, inEnterprise));
        layout.next(userProcessContainer);
        
        jSplitPane1.setRightComponent(userProcessContainer);
        
    }//GEN-LAST:event_btnBeginPatientInteractionActionPerformed

    private void btnPatientProfileStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientProfileStatusActionPerformed
        // TODO add your handling code here:
        JPanel userProcessContainer = new JPanel();
        userProcessContainer.setLayout(new CardLayout());
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add(new PatientProfileStatus(doctorOrganization.getWorkQueue(), internationalNetwork, inCityEnterprise, inOrganization, userAccount, userProcessContainer, inEnterprise));
        layout.next(userProcessContainer);
        
        jSplitPane1.setRightComponent(userProcessContainer);
    }//GEN-LAST:event_btnPatientProfileStatusActionPerformed

    private void btnComposeNewMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComposeNewMailActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new ComposeMail(internationalNetwork, userAccount));

    }//GEN-LAST:event_btnComposeNewMailActionPerformed

    private void btnCheckMailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCheckMailsActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new Inbox(userAccount.getWorkQueue()));

    }//GEN-LAST:event_btnCheckMailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBeginPatientInteraction;
    private javax.swing.JButton btnCheckMails;
    private javax.swing.JButton btnComposeNewMail;
    private javax.swing.JButton btnFetchGlobalPatientProfile;
    private javax.swing.JButton btnManagePatients;
    private javax.swing.JButton btnPatientProfileStatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
}
