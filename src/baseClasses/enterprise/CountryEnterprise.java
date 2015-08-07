/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseClasses.enterprise;

import baseClasses.network.Network;
import baseClasses.roles.Role;
import baseClasses.userAccount.UserAccountDirectory;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class CountryEnterprise extends Enterprise
{
    private Network countryNetwork;
    
    // To add country level login details for Government Panels
    private UserAccountDirectory userAccountDirectory;

   
    
    public Network getCountryNetwork() {
        return countryNetwork;
    }

    public void setCountryNetwork(Network countryNetwork) {
        this.countryNetwork = countryNetwork;
    }
    

    @Override
    public ArrayList<Role> getSupportedRole()
    {
        return null;
    
    }
    
    public CountryEnterprise(String name)
    {
        super(name, EnterpriseType.Country);
        countryNetwork = new Network();
    }
    

    @Override
    public String toString() {
        return name; //To change body of generated methods, choose Tools | Templates.
    }
    
}
