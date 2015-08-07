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

import baseClasses.Address;
import baseClasses.enterprise.CityEnterprise;
import baseClasses.enterprise.CountryEnterprise;
import baseClasses.enterprise.Enterprise;
import baseClasses.enterprise.HospitalEnterprise;
import baseClasses.enterprise.StateEnterprise;
import baseClasses.network.Network;
import baseClasses.roles.AdminRole;

/**
 *
 * @author Abhishek
 */
public class AddNewHospital extends javax.swing.JPanel {

    /**
     * Creates new form AddNewHospital
     */
    Network internationalNetwork;
    
    public AddNewHospital(Network internationalNetwork) {
        initComponents();
        this.internationalNetwork = internationalNetwork;
        populateCountryList();
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
        lblName2 = new javax.swing.JLabel();
        cmbCountryList = new javax.swing.JComboBox();
        lblSelectCountry = new javax.swing.JLabel();
        lblSelectCountry1 = new javax.swing.JLabel();
        cmbStateList = new javax.swing.JComboBox();
        lblSelectCountry2 = new javax.swing.JLabel();
        cmbCityList = new javax.swing.JComboBox();
        txtCity = new javax.swing.JTextField();
        txtState = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtStreetName = new javax.swing.JTextField();
        lblSelectCountry3 = new javax.swing.JLabel();
        txtZipcode = new javax.swing.JTextField();
        lblSelectCountry4 = new javax.swing.JLabel();
        txtHospitalName = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnAddNewHospital = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lblSelectCountry6 = new javax.swing.JLabel();
        lblSelectCountry5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1591, 820));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baseClasses/healtech logo.PNG"))); // NOI18N

        lblName2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblName2.setForeground(new java.awt.Color(0, 153, 51));
        lblName2.setText("       Add New Hospital");

        cmbCountryList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cmbCountryList.setForeground(new java.awt.Color(0, 153, 51));
        cmbCountryList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCountryListActionPerformed(evt);
            }
        });

        lblSelectCountry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSelectCountry.setForeground(new java.awt.Color(0, 153, 51));
        lblSelectCountry.setText("Name of the Hospital:");

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

        jLabel2.setText("NOTE: Please select the option of Select One and enter the name if your State or City are not found in the list.");

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

        txtHospitalName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnClear.setBackground(new java.awt.Color(255, 255, 255));
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(0, 153, 0));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnAddNewHospital.setBackground(new java.awt.Color(255, 255, 255));
        btnAddNewHospital.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAddNewHospital.setForeground(new java.awt.Color(0, 153, 0));
        btnAddNewHospital.setText("Add New Hospital");
        btnAddNewHospital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewHospitalActionPerformed(evt);
            }
        });

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblSelectCountry6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSelectCountry6.setForeground(new java.awt.Color(0, 153, 51));
        lblSelectCountry6.setText("Password");

        lblSelectCountry5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSelectCountry5.setForeground(new java.awt.Color(0, 153, 51));
        lblSelectCountry5.setText("Username");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(724, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(141, 141, 141)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(394, 394, 394)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName2, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblSelectCountry4)
                            .addGap(40, 40, 40)
                            .addComponent(cmbCountryList, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAddNewHospital, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblSelectCountry1)
                                            .addGap(65, 65, 65)
                                            .addComponent(cmbStateList, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblSelectCountry2)
                                                .addComponent(jLabel10)
                                                .addComponent(lblSelectCountry3))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cmbCityList, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtStreetName, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(89, 89, 89)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblSelectCountry5)
                                            .addComponent(lblSelectCountry)
                                            .addComponent(lblSelectCountry6))))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtState)
                                    .addComponent(txtCity)
                                    .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(389, 389, 389)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtUsername)
                                    .addComponent(txtPassword))))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(lblName2)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCountryList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtStreetName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelectCountry3)
                    .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelectCountry)
                    .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSelectCountry5)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSelectCountry6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnAddNewHospital))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCountryListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCountryListActionPerformed
        // TODO add your handling code here:
        cmbStateList.setEnabled(true);
        populateStateList((CountryEnterprise) cmbCountryList.getSelectedItem());
        
    }//GEN-LAST:event_cmbCountryListActionPerformed

    private void cmbStateListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStateListActionPerformed
        // TODO add your handling code here:
        cmbCityList.setEnabled(true);
        populateCityList((StateEnterprise)cmbStateList.getSelectedItem());
        
    }//GEN-LAST:event_cmbStateListActionPerformed

    private void cmbCityListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCityListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCityListActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        cmbCountryList.setSelectedIndex(0);
        cmbStateList.setSelectedIndex(0);
        cmbCityList.setSelectedIndex(0);
        txtCity.setText("");
        txtHospitalName.setText("");
        txtState.setText("");
        txtStreetName.setText("");
        txtZipcode.setText("");
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnAddNewHospitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewHospitalActionPerformed
        // TODO add your handling code here:
        Address address = new Address();
        address.setCountry((CountryEnterprise)cmbCountryList.getSelectedItem());
        CityEnterprise cityEnterprise;
        StateEnterprise stateEnterprise;
        
        if(!(txtState.getText().equals("")))
        {
            CountryEnterprise countryEnterprise= (CountryEnterprise)cmbCountryList.getSelectedItem();
            //countryEnterprise.getCountryNetwork().getEnterpriseDirectory().getEnterpriseList().add(new StateEnterprise(txtState.getText()));
            stateEnterprise =(StateEnterprise) countryEnterprise.getCountryNetwork().getEnterpriseDirectory().createAndAddEnterprise(txtState.getText(), Enterprise.EnterpriseType.State,null,null,null,null, null);
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
            cityEnterprise =(CityEnterprise) stateEnterprise.getStateNetwork().getEnterpriseDirectory().createAndAddEnterprise(txtCity.getText(), Enterprise.EnterpriseType.City,null,null,null,null, null);
            address.setCity(cityEnterprise);
        }
        else
        {
             address.setCity((CityEnterprise)cmbCityList.getSelectedItem());
            cityEnterprise = (CityEnterprise)cmbCityList.getSelectedItem();
            
        }
        
        address.setStreet(txtStreetName.getText());
        address.setZipcode((txtZipcode.getText()));
        
        System.out.println("CityEnterprise" + cityEnterprise + " ");
        System.out.println(cityEnterprise.getCityNetwork());
        System.out.println(cityEnterprise.getCityNetwork().getEnterpriseDirectory());
        HospitalEnterprise hospitalEnterprise = (HospitalEnterprise) cityEnterprise.getCityNetwork().getEnterpriseDirectory().createAndAddEnterprise(txtHospitalName.getText(), 
                Enterprise.EnterpriseType.Hospital,txtUsername.getText(), String.valueOf(txtPassword.getPassword()), new AdminRole(),"Active", address);
        //hospitalEnterprise.setAddress(address);
        //hospitalEnterprise.getUserAccountDirectory().createUserAccount(txtUsername.getText(), String.valueOf(txtPassword.getPassword()), new AdminRole(),"Active");
    }//GEN-LAST:event_btnAddNewHospitalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewHospital;
    private javax.swing.JButton btnClear;
    private javax.swing.JComboBox cmbCityList;
    private javax.swing.JComboBox cmbCountryList;
    private javax.swing.JComboBox cmbStateList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblName2;
    private javax.swing.JLabel lblSelectCountry;
    private javax.swing.JLabel lblSelectCountry1;
    private javax.swing.JLabel lblSelectCountry2;
    private javax.swing.JLabel lblSelectCountry3;
    private javax.swing.JLabel lblSelectCountry4;
    private javax.swing.JLabel lblSelectCountry5;
    private javax.swing.JLabel lblSelectCountry6;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtHospitalName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtStreetName;
    private javax.swing.JTextField txtUsername;
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
            if(state.getClass() ==  StateEnterprise.class)
            cmbStateList.addItem((StateEnterprise) state);
        }
 
    }

    private void populateCityList(StateEnterprise stateEnterprise)
    {
                cmbCityList.removeAllItems();
        
        System.out.println("State Enterprise List size"+stateEnterprise.getStateNetwork().getEnterpriseDirectory().getEnterpriseList().size());
        for(Enterprise city: stateEnterprise.getStateNetwork().getEnterpriseDirectory().getEnterpriseList())
        {
            System.out.println("City Enterprise" + city);
            cmbCityList.addItem((CityEnterprise) city);
            
        }
    }
}
