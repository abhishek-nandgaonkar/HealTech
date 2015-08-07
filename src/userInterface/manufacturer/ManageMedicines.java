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
package userInterface.manufacturer;

import baseClasses.enterprise.Enterprise;
import baseClasses.enterprise.PharmaceuticalCompanyEnterprise;
import baseClasses.medicine.Medicine;
import baseClasses.organization.ManufacturingOrganization;
import baseClasses.organization.Organization;
import baseClasses.userAccount.UserAccount;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhishek
 */
public class ManageMedicines extends javax.swing.JPanel {

    /**
     * Creates new form ManageMedicines
     */
    Enterprise inEnterprise;
    UserAccount userAccount;
    Organization inOrganization;
    ManufacturingOrganization manufacturingOrganization;
    PharmaceuticalCompanyEnterprise pharmaceuticalCompanyEnterprise;
    
    public ManageMedicines(Enterprise inEnterprise, UserAccount userAccount, Organization inOrganization) {
        initComponents();
        this.inEnterprise = inEnterprise;
        this.userAccount = userAccount;
        this.inOrganization = inOrganization;
        
        if(inOrganization.getClass() == ManufacturingOrganization.class)
        {
            manufacturingOrganization = (ManufacturingOrganization) inOrganization;
        }
        pharmaceuticalCompanyEnterprise = (PharmaceuticalCompanyEnterprise) inEnterprise;
        
        
        populateMedsTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDrugDetails = new javax.swing.JTable();
        txtQuantity = new javax.swing.JTextField();
        lblName4 = new javax.swing.JLabel();
        btnUpdateMedicine = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblName5 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        lblName1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblName1.setForeground(new java.awt.Color(0, 153, 51));
        lblName1.setText("Manage Medicines ");

        tblDrugDetails.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblDrugDetails.setForeground(new java.awt.Color(0, 204, 51));
        tblDrugDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine", "Availability", "Quantity", "Price per unit"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDrugDetails);
        if (tblDrugDetails.getColumnModel().getColumnCount() > 0) {
            tblDrugDetails.getColumnModel().getColumn(0).setResizable(false);
            tblDrugDetails.getColumnModel().getColumn(1).setResizable(false);
            tblDrugDetails.getColumnModel().getColumn(2).setResizable(false);
            tblDrugDetails.getColumnModel().getColumn(3).setResizable(false);
        }

        txtQuantity.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtQuantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantityActionPerformed(evt);
            }
        });

        lblName4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblName4.setForeground(new java.awt.Color(0, 153, 51));
        lblName4.setText("Update Quantity");

        btnUpdateMedicine.setBackground(new java.awt.Color(255, 255, 255));
        btnUpdateMedicine.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUpdateMedicine.setForeground(new java.awt.Color(0, 153, 0));
        btnUpdateMedicine.setText("Update Medicine");
        btnUpdateMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMedicineActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baseClasses/healtech logo.PNG"))); // NOI18N

        lblName5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblName5.setForeground(new java.awt.Color(0, 153, 51));
        lblName5.setText("Update Price Per Unit");

        txtPrice.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(761, Short.MAX_VALUE)
                .addComponent(lblName5)
                .addGap(18, 18, 18)
                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(321, 321, 321))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(1406, 1406, 1406)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(268, 268, 268)
                                    .addComponent(lblName4)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(394, 394, 394)
                                    .addComponent(btnUpdateMedicine))))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(477, 477, 477)
                            .addComponent(lblName1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName5))
                .addContainerGap(519, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblName1)
                            .addGap(141, 141, 141)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblName4))
                            .addGap(103, 103, 103)
                            .addComponent(btnUpdateMedicine))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(71, 71, 71)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(19, 19, 19)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantityActionPerformed

    private void btnUpdateMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMedicineActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDrugDetails.getSelectedRow();

        Medicine medicine = (Medicine) tblDrugDetails.getValueAt(selectedRow, 0);
        
        medicine.setQuantity(Integer.parseInt(txtQuantity.getText()));
        medicine.setPrice(Float.parseFloat(txtPrice.getText()));
    }//GEN-LAST:event_btnUpdateMedicineActionPerformed

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdateMedicine;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName1;
    private javax.swing.JLabel lblName4;
    private javax.swing.JLabel lblName5;
    private javax.swing.JTable tblDrugDetails;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables

    private void populateMedsTable()
    {
        DefaultTableModel dtm = (DefaultTableModel) tblDrugDetails.getModel();
        dtm.setRowCount(0);
        
        for(Medicine medicine: manufacturingOrganization.getMedicineList())
        {
            Object[] row = new Object[4];
            row[0] = medicine;
            row[1] = medicine.getDrug();
            row[2] = medicine.getQuantity();
            row[3] = medicine.getPrice();
            dtm.addRow(row);
        }
    }
}
