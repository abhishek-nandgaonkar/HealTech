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
import baseClasses.enterprise.ManufacturingEnterprise;
import baseClasses.enterprise.StateEnterprise;
import baseClasses.network.Network;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhishek
 */
public class ManageManufacturerPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageManufacturingsPanel
     */
    Network internationalNetwork;
    
    public ManageManufacturerPanel(Network internationalNetwork) {
        initComponents();
        this.internationalNetwork = internationalNetwork;
        populateCountryList(cmbCountryName1);
        cmbCityList1.setEnabled(false);
        cmbStateList1.setEnabled(false);
        
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
        tblManufacturers = new javax.swing.JTable();
        btnUpdateManufacturerName = new javax.swing.JButton();
        txtManufacturingName = new javax.swing.JTextField();
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
        cmbCountryName1 = new javax.swing.JComboBox();
        lblSelectCountry5 = new javax.swing.JLabel();
        lblSelectCountry6 = new javax.swing.JLabel();
        cmbStateList1 = new javax.swing.JComboBox();
        cmbCityList1 = new javax.swing.JComboBox();
        lblSelectCountry7 = new javax.swing.JLabel();
        btnApplyFilter = new javax.swing.JButton();
        btnViewDetails = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1591, 820));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baseClasses/healtech logo.PNG"))); // NOI18N

        lblName1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblName1.setForeground(new java.awt.Color(0, 153, 51));
        lblName1.setText("Manage Manufacturers");

        tblManufacturers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Manufacturer Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblManufacturers);
        if (tblManufacturers.getColumnModel().getColumnCount() > 0) {
            tblManufacturers.getColumnModel().getColumn(0).setResizable(false);
        }

        btnUpdateManufacturerName.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateManufacturerName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdateManufacturerName.setForeground(new java.awt.Color(0, 153, 0));
        btnUpdateManufacturerName.setText("Update Manufacturer Name");
        btnUpdateManufacturerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateManufacturerNameActionPerformed(evt);
            }
        });

        txtManufacturingName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

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

        cmbCountryName1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbCountryName1.setForeground(new java.awt.Color(0, 153, 51));
        cmbCountryName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCountryName1ActionPerformed(evt);
            }
        });

        lblSelectCountry5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSelectCountry5.setForeground(new java.awt.Color(0, 153, 51));
        lblSelectCountry5.setText("Select Country:");

        lblSelectCountry6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSelectCountry6.setForeground(new java.awt.Color(0, 153, 51));
        lblSelectCountry6.setText("Select State:");

        cmbStateList1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbStateList1.setForeground(new java.awt.Color(0, 153, 51));
        cmbStateList1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStateList1ActionPerformed(evt);
            }
        });

        cmbCityList1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cmbCityList1.setForeground(new java.awt.Color(0, 153, 51));
        cmbCityList1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCityList1ActionPerformed(evt);
            }
        });

        lblSelectCountry7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSelectCountry7.setForeground(new java.awt.Color(0, 153, 51));
        lblSelectCountry7.setText("Select City:");

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
        btnViewDetails.setText("View Manufacturer Details");
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
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblName1, javax.swing.GroupLayout.PREFERRED_SIZE, 1244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblSelectCountry5)
                                            .addGap(40, 40, 40)
                                            .addComponent(cmbCountryName1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblSelectCountry6)
                                                .addGap(65, 65, 65)
                                                .addComponent(cmbStateList1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblSelectCountry7)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cmbCityList1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnApplyFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(2, 2, 2)))
                            .addComponent(btnViewDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(btnUpdateManufacturerName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtManufacturingName, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addGap(31, 31, 31))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(lblName1)
                        .addGap(58, 58, 58)
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
                                .addComponent(txtManufacturingName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(btnUpdateManufacturerName)))
                        .addGap(34, 34, 34)
                        .addComponent(btnUpdateCountryStateCity))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtStreetName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewDetails))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelectCountry3)
                    .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnUpdateAddressBasics)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCountryName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSelectCountry5))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblSelectCountry6))
                            .addComponent(cmbStateList1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCityList1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSelectCountry7))
                        .addGap(38, 38, 38)
                        .addComponent(btnApplyFilter)
                        .addGap(66, 66, 66))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateManufacturerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateManufacturerNameActionPerformed
        // TODO add your handling code here:
        
        ManufacturingEnterprise manufacturingEnterprise = (ManufacturingEnterprise) tblManufacturers.getValueAt(tblManufacturers.getSelectedRow(), 0);
        manufacturingEnterprise.setName(txtManufacturingName.getText());

    }//GEN-LAST:event_btnUpdateManufacturerNameActionPerformed

    private void cmbCountryNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCountryNameActionPerformed
        // TODO add your handling code here:

        populateStateList((CountryEnterprise) cmbCountryName.getSelectedItem(),cmbStateList);

    }//GEN-LAST:event_cmbCountryNameActionPerformed

    private void cmbStateListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStateListActionPerformed
        // TODO add your handling code here:

        populateCityList((StateEnterprise)cmbStateList.getSelectedItem(),cmbCityList);
    }//GEN-LAST:event_cmbStateListActionPerformed

    private void cmbCityListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCityListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCityListActionPerformed

    private void btnUpdateCountryStateCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateCountryStateCityActionPerformed
        // TODO add your handling code here:
        ManufacturingEnterprise manufacturingEnterprise = (ManufacturingEnterprise) tblManufacturers.getValueAt(tblManufacturers.getSelectedRow(), 0);
        
        
        
                if(!(manufacturingEnterprise.getAddress().getCity().equals((CityEnterprise)cmbCityList.getSelectedItem())))
                {
                    if(!(manufacturingEnterprise.getAddress().getState().equals((StateEnterprise)cmbStateList.getSelectedItem())))
                    {
                        if(!(manufacturingEnterprise.getAddress().getCountry().equals((CountryEnterprise)cmbCountryName.getSelectedItem())))
                        {
                            manufacturingEnterprise.getAddress().setCountry((CountryEnterprise)cmbCountryName.getSelectedItem());
                            manufacturingEnterprise.getAddress().setState((StateEnterprise)cmbStateList.getSelectedItem());
                            manufacturingEnterprise.getAddress().setCity((CityEnterprise)cmbCityList.getSelectedItem());
                        
                        }
                        else
                        {
                            manufacturingEnterprise.getAddress().setState((StateEnterprise)cmbStateList.getSelectedItem());
                            manufacturingEnterprise.getAddress().setCity((CityEnterprise)cmbCityList.getSelectedItem());
                        }
                    }
                    else
                    {
                        manufacturingEnterprise.getAddress().setCity((CityEnterprise)cmbCityList.getSelectedItem());
                    }
                }
        
        
    }//GEN-LAST:event_btnUpdateCountryStateCityActionPerformed

    private void btnUpdateAddressBasicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateAddressBasicsActionPerformed
        // TODO add your handling code here:
        ManufacturingEnterprise manufacturingEnterprise = (ManufacturingEnterprise) tblManufacturers.getValueAt(tblManufacturers.getSelectedRow(), 0);
        if(!(txtStreetName.getText().equals("")))
        {
            manufacturingEnterprise.getAddress().setStreet(txtStreetName.getText());
        }
        if(!(txtZipcode.getText().equals("")))
        {
            manufacturingEnterprise.getAddress().setZipcode((txtZipcode.getText()));
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
        ManufacturingEnterprise manufacturingEnterpirse = null;
        DefaultTableModel dtm = (DefaultTableModel) tblManufacturers.getModel();
        dtm.setRowCount(0);
        for(Enterprise manufacturer: cityEnterprise.getCityNetwork().getEnterpriseDirectory().getEnterpriseList())
        {
            if(manufacturer.getClass() == ManufacturingEnterprise.class)
            {
                manufacturingEnterpirse = (ManufacturingEnterprise) manufacturer;
                Object[] row = new Object[1];
                row[0] = manufacturingEnterpirse;
                dtm.addRow(row);
                
            }
        }
    }//GEN-LAST:event_btnApplyFilterActionPerformed

    private void btnViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewDetailsActionPerformed
        // TODO add your handling code here:
        int selection = tblManufacturers.getSelectedRow();
        ManufacturingEnterprise pharmaceuticalCompanyEnterprise = (ManufacturingEnterprise) tblManufacturers.getValueAt(selection, 0);

        txtCity.setText(pharmaceuticalCompanyEnterprise.getAddress().getCity().getName());
        txtManufacturingName.setText(pharmaceuticalCompanyEnterprise.getName());
        txtState.setText(pharmaceuticalCompanyEnterprise.getAddress().getState().getName());
        txtStreetName.setText(pharmaceuticalCompanyEnterprise.getAddress().getStreet());
        txtZipcode.setText((pharmaceuticalCompanyEnterprise.getAddress().getZipcode()));
        populateCountryList(cmbCountryName);

        //cmbCountryName.setSelectedItem(pharmaceuticalCompanyEnterprise.getAddress().getCountry());
        //cmbStateList.setSelectedItem(pharmaceuticalCompanyEnterprise.getAddress().getState());
        //cmbCityList.setSelectedItem(pharmaceuticalCompanyEnterprise.getAddress().getCity());
    }//GEN-LAST:event_btnViewDetailsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApplyFilter;
    private javax.swing.JButton btnUpdateAddressBasics;
    private javax.swing.JButton btnUpdateCountryStateCity;
    private javax.swing.JButton btnUpdateManufacturerName;
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
    private javax.swing.JTable tblManufacturers;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtManufacturingName;
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