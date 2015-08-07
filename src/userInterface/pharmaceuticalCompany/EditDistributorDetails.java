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
package userInterface.pharmaceuticalCompany;


import baseClasses.Address;
import baseClasses.Name;
import baseClasses.distributor.Distributor;
import baseClasses.enterprise.CityEnterprise;
import baseClasses.enterprise.CountryEnterprise;
import baseClasses.enterprise.Enterprise;
import baseClasses.enterprise.StateEnterprise;
import baseClasses.network.Network;
import baseClasses.organization.ManufacturingOrganization;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Abhishek
 */
public class EditDistributorDetails extends javax.swing.JPanel {

    /**
     * Creates new form EditDistributorDetails
     */
    Network internationalNetwork;
    Distributor distributor;
    JPanel manageDistributorsProfileCard;
    public EditDistributorDetails(Network internationalNework) {
        initComponents();
        this.internationalNetwork = internationalNework;
        this.distributor = distributor;
        this.manageDistributorsProfileCard = manageDistributorsProfileCard;
        populateCountryList();
        populateFields();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnClear = new javax.swing.JButton();
        lblName3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        calendar = new com.toedter.calendar.JCalendar();
        jLabel10 = new javax.swing.JLabel();
        txtStreet = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cmbCountryList = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        cmbStateList = new javax.swing.JComboBox();
        txtCity = new javax.swing.JTextField();
        cmbCityList = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtZipcode = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        btnClear2 = new javax.swing.JButton();
        txtState = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        lblName1 = new javax.swing.JLabel();
        btnClear3 = new javax.swing.JButton();

        btnClear.setBackground(new java.awt.Color(255, 255, 255));
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(0, 153, 0));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        setBackground(new java.awt.Color(255, 255, 255));

        lblName3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblName3.setForeground(new java.awt.Color(0, 153, 51));
        lblName3.setText("First Name");

