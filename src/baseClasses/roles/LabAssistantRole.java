package baseClasses.roles;


import baseClasses.enterprise.CityEnterprise;
import baseClasses.enterprise.Enterprise;
import baseClasses.location.CountryDirectory;
import baseClasses.organization.Organization;
import baseClasses.userAccount.UserAccount;
import business.CentralAuthority;
import javax.swing.JPanel;

import userInterface.lab.LabOrganizationWorkArea;

/**
 *
 * @author Abhishek
 */
public class LabAssistantRole extends Role
{

    private CountryDirectory countryDirectory;
    
    public LabAssistantRole()
    {
        this.countryDirectory = countryDirectory;
    }    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, CentralAuthority centralAuthority, UserAccount userAccount, Organization inOrganization, Enterprise inEnterprise, CityEnterprise inCityEnterprise) {
        System.out.println("printing from lab wala role" + inEnterprise);
        return new LabOrganizationWorkArea(inEnterprise, inOrganization, userAccount);
    }
    
    
}
