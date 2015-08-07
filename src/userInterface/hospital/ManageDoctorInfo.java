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

import baseClasses.doctor.Doctor;
import baseClasses.enterprise.HospitalEnterprise;
import baseClasses.network.Network;
import baseClasses.organization.DoctorOrganization;
import baseClasses.organization.Organization;
import baseClasses.userAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhishek
 */
public class ManageDoctorInfo extends javax.swing.JPanel {

    /**
     * Creates new form ManageDoctorInfo
     */
    Network internationalNetwork;
    HospitalEnterprise hospitalEnterprise;
    JPanel updateDoctorCard;
    DoctorOrganization doctorOrganization;
    
    public ManageDoctorInfo(Network internationalNetwork, HospitalEnterprise hospitalEnterprise, JPanel updateDoctorCard, DoctorOrganization doctorOrganization) {
        initComponents();
        this.internationalNetwork = internationalNetwork;
        this.updateDoctorCard = updateDoctorCard;
        this.hospitalEnterprise = hospitalEnterprise;
        this.doctorOrganization = doctorOrganization;
        System.out.println("Printing from ManageDoctorInfo: " + hospitalEnterprise);
        populateDoctorList();
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
        tblDoctorList = new javax.swing.JTable();
        btnViewDetails = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baseClasses/healtech logo.PNG"))); // NOI18N

        lblName2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblName2.setForeground(new java.awt.Color(0, 153, 51));
        lblName2.setText("Manage Doctor Information");

        tblDoctorList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblDoctorList.setForeground(new java.awt.Color(0, 153, 51));
        tblDoctorList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UID", "Doctor Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDoctorList);

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
        int selectedItem = tblDoctorList.getSelectedRow();
        
        if(selectedItem > -1)
        {
            Doctor doctor = (Doctor) tblDoctorList.getValueAt(selectedItem, 0);
        
        //JPanel updateDoctorCard = new JPanel();
        updateDoctorCard.setLayout(new CardLayout());
        CardLayout layout = (CardLayout) updateDoctorCard.getLayout();
        updateDoctorCard.add(new UpdateDoctorDetails(doctor,updateDoctorCard));
        layout.next(updateDoctorCard);
        }
        else
            JOptionPane.showMessageDialog(this, "Please make a selection in the table to proceed", "Error", JOptionPane.ERROR_MESSAGE);
        
    }//GEN-LAST:event_btnViewDetailsActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        int selectedItem = tblDoctorList.getSelectedRow();
          if(selectedItem > -1)
        {
            Doctor doctor = (Doctor) tblDoctorList.getValueAt(selectedItem, 0);
            //hospitalEnterprise.getOrganizationDirectory().getOrganizationList().remove(doctor);
            doctorOrganization.getUserAccountDirectory().getUserAccountList().remove(doctor);
            
        }
        else
            JOptionPane.showMessageDialog(this, "Please make a selection in the table to proceed", "Error", JOptionPane.ERROR_MESSAGE);
        
        
         
        
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JTable tblDoctorList;
    // End of variables declaration//GEN-END:variables

    private void populateDoctorList()
    {
        DefaultTableModel dtm = (DefaultTableModel) tblDoctorList.getModel();
        dtm.setRowCount(0);
        DoctorOrganization doctorOrganization = null;
        Doctor doctor = null;
        System.out.println("Printing from manage doctor info" + hospitalEnterprise.getOrganizationDirectory().getOrganizationList().size());
        for(Organization doctorOrg: hospitalEnterprise.getOrganizationDirectory().getOrganizationList())
        {
            if(doctorOrg.getClass() == DoctorOrganization.class)
            {
                doctorOrganization = (DoctorOrganization) doctorOrg;
                System.out.println("Doctor Organization found");
                System.out.println(doctorOrganization.getUserAccountDirectory().getUserAccountList().size());
                //for(Person person: doctorOrganization.getPersonDirectory().getPersonList())
                for(UserAccount ua: doctorOrganization.getUserAccountDirectory().getUserAccountList())
                {
                    doctor = (Doctor) ua.getPerson();
                    System.out.println(doctor);
                    Object[] row = new Object[2];
                    row[0] = doctor;
                    row[1] = doctor.getName().getFirstName() + " " + doctor.getName().getLastName();
                    dtm.addRow(row);
                    
                }
            }
        }
        
    }
}
