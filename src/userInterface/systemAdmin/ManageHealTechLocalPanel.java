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
package userInterface.systemAdmin;

import baseClasses.enterprise.CityEnterprise;
import baseClasses.enterprise.CountryEnterprise;
import baseClasses.enterprise.Enterprise;
import baseClasses.enterprise.HealTechLocalEnterprise;
import baseClasses.enterprise.PharmacyEnterprise;
import baseClasses.enterprise.StateEnterprise;
import baseClasses.network.Network;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhishek
 */
public class ManageHealTechLocalPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageHealTechLocalsPanel
     */
    Network internationalNetwork;
    
    public ManageHealTechLocalPanel(Network internationalNetwork) {
        initComponents();
        this.internationalNetwork = internationalNetwork;
        populateCountryList(cmbCountryName1);
        cmbCityList.setEnabled(false);
        cmbStateList.setEnabled(false);
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
        tblHealTechLocals = new javax.swing.JTable();
        btnUpdateHealTechLocalName = new javax.swing.JButton();
        txtHealTechLocalName = new javax.swing.JTextField();
        cmbCountryName = new javax.swing.JComboBox();
        lblSelectCountry1 = new javax.swing.JLabel();
        cmbStateList = new javax.swing.JComboBox();
        lblSelectCountry2 = new javax.swing.JLabel();
        cmbCityList = new javax.swing.JComboBox();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtStreetName = new javax.swing.JTextField();
        lblSelectCountry3 = new javax.swing.JLabel();
        txtZipcode = new javax.swing.JTextField();
        lblSelectCountry4 = new javax.swing.JLabel();
        btnUpdateCountryStateCity = new javax.swing.JButton();
        btnUpdateAddressBasics = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lblSelectCountry5 = new javax.swing.JLabel();
        cmbCountryName1 = new javax.swing.JComboBox();
        cmbStateList1 = new javax.swing.JComboBox();
        lblSelectCountry6 = new javax.swing.JLabel();
        lblSelectCountry7 = new javax.swing.JLabel();
        cmbCityList1 = new javax.swing.JComboBox();
        btnApplyFilter = new javax.swing.JButton();
        btnViewDetails = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1591, 820));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baseClasses/healtech logo.PNG"))); // NOI18N

        lblName1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblName1.setForeground(new java.awt.Color(0, 153, 51));
        lblName1.setText("Manage HealTech Locals");

        tblHealTechLocals.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "HealTech Local Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHealTechLocals);
        if (tblHealTechLocals.getColumnModel().getColumnCount() > 0) {
            tblHealTechLocals.getColumnModel().getColumn(0).setResizable(false);
        }

        btnUpdateHealTechLocalName.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateHealTechLocalName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdateHealTechLocalName.setForeground(new java.awt.Color(0, 153, 0));
        btnUpdateHealTechLocalName.setText("Update HealTechLocal Name");
        btnUpdateHealTechLocalName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateHealTechLocalNameActionPerformed(evt);
            }
        });

        txtHealTechLocalName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        cmbCountryName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbCountryName.setForeground(new java.awt.Color(0, 153, 51));
        cmbCountryName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCountryNameActionPerformed(evt);
            }
        });

        lblSelectCountry1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSelectCountry1.setForeground(new java.awt.Color(0, 153, 51));
        lblSelectCountry1.setText("Select State:");

        cmbStateList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbStateList.setForeground(new java.awt.Color(0, 153, 51));
        cmbStateList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStateListActionPerformed(evt);
            }
        });

        lblSelectCountry2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSelectCountry2.setForeground(new java.awt.Color(0, 153, 51));
        lblSelectCountry2.setText("Select City:");

        cmbCityList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbCityList.setForeground(new java.awt.Color(0, 153, 51));
        cmbCityList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCityListActionPerformed(evt);
            }
        });

        txtCity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCity.setForeground(new java.awt.Color(0, 153, 51));

        txtState.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtState.setForeground(new java.awt.Color(0, 153, 51));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 51));
        jLabel10.setText("Street Name:");

        txtStreetName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtStreetName.setForeground(new java.awt.Color(0, 153, 51));

        lblSelectCountry3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSelectCountry3.setForeground(new java.awt.Color(0, 153, 51));
        lblSelectCountry3.setText("Zipcode:");

        txtZipcode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtZipcode.setForeground(new java.awt.Color(0, 153, 51));

        lblSelectCountry4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSelectCountry4.setForeground(new java.awt.Color(0, 153, 51));
        lblSelectCountry4.setText("Select Country:");

        btnUpdateCountryStateCity.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateCountryStateCity.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdateCountryStateCity.setForeground(new java.awt.Color(0, 153, 0));
        btnUpdateCountryStateCity.setText("Update Country/State/City");
        btnUpdateCountryStateCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateCountryStateCityActionPerformed(evt);
            }
        });

        btnUpdateAddressBasics.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateAddressBasics.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdateAddressBasics.setForeground(new java.awt.Color(0, 153, 0));
        btnUpdateAddressBasics.setText("Update Address Basics");
        btnUpdateAddressBasics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateAddressBasicsActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 153, 51));
        jLabel11.setText("Filters");

        lblSelectCountry5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSelectCountry5.setForeground(new java.awt.Color(0, 153, 51));
        lblSelectCountry5.setText("Select Country:");

        cmbCountryName1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbCountryName1.setForeground(new java.awt.Color(0, 153, 51));
        cmbCountryName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCountryName1ActionPerformed(evt);
            }
        });

        cmbStateList1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbStateList1.setForeground(new java.awt.Color(0, 153, 51));
        cmbStateList1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStateList1ActionPerformed(evt);
            }
        });

        lblSelectCountry6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSelectCountry6.setForeground(new java.awt.Color(0, 153, 51));
        lblSelectCountry6.setText("Select State:");

        lblSelectCountry7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSelectCountry7.setForeground(new java.awt.Color(0, 153, 51));
        lblSelectCountry7.setText("Select City:");

        cmbCityList1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbCityList1.setForeground(new java.awt.Color(0, 153, 51));
        cmbCityList1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCityList1ActionPerformed(evt);
            }
        });

        btnApplyFilter.setBackground(new java.awt.Color(255, 255, 255));
        btnApplyFilter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnApplyFilter.setForeground(new java.awt.Color(0, 153, 0));
        btnApplyFilter.setText("Apply Filters");
        btnApplyFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApplyFilterActionPerformed(evt);
            }
        });

        btnViewDetails.setBackground(new java.awt.Color(255, 255, 255));
        btnViewDetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnViewDetails.setForeground(new java.awt.Color(0, 153, 0));
        btnViewDetails.setText("View HealTech Local Details");
        btnViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(lblName1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnViewDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 471, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnApplyFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblSelectCountry6)
                                        .addGap(25, 25, 25))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblSelectCountry5)
                                            .addComponent(lblSelectCountry7)
                                            .addComponent(jLabel11))
                                        .addGap(5, 5, 5)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbCountryName1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbStateList1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbCityList1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnUpdateHealTechLocalName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtHealTechLocalName, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(105, 105, 105)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblSelectCountry4)
                                        .addGap(40, 40, 40)
                                        .addComponent(cmbCountryName, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblSelectCountry1)
                                                .addGap(65, 65, 65)
                                                .addComponent(cmbStateList, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblSelectCountry2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cmbCityList, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(btnUpdateCountryStateCity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(27, 27, 27)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCity)
                                            .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(164, 164, 164)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnUpdateAddressBasics, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblSelectCountry3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(124, 124, 124)
                                            .addComponent(txtStreetName, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(1002, 1002, 1002)
                        .addComponent(jLabel1))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(lblName1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbCountryName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSelectCountry4))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(3, 3, 3)
                                        .addComponent(lblSelectCountry1))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(cmbStateList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cmbCityList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSelectCountry2)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtHealTechLocalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(btnUpdateHealTechLocalName)))
                        .addGap(34, 34, 34)
                        .addComponent(btnUpdateCountryStateCity)
                        .addGap(96, 96, 96)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtStreetName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSelectCountry3)
                            .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(btnUpdateAddressBasics)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnViewDetails)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblSelectCountry5)
                                .addGap(36, 36, 36)
                                .addComponent(lblSelectCountry6)
                                .addGap(33, 33, 33)
                                .addComponent(lblSelectCountry7)
                                .addGap(18, 18, 18)
                                .addComponent(btnApplyFilter))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbCountryName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(cmbStateList1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(cmbCityList1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateHealTechLocalNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateHealTechLocalNameActionPerformed
        // TODO add your handling code here:
        
        HealTechLocalEnterprise healTechLocalEnterprise = (HealTechLocalEnterprise) tblHealTechLocals.getValueAt(tblHealTechLocals.getSelectedRow(), 0);
        healTechLocalEnterprise.setName(txtHealTechLocalName.getText());

    }//GEN-LAST:event_btnUpdateHealTechLocalNameActionPerformed

    private void cmbCountryNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCountryNameActionPerformed
        // TODO add your handling code here:
        cmbStateList.setEnabled(true);
        populateStateList((CountryEnterprise) cmbCountryName.getSelectedItem(),cmbStateList);

    }//GEN-LAST:event_cmbCountryNameActionPerformed

    private void cmbStateListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStateListActionPerformed
        // TODO add your handling code here:
        cmbCityList.setEnabled(true);
        populateCityList((StateEnterprise)cmbStateList.getSelectedItem(),cmbCityList);
    }//GEN-LAST:event_cmbStateListActionPerformed

    private void cmbCityListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCityListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCityListActionPerformed

    private void btnUpdateCountryStateCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCountryStateCityActionPerformed
        // TODO add your handling code here:
        HealTechLocalEnterprise healTechLocalEnterprise = (HealTechLocalEnterprise) tblHealTechLocals.getValueAt(tblHealTechLocals.getSelectedRow(), 0);
        
        
        
                if(!(healTechLocalEnterprise.getAddress().getCity().equals((CityEnterprise)cmbCityList.getSelectedItem())))
                {
                    if(!(healTechLocalEnterprise.getAddress().getState().equals((StateEnterprise)cmbStateList.getSelectedItem())))
                    {
                        if(!(healTechLocalEnterprise.getAddress().getCountry().equals((CountryEnterprise)cmbCountryName.getSelectedItem())))
                        {
                            healTechLocalEnterprise.getAddress().setCountry((CountryEnterprise)cmbCountryName.getSelectedItem());
                            healTechLocalEnterprise.getAddress().setState((StateEnterprise)cmbStateList.getSelectedItem());
                            healTechLocalEnterprise.getAddress().setCity((CityEnterprise)cmbCityList.getSelectedItem());
                        
                        }
                        else
                        {
                            healTechLocalEnterprise.getAddress().setState((StateEnterprise)cmbStateList.getSelectedItem());
                            healTechLocalEnterprise.getAddress().setCity((CityEnterprise)cmbCityList.getSelectedItem());
                        }
                    }
                    else
                    {
                        healTechLocalEnterprise.getAddress().setCity((CityEnterprise)cmbCityList.getSelectedItem());
                    }
                }
        
        
    }//GEN-LAST:event_btnUpdateCountryStateCityActionPerformed

    private void btnUpdateAddressBasicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAddressBasicsActionPerformed
        // TODO add your handling code here:
        HealTechLocalEnterprise healTechLocalEnterprise = (HealTechLocalEnterprise) tblHealTechLocals.getValueAt(tblHealTechLocals.getSelectedRow(), 0);
        if(!(txtStreetName.getText().equals("")))
        {
            healTechLocalEnterprise.getAddress().setStreet(txtStreetName.getText());
        }
        if(!(txtZipcode.getText().equals("")))
        {
            healTechLocalEnterprise.getAddress().setZipcode((txtZipcode.getText()));
        }
    }//GEN-LAST:event_btnUpdateAddressBasicsActionPerformed

    private void cmbCountryName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCountryName1ActionPerformed
        // TODO add your handling code here:
        cmbStateList1.setEnabled(true);
        populateStateList((CountryEnterprise)cmbCountryName1.getSelectedItem(), cmbStateList1);
    }//GEN-LAST:event_cmbCountryName1ActionPerformed

    private void cmbStateList1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStateList1ActionPerformed
        // TODO add your handling code here:
        cmbCityList1.setEnabled(true);
        populateCityList((StateEnterprise)cmbStateList1.getSelectedItem(), cmbCityList1);
    }//GEN-LAST:event_cmbStateList1ActionPerformed

    private void cmbCityList1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCityList1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCityList1ActionPerformed

    private void btnApplyFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApplyFilterActionPerformed
        // TODO add your handling code here:
        CityEnterprise cityEnterprise = (CityEnterprise) cmbCityList1.getSelectedItem();
        HealTechLocalEnterprise healtechlocalEnterprise = null;
        DefaultTableModel dtm = (DefaultTableModel) tblHealTechLocals.getModel();
        dtm.setRowCount(0);
        for(Enterprise htlocal: cityEnterprise.getCityNetwork().getEnterpriseDirectory().getEnterpriseList())
        {
            if(htlocal.getClass() == HealTechLocalEnterprise.class)
            {
                healtechlocalEnterprise = (HealTechLocalEnterprise) htlocal;
                Object[] row = new Object[1];
                row[0] = healtechlocalEnterprise;
                dtm.addRow(row);

            }
        }
    }//GEN-LAST:event_btnApplyFilterActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        int selection = tblHealTechLocals.getSelectedRow();
        HealTechLocalEnterprise pharamacyEnterprise = (HealTechLocalEnterprise) tblHealTechLocals.getValueAt(selection, 0);

        txtCity.setText(pharamacyEnterprise.getAddress().getCity().getName());
        txtHealTechLocalName.setText(pharamacyEnterprise.getName());
        txtState.setText(pharamacyEnterprise.getAddress().getState().getName());
        txtStreetName.setText(pharamacyEnterprise.getAddress().getStreet());
        txtZipcode.setText((pharamacyEnterprise.getAddress().getZipcode()));
        populateCountryList(cmbCountryName);

        //cmbCountryName.setSelectedItem(pharamacyEnterprise.getAddress().getCountry());
        //cmbStateList.setSelectedItem(pharamacyEnterprise.getAddress().getState());
        //cmbCityList.setSelectedItem(pharamacyEnterprise.getAddress().getCity());
    }//GEN-LAST:event_btnViewDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApplyFilter;
    private javax.swing.JButton btnUpdateAddressBasics;
    private javax.swing.JButton btnUpdateCountryStateCity;
    private javax.swing.JButton btnUpdateHealTechLocalName;
    private javax.swing.JButton btnViewDetails;
    private javax.swing.JComboBox cmbCityList;
    private javax.swing.JComboBox cmbCityList1;
    private javax.swing.JComboBox cmbCountryName;
    private javax.swing.JComboBox cmbCountryName1;
    private javax.swing.JComboBox cmbStateList;
    private javax.swing.JComboBox cmbStateList1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblSelectCountry1;
    private javax.swing.JLabel lblSelectCountry2;
    private javax.swing.JLabel lblSelectCountry3;
    private javax.swing.JLabel lblSelectCountry4;
    private javax.swing.JLabel lblSelectCountry5;
    private javax.swing.JLabel lblSelectCountry6;
    private javax.swing.JLabel lblSelectCountry7;
    private javax.swing.JTable tblHealTechLocals;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtHealTechLocalName;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStreetName;
    private javax.swing.JTextField txtZipcode;
    // End of variables declaration//GEN-END:variables
private void populateCountryList(JComboBox cmbCountryName)
    {
        cmbCountryName.removeAllItems();
        CountryEnterprise countryEnterprise;
        
        for(Enterprise country: internationalNetwork.getEnterpriseDirectory().getEnterpriseList())
        {
            cmbCountryName.addItem((CountryEnterprise) country);
        }
        
    }

    private void populateStateList(CountryEnterprise countryEnterprise, JComboBox cmbStateList)
    {
        
        cmbStateList.removeAllItems();
        
        for(Enterprise state: countryEnterprise.getCountryNetwork().getEnterpriseDirectory().getEnterpriseList())
        {
            if(state.getClass() == StateEnterprise.class)
            cmbStateList.addItem((StateEnterprise) state);
        }
 
    }

    private void populateCityList(StateEnterprise stateEnterprise, JComboBox cmbCityList)
    {
                cmbCityList.removeAllItems();
        
        
        for(Enterprise city: stateEnterprise.getStateNetwork().getEnterpriseDirectory().getEnterpriseList())
        {
            cmbCityList.addItem((CityEnterprise) city);
            
        }
    }

}
