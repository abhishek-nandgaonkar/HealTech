/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseClasses.enterprise;

import baseClasses.network.Network;
import baseClasses.organization.CitizenOrganization;
import baseClasses.roles.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class CityEnterprise extends Enterprise
{
    
    private Network cityNetwork;
    private CitizenOrganization citizenOrganization;
    private PharmaceuticalCompanyEnterprise pharmaceuticalEnterprise;
    

    public Network getCityNetwork() {
        return cityNetwork;
    }

    public void setCityNetwork(Network cityNetwork) {
        this.cityNetwork = cityNetwork;
    }
    

    @Override
    public ArrayList<Role> getSupportedRole()
    {
        return null;
    
    }
    
    public CityEnterprise(String name)
    {
        super(name, EnterpriseType.City);
        cityNetwork = new Network();
        citizenOrganization = new CitizenOrganization();
        pharmaceuticalEnterprise = new PharmaceuticalCompanyEnterprise(null);
        this.getOrganizationDirectory().getOrganizationList().add(citizenOrganization);
    }
}
