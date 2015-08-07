/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseClasses.enterprise;

import baseClasses.roles.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class HealTechLocalEnterprise extends Enterprise
{

    @Override
    public ArrayList<Role> getSupportedRole()
    {
        return null;
    
    }
    
    public HealTechLocalEnterprise(String name)
    {
        super(name, EnterpriseType.HealTechLocal);
    }
}
