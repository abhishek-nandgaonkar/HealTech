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
package userInterface.distributor;


import baseClasses.enterprise.Enterprise;
import baseClasses.enterprise.PharmaceuticalCompanyEnterprise;
import baseClasses.enterprise.PharmacyEnterprise;
import baseClasses.medicine.Medicine;
import baseClasses.order.Order;
import baseClasses.order.OrderItem;
import baseClasses.organization.DistributorOrganization;
import baseClasses.userAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import workQueue.MedicineOrderRequest;

import workQueue.WorkRequest;

/**
 *
 * @author Abhishek
 */
public class MedicineOrderRequestDetailsPanel extends javax.swing.JPanel {

    /**
     * Creates new form MedicineRequestDetailsPanel
     */
    private Enterprise inEnterprise;
    //private PharmacyEnterprise pharmacyEnterprise;
    private UserAccount userAccount;
    private DistributorOrganization distributorOrganization;
    //ManufacturingOrganization manufacturinOrganization;
    private PharmaceuticalCompanyEnterprise pharmaceuticalCompanyEnterprise;
    
    public MedicineOrderRequestDetailsPanel(DistributorOrganization distributorOrganization, UserAccount userAccount, PharmaceuticalCompanyEnterprise pharmaceuticalCompanyEnterprise) {
        initComponents();
        //this.pharmacyEnterprise = pharmacyEnterprise;
        this.distributorOrganization = distributorOrganization;
        this.userAccount = userAccount;
        this.pharmaceuticalCompanyEnterprise = pharmaceuticalCompanyEnterprise;
        //this.manufacturinOrganization = manufacturingOrganization;
        
        populateMedicineTable();
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
        tblDrugDetails = new javax.swing.JTable();
        btnAcceptOrder = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        lblName1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblName1.setForeground(new java.awt.Color(0, 153, 51));
        lblName1.setText("Medicine Order Request Details");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baseClasses/healtech logo.PNG"))); // NOI18N

        tblDrugDetails.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblDrugDetails.setForeground(new java.awt.Color(0, 204, 51));
        tblDrugDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Order", "Status", "Notes"
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
        jScrollPane1.setViewportView(tblDrugDetails);
        if (tblDrugDetails.getColumnModel().getColumnCount() > 0) {
            tblDrugDetails.getColumnModel().getColumn(0).setResizable(false);
            tblDrugDetails.getColumnModel().getColumn(1).setResizable(false);
            tblDrugDetails.getColumnModel().getColumn(2).setResizable(false);
        }

        btnAcceptOrder.setBackground(new java.awt.Color(255, 255, 255));
        btnAcceptOrder.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAcceptOrder.setForeground(new java.awt.Color(0, 153, 0));
        btnAcceptOrder.setText("Approve Order");
        btnAcceptOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(506, 506, 506)
                .addComponent(btnAcceptOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(392, 392, 392)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(415, 415, 415)
                        .addComponent(lblName1, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(451, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblName1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnAcceptOrder)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAcceptOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptOrderActionPerformed
        // TODO add your handling code here:
        //jSplitPane1.setRightComponent(new PurchaseNewDrugs(internationalNetwork, userAccount));
        int selectedRow = tblDrugDetails.getSelectedRow();
        
        if(selectedRow > -1)
        {
            Order order = (Order) tblDrugDetails.getValueAt(selectedRow, 0);
            pharmaceuticalCompanyEnterprise.getOrderList().add(order);
            Medicine med;

            for(OrderItem orderItem: order.getOrderItemList())
            {
                med = orderItem.getMedicine();

                pharmaceuticalCompanyEnterprise.getMedicineList().add(med);
            }
        }
        else
            JOptionPane.showMessageDialog(this, "Please select an item to proceed", "Error", JOptionPane.ERROR_MESSAGE);
            
        
    }//GEN-LAST:event_btnAcceptOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceptOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName1;
    private javax.swing.JTable tblDrugDetails;
    // End of variables declaration//GEN-END:variables

    private void populateMedicineTable()
    {
        DefaultTableModel dtm = (DefaultTableModel) tblDrugDetails.getModel();
        dtm.setRowCount(0);
        System.out.println("Printing from medicine details panel");
        //System.out.println("Pharma company" + pharmacyEnterprise);
        //System.out.println("medicinelist length: " + pharmacyEnterprise.getMedicineList());
        MedicineOrderRequest medicineOrderWorkRequest = null;
        
        for(WorkRequest wr: userAccount.getWorkQueue().getWorkRequestList())
        {
            if(wr.getClass() == MedicineOrderRequest.class)
            {
                medicineOrderWorkRequest = (MedicineOrderRequest) wr;
                 Object[] row = new Object[3];
                 row[0] = medicineOrderWorkRequest;
                 row[1] = medicineOrderWorkRequest.getStatus();
                 row[2] = medicineOrderWorkRequest.getMessage();
                 dtm.addRow(row);
            }
        }

    }
}
