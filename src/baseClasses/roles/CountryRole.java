package baseClasses.roles;


import baseClasses.enterprise.CityEnterprise;
import baseClasses.enterprise.Enterprise;
import baseClasses.organization.Organization;
import baseClasses.userAccount.UserAccount;
import business.CentralAuthority;
import javax.swing.JPanel;
import userInterface.government.GovernmentAdminWorkArea;

/**
 *
 * @author Abhishek
 */
public class CountryRole extends Role
{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, CentralAuthority centralAuthority, UserAccount userAccount, Organization inOrganization, Enterprise inEnterprise, CityEnterprise inCityEnterprise) {
        return new GovernmentAdminWorkArea(centralAuthority.getInternationalNetwork(), userAccount);
    }

    
    
}
