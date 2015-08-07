package baseClasses.roles;


import baseClasses.enterprise.CityEnterprise;
import baseClasses.enterprise.Enterprise;
import baseClasses.organization.Organization;
import baseClasses.userAccount.UserAccount;
import business.CentralAuthority;
import javax.swing.JPanel;
import userInterface.patient.PatientWorkArea;

/**
 *
 * @author Abhishek
 */
public class PatientRole extends Role
{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, CentralAuthority centralAuthority, UserAccount userAccount, Organization inOrganization, Enterprise inEnterprise, CityEnterprise inCityEnterprise) {
        return new PatientWorkArea(centralAuthority.getInternationalNetwork(), userAccount);
    }

    
    
}
