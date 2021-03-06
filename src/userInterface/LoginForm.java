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
package userInterface;

import baseClasses.enterprise.CityEnterprise;
import baseClasses.enterprise.CountryEnterprise;
import baseClasses.enterprise.Enterprise;
import baseClasses.enterprise.FDAEnterprise;
import baseClasses.enterprise.StateEnterprise;
import baseClasses.network.Network;
import baseClasses.organization.DrugAdminOrganization;
import baseClasses.organization.Organization;
import baseClasses.userAccount.UserAccount;
import business.CentralAuthority;
import business.db4OUtilpack.DB4OUtil;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Abhishek
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    private CentralAuthority centralAuthority;
    private DB4OUtil db4OUtil = DB4OUtil.getInstance();

    public LoginForm() {
        //centralAuthority = ConfigureCentralAuthority.initialize();
        URL iconURL = getClass().getResource("healtech icon 48x48.png");
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
        //CentralAuthority centralAuthority = CentralAuthority.getInstance();
        centralAuthority = db4OUtil.retrieveSystem();
        Network internationalNetwork = centralAuthority.getInternationalNetwork();
        // System.out.println("" + centralAuthority + internationalNetwork);

      //Creates a FileReader Object
//        try {
//            File file = new File("Hello1.txt");
//            FileWriter writer = null;
//            writer = new FileWriter(file);
//            // Writes the content to the file
//            writer.write("This\n is\n an\n example\n");
//            writer.flush();
//            writer.close();
//            FileReader fr;
//            fr = new FileReader(file);
//            char[] a = new char[50];
//            fr.read(a); // reads the content to the array
//            for (char c : a) {
//                System.out.print(c); //prints the characters one by one
//            }
//            fr.close();
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(LoginForm.class.getName()).log(Level.SEVERE, null, ex);
//        }

        try {
            initComponents();
            this.setLocationRelativeTo(null);
            this.setTitle("Login Screen");

            KeyListener keyListener = new KeyListener() {

                @Override
                public void keyTyped(KeyEvent e) {

                }

                @Override
                public void keyPressed(KeyEvent e) {

                    if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                        validateUser();
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {

                }
            };

            txtPassword.addKeyListener(keyListener);
            btnLogin.addKeyListener(keyListener);
            txtUsername.addKeyListener(keyListener);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        btnClear = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();

        jLabel5.setText("jLabel5");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/baseClasses/healtech mid.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 51));
        jLabel2.setText("                  Login Page");

        lblUserName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(0, 153, 51));
        lblUserName.setText("Username");

        lblPassword.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(0, 153, 51));
        lblPassword.setText("Password");

        btnClear.setBackground(new java.awt.Color(255, 255, 255));
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnClear.setForeground(new java.awt.Color(0, 153, 0));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 153, 0));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtUsername.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogin))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblPassword)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lblUserName)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel1)))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserName)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnLogin))
                .addGap(53, 53, 53))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        if (!(txtUsername.getText().isEmpty())) {
            if (!(String.valueOf(txtPassword.getPassword()).equals(""))) {
                if (((Pattern.matches("^[a-zA-Z\\s ?]+", txtUsername.getText())))) {
                    validateUser();
                } else {
                    JOptionPane.showMessageDialog(this, "Please enter valid values", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please enter a value for Password.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Please enter a value for Username.", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        txtUsername.setText("");
        txtPassword.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Method to Validate User
    public void validateUser() {
        String userName = txtUsername.getText();
        char[] passwordCharArray = txtPassword.getPassword();
        String password = String.valueOf(passwordCharArray);
        System.out.println("Username entered:" + userName);
        System.out.println("Password entered:" + password);
        UserAccount userAccount = null;

        //Checking in System's User Account Directory
        userAccount = centralAuthority.getUserAccountDirectory().authenticateUser(userName, password);
        System.out.println("UserAccount central authority level: " + userAccount);

        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        CityEnterprise inCityEnterprise = null;
        if (userAccount == null) {
            System.out.println("Central Authority ***********************************" + centralAuthority);
            //Go inside each network to check each enterprise
            for (Enterprise countryEnterprise : centralAuthority.getInternationalNetwork().getEnterpriseDirectory().getEnterpriseList()) {
                if (countryEnterprise.getClass() == CountryEnterprise.class) {
                    if (userAccount != null) {
                        break;
                    }
                    CountryEnterprise country = (CountryEnterprise) countryEnterprise;
                    Network countryNetwork = country.getCountryNetwork();
                    userAccount = countryEnterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    System.out.println("UserAccount country level: " + userAccount);

                    //since user account found already, we skip the rest
                    if (userAccount != null) {
                        break;
                    }

                    for (Enterprise stateEnterprise : countryNetwork.getEnterpriseDirectory().getEnterpriseList()) {

                        if (stateEnterprise.getClass() == FDAEnterprise.class) {
                            FDAEnterprise fda = (FDAEnterprise) stateEnterprise;
                            DrugAdminOrganization drugAdminOrganization = null;

                            if (userAccount == null) {
                                System.out.println("User Account" + userAccount);
                                userAccount = fda.getUserAccountDirectory().authenticateUser(userName, password);

                                if (userAccount != null) {
                                    inEnterprise = stateEnterprise;
                                    System.out.println("User Account Populated" + userAccount);
                                    break;
                                }
                                for (Organization org : fda.getOrganizationDirectory().getOrganizationList()) {
                                    if (org.getClass() == DrugAdminOrganization.class) {
                                        drugAdminOrganization = (DrugAdminOrganization) org;

                                        if (userAccount == null) {
                                            userAccount = drugAdminOrganization.getUserAccountDirectory().authenticateUser(userName, password);

                                            if (userAccount != null) {
                                                inEnterprise = fda;
                                                inOrganization = drugAdminOrganization;
                                                break;
                                            }
                                        }
                                    }
                                }

                            }
//                             if (userAccount != null) {
//                                    System.out.println("User Account Populated" + userAccount);
//                                    break;
//                                }
                        }

                        if (stateEnterprise.getClass() == StateEnterprise.class) {
                            StateEnterprise state = (StateEnterprise) stateEnterprise;
                            Network stateNetwork = state.getStateNetwork();

                            for (Enterprise cityEnterprise : stateNetwork.getEnterpriseDirectory().getEnterpriseList()) {

                                CityEnterprise city = (CityEnterprise) cityEnterprise;
                                Network cityNetwork = city.getCityNetwork();

                                for (Enterprise enterprise : cityNetwork.getEnterpriseDirectory().getEnterpriseList()) {
                                    if (userAccount != null) {
                                        break;
                                    }

                                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                                    System.out.println("UserAccount city enterprise level: " + userAccount);

                                    if (userAccount == null) {
                                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                            userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                                            System.out.println("UserAccount organization level: " + userAccount);
                                            if (userAccount != null) {
                                                inEnterprise = enterprise;
                                                inOrganization = organization;
                                                inCityEnterprise = city;
                                                break;
                                            }
                                        }
                                    } else {
                                        System.out.println("User account found at city enterprise level");
                                        inEnterprise = enterprise;
                                        inCityEnterprise = city;
                                        inOrganization = null;
                                        break;
                                    }
                                    if (inOrganization != null) {
                                        break;
                                    }
                                    if (userAccount != null) {
                                        break;
                                    }
                                }
                            }
                        }
                        if (stateEnterprise.getClass() == FDAEnterprise.class) {
                            FDAEnterprise fda = (FDAEnterprise) stateEnterprise;

                            if (userAccount == null) {
                                System.out.println("User Account" + userAccount);
                                userAccount = fda.getUserAccountDirectory().authenticateUser(userName, password);

                                if (userAccount != null) {
                                    System.out.println("User Account Populated" + userAccount);
                                    break;

                                }

                            }
                        }

                    }

                    if (inEnterprise != null) {
                        break;
                    }
                }
            }
        }

        if (userAccount == null) {
            System.out.println("UserAccount: " + userAccount);
            JOptionPane.showMessageDialog(this, "Invalid Username or Password", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            txtUsername.setText("");
            txtPassword.setText("");
            System.out.println("login frame db4outil" + db4OUtil);
            MainFrame mainFrame = new MainFrame(centralAuthority, userAccount, inOrganization, inEnterprise, inCityEnterprise, db4OUtil, this);
            JOptionPane.showMessageDialog(this, "You are now logged in as " + userAccount.getUsername(), "Information", JOptionPane.INFORMATION_MESSAGE);
            //MainFrame mainFrame = new MainFrame(centralAuthority, userAccount, inOrganization, inEnterprise, inCityEnterprise);

            mainFrame.setVisible(true);
            this.setVisible(false);
            //this.dispose();

            //CardLayout layout = (CardLayout) container.getLayout();
            //container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, ecoSystem));
            //layout.next(container);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnLogin;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
