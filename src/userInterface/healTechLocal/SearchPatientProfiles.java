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
package userInterface.healTechLocal;

import baseClasses.citizen.Citizen;
import baseClasses.enterprise.CityEnterprise;
import baseClasses.enterprise.CountryEnterprise;
import baseClasses.enterprise.Enterprise;
import baseClasses.enterprise.HospitalEnterprise;
import baseClasses.enterprise.StateEnterprise;
import baseClasses.network.Network;
import baseClasses.organization.Organization;
import baseClasses.organization.PatientOrganization;
import baseClasses.patient.Patient;
import baseClasses.person.Person;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhishek
 */
public class SearchPatientProfiles extends javax.swing.JPanel {

    /**
     * Creates new form SearchPatientProfiles
     */
    ArrayList<HospitalEnterprise> hospitalEnterprise;
    Network internationalNetwork;

    public SearchPatientProfiles(ArrayList<HospitalEnterprise> hospitalEnterprise, Network internationalNetwork) {
        initComponents();
        this.hospitalEnterprise = hospitalEnterprise;
        this.internationalNetwork = internationalNetwork;
        populateCountryList();
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
        lblName3 = new javax.swing.JLabel();
        cmbCountryList = new javax.swing.JComboBox();
        lblSearchOutput = new javax.swing.JLabel();
        txtUID = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatientProfiles = new javax.swing.JTable();
        lblName4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baseClasses/healtech logo.PNG"))); // NOI18N

        lblName1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblName1.setForeground(new java.awt.Color(0, 153, 51));
        lblName1.setText("Search Patient Profiles");

        lblName3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblName3.setForeground(new java.awt.Color(0, 153, 51));
        lblName3.setText("Select Country");

        cmbCountryList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbCountryList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCountryListActionPerformed(evt);
            }
        });

        lblSearchOutput.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSearchOutput.setForeground(new java.awt.Color(0, 153, 51));

        txtUID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(0, 153, 0));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tblPatientProfiles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient Profile", "Hospital"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPatientProfiles);
        if (tblPatientProfiles.getColumnModel().getColumnCount() > 0) {
            tblPatientProfiles.getColumnModel().getColumn(0).setResizable(false);
            tblPatientProfiles.getColumnModel().getColumn(1).setResizable(false);
        }

        lblName4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblName4.setForeground(new java.awt.Color(0, 153, 51));
        lblName4.setText("Search by Citizen ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(1248, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(lblName1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(lblName3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmbCountryList, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblName4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtUID, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(lblSearchOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 607, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblName1)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblName3)
                            .addComponent(cmbCountryList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSearch)
                            .addComponent(lblName4))
                        .addGap(33, 33, 33)
                        .addComponent(lblSearchOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCountryListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCountryListActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_cmbCountryListActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        CountryEnterprise countryEnterprise = (CountryEnterprise) cmbCountryList.getSelectedItem();
        int UID = Integer.parseInt(txtUID.getText());
        StateEnterprise stateEnterprise = null;
        CityEnterprise cityEnterprise = null;
        Citizen citizen = null;
        Citizen finalCitizen = null;

        for (Enterprise state : countryEnterprise.getCountryNetwork().getEnterpriseDirectory().getEnterpriseList()) {
            if (state.getClass() == StateEnterprise.class) {
                stateEnterprise = (StateEnterprise) state;
                for (Enterprise city : stateEnterprise.getStateNetwork().getEnterpriseDirectory().getEnterpriseList()) {
                    cityEnterprise = (CityEnterprise) city;

                    for (Person person : cityEnterprise.getPersonDirectory().getPersonList()) {
                        if (person.getClass() == Citizen.class) {
                            citizen = (Citizen) person;

                            if (citizen.getUID() == UID) {
                                finalCitizen = citizen;
                                lblSearchOutput.setText("Profile Found!");
                                populatePatientProfileTable();
                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JComboBox cmbCountryList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName3;
    private javax.swing.JLabel lblName4;
    private javax.swing.JLabel lblSearchOutput;
    private javax.swing.JTable tblPatientProfiles;
    private javax.swing.JTextField txtUID;
    // End of variables declaration//GEN-END:variables

    private void populateCountryList() {
        cmbCountryList.removeAllItems();
        CountryEnterprise countryEnterprise;

        for (Enterprise country : internationalNetwork.getEnterpriseDirectory().getEnterpriseList()) {
            cmbCountryList.addItem((CountryEnterprise) country);
        }

    }

    private void populatePatientProfileTable() {
        Patient patient;
        DefaultTableModel dtm = (DefaultTableModel) tblPatientProfiles.getModel();
        dtm.setRowCount(0);
        PatientOrganization patientOrganization;

        for (HospitalEnterprise hospitalEnterprise : hospitalEnterprise) {
            for (Organization organization : hospitalEnterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization.getClass() == PatientOrganization.class) {
                    patientOrganization = (PatientOrganization) organization;
                    for (Person person : organization.getPersonDirectory().getPersonList()) {
                        if (person.getClass() == Patient.class) {
                            patient = (Patient) person;
                            Object[] row = new Object[2];
                            row[0] = patient.getPatientProfile();
                            row[1] = hospitalEnterprise;
                            dtm.addRow(row);
                        }
                    }

                }
            }
        }

    }
}