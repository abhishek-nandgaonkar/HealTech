package baseClasses.roles;


import baseClasses.enterprise.CityEnterprise;
import baseClasses.enterprise.Enterprise;
import baseClasses.enterprise.FDAEnterprise;
import baseClasses.enterprise.HealTechLocalEnterprise;
import baseClasses.enterprise.HospitalEnterprise;
import baseClasses.enterprise.PharmaceuticalCompanyEnterprise;
import baseClasses.enterprise.PharmacyEnterprise;
import baseClasses.location.CountryDirectory;
import baseClasses.organization.Organization;
import baseClasses.userAccount.UserAccount;
import business.CentralAuthority;
import javax.swing.JPanel;
import userInterface.FDA.DrugAdminWorkAreaPanel;
import userInterface.FDA.FDAAdminWorkArea;
import userInterface.hospital.HospitalAdminWorkArea;
import userInterface.pharmaceuticalCompany.PharmaceuticalAdminWorkArea;
import userInterface.pharmacy.PharmacyAdminWorkArea;

/**
 *
 * @author Abhishek
 */
public class AdminRole extends Role
{

    private CountryDirectory countryDirectory;
    
    public AdminRole()
    {
        this.countryDirectory = countryDirectory;
    }


   



    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, CentralAuthority centralAuthority, UserAccount userAccount, Organization inOrganization, Enterprise inEnterprise, CityEnterprise inCityEnterprise)
    {
        if(inEnterprise.getClass() == HospitalEnterprise.class)
        {
            System.out.println("Printing from Admin Role for Hospital: " + inEnterprise);
            HospitalEnterprise hospitalEnterprise = new HospitalEnterprise(null);
            hospitalEnterprise = (HospitalEnterprise) inEnterprise;
            System.out.println("Printing from Admin Role for Hospital: " + inEnterprise + hospitalEnterprise);
            return new HospitalAdminWorkArea(centralAuthority.getInternationalNetwork(), hospitalEnterprise, userAccount, inOrganization);
        }
        else if(inEnterprise.getClass() == HealTechLocalEnterprise.class)
        {
            
        }
        else if(inEnterprise.getClass() == PharmaceuticalCompanyEnterprise.class)
        {
            PharmaceuticalCompanyEnterprise pharmaceuticalCompanyEnterprise = (PharmaceuticalCompanyEnterprise) inEnterprise;
        return new PharmaceuticalAdminWorkArea(centralAuthority.getInternationalNetwork(), pharmaceuticalCompanyEnterprise, inCityEnterprise, userAccount);
        }
        else if(inEnterprise.getClass() == PharmacyEnterprise.class)
        {
            
            return new PharmacyAdminWorkArea(centralAuthority.getInternationalNetwork(),userAccount, inEnterprise);
        }
        else if(inEnterprise.getClass() == FDAEnterprise.class)
        {
            FDAEnterprise fdaEnterprise = (FDAEnterprise) inEnterprise;
            return new FDAAdminWorkArea(centralAuthority.getInternationalNetwork(),fdaEnterprise);
        }
        else
            return null;
        
        return null;
    }
    
    
    
    
}
