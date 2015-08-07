package baseClasses.roles;


import baseClasses.enterprise.CityEnterprise;
import baseClasses.enterprise.Enterprise;
import baseClasses.enterprise.HospitalEnterprise;
import baseClasses.location.CountryDirectory;
import baseClasses.organization.Organization;
import baseClasses.userAccount.UserAccount;
import business.CentralAuthority;
import java.util.ArrayList;
import javax.swing.JPanel;
import userInterface.healTechLocal.SearchPatientProfiles;

/**
 *
 * @author Abhishek
 */
public class HealTechRole extends Role
{

    private CountryDirectory countryDirectory;
    
    public HealTechRole()
    {
        this.countryDirectory = countryDirectory;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, CentralAuthority centralAuthority, UserAccount userAccount, Organization inOrganization, Enterprise inEnterprise, CityEnterprise inCityEnterprise) {
        
        ArrayList <HospitalEnterprise> hospitalList = new ArrayList();
        HospitalEnterprise hospitalEnterprise;
        for(Enterprise hospital: inCityEnterprise.getCityNetwork().getEnterpriseDirectory().getEnterpriseList())
        {
            if(hospital.getClass() == HospitalEnterprise.class)
            {
                hospitalEnterprise = (HospitalEnterprise) hospital;
                hospitalList.add(hospitalEnterprise);
            }
        }
        
        return new SearchPatientProfiles(hospitalList, centralAuthority.getInternationalNetwork());
    }



    
    
    
}
