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

import baseClasses.doctor.Doctor;
import baseClasses.enterprise.CityEnterprise;
import baseClasses.organization.Organization;
import baseClasses.patient.Patient;
import baseClasses.userAccount.UserAccount;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhishek
 */
public class ManagePatients extends javax.swing.JPanel {

    /**
     * Creates new form ManagePatients
     */
    private CityEnterprise inCityEnterprise;
    private Organization inOrganization;
    private UserAccount userAccount;
    private JPanel userProcessContainer;
    
    public ManagePatients(CityEnterprise inCityEnterprise, Organization inOrganization, UserAccount userAccount, JPanel userProcessContainer) {
        initComponents();
        this.inCityEnterprise = inCityEnterprise;
        this.inOrganization = inOrganization;
        this.userAccount = userAccount;
        this.userProcessContainer = userProcessContainer;
        populatePatientTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblName1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatients = new javax.swing.JTable();
        btnGetPatientProfiles = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lblName1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblName1.setForeground(new java.awt.Color(0, 153, 51));
        lblName1.setText("                                         Manage Patient Profiles");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baseClasses/healtech logo.PNG"))); // NOI18N

        tblPatients.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UID", "Name", "Nationality"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPatients);
        if (tblPatients.getColumnModel().getColumnCount() > 0) {
            tblPatients.getColumnModel().getColumn(0).setResizable(false);
            tblPatients.getColumnModel().getColumn(1).setResizable(false);
            tblPatients.getColumnModel().getColumn(2).setResizable(false);
        }

        btnGetPatientProfiles.setBackground(new java.awt.Color(255, 255, 255));
        btnGetPatientProfiles.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnGetPatientProfiles.setForeground(new java.awt.Color(0, 153, 0));
        btnGetPatientProfiles.setText("Get Patient Profiles");
        btnGetPatientProfiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetPatientProfilesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(393, 393, 393)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(574, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(520, 520, 520)
                .addComponent(btnGetPatientProfiles, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lblName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(121, 121, 121)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(108, 108, 108)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnGetPatientProfiles))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(lblName1)
                    .addContainerGap(742, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGetPatientProfilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetPatientProfilesActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPatients.getSelectedRow();
        System.out.println("selectedROw: " + selectedRow);
        if(selectedRow > -1)
        {
            //JPanel userProcessContainer = new JPanel();
            userProcessContainer.setLayout(new CardLayout());
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            userProcessContainer.add(new ViewPatientProfiles((Patient) tblPatients.getValueAt(selectedRow, 0),userProcessContainer));
            layout.next(userProcessContainer);

        }
        else
        JOptionPane.showMessageDialog(this, "Please click an entry from table to proceed", "Error", JOptionPane.ERROR_MESSAGE);

        //jSplitPane1.setRightComponent(userProcessContainer);
    }//GEN-LAST:event_btnGetPatientProfilesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGetPatientProfiles;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName1;
    private javax.swing.JTable tblPatients;
    // End of variables declaration//GEN-END:variables

    private void populatePatientTable()
    {
        DefaultTableModel dtm = (DefaultTableModel) tblPatients.getModel();
        dtm.setRowCount(0);
        
        Doctor doctor = (Doctor) userAccount.getPerson();
        
        ArrayList<Patient> patientList = doctor.getPatientList();
        
        for(Patient patient: doctor.getPatientList())
        {
            Object[] row = new Object[3];
            row[0] = patient;
            row[1] = patient.getName().getFirstName() + " " + patient.getName().getLastName();
            row[2] = patient.getNationality();
            dtm.addRow(row);
        }
        
    }
}