        txtName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 153, 51));
        jLabel9.setText("Date of Birth");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 153, 51));
        jLabel10.setText("Street");

        txtStreet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStreetActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 51));
        jLabel6.setText("Country");

        cmbCountryList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbCountryList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCountryListActionPerformed(evt);
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

        txtCity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        cmbCityList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 51));
        jLabel5.setText("City");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 153, 51));
        jLabel7.setText("ZIP Code");

        txtZipcode.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnUpdate.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(0, 153, 0));
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnClear2.setBackground(new java.awt.Color(255, 255, 255));
        btnClear2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear2.setForeground(new java.awt.Color(0, 153, 0));
        btnClear2.setText("<< Back");
        btnClear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear2ActionPerformed(evt);
            }
        });

        txtState.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baseClasses/healtech logo.PNG"))); // NOI18N

        lblName1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblName1.setForeground(new java.awt.Color(0, 153, 51));
        lblName1.setText("                  Edit Distributor Details");

        btnClear3.setBackground(new java.awt.Color(255, 255, 255));
        btnClear3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear3.setForeground(new java.awt.Color(0, 153, 0));
        btnClear3.setText("Clear");
        btnClear3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClear3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblName1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblName3)
                                .addGap(28, 28, 28)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140)
                                .addComponent(jLabel9)
                                .addGap(81, 81, 81)
                                .addComponent(calendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnClear2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(12, 12, 12)))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbCityList, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(105, 105, 105)
                                        .addComponent(btnUpdate))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbCountryList, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbStateList, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(3, 3, 3)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtCity)
                                            .addComponent(txtState, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE))))))))
                .addContainerGap(265, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(193, 193, 193)
                    .addComponent(btnClear3)
                    .addContainerGap(885, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblName1)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblName3))
                    .addComponent(jLabel9)
                    .addComponent(calendar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCountryList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtState, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(cmbStateList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbCityList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnClear2)
                        .addGap(28, 28, 28))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(551, Short.MAX_VALUE)
                    .addComponent(btnClear3)
                    .addGap(90, 90, 90)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStreetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStreetActionPerformed

    private void cmbCountryListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCountryListActionPerformed
        // TODO add your handling code here:
        populateStateList((CountryEnterprise) cmbCountryList.getSelectedItem());
        
    }//GEN-LAST:event_cmbCountryListActionPerformed

    private void cmbStateListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStateListActionPerformed
        // TODO add your handling code here:
        populateCityList((StateEnterprise)cmbStateList.getSelectedItem());
    }//GEN-LAST:event_cmbStateListActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
       

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
       Address address = new Address();
        address.setCountry((CountryEnterprise)cmbCountryList.getSelectedItem());
        CityEnterprise cityEnterprise;
        StateEnterprise stateEnterprise;
        ManufacturingOrganization distributorOrganization;
        
        if(!(txtState.getText().equals("")))
        {
            CountryEnterprise countryEnterprise= (CountryEnterprise)cmbCountryList.getSelectedItem();
            //countryEnterprise.getCountryNetwork().getEnterpriseDirectory().getEnterpriseList().add(new StateEnterprise(txtState.getText()));
            stateEnterprise =(StateEnterprise) countryEnterprise.getCountryNetwork().getEnterpriseDirectory().createAndAddEnterprise(txtState.getText(), Enterprise.EnterpriseType.State,null,null,null,null,null);
            address.setState(stateEnterprise);
        }
        else
        {
            address.setState((StateEnterprise)cmbStateList.getSelectedItem());
        }
        
        if(!(txtCity.getText().equals("")))
        {
            CountryEnterprise countryEnterprise= (CountryEnterprise)cmbCountryList.getSelectedItem();
            stateEnterprise = (StateEnterprise) cmbStateList.getSelectedItem();
            cityEnterprise =(CityEnterprise) stateEnterprise.getStateNetwork().getEnterpriseDirectory().createAndAddEnterprise(txtCity.getText(), Enterprise.EnterpriseType.City,null,null,null,null,null);
            address.setCity(cityEnterprise);
        }
        else
        {
             address.setCity((CityEnterprise)cmbCityList.getSelectedItem());
            cityEnterprise = (CityEnterprise)cmbCityList.getSelectedItem();
            
        }
        
        address.setStreet(txtStreet.getText());
        address.setZipcode((txtZipcode.getText()));
        
        
        Name name = new Name();
        name.setFirstName(txtName.getText());
       
        distributor.setName(name);
        
   
        distributor.setDateOfBirth(calendar.getDate());
        

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnClear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear2ActionPerformed
        // TODO add your handling code here:
         CardLayout layout = (CardLayout) manageDistributorsProfileCard.getLayout();
         layout.previous(manageDistributorsProfileCard);
    }//GEN-LAST:event_btnClear2ActionPerformed

    private void btnClear3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClear3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClear3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClear2;
    private javax.swing.JButton btnClear3;
    private javax.swing.JButton btnUpdate;
    private com.toedter.calendar.JCalendar calendar;
    private javax.swing.JComboBox cmbCityList;
    private javax.swing.JComboBox cmbCountryList;
    private javax.swing.JComboBox cmbStateList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName3;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStreet;
    private javax.swing.JTextField txtZipcode;
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
            if(state.getClass() == StateEnterprise.class)
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

    private void populateFields()
    {
       
        CityEnterprise cityEnterprise = (distributor.getAddress().getCity());
    
        txtName.setText(distributor.getName().getFirstName());
       
        txtStreet.setText(distributor.getAddress().getStreet());
        txtZipcode.setText((distributor.getAddress().getZipcode()));
        StateEnterprise stateEnterprise = distributor.getAddress().getState();
        CountryEnterprise countryEnterprise = distributor.getAddress().getCountry();
        
        cmbCountryList.setSelectedItem(countryEnterprise);
        cmbStateList.setSelectedItem(stateEnterprise);
        cmbCityList.setSelectedItem(cityEnterprise);
        
    }


}
