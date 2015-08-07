package baseClasses.roles;


import baseClasses.enterprise.CityEnterprise;
import baseClasses.enterprise.Enterprise;
import baseClasses.enterprise.PharmaceuticalCompanyEnterprise;
import baseClasses.location.CountryDirectory;
import baseClasses.organization.ManufacturingOrganization;
import baseClasses.organization.Organization;
import baseClasses.userAccount.UserAccount;
import business.CentralAuthority;
import javax.swing.JPanel;
import userInterface.distributor.DistributorWorkArea;

/**
 *
 * @author Abhishek
 */
public class DistributorRole extends Role
{

    private CountryDirectory countryDirectory;
    
    public DistributorRole()
    {
        this.countryDirectory = countryDirectory;
    }    

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, CentralAuthority centralAuthority, UserAccount userAccount, Organization inOrganization, Enterprise inEnterprise, CityEnterprise inCityEnterprise) {
        PharmaceuticalCompanyEnterprise pharmaceuticalCompanyEnterprise = (PharmaceuticalCompanyEnterprise) inEnterprise;
        ManufacturingOrganization manufacturingOrganization = null;
        for(Organization org: pharmaceuticalCompanyEnterprise.getOrganizationDirectory().getOrganizationList())
        {
            if(org.getClass() == ManufacturingOrganization.class)
            {
                manufacturingOrganization = (ManufacturingOrganization) org;
            }
        }
        
        return new DistributorWorkArea(centralAuthority.getInternationalNetwork(),pharmaceuticalCompanyEnterprise,manufacturingOrganization,userAccount, inOrganization);
    }
    
}
