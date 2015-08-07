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

//import Business.DB4OUtil.DB4OUtil;
import baseClasses.enterprise.CityEnterprise;
import baseClasses.enterprise.Enterprise;
import baseClasses.organization.Organization;
import baseClasses.userAccount.UserAccount;
import business.CentralAuthority;
import business.db4OUtilpack.DB4OUtil;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

/**
 *
 * @author Abhishek
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    private CentralAuthority centralAuthority;
    UserAccount userAccount;
    Organization inOrganization;
    Enterprise  inEnterprise;
    CityEnterprise inCityEnterprise;
    private LoginForm loginForm;
    public JMenuBar menubar = new JMenuBar();;
    //menubar.add(Box.createRigidArea(new Dimension(100,25)));
    DB4OUtil db4OUtil;
    public MainFrame(CentralAuthority centralAuthority,UserAccount userAccount,Organization inOrganization,Enterprise inEnterprise, CityEnterprise inCityEnterprise, DB4OUtil db4OUtil, LoginForm loginForm) {
        initComponents();
       // menubar.add(Box.createRigidArea(new Dimension(100,25)));
        menubar.setPreferredSize(new Dimension(100,25));
        System.out.println("Printing from main frame: " + centralAuthority + centralAuthority.getInternationalNetwork());
        this.centralAuthority = centralAuthority;
        this.db4OUtil = db4OUtil;
        System.out.println("main frame db4outil" + db4OUtil);
        this.userAccount = userAccount;
        this.inEnterprise = inEnterprise;
        this.inOrganization = inOrganization;
        this.inCityEnterprise = inCityEnterprise;
        this.loginForm = loginForm;
        Toolkit tk = Toolkit.getDefaultToolkit();  
        int xSize = ((int) tk.getScreenSize().getWidth());  
        int ySize = ((int) tk.getScreenSize().getHeight());  
        this.setSize(xSize,ySize-45); 
        //this.setSize(java.awt.Toolkit.getDefaultToolkit().getScreenSize());
        System.out.println("java.awt.Toolkit.getDefaultToolkit().getScreenSize()" + java.awt.Toolkit.getDefaultToolkit().getScreenSize());
        System.out.println("MainFrame size: " + this.getSize());
        userProcessContainer.setSize(this.getSize());
        System.out.println("UPC size: " + userProcessContainer.getSize());
        this.setTitle("HEALTECH H.I.S.");
        
        URL iconURL = getClass().getResource("healtech icon 48x48.png");
        ImageIcon icon = new ImageIcon(iconURL);
        this.setIconImage(icon.getImage());
        
         
        
        JMenu file = new JMenu("File");
        //JMenu edit = new JMenu("Edit");
        //JMenu preferences = new JMenu("Preferences");
        JMenu exit = new JMenu("Exit");
        file.setMnemonic(KeyEvent.VK_F);

        JMenuItem miExit = new JMenuItem("Logout and Exit");
        JMenuItem miLogout = new JMenuItem("Logout");
        miExit.setMnemonic(KeyEvent.VK_E);
        miExit.setToolTipText("Logout and Exit application");
        
        miExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event)
            {
                logout();
                System.exit(0);
            }
        });

                this.addWindowListener(new java.awt.event.WindowAdapter() {
    @Override
    public void windowClosing(java.awt.event.WindowEvent windowEvent) {
        if (JOptionPane.showConfirmDialog(null,"Are you sure to close this window?", "Really Closing?",  JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION){
            System.out.println("Red Cross was clicked");
            logout();
            System.exit(0);
        }
        
    }
});
        
        miLogout.setMnemonic(KeyEvent.VK_E);
        miLogout.setToolTipText("Logout");
        
        miLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent event)
            {
                logout();
                
                // comment out the below code.. its is just for testing
                
                
//                LoginForm loginForm = new LoginForm();
//        loginForm.setVisible(true);
//        loginForm.setEnabled(true);
        // db4OUtil.clearSystem();
        //db4OUtil.storeSystem(centralAuthority);
        //this.setVisible(false);
        //this.setEnabled(false);
        //this.dispose();
                
            }

        });
        
        file.add(miLogout);
        exit.add(miExit);
        
        
        menubar.add(file);
        //menubar.add(edit);
       // menubar.add(preferences);
        menubar.add(exit);
        
        
        setJMenuBar(menubar);
       
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        System.out.println();
        //System.out.println(userAccount.getRole());
       
        userProcessContainer.add(userAccount.getRole().createWorkArea(userProcessContainer,centralAuthority,userAccount,inOrganization,inEnterprise,inCityEnterprise));
        layout.next(userProcessContainer);
    }
    
    public void logout()
    {
        //LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
        loginForm.setEnabled(true);
        // db4OUtil.clearSystem();
        db4OUtil.storeSystem(centralAuthority);
        this.setVisible(false);
        this.setEnabled(false);
        this.dispose();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userProcessContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userProcessContainer.setBackground(new java.awt.Color(255, 255, 255));
        userProcessContainer.setLayout(new java.awt.CardLayout());
        getContentPane().add(userProcessContainer, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel userProcessContainer;
    // End of variables declaration//GEN-END:variables
}
