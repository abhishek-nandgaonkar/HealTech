package baseClasses.roles;


import baseClasses.enterprise.CityEnterprise;
import baseClasses.enterprise.Enterprise;
import baseClasses.enterprise.PharmaceuticalCompanyEnterprise;
import baseClasses.location.CountryDirectory;
import baseClasses.organization.Organization;
import baseClasses.userAccount.UserAccount;
import business.CentralAuthority;
import javax.swing.JPanel;
import userInterface.pharmaceuticalCompany.PharmaceuticalAdminWorkArea;

/**
 *
 * @author Abhishek
 */
public class PharmaceuticalCompanyRole extends Role
{

    private CountryDirectory countryDirectory;
    
    public PharmaceuticalCompanyRole()
    {
        this.countryDirectory = countryDirectory;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, CentralAuthority centralAuthority, UserAccount userAccount, Organization inOrganization, Enterprise inEnterprise, CityEnterprise inCityEnterprise)
    {
        return null;
    }
    
    
    
}
