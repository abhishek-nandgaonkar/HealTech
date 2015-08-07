/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseClasses.roles;


import baseClasses.enterprise.CityEnterprise;
import baseClasses.enterprise.Enterprise;
import baseClasses.organization.Organization;
import baseClasses.userAccount.UserAccount;
import business.CentralAuthority;
import javax.swing.JPanel;
import userInterface.systemAdmin.SystemAdminWorkArea;

/**
 *
 * @author Abhishek
 */
public class SystemAdminRole extends Role
{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, CentralAuthority centralAuthority, UserAccount userAccount, Organization inOrganization, Enterprise inEnterprise, CityEnterprise inCityEnterprise)
    {
        System.out.println("Printing from system admin role: " + centralAuthority.getInternationalNetwork());
        return new SystemAdminWorkArea(centralAuthority.getInternationalNetwork());
    }



    
}
