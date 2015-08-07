package baseClasses.roles;


import baseClasses.enterprise.CityEnterprise;
import baseClasses.enterprise.Enterprise;
import baseClasses.enterprise.FDAEnterprise;
import baseClasses.location.CountryDirectory;
import baseClasses.organization.Organization;
import baseClasses.userAccount.UserAccount;
import business.CentralAuthority;
import javax.swing.JPanel;
import userInterface.FDA.FDAAdminWorkArea;


/**
 *
 * @author Abhishek
 */
public class FDARole extends Role
{

    private CountryDirectory countryDirectory;
    
    public FDARole()
    {
        this.countryDirectory = countryDirectory;
    }    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, CentralAuthority centralAuthority, UserAccount userAccount, Organization inOrganization, Enterprise inEnterprise, CityEnterprise inCityEnterprise) {
        FDAEnterprise fdaEnterprise = (FDAEnterprise) inEnterprise;
        System.out.println("Printing from FDARole class"  + fdaEnterprise);
            return new FDAAdminWorkArea(centralAuthority.getInternationalNetwork(), fdaEnterprise);
    }
    
}
