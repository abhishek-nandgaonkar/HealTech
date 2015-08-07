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

import baseClasses.labAssistant.LabAssistant;
import baseClasses.enterprise.HospitalEnterprise;
import baseClasses.network.Network;
import baseClasses.organization.LabOrganization;
import baseClasses.organization.Organization;
import baseClasses.person.Person;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Abhishek
 */
public class ManageLabAssistantInfo extends javax.swing.JPanel {

    /**
     * Creates new form ManageLabAssistantInfo
     */
    Network internationalNetwork;
    HospitalEnterprise hospitalEnterprise;
    JPanel updateLabAssistantCard;
    public ManageLabAssistantInfo(Network internationalNetwork, HospitalEnterprise hospitalEnterprise, JPanel updateLabAssistantCard) {
        initComponents();
        this.internationalNetwork = internationalNetwork;
        this.hospitalEnterprise = hospitalEnterprise;
        this.updateLabAssistantCard = updateLabAssistantCard;
        populateLabAssistantList();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLabAssistantList = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baseClasses/healtech logo.PNG"))); // NOI18N

        lblName2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblName2.setForeground(new java.awt.Color(0, 153, 51));
        lblName2.setText("Manage Lab Assistant Information");

        tblLabAssistantList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "UID", "Lab Assistant Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLabAssistantList);

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(0, 153, 0));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(437, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(lblName2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(248, 248, 248)
                .addComponent(jLabel1))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(lblName2)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(btnDelete)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedItem = tblLabAssistantList.getSelectedRow();
        LabAssistant labAssistant = (LabAssistant) tblLabAssistantList.getValueAt(selectedItem, 0);

        hospitalEnterprise.getOrganizationDirectory().getOrganizationList().remove(labAssistant);
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName2;
    private javax.swing.JTable tblLabAssistantList;
    // End of variables declaration//GEN-END:variables

    private void populateLabAssistantList()
    {
        DefaultTableModel dtm = (DefaultTableModel) tblLabAssistantList.getModel();
        dtm.setRowCount(0);
        LabOrganization labOrganization = null;
        LabAssistant labAssistant = null;
        
        for(Organization labAssistantOrg: hospitalEnterprise.getOrganizationDirectory().getOrganizationList())
        {
            if(labAssistantOrg.getClass() == LabOrganization.class)
            {
                labOrganization = (LabOrganization) labAssistantOrg;
                
                for(Person person: labOrganization.getPersonDirectory().getPersonList())
                {
                    labAssistant = (LabAssistant) person;
                    
                    Object[] row = new Object[2];
                    row[0] = labAssistant;
                    row[1] = labAssistant.getName().getFirstName() + " " + labAssistant.getName().getLastName();
                    dtm.addRow(row);
                    
                }
            }
        }
        
    }
}
