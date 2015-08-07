package baseClasses.roles;


import baseClasses.enterprise.CityEnterprise;
import baseClasses.enterprise.Enterprise;
import baseClasses.location.CountryDirectory;
import baseClasses.organization.Organization;
import baseClasses.userAccount.UserAccount;
import business.CentralAuthority;
import javax.swing.JPanel;
import userInterface.manufacturer.ManufacturingAdminWorkArea;

/**
 *
 * @author Abhishek
 */
public class ManufacturingRole extends Role
{

    private CountryDirectory countryDirectory;
    
    public ManufacturingRole()
    {
        this.countryDirectory = countryDirectory;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, CentralAuthority centralAuthority, UserAccount userAccount, Organization inOrganization, Enterprise inEnterprise, CityEnterprise inCityEnterprise) {
        return new ManufacturingAdminWorkArea(centralAuthority.getInternationalNetwork(),  inEnterprise, inOrganization, userAccount);
    }
    
    
    
}
