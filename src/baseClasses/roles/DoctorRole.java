package baseClasses.roles;


import baseClasses.enterprise.CityEnterprise;
import baseClasses.enterprise.Enterprise;
import baseClasses.organization.Organization;
import baseClasses.userAccount.UserAccount;
import business.CentralAuthority;
import javax.swing.JPanel;
import userInterface.doctor.DoctorWorkAreaPanel;


/**
 *
 * @author Abhishek
 */
public class DoctorRole extends Role
{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, CentralAuthority centralAuthority, UserAccount userAccount, Organization inOrganization, Enterprise inEnterprise, CityEnterprise inCityEnterprise) {
        System.out.println("printing from doctor wala role" + inEnterprise);
        //return new SelectHospitalPanel(centralAuthority.getInternationalNetwork(), inOrganization, inEnterprise);
        return  new DoctorWorkAreaPanel(centralAuthority.getInternationalNetwork(), inCityEnterprise, inOrganization, userAccount, inEnterprise);
    }


    
    
}
