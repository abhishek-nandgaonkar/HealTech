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

import baseClasses.citizen.Citizen;
import baseClasses.labAssistant.LabAssistant;
import baseClasses.enterprise.CityEnterprise;
import baseClasses.enterprise.CountryEnterprise;
import baseClasses.enterprise.Enterprise;
import baseClasses.enterprise.HospitalEnterprise;
import baseClasses.enterprise.StateEnterprise;
import baseClasses.network.Network;
import baseClasses.organization.CitizenOrganization;
import baseClasses.organization.LabOrganization;
import baseClasses.organization.Organization;
import baseClasses.person.Person;
import baseClasses.roles.DoctorRole;
import baseClasses.roles.LabAssistantRole;
import baseClasses.vitalSigns.Height;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Abhishek
 */
public class AddNewLabAssistantPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddNewLabAssistantPanel
     */
    Network internationalNetwork;
    ArrayList<HospitalEnterprise> docHospitalsList;
    LabAssistant labAssistant = new LabAssistant();
    HospitalEnterprise hospitalEnterprise;
    Citizen finalCitizen = null;

    public AddNewLabAssistantPanel(Network internationalNetwork, HospitalEnterprise hospitalEnterprise) {
        initComponents();
        this.internationalNetwork = internationalNetwork;
        this.hospitalEnterprise = hospitalEnterprise;

        docHospitalsList = new ArrayList();
        populateCountryList();

        txtPassword.setEnabled(false);

        txtUID.setEnabled(false);
        txtUsername.setEnabled(false);

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
        btnSearch = new javax.swing.JButton();
        lblName3 = new javax.swing.JLabel();
        cmbCountryList = new javax.swing.JComboBox();
        btnAddLabAssistant = new javax.swing.JButton();
        txtUID = new javax.swing.JTextField();
        lblName4 = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        lblSelectCountry5 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lblSelectCountry6 = new javax.swing.JLabel();
        lblResult = new javax.swing.JLabel();
        btnSearch1 = new javax.swing.JButton();
        txtPassword1 = new javax.swing.JPasswordField();
        lblSelectCountry7 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baseClasses/healtech logo.PNG"))); // NOI18N

        lblName1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblName1.setForeground(new java.awt.Color(0, 153, 51));
        lblName1.setText("                Add New Lab Assistant");

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(0, 153, 0));
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblName3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblName3.setForeground(new java.awt.Color(0, 153, 51));
        lblName3.setText("Select Country");

        cmbCountryList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbCountryList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCountryListActionPerformed(evt);
            }
        });

        btnAddLabAssistant.setBackground(new java.awt.Color(255, 255, 255));
        btnAddLabAssistant.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddLabAssistant.setForeground(new java.awt.Color(0, 153, 0));
        btnAddLabAssistant.setText("Add Lab Assistant");
        btnAddLabAssistant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddLabAssistantActionPerformed(evt);
            }
        });

        txtUID.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblName4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblName4.setForeground(new java.awt.Color(0, 153, 51));
        lblName4.setText("Search by Citizen ID");

        btnClear.setBackground(new java.awt.Color(255, 255, 255));
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(0, 153, 0));
        btnClear.setText("Clear ");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        lblSelectCountry5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSelectCountry5.setForeground(new java.awt.Color(0, 153, 51));
        lblSelectCountry5.setText("Username");

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblSelectCountry6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSelectCountry6.setForeground(new java.awt.Color(0, 153, 51));
        lblSelectCountry6.setText("Password");

        lblResult.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblResult.setForeground(new java.awt.Color(0, 153, 51));

        btnSearch1.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSearch1.setForeground(new java.awt.Color(0, 153, 0));
        btnSearch1.setText("View Profile");
        btnSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch1ActionPerformed(evt);
            }
        });

        txtPassword1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblSelectCountry7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSelectCountry7.setForeground(new java.awt.Color(0, 153, 51));
        lblSelectCountry7.setText("Re enter Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(468, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(lblName3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cmbCountryList, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblName4, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtUID, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAddLabAssistant))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblSelectCountry5)
                                            .addComponent(lblSelectCountry6)
                                            .addComponent(lblSelectCountry7))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtPassword1)
                                            .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                                            .addComponent(txtPassword))))
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(440, 440, 440))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lblName1)
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName3)
                    .addComponent(cmbCountryList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearch)
                    .addComponent(txtUID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSearch1)
                    .addComponent(lblResult, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelectCountry5)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSelectCountry6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSelectCountry7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddLabAssistant)
                    .addComponent(btnClear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        System.out.println("in the search button method in add new doctor panel");
        CountryEnterprise countryEnterprise = (CountryEnterprise) cmbCountryList.getSelectedItem();
        System.out.println("Country enterprise sel" + countryEnterprise);
        int UID = Integer.parseInt(txtUID.getText());
        System.out.println(UID);
        StateEnterprise stateEnterprise = null;
        CityEnterprise cityEnterprise = null;
        Citizen citizen = null;

        CountryEnterprise countryEnt = null;
        CitizenOrganization citizenOrganization = null;

        for (Enterprise country : internationalNetwork.getEnterpriseDirectory().getEnterpriseList()) {
            if (country.getClass() == CountryEnterprise.class) {
                countryEnt = (CountryEnterprise) country;

                if (countryEnt.getName().equals(countryEnterprise.getName())) {
                    System.out.println("Country found: " + countryEnt);
                    countryEnterprise = countryEnt;
                    for (Enterprise state : countryEnterprise.getCountryNetwork().getEnterpriseDirectory().getEnterpriseList()) {
                        if (state.getClass() == StateEnterprise.class) {
                            stateEnterprise = (StateEnterprise) state;
                            for (Enterprise city : stateEnterprise.getStateNetwork().getEnterpriseDirectory().getEnterpriseList()) {
                                cityEnterprise = (CityEnterprise) city;

                                for (Organization organization : cityEnterprise.getOrganizationDirectory().getOrganizationList()) {
                                    if (organization.getClass() == CitizenOrganization.class) {
                                        citizenOrganization = (CitizenOrganization) organization;
                                        for (Person person : citizenOrganization.getPersonDirectory().getPersonList()) {
                                            if (person.getClass() == Citizen.class) {
                                                citizen = (Citizen) person;
                                                System.out.println("" + cityEnterprise.getName() + " " + person.getName().getFirstName() + " " + cityEnterprise.getPersonDirectory().getPersonList().size());
                                                if (citizen.getUID() == UID) {
                                                    finalCitizen = citizen;
                                                    lblResult.setText("Profile Found: " + finalCitizen.getName().getFirstName());
                                                    System.out.println("Profile found in Add Doctor Panel");
                                                }
                                            }
                                        }
                                    }

                                }

                            }
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void cmbCountryListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCountryListActionPerformed
        // TODO add your handling code here:

        txtPassword.setEnabled(true);

        txtUID.setEnabled(true);
        txtUsername.setEnabled(true);
    }//GEN-LAST:event_cmbCountryListActionPerformed

    private void btnAddLabAssistantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddLabAssistantActionPerformed
        // TODO add your handling code here:
        if (!(txtUsername.getText().isEmpty())) {
            if (!(String.valueOf(txtPassword.getPassword()).equals(""))) {
                if (!(String.valueOf(txtPassword1.getPassword()).equals(""))) {
                    String one = String.valueOf(txtPassword.getPassword());
                    String two = String.valueOf(txtPassword1.getPassword());
                    if (one.equals(two)) {
                        labAssistant.setAddress(finalCitizen.getAddress());
                        labAssistant.setDateOfBirth(finalCitizen.getDateOfBirth());
                        labAssistant.setName(finalCitizen.getName());
                        labAssistant.setNationality(finalCitizen.getNationality());
                        labAssistant.setUID(Integer.parseInt(txtUID.getText()));
        //labAssistant.setHighestDegree(txtHightestDegree1.getText());
                        //labAssistant.setSpecialization(txtSpecialization.getText());

                        //hospitalEnterprise.getPersonDirectory().getPersonList().add(labAssistant);
                        LabOrganization labAssistantOrganization = null;

                        for (Organization organization : hospitalEnterprise.getOrganizationDirectory().getOrganizationList()) {
                            if (organization.getClass() == LabOrganization.class) {
                                labAssistantOrganization = (LabOrganization) organization;
                                labAssistantOrganization.getPersonDirectory().getPersonList().add(labAssistant);

                                labAssistantOrganization.getUserAccountDirectory().createUserAccount(txtUsername.getText(), String.valueOf(txtPassword.getPassword()), new LabAssistantRole(), "Active");
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "The two passwords entered do not match", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Please enter the password in both the fields", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please enter the password in both the fields", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter the username", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnAddLabAssistantActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:

        txtUID.setText("");

        cmbCountryList.setSelectedIndex(0);
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch1ActionPerformed
        // TODO add your handling code here:
        //JFrame detailsFrame = new JFrame("View Citizen Profile");
        //jframe.add(new EditCitizenDetails());
        JFrame frame = new JFrame(finalCitizen.getName().getFirstName() + " " + finalCitizen.getName().getLastName());
        frame.setSize(1200, 1000);

        frame.setVisible(true);
        frame.add(new ViewCitizenDetails(internationalNetwork, finalCitizen, null));
    }//GEN-LAST:event_btnSearch1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddLabAssistant;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JComboBox cmbCountryList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName3;
    private javax.swing.JLabel lblName4;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblSelectCountry5;
    private javax.swing.JLabel lblSelectCountry6;
    private javax.swing.JLabel lblSelectCountry7;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPassword1;
    private javax.swing.JTextField txtUID;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
     private void populateCountryList() {
        cmbCountryList.removeAllItems();
        CountryEnterprise countryEnterprise;

        for (Enterprise country : internationalNetwork.getEnterpriseDirectory().getEnterpriseList()) {
            cmbCountryList.addItem((CountryEnterprise) country);
        }

    }

}
