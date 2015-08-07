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
import baseClasses.pharmacy.Pharmacy;
import baseClasses.enterprise.CityEnterprise;
import baseClasses.enterprise.CountryEnterprise;
import baseClasses.enterprise.Enterprise;
import baseClasses.enterprise.StateEnterprise;
import baseClasses.network.Network;
import baseClasses.organization.PharmacyOrganization;
import baseClasses.organization.Organization;
import baseClasses.person.Person;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhishek
 */

public class ManagePharmacyProfiles extends javax.swing.JPanel {

    /**
     * Creates new form ManagePharmacyProfiles
     */
    Network internationalNetwork;
    JPanel managePharmacysProfileCard;
    public ManagePharmacyProfiles(Network internationalNetwork, JPanel managePharmacysProfileCard) {
        initComponents();
        this.internationalNetwork = internationalNetwork;
        this.managePharmacysProfileCard = managePharmacysProfileCard;
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
        jLabel6 = new javax.swing.JLabel();
        cmbCountryList = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cmbCityList = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cmbStateList = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPharmacys = new javax.swing.JTable();
        btnShowDetails = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baseClasses/healtech logo.PNG"))); // NOI18N

        lblName1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblName1.setForeground(new java.awt.Color(0, 153, 51));
        lblName1.setText("                      Manage Pharmacies");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 51));
        jLabel6.setText("Country");

        cmbCountryList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbCountryList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCountryListActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 51));
        jLabel5.setText("City");

        cmbCityList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbCityList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCityListActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 51));
        jLabel4.setText("State");

        cmbStateList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbStateList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStateListActionPerformed(evt);
            }
        });

        tblPharmacys.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblPharmacys.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pharmacy"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPharmacys);
        if (tblPharmacys.getColumnModel().getColumnCount() > 0) {
            tblPharmacys.getColumnModel().getColumn(0).setResizable(false);
        }

        btnShowDetails.setBackground(new java.awt.Color(255, 255, 255));
        btnShowDetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnShowDetails.setForeground(new java.awt.Color(0, 153, 0));
        btnShowDetails.setText("Show Details");
        btnShowDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(lblName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(665, Short.MAX_VALUE)
                .addComponent(btnShowDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(558, 558, 558)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel4))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbCountryList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbCityList, 0, 219, Short.MAX_VALUE)
                    .addComponent(cmbStateList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(162, 162, 162)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblName1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCountryList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cmbStateList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmbCityList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 737, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnShowDetails)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCountryListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCountryListActionPerformed
        // TODO add your handling code here:
        populateStateList((CountryEnterprise) cmbCountryList.getSelectedItem());
        /*cmbCountryList.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    System.out.println("In the action listener");
                    String currentQuantity = (String)cmbCountryList.getSelectedItem();
                    if(currentQuantity.equals("United States of America"))
                    {
                        txtState.setEnabled(false);
                        System.out.println(currentQuantity);
                        cmbStateList.setEnabled(true);
                        cmbStateList.removeAllItems();
                        for(String state: USAstateList)
                        {

                            cmbStateList.addItem(state);
                        }
                    }
                    else if(currentQuantity.equals("India"))
                    {
                        txtState.setEnabled(false);
                        cmbStateList.setEnabled(true);
                        cmbStateList.removeAllItems();
                        for(String state: indiaStateList)
                        {

                            cmbStateList.addItem(state);
                        }
                    }
                    else
                    {
                        cmbStateList.setEnabled(false);
                        cmbStateList.setEnabled(true);

                    }

                }
            }
        );*/
    }//GEN-LAST:event_cmbCountryListActionPerformed

    private void cmbStateListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStateListActionPerformed
        // TODO add your handling code here:
        populateCityList((StateEnterprise)cmbStateList.getSelectedItem());
    }//GEN-LAST:event_cmbStateListActionPerformed

    private void cmbCityListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCityListActionPerformed
        // TODO add your handling code here:
        CityEnterprise cityEnterprise = (CityEnterprise) cmbCityList.getSelectedItem();
        PharmacyOrganization pharmacyOrganization = null;
        boolean flag = false;
        Pharmacy pharmacy = null;
        
        DefaultTableModel dtm = (DefaultTableModel) tblPharmacys.getModel();
        dtm.setRowCount(0);
        
        for(Organization organization: cityEnterprise.getOrganizationDirectory().getOrganizationList())
        {
            if(organization.getClass() == PharmacyOrganization.class)
            {
                pharmacyOrganization = (PharmacyOrganization) organization;
                flag = true;
            }
        }
        if(flag)
        {
            for(Person person: pharmacyOrganization.getPersonDirectory().getPersonList())
            {
                pharmacy = (Pharmacy) person;
                Object[] row = new Object[1];
                row[0] = pharmacy;
                
                dtm.addRow(row);
            }
        }
    }//GEN-LAST:event_cmbCityListActionPerformed

    private void btnShowDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowDetailsActionPerformed
        // TODO add your handling code here:
      int selectedRow = tblPharmacys.getSelectedRow();
       Pharmacy pharmacy = (Pharmacy) tblPharmacys.getValueAt(selectedRow, 0);
              
       CardLayout layout = (CardLayout) managePharmacysProfileCard.getLayout();
       managePharmacysProfileCard.add(new EditPharmacyDetails(internationalNetwork, pharmacy, managePharmacysProfileCard));
       layout.next(managePharmacysProfileCard);
      //this.add(new EditPharmacyDetails((internationalNetwork,pharmacy)));
              

    }//GEN-LAST:event_btnShowDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnShowDetails;
    private javax.swing.JComboBox cmbCityList;
    private javax.swing.JComboBox cmbCountryList;
    private javax.swing.JComboBox cmbStateList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName1;
    private javax.swing.JTable tblPharmacys;
    // End of variables declaration//GEN-END:variables
     private void populateCountryList()
    {
        cmbCountryList.removeAllItems();
        CountryEnterprise countryEnterprise;
        
        for(Enterprise country: internationalNetwork.getEnterpriseDirectory().getEnterpriseList())
        {
            cmbCountryList.addItem((CountryEnterprise) country);
        }
        
    }

    private void populateStateList(CountryEnterprise countryEnterprise)
    {
        
        cmbStateList.removeAllItems();
        
        for(Enterprise state: countryEnterprise.getCountryNetwork().getEnterpriseDirectory().getEnterpriseList())
        {
            if(state.getClass() ==  StateEnterprise.class)
            cmbStateList.addItem((StateEnterprise) state);
        }
 
    }

    private void populateCityList(StateEnterprise stateEnterprise)
    {
                cmbCityList.removeAllItems();
        
        
        for(Enterprise city: stateEnterprise.getStateNetwork().getEnterpriseDirectory().getEnterpriseList())
        {
            cmbCityList.addItem((CityEnterprise) city);
            
        }
    }

}
