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
package userInterface.hospital;

import baseClasses.patient.Patient;
import baseClasses.enterprise.HospitalEnterprise;
import baseClasses.network.Network;
import baseClasses.organization.PatientOrganization;
import baseClasses.organization.Organization;
import baseClasses.person.Person;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhishek
 */
public class ManagePatientInfo extends javax.swing.JPanel {

    /**
     * Creates new form ManagePatientInfo
     */
    Network internationalNetwork;
    HospitalEnterprise hospitalEnterprise;
    JPanel updatePatientCard;
    
    public ManagePatientInfo(Network internationalNetwork, HospitalEnterprise hospitalEnterprise, JPanel updatePatientCard ) {
        initComponents();
        this.internationalNetwork = internationalNetwork;
        this.hospitalEnterprise = hospitalEnterprise;
        this.updatePatientCard = updatePatientCard;
        populatePatientList();
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
        tblPatientList = new javax.swing.JTable();
        btnViewDetails = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baseClasses/healtech logo.PNG"))); // NOI18N

        lblName2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblName2.setForeground(new java.awt.Color(0, 153, 51));
        lblName2.setText("Manage Patient Information");

        tblPatientList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UID", "Patient Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPatientList);
        if (tblPatientList.getColumnModel().getColumnCount() > 0) {
            tblPatientList.getColumnModel().getColumn(0).setResizable(false);
            tblPatientList.getColumnModel().getColumn(1).setResizable(false);
        }

        btnViewDetails.setBackground(new java.awt.Color(255, 255, 255));
        btnViewDetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnViewDetails.setForeground(new java.awt.Color(0, 153, 0));
        btnViewDetails.setText("View Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 153, 0));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(437, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName2, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(370, 370, 370)
                        .addComponent(jLabel1))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblName2)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnViewDetails)
                        .addComponent(btnDelete))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        int selectedItem = tblPatientList.getSelectedRow();
        Patient patient = (Patient) tblPatientList.getValueAt(selectedItem, 0);
        
        //JPanel updatePatientCard = new JPanel();
        updatePatientCard.setLayout(new CardLayout());
        CardLayout layout = (CardLayout) updatePatientCard.getLayout();
        updatePatientCard.add(new UpdatePatientDetails(patient,updatePatientCard));
        layout.next(updatePatientCard);
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedItem = tblPatientList.getSelectedRow();
        Patient patient = (Patient) tblPatientList.getValueAt(selectedItem, 0);

        hospitalEnterprise.getOrganizationDirectory().getOrganizationList().remove(patient);
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JTable tblPatientList;
    // End of variables declaration//GEN-END:variables

    private void populatePatientList()
    {
        DefaultTableModel dtm = (DefaultTableModel) tblPatientList.getModel();
        dtm.setRowCount(0);
        PatientOrganization patientOrganization = null;
        Patient patient = null;
        
        for(Organization patientOrg: hospitalEnterprise.getOrganizationDirectory().getOrganizationList())
        {
            if(patientOrg.getClass() == PatientOrganization.class)
            {
                patientOrganization = (PatientOrganization) patientOrg;
                
                for(Person person: patientOrganization.getPersonDirectory().getPersonList())
                {
                    patient = (Patient) person;
                    
                    Object[] row = new Object[2];
                    row[0] = patient;
                    row[1] = patient.getName().getFirstName() + " " + patient.getName().getLastName();
                    dtm.addRow(row);
                    
                }
            }
        }
        
    }
}
