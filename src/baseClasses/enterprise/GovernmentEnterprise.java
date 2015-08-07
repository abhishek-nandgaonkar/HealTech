/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseClasses.enterprise;

import baseClasses.network.Network;
import baseClasses.roles.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class GovernmentEnterprise extends Enterprise
{
    
    //private Network cityNetwork;
    

    

    @Override
    public ArrayList<Role> getSupportedRole()
    {
        return null;
    
    }
    
    public GovernmentEnterprise(String name)
    {
        super(name, EnterpriseType.Government);
    }
}
