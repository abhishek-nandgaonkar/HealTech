package baseClasses.roles;


import baseClasses.enterprise.CityEnterprise;
import baseClasses.enterprise.Enterprise;
import baseClasses.enterprise.FDAEnterprise;
import baseClasses.location.CountryDirectory;
import baseClasses.organization.Organization;
import baseClasses.userAccount.UserAccount;
import business.CentralAuthority;
import javax.swing.JPanel;
import userInterface.FDA.DrugAdminWorkAreaPanel;

/**
 *
 * @author Abhishek
 */
public class DrugAdminRole extends Role
{

    private CountryDirectory countryDirectory;
    
    public DrugAdminRole()
    {
        this.countryDirectory = countryDirectory;
    }    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, CentralAuthority centralAuthority, UserAccount userAccount, Organization inOrganization, Enterprise inEnterprise, CityEnterprise inCityEnterprise) {
        FDAEnterprise fdaEnteprise = (FDAEnterprise) inEnterprise;
        System.out.println("Printing from  Drug Admin Role" +"  "+ fdaEnteprise);
        return new DrugAdminWorkAreaPanel(fdaEnteprise, userAccount);
    }
    
}
