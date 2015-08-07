package baseClasses.roles;


import baseClasses.enterprise.CityEnterprise;
import baseClasses.enterprise.Enterprise;
import baseClasses.location.CountryDirectory;
import baseClasses.organization.Organization;
import baseClasses.userAccount.UserAccount;
import business.CentralAuthority;
import javax.swing.JPanel;

import userInterface.government.FindMyProfile;

/**
 *
 * @author Abhishek
 */
public class CitizenRole extends Role
{

    private CountryDirectory countryDirectory;
    
    public CitizenRole()
    {
        this.countryDirectory = countryDirectory;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, CentralAuthority centralAuthority, UserAccount userAccount, Organization inOrganization, Enterprise inEnterprise, CityEnterprise inCityEnterprise) {
       return new FindMyProfile(centralAuthority.getInternationalNetwork());
    }



    
    
    
}
